package defpackage;

import androidx.car.app.model.CarText;
import androidx.car.app.model.ItemList;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class chq {
    public final List a;
    public int b;
    public cii c;
    public cig d;
    public CarText e;

    public chq() {
        this.a = new ArrayList();
    }

    public final ItemList a() {
        if (this.c != null) {
            int size = this.a.size();
            if (size == 0) {
                throw new IllegalStateException("A selectable list cannot be empty");
            }
            if (this.b >= size) {
                throw new IllegalStateException("The selected item index (" + this.b + ") is larger than the size of the list (" + size + ")");
            }
            for (chp chpVar : this.a) {
                if (ItemList.getOnClickDelegate(chpVar) != null) {
                    throw new IllegalStateException("Items that belong to selectable lists can't have an onClickListener. Use the OnSelectedListener of the list instead");
                }
                if (ItemList.getToggle(chpVar) != null) {
                    throw new IllegalStateException("Items that belong to selectable lists can't have a toggle");
                }
            }
        }
        return new ItemList(this);
    }

    public final void b(chp chpVar) {
        chpVar.getClass();
        this.a.add(chpVar);
    }

    public chq(ItemList itemList) {
        this.b = itemList.getSelectedIndex();
        this.c = itemList.getOnSelectedDelegate();
        this.d = itemList.getOnItemVisibilityChangedDelegate();
        this.e = itemList.getNoItemsMessage();
        this.a = new ArrayList(itemList.getItems());
    }
}
