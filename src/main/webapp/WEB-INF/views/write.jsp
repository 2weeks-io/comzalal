<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
	<style>
	.ck-editor__editable {
	    min-height: 400px;
	}
	</style>
    <meta charset="utf-8">
    <title>CKEditor 5 – Document editor</title>
    <script src="${pageContext.request.contextPath}/resources/ckeditor/ckeditor.js"></script>
</head>
<body>
    <h1>Document editor</h1>

    <!-- The toolbar will be rendered in this container. -->
    <div id="toolbar-container"></div>

    <!-- This container will become the editable. -->
    <div id="editor">
        <p>This is the initial editor content.</p>
    </div>

    <script>
    	ClassicEditor
            .create( document.querySelector( '#editor' ), {
        		ckfinder: {
        	        uploadUrl: '/ck/fileupload' // 내가 지정한 업로드 url (post로 요청감)
        		},
        		alignment: {
                    options: [ 'left', 'center', 'right' ]
                }
        	} )
            .then( editor => {
                const toolbarContainer = document.querySelector( '#toolbar-container' );

                toolbarContainer.appendChild( editor.ui.view.toolbar.element );
            } )
            .catch( error => {
                console.error( error );
            } );
    </script>
</body>
</html>