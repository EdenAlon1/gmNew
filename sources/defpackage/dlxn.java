package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlxn implements ffjn {
    final /* synthetic */ dlvn a;

    public dlxn(dlvn dlvnVar) {
        this.a = dlvnVar;
    }

    @Override // defpackage.ffjn
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        long j;
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
            long a2 = dlwl.a(this.a, hfdVar);
            dlvn dlvnVar = this.a;
            hfdVar.v(-1027064125);
            if (dlvnVar.a != null) {
                j = ibw.d;
            } else {
                hfdVar.v(-2125960654);
                boolean z = dooy.f(hfdVar) && dlvnVar.d;
                hfdVar.o();
                if (z) {
                    j = ibw.d;
                } else if (dlvnVar.d) {
                    j = ibw.a;
                } else if (dlvnVar.c && dlvnVar.b) {
                    j = ibw.a;
                } else {
                    hfdVar.v(-2125956369);
                    boolean z2 = dooy.f(hfdVar) && dlvnVar.b;
                    hfdVar.o();
                    if (z2) {
                        j = ibw.d;
                    } else {
                        hfdVar.v(-2125953576);
                        j = gft.a(hfdVar).g;
                        hfdVar.o();
                    }
                }
            }
            long j2 = j;
            hfdVar.o();
            dlxp.d(a2, j2, hfdVar, 0);
            dlvn dlvnVar2 = this.a;
            hfdVar.v(-537126992);
            dmae dmaeVar = dlvnVar2.g;
            if (dmaeVar == null) {
                ffcuVar = null;
            } else {
                dlvn dlvnVar3 = this.a;
                a = ebqVar.a(hvi.e, 1.0f, true);
                dmad.a(dmaeVar, ebs.e(a, 56.0f), dlwl.a(dlvnVar3, hfdVar), dlwl.b(dlvnVar3, hfdVar), 0.0f, 0.0f, hfdVar, 0, 48);
                hfdVar = hfdVar;
                ffcuVar = ffcu.a;
            }
            hfdVar.o();
            hfdVar.v(-537127561);
            if (ffcuVar == null) {
                dlxp.f(ebqVar, dlwl.b(this.a, hfdVar), hfdVar, 0);
            }
            hfdVar.o();
            dlvn dlvnVar4 = this.a;
            dlxp.j(dlvnVar4.f, dlwl.c(dlvnVar4, hfdVar), hfdVar, 0);
            if (this.a.e != null) {
                ebv.a(ebs.e(ebs.o(hvi.e, 40.0f), 1.0f), hfdVar);
            }
        }
        return ffcu.a;
    }
}
