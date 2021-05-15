while getopts t:r:p: flag
do
    case "${flag}" in
        t) imageTag=${OPTARG};;
        r) registry=${OPTARG};;
        p) project=${OPTARG};;
    esac
done

mkdir -p config
cp -r ./demo/target/demo-0.0.1-SNAPSHOT.jar './'application.jar
docker build -t  $registry/$project/application:$imageTag -f ./demo/Dockerfile .
