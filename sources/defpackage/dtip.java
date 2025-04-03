package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtip implements ffix {
    final /* synthetic */ int a;
    final /* synthetic */ dtlg b;
    final /* synthetic */ dtfd c;
    final /* synthetic */ hjz d;

    public dtip(int i, dtlg dtlgVar, hjz hjzVar, dtfd dtfdVar) {
        this.a = i;
        this.b = dtlgVar;
        this.d = hjzVar;
        this.c = dtfdVar;
    }

    @Override // defpackage.ffix
    public final /* synthetic */ Object invoke() {
        this.d.i(this.a);
        dteg dtegVar = (dteg) dteh.a.createBuilder();
        dtegVar.getClass();
        dtei.c(this.c, dtegVar);
        this.b.h.invoke(dtei.a(dtegVar));
        return ffcu.a;
    }
}
