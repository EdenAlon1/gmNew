package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fvq implements ffxy {
    final /* synthetic */ hss a;

    public fvq(hss hssVar) {
        this.a = hssVar;
    }

    @Override // defpackage.ffxy
    public final /* bridge */ /* synthetic */ Object fQ(Object obj, ffgu ffguVar) {
        dwm dwmVar = (dwm) obj;
        if (dwmVar instanceof dwk) {
            this.a.add(dwmVar);
        } else if (dwmVar instanceof dwl) {
            this.a.remove(((dwl) dwmVar).a);
        } else if (dwmVar instanceof dwf) {
            this.a.add(dwmVar);
        } else if (dwmVar instanceof dwg) {
            this.a.remove(((dwg) dwmVar).a);
        } else if (dwmVar instanceof dwp) {
            this.a.add(dwmVar);
        } else if (dwmVar instanceof dwq) {
            this.a.remove(((dwq) dwmVar).a);
        } else if (dwmVar instanceof dwo) {
            this.a.remove(((dwo) dwmVar).a);
        }
        return ffcu.a;
    }
}
