<script setup lang="ts">
import { getCurrentScope, onScopeDispose, onUnmounted } from "vue";

// 一个组件可以理解为一个特殊的作用域
console.log(getCurrentScope());

onUnmounted(() => {
  console.log("onUnmounted");
});
// 组件销毁时同样会调用onScopeDispose
onScopeDispose(() => {
  console.log("onScopeDispose");
});
</script>

<template>
  <div>scope test</div>
</template>
