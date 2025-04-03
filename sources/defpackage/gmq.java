package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gmq implements ffxy {
    final /* synthetic */ hss a;

    public gmq(hss hssVar) {
        this.a = hssVar;
    }

    @Override // defpackage.ffxy
    public final /* bridge */ /* synthetic */ Object fQ(Object obj, ffgu ffguVar) {
        dwm dwmVar = (dwm) obj;
        if (dwmVar instanceof dwp) {
            this.a.add(dwmVar);
        } else if (dwmVar instanceof dwq) {
            this.a.remove(((dwq) dwmVar).a);
        } else if (dwmVar instanceof dwo) {
            this.a.remove(((dwo) dwmVar).a);
        } else if (dwmVar instanceof dwd) {
            this.a.add(dwmVar);
        } else if (dwmVar instanceof dwe) {
            this.a.remove(((dwe) dwmVar).a);
        } else if (dwmVar instanceof dwc) {
            this.a.remove(((dwc) dwmVar).a);
        }
        return ffcu.a;
    }
}
