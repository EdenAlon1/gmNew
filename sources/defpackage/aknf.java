package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aknf implements cnjv {
    private final ffbr a;

    public aknf(ffbr ffbrVar) {
        this.a = ffbrVar;
    }

    @Override // defpackage.cnjv
    public final elfl fM(boolean z) {
        Intent intent = new Intent();
        intent.setAction("com.google.android.apps.messaging.samsung.mde.DEFAULT_SMS_PACKAGE_CHANGED");
        intent.putExtra("EXTRA_IS_DEFAULT_SMS_APP", z);
        ((akne) this.a.b()).a(intent);
        return elfo.e(null);
    }
}
