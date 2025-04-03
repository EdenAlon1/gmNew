package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwdw extends dwea {
    final /* synthetic */ dwdx a;

    public dwdw(dwdx dwdxVar) {
        this.a = dwdxVar;
    }

    @Override // defpackage.dwea
    public final void a(long j) {
        dwdx dwdxVar = this.a;
        dwdxVar.c++;
        if (dwdxVar.a(dwdxVar.a) || this.a.a.isStarted()) {
            return;
        }
        dwdx dwdxVar2 = this.a;
        if (dwdxVar2.b != -1 && dwdxVar2.c >= 0) {
            return;
        }
        dwdxVar2.a.start();
    }
}
