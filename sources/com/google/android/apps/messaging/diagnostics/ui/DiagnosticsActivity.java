package com.google.android.apps.messaging.diagnostics.ui;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.diagnostics.ui.DiagnosticsActivity;
import defpackage.achr;
import defpackage.cwml;
import defpackage.im;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DiagnosticsActivity extends achr {
    @Override // defpackage.cwqd, defpackage.cwpv, defpackage.cwps
    public final cwml eY() {
        return cwml.g;
    }

    @Override // defpackage.cwqd, defpackage.cwpv, defpackage.cwps, defpackage.cwqf, defpackage.efac, defpackage.eg, defpackage.abe, defpackage.hl, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.diagnostics_activity);
        im k = k();
        if (k != null) {
            k.setDisplayHomeAsUpEnabled(true);
            k.setTitle(R.string.diagnostics_activity_title);
        }
        Toolbar eZ = eZ();
        if (eZ != null) {
            eZ.t(new View.OnClickListener() { // from class: ache
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DiagnosticsActivity.this.gE().d();
                }
            });
        }
    }
}
