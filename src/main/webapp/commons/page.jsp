<%@ page pageEncoding="UTF-8" %>
<%@ include file="inc.jsp" %>
<script src="${ctx}/assets/js/jquery.min.js"></script>
<script>
    $(function () {
        var form = $('#form');
        $('#submit').click(function () {
            form.attr('action', form.attr('action') + $('#page').val());
            form.submit();
        });
    });
</script>
<c:choose>
    <c:when test="${sessionScope.pagination.totalRows eq 0}">
        <em>没有记录</em>
    </c:when>
    <c:otherwise>
        <p>共 ${sessionScope.pagination.totalRows} 条记录，
            共 ${sessionScope.pagination.totalPages} 页，
            当前第 ${sessionScope.pagination.currentPage} 页</p>
        <c:choose>
            <c:when test="${sessionScope.pagination.currentPage eq 1}">
                首页
                上一页
            </c:when>
            <c:otherwise>
                <a href="${ctx}/${param.path}/1">首页</a>
                <a href="${ctx}/${param.path}/${sessionScope.pagination.currentPage - 1}">上一页</a>
            </c:otherwise>
        </c:choose>
        <c:if test="${sessionScope.pagination.currentPage < 7} && ${sessionScope}">
        <c:forEach var="page" begin="1" end="7">
            <a href="${ctx}/${param.path}/${page}">${page}</a>
        </c:forEach>

        </c:if>
        <c:if test="${sessionScope.pagination.currentPage >= 7}">

        </c:if>
        <c:choose>
            <c:when test="${sessionScope.pagination.currentPage eq sessionScope.pagination.totalPages}">
                下一页
                尾页
            </c:when>
            <c:otherwise>
                <a href="${ctx}/${param.path}/${sessionScope.pagination.currentPage + 1}">下一页</a>
                <a href="${ctx}/${param.path}/${sessionScope.pagination.totalPages}">尾页</a>
            </c:otherwise>
        </c:choose>
        <form id="form" action="${ctx}/${param.path}/" method="post" style="display: inline-block">
            跳到第
            <select id="page">
                <c:forEach var="i" begin="1" end="${sessionScope.pagination.totalPages}">
                <option value="${i}">${i}
                    </c:forEach>
            </select>
            页
            <a id="submit" href="#">GO</a>
        </form>
    </c:otherwise>
</c:choose>