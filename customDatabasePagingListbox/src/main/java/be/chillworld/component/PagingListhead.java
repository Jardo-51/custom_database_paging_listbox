package be.chillworld.component;

import org.zkoss.zk.ui.Component;
import org.zkoss.zul.Listhead;

public class PagingListhead extends Listhead {

    private static final long serialVersionUID = 1L;

    @Override
    public void beforeParentChanged(Component parent) {
        // do nothing (don't throw wrong parent exception as in Listhead)
    }

}
