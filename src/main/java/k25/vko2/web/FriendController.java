package k25.vko2.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import k25.vko2.domain.Friend;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class FriendController {

    private static List<Friend> friendList = new ArrayList<>();

    @GetMapping("/add")
    public String addFriendInfo(Model model) {
        model.addAttribute("friend", new Friend());
        return "newFriend";
    }

    @PostMapping("saveFriend")
	public String saveFriend(Friend friend) {
		System.out.println("Database is not implemented : " + friend);
		friendList.add(friend);
		return "redirect:/friendlist";
	}

    @GetMapping("/friendlist")
	public String showFriends(Model model) {
		System.out.println("friends...");
		model.addAttribute("friends", friendList);
		return "friendlist";
	}
    
}
