package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egxd implements ffjn {
    final /* synthetic */ egub a;
    final /* synthetic */ Account b;

    public egxd(egub egubVar, Account account) {
        this.a = egubVar;
        this.b = account;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        egtj egtjVar = (egtj) obj;
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        egtjVar.getClass();
        hfdVar.v(-1734149171);
        boolean F = hfdVar.F(this.a) | hfdVar.F(this.b);
        Object f = hfdVar.f();
        if (F || f == hfc.a) {
            final Account account = this.b;
            final egub egubVar = this.a;
            ffix ffixVar = new ffix() { // from class: egxc
                @Override // defpackage.ffix
                public final Object invoke() {
                    egub.this.a(account);
                    return ffcu.a;
                }
            };
            hfdVar.y(ffixVar);
            f = ffixVar;
        }
        hfdVar.o();
        dwfj.c(egtjVar.a((ffix) f), null, false, null, null, null, null, eguk.a, hfdVar, 805306368, 510);
        return ffcu.a;
    }
}
