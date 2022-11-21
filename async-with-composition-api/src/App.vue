<script setup lang="ts">
import { ref } from "vue";
import ComponentA from "./components/ComponentA.vue";
import ComponentB from "./components/ComponentB.vue";

const i = ref(0);

const onSwitch = () => {
  i.value = (i.value + 1) % 2;
};
</script>

<template>
  <div>
    <ComponentA v-if="i === 0" />
    <ComponentB v-else />
    <button @click="onSwitch">Switch</button>
  </div>
</template>
