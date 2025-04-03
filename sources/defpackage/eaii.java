package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaii implements eaha {
    public static final entd a = entd.c("GnpSdk");
    public final eafe b;

    public eaii(eafe eafeVar) {
        this.b = eafeVar;
    }

    @Override // defpackage.eaha
    public final void a(Intent intent, eafp eafpVar, long j) {
        eafpVar.getClass();
        ffqz.a(ffhe.a, new eaih(this, null));
    }

    @Override // defpackage.eaha
    public final boolean b(Intent intent) {
        return ffkj.e("android.intent.action.TIMEZONE_CHANGED", intent.getAction());
    }
}
