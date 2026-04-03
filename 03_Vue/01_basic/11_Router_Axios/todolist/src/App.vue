<template>
  <div class="container">
    <Header></Header>
    <RouterView></RouterView>
  </div>
</template>
<script setup>
import Header from './components/Header.vue';
import todoLists from '../db.json';
import { computed, provide, reactive } from 'vue';

// 1. todo List 조회하기
const state = reactive({
  todoLists: todoLists.todos,
});

// 토글 조작
const toggleDone = (id) => {
  let index = state.todoLists.findIndex((item) => item.id === id);

  // 완료상태 수정
  state.todoLists[index].done = !state.todoLists[index].done;
};

// 2. todo 추가하기
const addTodo = ({ todo, desc }) => {
  state.todoLists.push({ id: Date.now(), todo, desc, done: false });
};

// todoList가 변경되면 inject한 컴포넌트도 재랜더링되도록
provide(
  'todoList',
  computed(() => state.todoLists),
);

provide('actions', { toggleDone, addTodo });
</script>

<style scoped></style>
