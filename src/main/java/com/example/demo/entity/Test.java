package com.example.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.entity
 * @ClassName: Test
 * @Author: Deng YuBin
 * @Description: ds
 * @Date: 2020/10/14 18:12
 * @Version: 1.0
 */
@NoArgsConstructor
@Data
public class Test {

    /**
     * prop : Production
     * label : 饮料
     * width : null
     * propsChildren : [{"prop":"aQty","label":"西瓜汁","width":null}]
     */

    public String prop;
    public String label;
    public Object width;
    public List<PropsChildrenBean> propsChildren;

    @Data
    @NoArgsConstructor
    public static class PropsChildrenBean {
        /**
         * prop : aQty
         * label : 西瓜汁
         * width : null
         */

        public String prop;
        public String label;
        public Object width;
        /**
         * width : null
         * propsChildren : [{"prop":"aQty","label":"西瓜汁","width":null,"propsChildren":[{"prop":"aQty","label":"西瓜汁","width":null}]}]
         */

        public Object widthX;
        public List<PropsChildrenBeanX> propsChildren;

        @NoArgsConstructor
        @Data
        public static class PropsChildrenBeanX {
            /**
             * prop : aQty
             * label : 西瓜汁
             * width : null
             * propsChildren : [{"prop":"aQty","label":"西瓜汁","width":null}]
             */

            public String propX;
            public String labelX;
            public Object widthX;
            public List<PropsChildrenBean2> propsChildren;

            @NoArgsConstructor
            @Data
            public static class PropsChildrenBean2 {
                /**
                 * prop : aQty
                 * label : 西瓜汁
                 * width : null
                 */

                public String propX;
                public String labelX;
                public Object widthX;
            }
        }
    }
}
