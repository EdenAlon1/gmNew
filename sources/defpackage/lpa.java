package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lpa implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ lpb b;

    public lpa(lpb lpbVar, Object obj) {
        this.b = lpbVar;
        this.a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lpb lpbVar = this.b;
        Object obj = this.a;
        if (lpbVar.f()) {
            lpbVar.b(obj);
        } else {
            lpbVar.c(obj);
        }
        lpbVar.f = 3;
    }
}
