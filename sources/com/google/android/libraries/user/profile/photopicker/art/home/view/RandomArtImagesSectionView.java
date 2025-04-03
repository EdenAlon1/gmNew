package com.google.android.libraries.user.profile.photopicker.art.home.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.user.profile.photopicker.art.home.view.RandomArtImagesSectionView;
import defpackage.dvxi;
import defpackage.dvxy;
import defpackage.dvyc;
import defpackage.efux;
import defpackage.efxq;
import defpackage.efzl;
import defpackage.efzn;
import defpackage.efzs;
import defpackage.efzt;
import defpackage.egaj;
import defpackage.egjk;
import defpackage.fazf;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class RandomArtImagesSectionView extends efxq {
    public efzt b;
    public dvyc c;
    public dvxy d;
    public final efzs e;
    public efux f;
    private final RecyclerView g;

    public RandomArtImagesSectionView(Context context) {
        this(context, null);
    }

    public RandomArtImagesSectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
        Object obj = context;
        if (!this.a) {
            while (!(obj instanceof fazf) && (obj instanceof ContextWrapper)) {
                obj = ((ContextWrapper) obj).getBaseContext();
            }
            ((fazf) obj).ab().a(this);
        }
        inflate(getContext(), R.layout.photo_picker_random_art_section, this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.photo_picker_recycler_grid);
        this.g = recyclerView;
        this.d.b(this, this.c.a(124721));
        recyclerView.getContext();
        recyclerView.ap(new GridLayoutManager(3, 0));
        efzt efztVar = this.b;
        efzn efznVar = new efzn() { // from class: efxs
            @Override // defpackage.efzn
            public final void a(long j, String str) {
                RandomArtImagesSectionView.this.f.c(j, str);
            }
        };
        egaj egajVar = (egaj) efztVar.a.b();
        egajVar.getClass();
        dvyc dvycVar = (dvyc) efztVar.b.b();
        dvycVar.getClass();
        dvxy dvxyVar = (dvxy) efztVar.c.b();
        dvxyVar.getClass();
        dvxi dvxiVar = (dvxi) efztVar.d.b();
        dvxiVar.getClass();
        egjk egjkVar = (egjk) efztVar.e.b();
        egjkVar.getClass();
        efzs efzsVar = new efzs(egajVar, dvycVar, dvxyVar, dvxiVar, egjkVar, efznVar);
        this.e = efzsVar;
        recyclerView.am(efzsVar);
        recyclerView.w(new efzl((int) getResources().getDimension(R.dimen.photo_picker_grid_spacing), getResources().getInteger(R.integer.photo_picker_random_art_num_rows), 0, false));
    }
}
