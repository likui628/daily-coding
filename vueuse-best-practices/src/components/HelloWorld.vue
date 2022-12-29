<script setup lang="ts">
import { ref } from "vue";
import { useToggle } from "@vueuse/core";

const initValue = ref(true);
const toggle = useToggle(initValue);
</script>

<template>
  <div class="box">
    <p>Value: {{ initValue ? "ON" : "OFF" }}</p>
    <button @click="toggle()">Toggle</button>
    <button @click="initValue = true">Set ON</button>
    <button @click="initValue = false">Set OFF</button>
  </div>
</template>

<style scoped>
.box {
  padding: 10px;
  border: 1px solid #eee;
  border-radius: 5px;
}

button {
  margin: 3px;
}
</style>
