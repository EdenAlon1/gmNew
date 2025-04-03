package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeaf extends edzp implements eeok {
    private final eeos a;

    public eeaf(InputStream inputStream) {
        super(inputStream);
        this.a = eeos.a(eeaa.f);
    }

    public final /* synthetic */ Integer a() {
        return Integer.valueOf(super.read());
    }

    public final /* synthetic */ Integer b(byte[] bArr) {
        return Integer.valueOf(super.read(bArr));
    }

    public final /* synthetic */ Integer c(byte[] bArr, int i, int i2) {
        return Integer.valueOf(super.read(bArr, i, i2));
    }

    @Override // defpackage.edzp, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.d(eeaa.CLOSING, new eeoa(new eeob() { // from class: eeab
            @Override // defpackage.eeob
            public final void a() {
                eeaf.this.d();
            }
        }), eeaa.CLOSED);
    }

    public final /* synthetic */ void d() {
        super.close();
    }

    @Override // defpackage.eeok
    public final void e(eeon eeonVar) {
        this.a.f(eeonVar);
    }

    @Override // defpackage.edzp, java.io.InputStream
    public final int read() {
        return ((Integer) this.a.c(eeaa.ACTIVE, new eeot() { // from class: eead
            @Override // defpackage.eeot
            public final /* synthetic */ Class a() {
                return IOException.class;
            }

            @Override // defpackage.eeot
            public final Object b() {
                return eeaf.this.a();
            }
        })).intValue();
    }

    @Override // defpackage.edzp, java.io.InputStream
    public final int read(final byte[] bArr) {
        return ((Integer) this.a.c(eeaa.ACTIVE, new eeot() { // from class: eeac
            @Override // defpackage.eeot
            public final /* synthetic */ Class a() {
                return IOException.class;
            }

            @Override // defpackage.eeot
            public final Object b() {
                return eeaf.this.b(bArr);
            }
        })).intValue();
    }

    @Override // defpackage.edzp, java.io.InputStream
    public final int read(final byte[] bArr, final int i, final int i2) {
        return ((Integer) this.a.c(eeaa.ACTIVE, new eeot() { // from class: eeae
            @Override // defpackage.eeot
            public final /* synthetic */ Class a() {
                return IOException.class;
            }

            @Override // defpackage.eeot
            public final Object b() {
                return eeaf.this.c(bArr, i, i2);
            }
        })).intValue();
    }
}
