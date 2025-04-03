package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.ui.rcs.setup.manual.CountryCodePickerActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddai extends adu {
    final /* synthetic */ ddae a;

    public ddai(ddae ddaeVar) {
        this.a = ddaeVar;
    }

    @Override // defpackage.adu
    public final /* bridge */ /* synthetic */ Intent a(Context context, Object obj) {
        Intent intent = new Intent(this.a.d.fe(), (Class<?>) CountryCodePickerActivity.class);
        efto eftoVar = this.a.s;
        intent.putExtra("com.google.android.apps.messaging.ui.rcs.setup.manual.extra.COUNTRY_CODE_SELECTED", eftoVar == null ? null : eftoVar.toByteArray());
        return intent;
    }

    @Override // defpackage.adu
    public final /* bridge */ /* synthetic */ Object b(int i, Intent intent) {
        if (i == -1 && intent != null) {
            try {
                byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.apps.messaging.ui.rcs.setup.manual.extra.COUNTRY_CODE_SELECTED");
                if (byteArrayExtra != null) {
                    return (efto) eyfy.parseFrom(efto.a, byteArrayExtra, eyfc.a());
                }
            } catch (eygu unused) {
            }
        }
        return this.a.f();
    }
}
