package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abap implements abqq {
    private final ffbr a;

    public abap(ffbr ffbrVar) {
        this.a = ffbrVar;
    }

    @Override // defpackage.abqq, java.lang.AutoCloseable
    public final void close() {
        ((abam) this.a.b()).f();
    }
}
