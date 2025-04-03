package defpackage;

import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeak extends edzq implements eeok {
    private final eeos a;

    public eeak(OutputStream outputStream) {
        super(outputStream);
        this.a = eeos.a(eeaa.f);
    }

    public final /* synthetic */ void a() {
        super.close();
    }

    public final /* synthetic */ void b(byte[] bArr) {
        super.write(bArr);
    }

    public final /* synthetic */ void c(byte[] bArr, int i, int i2) {
        super.write(bArr, i, i2);
    }

    @Override // defpackage.edzq, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.d(eeaa.CLOSING, new eeoa(new eeob() { // from class: eeaj
            @Override // defpackage.eeob
            public final void a() {
                eeak.this.a();
            }
        }), eeaa.CLOSED);
    }

    public final /* synthetic */ void d(int i) {
        super.write(i);
    }

    @Override // defpackage.eeok
    public final void e(eeon eeonVar) {
        this.a.f(eeonVar);
    }

    @Override // defpackage.edzq, java.io.OutputStream
    public final void write(final int i) {
        this.a.c(eeaa.ACTIVE, new eeoa(new eeob() { // from class: eeai
            @Override // defpackage.eeob
            public final void a() {
                eeak.this.d(i);
            }
        }));
    }

    @Override // defpackage.edzq, java.io.OutputStream
    public final void write(final byte[] bArr) {
        this.a.c(eeaa.ACTIVE, new eeoa(new eeob() { // from class: eeah
            @Override // defpackage.eeob
            public final void a() {
                eeak.this.b(bArr);
            }
        }));
    }

    @Override // defpackage.edzq, java.io.OutputStream
    public final void write(final byte[] bArr, final int i, final int i2) {
        this.a.c(eeaa.ACTIVE, new eeoa(new eeob() { // from class: eeag
            @Override // defpackage.eeob
            public final void a() {
                eeak.this.c(bArr, i, i2);
            }
        }));
    }
}
