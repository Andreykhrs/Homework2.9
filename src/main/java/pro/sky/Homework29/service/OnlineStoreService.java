package pro.sky.Homework29.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.Homework29.exception.OnlineStoreException;
import pro.sky.Homework29.model.OnlineStore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Service
@SessionScope
public class OnlineStoreService {
    List<OnlineStore> list = new ArrayList<>();

    public List<Integer> addId(List<Integer> ID) {
        if (ID.isEmpty()) {
            throw new OnlineStoreException();
        }
        for (Integer arg : ID) {
            list.add(new OnlineStore(arg));
        }
        return ID;
    }

    public List<OnlineStore> getId() {
        return Collections.unmodifiableList(list);
    }
}
