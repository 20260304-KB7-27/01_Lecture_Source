<template>
  <h1>App</h1>
  <h2>App에서 보는 Counter : {{ counter.count }}</h2>
  <Counter></Counter>
</template>

<script setup>
import Counter from './components/Counter.vue';
import { useCounterStore } from './stores/counter';

const counter = useCounterStore();
</script>

<style scoped></style>
