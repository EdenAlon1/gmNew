package com.google.android.apps.messaging.ui.mediapicker.c2o.customization;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem;
import defpackage.dcay;
import defpackage.dcbl;
import defpackage.dcbn;
import defpackage.epto;
import defpackage.epts;
import defpackage.im;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CategoryCustomizationActivity extends dcbn {
    public CustomizationModel K;
    private CustomizationRecyclerView L;
    private dcbl M;

    @Override // defpackage.dbxx
    protected final epts M() {
        return epts.UNKNOWN_COMPOSE_SCREEN_CATEGORY;
    }

    @Override // defpackage.dbxx
    protected final Class N() {
        return MediaContentItem.class;
    }

    @Override // defpackage.dbxx, defpackage.cwpv, defpackage.cwps, defpackage.cwqf, defpackage.efac, defpackage.eg, defpackage.abe, defpackage.hl, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.compose2o_customization_activity);
        setTitle(R.string.c2o_customization_activity_title);
        im k = k();
        if (k != null) {
            k.setHomeAsUpIndicator(0);
        }
        this.L = (CustomizationRecyclerView) findViewById(R.id.customization_recycler_view);
        this.K = (CustomizationModel) getIntent().getParcelableExtra("customization_model");
        dcbl dcblVar = new dcbl(this, this.K);
        this.M = dcblVar;
        this.L.am(dcblVar);
        dcbl dcblVar2 = this.M;
        dcblVar2.d.f(this.L);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.ad(1);
        this.L.ap(linearLayoutManager);
        gE().b(this, new dcay(this));
        af(epto.LOADED);
    }
}
