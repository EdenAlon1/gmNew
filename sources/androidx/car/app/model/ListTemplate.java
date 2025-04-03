package androidx.car.app.model;

import androidx.car.app.messaging.model.ConversationItem;
import defpackage.cfs;
import defpackage.cgw;
import defpackage.chk;
import defpackage.chp;
import defpackage.chq;
import defpackage.cht;
import defpackage.chu;
import defpackage.cjg;
import defpackage.clb;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
@cfs
/* loaded from: classes.dex */
public final class ListTemplate implements cjg {
    static final int MAX_ALLOWED_ITEMS = 100;
    static final int MAX_MESSAGES_PER_CONVERSATION = 10;

    @Deprecated
    private final ActionStrip mActionStrip;
    private final List<Action> mActions;
    private final Header mHeader;

    @Deprecated
    private final Action mHeaderAction;
    private final boolean mIsLoading;
    private final List<SectionedItemList> mSectionedLists;
    private final ItemList mSingleList;

    @Deprecated
    private final CarText mTitle;

    private ListTemplate() {
        this.mIsLoading = false;
        this.mTitle = null;
        this.mHeaderAction = null;
        this.mSingleList = null;
        this.mSectionedLists = Collections.EMPTY_LIST;
        this.mActionStrip = null;
        this.mActions = Collections.EMPTY_LIST;
        this.mHeader = null;
    }

    public static List<SectionedItemList> getTruncatedCopy(List<SectionedItemList> list) {
        chu chuVar = new chu();
        ArrayList arrayList = new ArrayList();
        for (SectionedItemList sectionedItemList : list) {
            arrayList.add(SectionedItemList.create(truncate(sectionedItemList.getItemList(), chuVar), sectionedItemList.getHeader().toCharSequence()));
            if (chuVar.a <= 0) {
                break;
            }
        }
        return arrayList;
    }

    public static ItemList truncate(ItemList itemList, chu chuVar) {
        chq chqVar = new chq(itemList);
        chqVar.a.clear();
        for (chp chpVar : itemList.getItems()) {
            if (chpVar instanceof ConversationItem) {
                ConversationItem conversationItem = (ConversationItem) chpVar;
                if (!chuVar.b(2)) {
                    break;
                }
                cgw cgwVar = new cgw(conversationItem);
                int min = Math.min(chuVar.a(), 10);
                int size = conversationItem.getMessages().size();
                int min2 = Math.min(size, min);
                cgwVar.f = conversationItem.getMessages().subList(size - min2, size);
                chqVar.b(new ConversationItem(cgwVar));
                chuVar.a -= min2;
            } else {
                if (!chuVar.b(1)) {
                    break;
                }
                chqVar.b(chpVar);
                chuVar.a();
            }
        }
        return chqVar.a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListTemplate)) {
            return false;
        }
        ListTemplate listTemplate = (ListTemplate) obj;
        return this.mIsLoading == listTemplate.mIsLoading && Objects.equals(this.mTitle, listTemplate.mTitle) && Objects.equals(this.mHeaderAction, listTemplate.mHeaderAction) && Objects.equals(this.mSingleList, listTemplate.mSingleList) && Objects.equals(this.mSectionedLists, listTemplate.mSectionedLists) && Objects.equals(this.mActionStrip, listTemplate.mActionStrip) && Objects.equals(this.mActions, listTemplate.mActions) && Objects.equals(this.mHeader, listTemplate.mHeader);
    }

    @Deprecated
    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public List<Action> getActions() {
        return this.mActions;
    }

    public Header getHeader() {
        Header header = this.mHeader;
        if (header != null) {
            return header;
        }
        if (this.mTitle == null && this.mHeaderAction == null && this.mActionStrip == null) {
            return null;
        }
        chk chkVar = new chk();
        CarText carText = this.mTitle;
        if (carText != null) {
            chkVar.d(carText);
        }
        Action action = this.mHeaderAction;
        if (action != null) {
            chkVar.c(action);
        }
        ActionStrip actionStrip = this.mActionStrip;
        if (actionStrip != null) {
            Iterator<Action> it = actionStrip.getActions().iterator();
            while (it.hasNext()) {
                chkVar.b(it.next());
            }
        }
        return chkVar.a();
    }

    @Deprecated
    public Action getHeaderAction() {
        return this.mHeaderAction;
    }

    public List<SectionedItemList> getSectionedLists() {
        return clb.a(this.mSectionedLists);
    }

    public ItemList getSingleList() {
        return this.mSingleList;
    }

    @Deprecated
    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mIsLoading), this.mTitle, this.mHeaderAction, this.mSingleList, this.mSectionedLists, this.mActionStrip, this.mHeader);
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public cht toBuilder() {
        return new cht(this);
    }

    public String toString() {
        return "ListTemplate";
    }

    public ListTemplate(cht chtVar) {
        this.mIsLoading = chtVar.a;
        this.mTitle = chtVar.d;
        this.mHeaderAction = chtVar.e;
        this.mSingleList = chtVar.b;
        this.mSectionedLists = clb.b(chtVar.c);
        this.mActionStrip = chtVar.f;
        this.mActions = clb.b(chtVar.g);
        this.mHeader = chtVar.h;
    }
}
