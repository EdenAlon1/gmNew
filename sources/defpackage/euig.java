package defpackage;

import androidx.car.app.model.Alert;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euig implements etfk {
    private final euix a;
    private final etge b;
    private final int c;
    private final byte[] d;

    private euig(euix euixVar, etge etgeVar, int i, byte[] bArr) {
        this.a = euixVar;
        this.b = etgeVar;
        this.c = i;
        this.d = bArr;
    }

    public static etfk c(etgx etgxVar) {
        euhi euhiVar = new euhi(etgxVar.b.d(), etgxVar.a.c);
        String valueOf = String.valueOf(String.valueOf(etgxVar.a.f));
        return new euig(euhiVar, new eujd(new eujc("HMAC".concat(valueOf), new SecretKeySpec(etgxVar.c.d(), "HMAC")), etgxVar.a.d), etgxVar.a.d, etgxVar.d.c());
    }

    @Override // defpackage.etfk
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.d;
        int i = this.c;
        int length = bArr3.length;
        int length2 = bArr.length;
        if (length2 < i + length) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!ettp.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, this.d.length, length2 - this.c);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, length2 - this.c, length2);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        if (!MessageDigest.isEqual(((eujd) this.b).a(euhs.b(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(0L).array(), 8))), copyOfRange2)) {
            throw new GeneralSecurityException("invalid MAC");
        }
        euix euixVar = this.a;
        int length3 = copyOfRange.length;
        euhi euhiVar = (euhi) euixVar;
        int i2 = euhiVar.a;
        if (length3 < i2) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr4 = new byte[i2];
        System.arraycopy(copyOfRange, 0, bArr4, 0, i2);
        int i3 = euhiVar.a;
        int i4 = length3 - i3;
        byte[] bArr5 = new byte[i4];
        euhiVar.a(copyOfRange, i3, i4, bArr5, 0, bArr4, false);
        return bArr5;
    }

    @Override // defpackage.etfk
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        euhi euhiVar = (euhi) this.a;
        int i = euhiVar.a;
        int length = bArr.length;
        int i2 = Alert.DURATION_SHOW_INDEFINITELY - i;
        if (length > i2) {
            throw new GeneralSecurityException(a.h(i2, "plaintext length can not exceed "));
        }
        byte[] bArr3 = new byte[i + length];
        byte[] b = ettg.b(i);
        System.arraycopy(b, 0, bArr3, 0, euhiVar.a);
        euhiVar.a(bArr, 0, length, bArr3, euhiVar.a, b, true);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return euhs.b(this.d, bArr3, this.b.a(euhs.b(bArr2, bArr3, Arrays.copyOf(ByteBuffer.allocate(8).putLong(0L).array(), 8))));
    }
}
