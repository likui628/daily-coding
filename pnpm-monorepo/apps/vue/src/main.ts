import { createApp } from 'vue'
import App from './App.vue'
import { log } from 'utils'

import './assets/main.css'

createApp(App).mount('#app')

log("vue mounted")
