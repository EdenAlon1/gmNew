package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaig implements eaha {
    public static final entd a = entd.c("GnpSdk");
    public final eafe b;

    public eaig(eafe eafeVar) {
        this.b = eafeVar;
    }

    @Override // defpackage.eaha
    public final void a(Intent intent, eafp eafpVar, long j) {
        eafpVar.getClass();
        ffqz.a(ffhe.a, new eaif(this, null));
    }

    @Override // defpackage.eaha
    public final boolean b(Intent intent) {
        return ffkj.e("android.intent.action.BOOT_COMPLETED", intent.getAction());
    }
}
