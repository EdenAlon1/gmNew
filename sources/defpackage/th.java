package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class th implements Runnable {
    final /* synthetic */ ti a;

    public th(ti tiVar) {
        this.a = tiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ti tiVar = this.a;
        tiVar.b = null;
        tiVar.drawableStateChanged();
    }
}
