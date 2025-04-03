package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgif extends fgih {
    public static final fgif a = new fgif();

    private fgif() {
        super(fgik.c, fgik.d, fgik.e, fgik.a);
    }

    @Override // defpackage.fgih, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.ffsd
    public final ffsd i(int i) {
        fggy.a(1);
        return fgik.c <= 1 ? this : super.i(1);
    }

    @Override // defpackage.ffsd
    public final String toString() {
        return "Dispatchers.Default";
    }
}
