package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wuz implements ffix {
    final /* synthetic */ wvd a;
    final /* synthetic */ aaxe b;

    public wuz(wvd wvdVar, aaxe aaxeVar) {
        this.a = wvdVar;
        this.b = aaxeVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        alxr alxrVar = (alxr) ffdx.T(this.b.a);
        wvd wvdVar = this.a;
        if (wvdVar.c.c(wvdVar.a)) {
            wvdVar.b.E(alxrVar.b());
            zdo zdoVar = wvdVar.e;
            if (alxrVar.a() == alxq.b && ((csmz) zdoVar.c.a()).f() == csod.UNAVAILABLE) {
                zdo zdoVar2 = wvdVar.e;
                axol.k(zdoVar2.d, null, new zdn(zdoVar2, null), 3);
                ((akzt) zdoVar2.e.b()).c("Bugle.UI.Conversations.DataWarning.Downloading.Shown");
            }
        } else {
            wvdVar.d.a();
        }
        return ffcu.a;
    }
}
