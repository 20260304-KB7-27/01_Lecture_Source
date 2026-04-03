<template>
  <div class="row">
    <div class="col p-3">
      <ul class="list-group">
        <TodoItem
          v-for="todoItem in todoList"
          :key="todoItem.id"
          :todoItem="todoItem"
        />
      </ul>
    </div>
  </div>
</template>

<script setup>
import TodoItem from '@/components/TodoItem.vue';
import { inject } from 'vue';

const todoList = inject('todoList');
</script>

<style scoped></style>
