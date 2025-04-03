package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class krz implements Runnable {
    final /* synthetic */ ksp a;
    final /* synthetic */ Object b;

    public krz(ksp kspVar, Object obj) {
        this.a = kspVar;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.accept(this.b);
    }
}
