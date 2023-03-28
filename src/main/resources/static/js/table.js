import request from "./baseUrl.js";

// 查询所有建工信息
export function getAll() {
    return request({
        method: 'get',
        url: `/selectAll`
    })
}

// 删除建工信息
export function del(id){
    return request({
        method:'delete',
        url:'/delete',
        params:{
            ProjectId:id
        }
    })
}

// 已选评委信息

export function getSelect(id){
    return request({
        method:'get',
        url:'/selectTexpert',
        params:{
            ProjectId:id
        }
    })
}

// 已选评委信息的工程名字查询

export function getName(id){
    return request({
        method:'get',
        url:'/sellById',
        params:{
            projectId:id
        }
    })
}

