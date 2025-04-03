package androidx.car.app.model;

import androidx.car.app.serialization.ListDelegateImpl;
import defpackage.cfs;
import defpackage.chp;
import defpackage.cix;
import defpackage.ckw;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
@cfs
/* loaded from: classes.dex */
public abstract class Section<T extends chp> {
    private final ckw<T> mItemsDelegate;
    private final CarText mNoItemsMessage;
    private final CarText mTitle;

    protected Section() {
        this.mItemsDelegate = new ListDelegateImpl(Collections.EMPTY_LIST);
        this.mTitle = null;
        this.mNoItemsMessage = null;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Section)) {
            return false;
        }
        Section section = (Section) obj;
        return Objects.equals(this.mItemsDelegate, section.mItemsDelegate) && Objects.equals(this.mTitle, section.mTitle) && Objects.equals(this.mNoItemsMessage, section.mNoItemsMessage);
    }

    public ckw<T> getItemsDelegate() {
        return this.mItemsDelegate;
    }

    public CarText getNoItemsMessage() {
        return this.mNoItemsMessage;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mItemsDelegate, this.mTitle, this.mNoItemsMessage);
    }

    public String toString() {
        return "Section";
    }

    protected Section(cix<T, ?> cixVar) {
        List list = cixVar.c;
        this.mItemsDelegate = new ListDelegateImpl(DesugarCollections.unmodifiableList(null));
        CarText carText = cixVar.d;
        this.mTitle = null;
        CarText carText2 = cixVar.e;
        this.mNoItemsMessage = null;
    }
}
