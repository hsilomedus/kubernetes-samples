kubectl run calublog --image=your_dockerhub_username_here/kub-calublog-arm:latest --replicas=4 --generator=run/v1 -l app=calublog,visualize=true
