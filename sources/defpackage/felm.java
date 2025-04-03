package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class felm implements Runnable {
    final /* synthetic */ fdyv a;
    final /* synthetic */ fema b;

    public felm(fema femaVar, fdyv fdyvVar) {
        this.a = fdyvVar;
        this.b = femaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.f.j(this.a);
    }
}
