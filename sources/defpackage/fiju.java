package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final /* synthetic */ class fiju implements Runnable {
    public final /* synthetic */ fikx a;
    public final /* synthetic */ fiky b;

    public /* synthetic */ fiju(fikx fikxVar, fiky fikyVar) {
        this.a = fikxVar;
        this.b = fikyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.b.a();
        } catch (Throwable th) {
            this.a.b(new fihr("System error", th));
        }
    }
}
