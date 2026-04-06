import { createApp } from 'vue';
import { createPinia } from 'pinia';
import App from './App.vue';

const app = createApp(App);

// pinia 추가
app.use(createPinia());

app.mount('#app');
