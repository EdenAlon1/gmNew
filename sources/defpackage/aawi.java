package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aawi implements abqq {
    private final ffbr a;

    public aawi(ffbr ffbrVar) {
        ffbrVar.getClass();
        this.a = ffbrVar;
    }

    @Override // defpackage.abqq, java.lang.AutoCloseable
    public final void close() {
        ayzs ayzsVar = (ayzs) this.a.b();
        if (ayzsVar.f != null) {
            ayzsVar.a();
            ayzsVar.f = null;
        }
    }
}
