package com.google.android.apps.messaging.ui.debug;

import android.os.Bundle;
import com.google.android.apps.messaging.R;
import defpackage.cwml;
import defpackage.davn;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class DebugGServiceKeysActivity extends davn {
    @Override // defpackage.cwps
    public final cwml eY() {
        return cwml.h;
    }

    @Override // defpackage.cwps, defpackage.cwqf, defpackage.efac, defpackage.eg, defpackage.abe, defpackage.hl, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.debug_gservicekeys_activity);
        setTitle("Auto-ramp Overrides / GService keys");
    }
}
