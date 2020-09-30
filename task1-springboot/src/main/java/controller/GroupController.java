package controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import repository.GroupRepository;

@RestController
    public class GroupController {

        private final GroupRepository groupRepository;

        public GroupController(GroupRepository groupRepository) {
            this.groupRepository = groupRepository;
        }

        @GetMapping("/api/groups")
        public ResponseEntity<?> getGroups() {

            return ResponseEntity.ok(groupRepository.findAll());
        }
    }


