package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfsx implements Runnable {
    final /* synthetic */ dfsy a;

    public dfsx(dfsy dfsyVar) {
        this.a = dfsyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dfqr dfqrVar = this.a.a.b;
        dfqrVar.n(String.valueOf(dfqrVar.getClass().getName()).concat(" disconnecting because it was signed out."));
    }
}
