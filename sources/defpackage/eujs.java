package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eujs implements etfk {
    private final etls a;
    private final byte[] b;

    public eujs(byte[] bArr, byte[] bArr2) {
        this.a = new etls(bArr);
        this.b = bArr2;
    }

    private final byte[] c(byte[] bArr) {
        int length = bArr.length;
        if (length < 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return this.a.c(ByteBuffer.wrap(bArr, 24, length - 24), Arrays.copyOf(bArr, 24), null);
    }

    @Override // defpackage.etfk
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.b;
        if (bArr3.length == 0) {
            return c(bArr);
        }
        if (!ettp.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = this.b;
        return c(Arrays.copyOfRange(bArr, bArr4.length, bArr.length));
    }

    @Override // defpackage.etfk
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 40);
        byte[] b = ettg.b(24);
        allocate.put(b);
        this.a.b(allocate, b, bArr, null);
        byte[] array = allocate.array();
        byte[] bArr3 = this.b;
        return bArr3.length == 0 ? array : euhs.b(bArr3, array);
    }
}
