kubectl api-resources

kubectl apply -f kube/nginx-pod.yaml

or

kubectl create -f kube/nginx-pod.yaml

kubectl get all -n demo

- logs

kubectl logs  pod/nginx-pod -n demo

minikube service nginx-service -n demo --url