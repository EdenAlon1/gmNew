package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fjf implements ffxy {
    final /* synthetic */ List a;
    final /* synthetic */ ffsk b;
    final /* synthetic */ fkk c;

    public fjf(List list, ffsk ffskVar, fkk fkkVar) {
        this.a = list;
        this.b = ffskVar;
        this.c = fkkVar;
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
        ffqy.d(this.b, null, null, new fje(this.c, (dwm) ffdx.Q(this.a), null), 3);
        return ffcu.a;
    }
}
