package androidx.car.app.model;

import defpackage.cfs;
import defpackage.chp;
import defpackage.chq;
import defpackage.cia;
import defpackage.cig;
import defpackage.cii;
import defpackage.clb;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
@cfs
/* loaded from: classes.dex */
public final class ItemList {
    private final List<chp> mItems;
    private final CarText mNoItemsMessage;
    private final cig mOnItemVisibilityChangedDelegate;
    private final cii mOnSelectedDelegate;
    private final int mSelectedIndex;

    private ItemList() {
        this.mSelectedIndex = 0;
        this.mItems = Collections.EMPTY_LIST;
        this.mNoItemsMessage = null;
        this.mOnSelectedDelegate = null;
        this.mOnItemVisibilityChangedDelegate = null;
    }

    public static cia getOnClickDelegate(chp chpVar) {
        if (chpVar instanceof Row) {
            return ((Row) chpVar).getOnClickDelegate();
        }
        if (chpVar instanceof GridItem) {
            return ((GridItem) chpVar).getOnClickDelegate();
        }
        return null;
    }

    public static Toggle getToggle(chp chpVar) {
        if (chpVar instanceof Row) {
            return ((Row) chpVar).getToggle();
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemList)) {
            return false;
        }
        ItemList itemList = (ItemList) obj;
        if (this.mSelectedIndex == itemList.mSelectedIndex && Objects.equals(this.mItems, itemList.mItems)) {
            if (Objects.equals(Boolean.valueOf(this.mOnSelectedDelegate == null), Boolean.valueOf(itemList.mOnSelectedDelegate == null))) {
                if (Objects.equals(Boolean.valueOf(this.mOnItemVisibilityChangedDelegate == null), Boolean.valueOf(itemList.mOnItemVisibilityChangedDelegate == null)) && Objects.equals(this.mNoItemsMessage, itemList.mNoItemsMessage)) {
                    return true;
                }
            }
        }
        return false;
    }

    public List<chp> getItems() {
        return clb.a(this.mItems);
    }

    public CarText getNoItemsMessage() {
        return this.mNoItemsMessage;
    }

    public cig getOnItemVisibilityChangedDelegate() {
        return this.mOnItemVisibilityChangedDelegate;
    }

    public cii getOnSelectedDelegate() {
        return this.mOnSelectedDelegate;
    }

    public int getSelectedIndex() {
        return this.mSelectedIndex;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mSelectedIndex), this.mItems, Boolean.valueOf(this.mOnSelectedDelegate == null), Boolean.valueOf(this.mOnItemVisibilityChangedDelegate == null), this.mNoItemsMessage);
    }

    public chq toBuilder() {
        return new chq(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[ items: ");
        List<chp> list = this.mItems;
        sb.append(list != null ? list.toString() : null);
        sb.append(", selected: ");
        sb.append(this.mSelectedIndex);
        sb.append("]");
        return sb.toString();
    }

    public ItemList(chq chqVar) {
        this.mSelectedIndex = chqVar.b;
        this.mItems = clb.b(chqVar.a);
        this.mNoItemsMessage = chqVar.e;
        this.mOnSelectedDelegate = chqVar.c;
        this.mOnItemVisibilityChangedDelegate = chqVar.d;
    }
}
