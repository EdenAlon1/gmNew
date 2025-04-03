package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eocy extends eodb implements Serializable {
    private static final long serialVersionUID = 0;
    final byte[] a;

    public eocy(byte[] bArr) {
        bArr.getClass();
        this.a = bArr;
    }

    @Override // defpackage.eodb
    public final int a() {
        int length = this.a.length;
        emxf.n(length >= 4, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", length);
        byte[] bArr = this.a;
        return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
    }

    @Override // defpackage.eodb
    public final int b() {
        return this.a.length * 8;
    }

    @Override // defpackage.eodb
    public final long c() {
        int length = this.a.length;
        emxf.n(length >= 8, "HashCode#asLong() requires >= 8 bytes (it only has %s bytes).", length);
        long j = this.a[0] & 255;
        for (int i = 1; i < Math.min(this.a.length, 8); i++) {
            j |= (this.a[i] & 255) << (i * 8);
        }
        return j;
    }

    @Override // defpackage.eodb
    public final boolean d(eodb eodbVar) {
        if (this.a.length != eodbVar.f().length) {
            return false;
        }
        boolean z = true;
        int i = 0;
        while (true) {
            byte[] bArr = this.a;
            if (i >= bArr.length) {
                return z;
            }
            z &= bArr[i] == eodbVar.f()[i];
            i++;
        }
    }

    @Override // defpackage.eodb
    public final byte[] e() {
        return (byte[]) this.a.clone();
    }

    @Override // defpackage.eodb
    public final byte[] f() {
        return this.a;
    }

    @Override // defpackage.eodb
    public final void g(byte[] bArr, int i) {
        System.arraycopy(this.a, 0, bArr, 0, i);
    }
}
