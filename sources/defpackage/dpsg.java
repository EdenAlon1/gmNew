package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class dpsg extends ffkh implements ffix {
    public dpsg(Object obj) {
        super(0, obj, dptb.class, "toggleFlash", "toggleFlash()V", 0);
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        int i;
        fgcm fgcmVar;
        Object c;
        dptb dptbVar = (dptb) this.g;
        dptbVar.g();
        int i2 = ((dptl) dptbVar.h.c()).c;
        int i3 = 2;
        if (i2 != 1) {
            if (i2 != 2) {
                i = 1;
                dptbVar.c.o(i);
                fgcmVar = dptbVar.h;
                do {
                    c = fgcmVar.c();
                } while (!fgcmVar.g(c, dptl.a((dptl) c, 0, null, i, null, false, null, null, null, 1048571)));
                return ffcu.a;
            }
            i3 = 0;
        }
        i = i3;
        dptbVar.c.o(i);
        fgcmVar = dptbVar.h;
        do {
            c = fgcmVar.c();
        } while (!fgcmVar.g(c, dptl.a((dptl) c, 0, null, i, null, false, null, null, null, 1048571)));
        return ffcu.a;
    }
}
