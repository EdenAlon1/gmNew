package com.google.android.apps.messaging.ui.vcard;

import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.apps.messaging.R;
import defpackage.csix;
import defpackage.cwpv;
import defpackage.ea;
import defpackage.im;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class VCardDetailActivity extends cwpv {
    @Override // defpackage.efac, defpackage.eg
    public final void h(ea eaVar) {
        super.h(eaVar);
        if (eaVar instanceof VCardDetailFragment) {
            Uri uri = (Uri) getIntent().getParcelableExtra("vcard_uri");
            uri.getClass();
            csix.k(!r3.a.g());
            ((VCardDetailFragment) eaVar).c = uri;
        }
    }

    @Override // defpackage.cwpv, defpackage.cwps, defpackage.cwqf, defpackage.efac, defpackage.eg, defpackage.abe, defpackage.hl, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.vcard_detail_activity);
        im k = k();
        if (k != null) {
            k.setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override // defpackage.cwpv, defpackage.efac, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        gE().d();
        return true;
    }
}
