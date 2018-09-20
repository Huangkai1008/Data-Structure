#### 数组时间复杂度分析 

=====================


> 添加操作

    addLast(e)                  O(1)
    addFirst(e)                 O(n)
    add(index, e)               O(n/2) = O(n)
    
    resize()                    O(n)
    
    
  `总结来说，添加操作的时间复杂度是O(n)`
 
 

> 删除操作

    removeLast(e)               O(1)
    removeFirst(e)              O(n)
    remove(index, e)            O(n/2) = O(n)
    
    resize()                    O(n)
    
    `总结来说，删除操作的时间复杂度是O(n)`
    
> 修改操作

    set(index, e)               O(1)

> 查询操作
    
    get(index)                  O(1)
    contains(e)                 O(n)
    find(e)                     O(n)
    

#### 总结

* 增: O(n)
* 删：O(n)
* 改：已知索引O(1) ,未知索引O(n)
* 查：已知索引O(1), 未知索引O(n)
   




