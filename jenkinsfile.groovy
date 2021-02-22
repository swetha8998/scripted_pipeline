node{
stage( "git"){
git branch: 'branch1', url: 'https://github.com/swetha8998/scripted_pipeline.git'
}
stage( "build" ){
sh 'echo "in building stage"'
}
stage ( "approve"){
sh 'echo "in approval stage" '
}
stage ( " deploy "){
sh 'echo "in deployement stage"'

}
}
