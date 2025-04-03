package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fry implements ffxy {
    final /* synthetic */ fsa a;
    final /* synthetic */ ffsk b;

    public fry(fsa fsaVar, ffsk ffskVar) {
        this.a = fsaVar;
        this.b = ffskVar;
    }

    @Override // defpackage.ffxy
    public final /* bridge */ /* synthetic */ Object fQ(Object obj, ffgu ffguVar) {
        dwm dwmVar = (dwm) obj;
        if (dwmVar instanceof dwr) {
            fsa fsaVar = this.a;
            if (fsaVar.g) {
                fsaVar.k((dwr) dwmVar);
            } else {
                fsaVar.h.h(dwmVar);
            }
        } else {
            fsa fsaVar2 = this.a;
            ffsk ffskVar = this.b;
            fsg fsgVar = fsaVar2.d;
            if (fsgVar == null) {
                fsg fsgVar2 = new fsg(fsaVar2.b, fsaVar2.c);
                ith.a(fsaVar2);
                fsaVar2.d = fsgVar2;
                fsgVar = fsgVar2;
            }
            boolean z = dwmVar instanceof dwk;
            if (z) {
                fsgVar.d.add(dwmVar);
            } else if (dwmVar instanceof dwl) {
                fsgVar.d.remove(((dwl) dwmVar).a);
            } else if (dwmVar instanceof dwf) {
                fsgVar.d.add(dwmVar);
            } else if (dwmVar instanceof dwg) {
                fsgVar.d.remove(((dwg) dwmVar).a);
            } else if (dwmVar instanceof dwd) {
                fsgVar.d.add(dwmVar);
            } else if (dwmVar instanceof dwe) {
                fsgVar.d.remove(((dwe) dwmVar).a);
            } else if (dwmVar instanceof dwc) {
                fsgVar.d.remove(((dwc) dwmVar).a);
            }
            dwm dwmVar2 = (dwm) ffdx.Q(fsgVar.d);
            if (!ffkj.e(fsgVar.e, dwmVar2)) {
                if (dwmVar2 != null) {
                    frj frjVar = (frj) fsgVar.b.invoke();
                    float f = z ? frjVar.c : dwmVar instanceof dwf ? frjVar.b : dwmVar instanceof dwd ? frjVar.a : 0.0f;
                    boolean z2 = dwmVar2 instanceof dwk;
                    dbu dbuVar = frx.a;
                    ffqy.d(ffskVar, null, null, new fse(fsgVar, f, z2 ? frx.a : dwmVar2 instanceof dwf ? new dbu(45, cyp.d, 2) : dwmVar2 instanceof dwd ? new dbu(45, cyp.d, 2) : frx.a, null), 3);
                } else {
                    dwm dwmVar3 = fsgVar.e;
                    boolean z3 = dwmVar3 instanceof dwk;
                    dbu dbuVar2 = frx.a;
                    ffqy.d(ffskVar, null, null, new fsf(fsgVar, z3 ? frx.a : dwmVar3 instanceof dwf ? frx.a : dwmVar3 instanceof dwd ? new dbu(150, cyp.d, 2) : frx.a, null), 3);
                }
                fsgVar.e = dwmVar2;
            }
        }
        return ffcu.a;
    }
}
