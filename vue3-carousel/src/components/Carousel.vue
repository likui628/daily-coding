<script setup lang="ts">
import { Carousel, Slide } from "vue3-carousel";

import "vue3-carousel/dist/carousel.css";
</script>

<template>
  <Carousel
    :items-to-show="4.5"
    :wrap-around="true"
    :autoplay="2000"
    snapAlign="start"
  >
    <Slide v-for="slide in 10" :key="slide">
      <div class="carousel__item">{{ slide }}</div>
    </Slide>
  </Carousel>
</template>

<style scoped>
.carousel__item {
  min-height: 250px;
  width: 100%;
  background-color: #42b883;
  color: #fff;
  font-size: 20px;
  border-radius: 8px;
  display: flex;
  justify-content: center;
  align-items: center;
}

.carousel__slide {
  padding: 10px;
}
</style>
