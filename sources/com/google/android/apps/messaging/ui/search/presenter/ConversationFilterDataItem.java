package com.google.android.apps.messaging.ui.search.presenter;

import com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ConversationFilterDataItem extends SearchFilterDataItem {
    public ConversationFilterDataItem(SearchQuery.ConversationSearchFilter conversationSearchFilter) {
        super(conversationSearchFilter, "", "");
    }

    @Override // defpackage.ddpr
    public final int b() {
        return 9;
    }

    @Override // com.google.android.apps.messaging.ui.search.presenter.SearchFilterDataItem
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final SearchQuery.ConversationSearchFilter a() {
        return (SearchQuery.ConversationSearchFilter) this.b;
    }
}
