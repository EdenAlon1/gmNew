package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qsh implements Runnable {
    final /* synthetic */ ria a;

    public qsh(ria riaVar) {
        this.a = riaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.cancel(true);
    }
}
