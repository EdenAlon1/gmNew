package defpackage;

import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.DERBitString;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhqz extends DERBitString {
    public fhqz(ASN1BitString aSN1BitString) {
        super(aSN1BitString.m(), aSN1BitString.f());
    }

    @Override // org.bouncycastle.asn1.ASN1BitString
    public final String toString() {
        int min = Math.min(5, this.b.length - 1);
        int i = 0;
        for (int i2 = 1; i2 < min; i2++) {
            i |= (255 & this.b[i2]) << ((i2 - 1) * 8);
        }
        if (min > 0 && min < 5) {
            byte[] bArr = this.b;
            i |= (((byte) (bArr[min] & (PrivateKeyType.INVALID << (bArr[0] & 255)))) & 255) << ((min - 1) * 8);
        }
        return "NetscapeCertType: 0x".concat(String.valueOf(Integer.toHexString(i)));
    }
}
