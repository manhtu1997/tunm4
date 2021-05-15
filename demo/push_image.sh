while getopts t:r:p: flag
do
    case "${flag}" in
        t) imageTag=${OPTARG};;
        r) registry=${OPTARG};;	
        p) project=${OPTARG};;
    esac
done

docker push $registry/$project/application:$imageTag 
docker rmi $registry/$project/application:$imageTag

sed -i -e "s~IMAGE_NAME~$registry/$project/application:$imageTag~g" ./demo/deployment.yaml 
