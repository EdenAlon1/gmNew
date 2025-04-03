package com.google.android.apps.messaging.cloudstore.fi;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.TextView;
import androidx.preference.Preference;
import com.google.android.apps.messaging.R;
import defpackage.ooi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class QrCodeScannerPreference extends Preference {
    private boolean a;

    public QrCodeScannerPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = true;
        this.A = R.layout.qr_code_scanner_preference_layout;
        aa();
    }

    @Override // androidx.preference.Preference
    public final void G(boolean z) {
        this.a = z;
        d();
    }

    @Override // androidx.preference.Preference
    public final boolean T() {
        return this.a;
    }

    @Override // androidx.preference.Preference
    public final void a(ooi ooiVar) {
        super.a(ooiVar);
        ((Button) ooiVar.C(R.id.scan_qr_code_preference_button)).setEnabled(this.a);
        ((TextView) ooiVar.C(android.R.id.title)).setTextColor(this.j.getColor(R.color.text_color_primary));
    }
}
