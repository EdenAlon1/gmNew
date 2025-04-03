package defpackage;

import com.google.android.apps.messaging.gaia.signoutaccount.SignOutAccountViewModel;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adow implements ffjm {
    final /* synthetic */ adpj a;
    final /* synthetic */ deoa b;

    public adow(adpj adpjVar, deoa deoaVar) {
        this.a = adpjVar;
        this.b = deoaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else if (this.a.a() == null) {
            hfdVar.v(1731100229);
            adqe adqeVar = (adqe) ((SignOutAccountViewModel) this.a.k.a()).a;
            fgcp fgcpVar = new fgcp(new adpx(adqeVar, null));
            ffsk ffskVar = adqeVar.b;
            int i = fgcz.a;
            adqr.f(fgbn.b(fgcpVar, ffskVar, fgcy.a(0L, 3), null), hfdVar, 0);
            hfdVar.o();
        } else {
            hfdVar.v(1731190904);
            deok.c(this.b, hfdVar, 0);
            hfdVar.o();
        }
        return ffcu.a;
    }
}
