package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbih implements AutoCloseable {
    final /* synthetic */ dtve a;
    final /* synthetic */ dtve b;

    public bbih(dtve dtveVar, dtve dtveVar2) {
        this.a = dtveVar;
        this.b = dtveVar2;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        bbii.g(this.a, this.b, "backupDb");
    }
}
