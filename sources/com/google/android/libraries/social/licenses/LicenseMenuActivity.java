package com.google.android.libraries.social.licenses;

import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.apps.messaging.R;
import defpackage.cg;
import defpackage.eeqw;
import defpackage.fr;
import defpackage.iy;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class LicenseMenuActivity extends iy {
    @Override // defpackage.eg, defpackage.abe, defpackage.hl, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.libraries_social_licenses_license_menu_activity);
        if (k() != null) {
            k().setDisplayHomeAsUpEnabled(true);
        }
        fr a = a();
        if (a.g(R.id.license_menu_fragment_container) instanceof eeqw) {
            return;
        }
        eeqw eeqwVar = new eeqw();
        cg cgVar = new cg(a);
        cgVar.s(R.id.license_menu_fragment_container, eeqwVar);
        cgVar.c();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }
}
