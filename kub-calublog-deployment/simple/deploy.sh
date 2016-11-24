kubectl run calublog --image=gcr.io/your_gcp_project_name/kub-calublog:0.0.2-SNAPSHOT --generator=run/v1 -l app=calublog,visualize=true
