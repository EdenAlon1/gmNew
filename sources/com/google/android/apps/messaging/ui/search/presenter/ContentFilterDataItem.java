package com.google.android.apps.messaging.ui.search.presenter;

import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery;
import defpackage.cbsy;
import defpackage.csux;
import defpackage.ddok;
import defpackage.ddps;
import defpackage.ddpw;
import defpackage.ensz;
import defpackage.entd;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ContentFilterDataItem extends SearchFilterDataItem implements ddpw, ddok {
    private static final entd d = entd.c("BugleSearch");
    public final ddps a;
    private final Resources e;
    private final int f;

    public ContentFilterDataItem(SearchQuery.ContentSearchFilter contentSearchFilter, Resources resources, int i, int i2) {
        super(contentSearchFilter, "", "");
        this.e = resources;
        this.f = i;
        this.a = new ddps(resources, i2);
    }

    @Override // defpackage.ddpr
    public final int b() {
        switch (a().a) {
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                return 1;
        }
    }

    @Override // defpackage.ddpw
    public final int c() {
        SearchQuery.ContentSearchFilter a = a();
        int i = a.a;
        if (i == 2) {
            return R.drawable.quantum_gm_ic_image_vd_theme_24;
        }
        if (i == 3) {
            return R.drawable.quantum_gm_ic_movie_vd_theme_24;
        }
        if (i == 4) {
            return R.drawable.quantum_gm_ic_link_vd_theme_24;
        }
        if (i == 5) {
            return R.drawable.quantum_gm_ic_place_vd_theme_24;
        }
        ensz enszVar = (ensz) d.j();
        enszVar.Y(csux.U, Integer.valueOf(a.a));
        ((ensz) enszVar.h("com/google/android/apps/messaging/ui/search/presenter/ContentFilterDataItem", "getSuggestionIconResourceId", 74, "ContentFilterDataItem.java")).q("Unknown content type. Returning default icon.");
        return R.drawable.quantum_gm_ic_search_vd_theme_24;
    }

    @Override // com.google.android.apps.messaging.ui.search.presenter.SearchFilterDataItem
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final SearchQuery.ContentSearchFilter a() {
        return (SearchQuery.ContentSearchFilter) this.b;
    }

    @Override // com.google.android.apps.messaging.ui.search.presenter.SearchFilterDataItem
    public final String e() {
        return this.e.getString(this.f);
    }

    @Override // com.google.android.apps.messaging.ui.search.presenter.SearchFilterDataItem
    public final String f() {
        return this.e.getString(this.f);
    }

    @Override // defpackage.ddok
    public final cbsy gH() {
        int i = a().a;
        if (i == 2) {
            return cbsy.h;
        }
        if (i == 3) {
            return cbsy.i;
        }
        if (i == 4) {
            return cbsy.k;
        }
        if (i == 5) {
            return cbsy.j;
        }
        throw new IllegalArgumentException("Unknown position for " + a().a);
    }

    @Override // com.google.android.apps.messaging.ui.search.presenter.SearchFilterDataItem
    public final int hashCode() {
        return Objects.hash(this.b, Integer.valueOf(this.f));
    }

    @Override // com.google.android.apps.messaging.ui.search.presenter.SearchFilterDataItem
    public final String toString() {
        return e();
    }
}
