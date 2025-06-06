# 🔐 OAuth 2.0 vs OpenID Connect (OIDC)

## 🧠 Overview

| Protocol         | Purpose             | Used For                  |
|------------------|----------------------|-----------------------------|
| OAuth 2.0        | Authorization        | Accessing resources         |
| OpenID Connect   | Authentication + Auth| Logging in + user identity |

---

## 📜 What is OAuth 2.0?

OAuth 2.0 is an **authorization protocol** that allows apps to get **limited access** to a user's resources **without sharing the user's credentials**.

**Example:** Granting an app access to your Google Drive photos.

### 🔁 OAuth Flow
1. User clicks "Connect with Google".
2. App redirects to Google (Auth Server).
3. Google authenticates the user and asks for permission.
4. If accepted, Google sends an **Access Token** to the app.
5. The app uses this token to access your data (e.g., photos).

---

## 🧾 What is OpenID Connect?

**OpenID Connect (OIDC)** is a layer built **on top of OAuth 2.0** that adds **user authentication**.

It returns an **ID Token** (JWT) that includes:
- User identity (`sub`, `email`)
- Token expiration (`exp`)
- Issuer (`iss`)

**Example:** "Login with Google" where you want to know *who* the user is.

---

## 🖼️ Diagram: OAuth 2.0 vs OIDC Flow

```text
            +-------------+                                   +-------------------+
            |             |                                   |                   |
            |  User       |                                   | Authorization     |
            |             |                                   | Server (Google)   |
            +------+------|                                   +--------+----------+
                   |                                                    |
        (1) Click "Login with Google" or "Authorize")                  |
                   |-------------------------------------------------->|           
                   |                                                  |
                   |                        [OAuth & OIDC]           |
                   |                     Authenticate user           |
                   |                         Issue tokens            |
                   |                                                  |
                   |<-------------------------------------------------|
                   |         (2) Tokens Returned (Access, ID)         |
                   |                                                  |
            +------v------+                                    +------v---------+
            |             |                                    |                |
            |  Client App | (3a) Uses Access Token to call API | Resource Server|
            |             | (3b) Uses ID Token to authenticate | (Google Photos)|
            +-------------+                                    +----------------+