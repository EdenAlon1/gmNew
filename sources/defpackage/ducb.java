package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ducb extends ducc {
    private final byte[] a;

    public ducb(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("Null keyMaterial");
        }
        this.a = bArr;
    }

    @Override // defpackage.ducc
    public final byte[] a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ducc) {
            ducc duccVar = (ducc) obj;
            duccVar.c();
            if (Arrays.equals(this.a, duccVar instanceof ducb ? ((ducb) duccVar).a : duccVar.a())) {
                duccVar.b();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.a) ^ 720379956) * 1000003) ^ 1;
    }

    public final String toString() {
        return "EncryptionKey{keyVersion=-1, keyMaterial=" + Arrays.toString(this.a) + ", encryptionAlgorithm=AES_GCM_256}";
    }

    @Override // defpackage.ducc
    public final void b() {
    }

    @Override // defpackage.ducc
    public final void c() {
    }
}
