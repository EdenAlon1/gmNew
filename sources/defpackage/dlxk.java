package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlxk implements ffjn {
    final /* synthetic */ dlvj a;

    public dlxk(dlvj dlvjVar) {
        this.a = dlvjVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hvi a;
        ffcu ffcuVar;
        ebq ebqVar = (ebq) obj;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ebqVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= true != hfdVar.D(ebqVar) ? 2 : 4;
        }
        if ((intValue & 19) == 18 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dlvj dlvjVar = this.a;
            dlxp.g(dlvjVar.a, dlvjVar.c, dlwl.a(dlvjVar, hfdVar), hfdVar, 0);
            dlvj dlvjVar2 = this.a;
            hfdVar.v(-833701456);
            dmae dmaeVar = dlvjVar2.g;
            if (dmaeVar == null) {
                ffcuVar = null;
            } else {
                dlvj dlvjVar3 = this.a;
                a = ebqVar.a(hvi.e, 1.0f, true);
                dmad.a(dmaeVar, ebs.e(a, 56.0f), dlwl.a(dlvjVar3, hfdVar), dlwl.b(dlvjVar3, hfdVar), 0.0f, 0.0f, hfdVar, 0, 48);
                hfdVar = hfdVar;
                ffcuVar = ffcu.a;
            }
            hfdVar.o();
            hfdVar.v(-833701900);
            if (ffcuVar == null) {
                dlvj dlvjVar4 = this.a;
                hfd hfdVar2 = hfdVar;
                dlxp.i(ebqVar, dlvjVar4.d, dlwl.a(dlvjVar4, hfdVar), dlwl.b(dlvjVar4, hfdVar2), hfdVar2, 0);
                hfdVar = hfdVar2;
            }
            hfdVar.o();
            dlvj dlvjVar5 = this.a;
            dlxp.j(dlvjVar5.b, dlwl.c(dlvjVar5, hfdVar), hfdVar, 0);
            if (this.a.f != null) {
                ebv.a(ebs.e(ebs.o(hvi.e, 40.0f), 1.0f), hfdVar);
            }
        }
        return ffcu.a;
    }
}
