function fn() {
  var config = {};
  // Base URL of your Flask API
  //config.baseUrl = 'http://dev-els-lmsserver.local/api';

  config.baseUrl = 'https://jsonplaceholder.typicode.com';


  // Default headers
  config.headers = { 'Content-Type': 'application/json' };

  return config;
}
