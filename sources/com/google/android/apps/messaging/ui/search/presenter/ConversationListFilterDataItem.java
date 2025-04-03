package com.google.android.apps.messaging.ui.search.presenter;

import com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery;
import defpackage.cbsy;
import defpackage.ddok;
import defpackage.ddpw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ConversationListFilterDataItem extends SearchFilterDataItem implements ddpw, ddok {
    public ConversationListFilterDataItem(SearchQuery.SearchFilter searchFilter) {
        super(searchFilter, "", "");
    }

    @Override // defpackage.ddpr
    public final int b() {
        return a().a.f;
    }

    @Override // defpackage.ddpw
    public final int c() {
        return a().a.a;
    }

    @Override // com.google.android.apps.messaging.ui.search.presenter.SearchFilterDataItem
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final SearchQuery.ConversationListSearchFilter a() {
        return (SearchQuery.ConversationListSearchFilter) this.b;
    }

    @Override // com.google.android.apps.messaging.ui.search.presenter.SearchFilterDataItem
    public final String e() {
        return a().a.b;
    }

    @Override // com.google.android.apps.messaging.ui.search.presenter.SearchFilterDataItem
    public final String f() {
        return a().a.b;
    }

    @Override // defpackage.ddok
    public final cbsy gH() {
        return a().a.e;
    }

    @Override // com.google.android.apps.messaging.ui.search.presenter.SearchFilterDataItem
    public final String toString() {
        return e();
    }
}
