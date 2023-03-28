const request = axios.create({
    // 设置请求的前缀
    baseURL: 'http://localhost:80/hotel',
    // 设置请求超时的时间
    timeout: 10000
});

// 向外导出这个对象
export default request
