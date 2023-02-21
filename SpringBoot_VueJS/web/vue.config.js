const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true,
  //빌드 시 결과물 내보낼 디렉터리 위치
  outputDir: '../src/main/resources/static',
  //개발모드 진행시 포트가 다르기 때문에 프록시 설정
  devServer: {
    proxy: 'http://localhost:8080'
  }
})
