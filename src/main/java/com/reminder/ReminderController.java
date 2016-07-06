package com.reminder;


        import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ReminderController {

    @RequestMapping(value="/", method=RequestMethod.GET)
    public String reminderForm(Model model) {
        model.addAttribute("reminder", new Reminder());
        return "reminder";
    }

    @RequestMapping(value="/", method=RequestMethod.POST)
    public String reminderSubmit(@ModelAttribute Reminder reminder, Model model) {
        model.addAttribute("reminder", reminder);
        return "result";
    }

}
