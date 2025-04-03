package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alrx implements AutoCloseable {
    public final alrv a;
    public final ecda b;
    public boolean c = false;

    public alrx(alrv alrvVar, ecda ecdaVar) {
        this.a = alrvVar;
        this.b = ecdaVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.c) {
            return;
        }
        alrv alrvVar = this.a;
        alrvVar.R.b().c(this.b);
    }
}
