package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eoda extends eodb implements Serializable {
    private static final long serialVersionUID = 0;
    final long a;

    public eoda(long j) {
        this.a = j;
    }

    @Override // defpackage.eodb
    public final int a() {
        return (int) this.a;
    }

    @Override // defpackage.eodb
    public final int b() {
        return 64;
    }

    @Override // defpackage.eodb
    public final long c() {
        return this.a;
    }

    @Override // defpackage.eodb
    public final boolean d(eodb eodbVar) {
        return this.a == eodbVar.c();
    }

    @Override // defpackage.eodb
    public final byte[] e() {
        return new byte[]{(byte) this.a, (byte) (r0 >> 8), (byte) (r0 >> 16), (byte) (r0 >> 24), (byte) (r0 >> 32), (byte) (r0 >> 40), (byte) (r0 >> 48), (byte) (r0 >> 56)};
    }

    @Override // defpackage.eodb
    public final void g(byte[] bArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) (this.a >> (i2 * 8));
        }
    }
}
