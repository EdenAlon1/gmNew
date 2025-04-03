package com.google.android.apps.messaging.ui.conversation.message.statuschangelist;

import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.apps.messaging.R;
import defpackage.czmk;
import defpackage.im;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class MessageStatusListActivity extends czmk {
    @Override // defpackage.cwpv, defpackage.cwps, defpackage.cwqf, defpackage.efac, defpackage.eg, defpackage.abe, defpackage.hl, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.message_status_list_activity);
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
