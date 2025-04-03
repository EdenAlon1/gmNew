package com.google.android.apps.messaging.ui.search.presenter;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery;
import defpackage.ddpw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class FreeTextFilterDataItem extends SearchFilterDataItem implements ddpw {
    public FreeTextFilterDataItem(SearchQuery.FreeTextSearchFilter freeTextSearchFilter, String str) {
        super(freeTextSearchFilter, freeTextSearchFilter.a, str);
    }

    @Override // defpackage.ddpr
    public final int b() {
        return 8;
    }

    @Override // defpackage.ddpw
    public final int c() {
        return R.drawable.quantum_gm_ic_search_vd_theme_24;
    }

    @Override // com.google.android.apps.messaging.ui.search.presenter.SearchFilterDataItem
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final SearchQuery.FreeTextSearchFilter a() {
        return (SearchQuery.FreeTextSearchFilter) this.b;
    }
}
