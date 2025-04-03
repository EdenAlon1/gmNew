package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fiki implements Runnable {
    final /* synthetic */ fikx a;

    public fiki(fikx fikxVar) {
        this.a = fikxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fikx fikxVar = this.a;
        fikxVar.m = fikxVar.p;
        fikxVar.p = null;
        fikxVar.h();
    }
}
