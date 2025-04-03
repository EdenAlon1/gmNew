package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class evb implements ffxy {
    final /* synthetic */ cok a;
    final /* synthetic */ evc b;

    public evb(cok cokVar, evc evcVar) {
        this.a = cokVar;
        this.b = evcVar;
    }

    @Override // defpackage.ffxy
    public final /* bridge */ /* synthetic */ Object fQ(Object obj, ffgu ffguVar) {
        dwm dwmVar = (dwm) obj;
        if ((dwmVar instanceof dwk) || (dwmVar instanceof dwf) || (dwmVar instanceof dwp)) {
            this.a.h(dwmVar);
        } else if (dwmVar instanceof dwl) {
            this.a.g(((dwl) dwmVar).a);
        } else if (dwmVar instanceof dwg) {
            this.a.g(((dwg) dwmVar).a);
        } else if (dwmVar instanceof dwq) {
            this.a.g(((dwq) dwmVar).a);
        } else if (dwmVar instanceof dwo) {
            this.a.g(((dwo) dwmVar).a);
        }
        cok cokVar = this.a;
        Object[] objArr = cokVar.b;
        int i = cokVar.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            dwm dwmVar2 = (dwm) objArr[i3];
            if (dwmVar2 instanceof dwk) {
                i2 |= 2;
            } else if (dwmVar2 instanceof dwf) {
                i2 |= 1;
            } else if (dwmVar2 instanceof dwp) {
                i2 |= 4;
            }
        }
        this.b.b.i(i2);
        return ffcu.a;
    }
}
