package com.djava.board.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.djava.board.dao.BoardDao;

public class BWriteCommand {

	public void excute(Model model) {
		
		Map<String, Object> map =  model.asMap(); // 컨트롤러에서 넘겨받은 model 객체 내에 있는 값들을 Map 타입으로 저장
		
		HttpServletRequest request  = (HttpServletRequest) map.get("request");
		// map 타입의 map 객체에서 request를 빼내서 저장
		
		String bname = request.getParameter("bname");
		String btitle = request.getParameter("btitle");
		String bcontent = request.getParameter("bcontent");
		
		BoardDao dao = new BoardDao();
		dao.write(bname, btitle, bcontent);
	}
	
}
