package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eefl {
    private int b = 0;
    public int a = 0;
    private final OutputStream c = new ByteArrayOutputStream();

    public final void a(byte[] bArr) {
        this.c.write(bArr);
        this.b += bArr.length;
        this.a++;
    }

    public final void b() {
        this.c.close();
    }

    public final void c() {
        this.c.flush();
    }

    public final void d() {
        ((ByteArrayOutputStream) this.c).reset();
        this.b = 0;
    }

    public final byte[] e() {
        return ((ByteArrayOutputStream) this.c).toByteArray();
    }

    public final void f(byte[] bArr, int i) {
        this.c.write(bArr, 0, i);
        this.b += i;
        this.a++;
    }
}
