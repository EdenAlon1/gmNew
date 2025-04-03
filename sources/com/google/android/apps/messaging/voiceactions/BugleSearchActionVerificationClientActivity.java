package com.google.android.apps.messaging.voiceactions;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.messaging.voiceactions.BugleSearchActionVerificationClientActivity;
import defpackage.cgcr;
import defpackage.cgcs;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class BugleSearchActionVerificationClientActivity extends Activity {
    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        final Intent intent2 = new Intent(this, (Class<?>) BugleSearchActionVerificationClientService.class);
        intent2.putExtra("SearchActionVerificationClientExtraIntent", intent);
        cgcs.a(new cgcr() { // from class: dedz
            @Override // defpackage.cgcr
            public final void a() {
                BugleSearchActionVerificationClientActivity.this.startForegroundService(intent2);
            }
        });
        if (intent.getBooleanExtra("EXPECT_EXTERNAL_APP_UI", false)) {
            return;
        }
        finish();
    }
}
