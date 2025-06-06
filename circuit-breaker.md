# 🔌 Circuit Breaker Pattern in Microservices

## 📘 What is a Circuit Breaker?

A **Circuit Breaker** is a **resilience pattern** used in microservices architecture to prevent cascading failures and improve system stability.

When one service (A) calls another service (B), and service B is down or slow, repeatedly making calls will:
- Waste resources
- Increase latency
- Cause user-facing failures

The **Circuit Breaker** detects this and temporarily blocks further calls to the failing service.

---

## ⚙️ How It Works

The circuit breaker has 3 states:

### 1. 🟢 Closed
- All requests flow normally.
- Failures are tracked.
- If failure threshold is exceeded, switch to **Open**.

### 2. 🔴 Open
- No requests are sent to the failing service.
- Fail-fast with fallback logic.
- Wait for a timeout (cool-down) period.

### 3. 🟡 Half-Open
- A few test requests are sent.
- If they succeed, switch to **Closed**.
- If they fail, revert to **Open**.

---

## 🧠 Why Use Circuit Breaker?

- Prevent unnecessary load on failing services
- Avoid cascading failures
- Provide graceful fallback responses
- Improve fault tolerance

---

## 📉 State Transition Diagram

```text
      +--------+
      | Closed |
      +---+----+
          |
     Failures exceed threshold
          v
      +---+----+
      |  Open  |
      +---+----+
          |
    After timeout (cool-down)
          v
      +--------+
      |Half-Open|
      +---+----+
          |
    Success  |  Failure
      v      v
  +------+  +------+
  |Closed|  | Open |
  +------+  +------+