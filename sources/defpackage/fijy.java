package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final /* synthetic */ class fijy implements Runnable {
    public final /* synthetic */ fikx a;
    public final /* synthetic */ fiky b;

    public /* synthetic */ fijy(fikx fikxVar, fiky fikyVar) {
        this.a = fikxVar;
        this.b = fikyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.b.a();
        } catch (Throwable th) {
            this.a.c(th);
        }
    }
}
