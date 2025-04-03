package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class felp implements Runnable {
    final /* synthetic */ fdys a;
    final /* synthetic */ fema b;

    public felp(fema femaVar, fdys fdysVar) {
        this.a = fdysVar;
        this.b = femaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.f.i(this.a);
    }
}
