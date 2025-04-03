package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class grp implements ffxy {
    final /* synthetic */ ffkz a;
    final /* synthetic */ grr b;

    public grp(ffkz ffkzVar, grr grrVar) {
        this.a = ffkzVar;
        this.b = grrVar;
    }

    @Override // defpackage.ffxy
    public final /* bridge */ /* synthetic */ Object fQ(Object obj, ffgu ffguVar) {
        dwm dwmVar = (dwm) obj;
        if (dwmVar instanceof dwp) {
            this.a.a++;
        } else if ((dwmVar instanceof dwq) || (dwmVar instanceof dwo)) {
            ffkz ffkzVar = this.a;
            ffkzVar.a--;
        }
        boolean z = this.a.a > 0;
        grr grrVar = this.b;
        if (grrVar.c != z) {
            grrVar.c = z;
            itz.b(grrVar);
        }
        return ffcu.a;
    }
}
