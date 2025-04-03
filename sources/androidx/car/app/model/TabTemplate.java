package androidx.car.app.model;

import defpackage.cfs;
import defpackage.cjb;
import defpackage.cje;
import defpackage.cjg;
import defpackage.clb;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
@cfs
/* loaded from: classes.dex */
public class TabTemplate implements cjg {
    private final String mActiveTabContentId;
    private final Action mHeaderAction;
    private final boolean mIsLoading;
    private final cjb mTabCallbackDelegate;
    private final TabContents mTabContents;
    private final List<Tab> mTabs;

    private TabTemplate() {
        this.mIsLoading = false;
        this.mHeaderAction = null;
        this.mTabs = Collections.EMPTY_LIST;
        this.mTabContents = null;
        this.mTabCallbackDelegate = null;
        this.mActiveTabContentId = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabTemplate)) {
            return false;
        }
        TabTemplate tabTemplate = (TabTemplate) obj;
        return this.mIsLoading == tabTemplate.mIsLoading && Objects.equals(this.mHeaderAction, tabTemplate.mHeaderAction) && Objects.equals(this.mTabs, tabTemplate.mTabs) && Objects.equals(this.mTabContents, tabTemplate.mTabContents) && Objects.equals(this.mActiveTabContentId, tabTemplate.getActiveTabContentId());
    }

    public String getActiveTabContentId() {
        String str = this.mActiveTabContentId;
        str.getClass();
        return str;
    }

    public Action getHeaderAction() {
        Action action = this.mHeaderAction;
        action.getClass();
        return action;
    }

    public cjb getTabCallbackDelegate() {
        cjb cjbVar = this.mTabCallbackDelegate;
        cjbVar.getClass();
        return cjbVar;
    }

    public TabContents getTabContents() {
        TabContents tabContents = this.mTabContents;
        tabContents.getClass();
        return tabContents;
    }

    public List<Tab> getTabs() {
        return clb.a(this.mTabs);
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mIsLoading), this.mHeaderAction, this.mTabs, this.mTabContents, this.mActiveTabContentId);
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public String toString() {
        return "TabTemplate";
    }

    TabTemplate(cje cjeVar) {
        boolean z = cjeVar.b;
        this.mIsLoading = false;
        Action action = cjeVar.c;
        this.mHeaderAction = null;
        List list = cjeVar.d;
        this.mTabs = clb.b(null);
        TabContents tabContents = cjeVar.e;
        this.mTabContents = null;
        cjb cjbVar = cjeVar.a;
        this.mTabCallbackDelegate = null;
        String str = cjeVar.f;
        this.mActiveTabContentId = null;
    }
}
