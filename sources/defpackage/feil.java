package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class feil implements fesc {
    protected final void a(int i) {
        if (f() < i) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // defpackage.fesc
    public void c() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.fesc
    public boolean d() {
        return false;
    }

    @Override // defpackage.fesc
    public void b() {
    }

    @Override // defpackage.fesc, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
