package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1Sequence;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhrk {
    private final fhrj[] a;

    public fhrk(String str) {
        this.a = new fhrj[]{new fhrj(str), new fhrj("X509 ".concat(str)), new fhrj("PKCS7")};
    }

    private final fhrj b(String str) {
        for (int i = 0; i != 3; i++) {
            fhrj fhrjVar = this.a[i];
            if (fhrjVar.b(str) || fhrjVar.a(str)) {
                return fhrjVar;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003a, code lost:
    
        if (r3 > 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if (r0.length() == 0) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.lang.String c(java.io.InputStream r5) {
        /*
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
        L5:
            int r1 = r5.read()
            r2 = 10
            r3 = 13
            if (r1 == r3) goto L18
            if (r1 == r2) goto L18
            if (r1 < 0) goto L18
            char r1 = (char) r1
            r0.append(r1)
            goto L5
        L18:
            if (r1 < 0) goto L20
            int r4 = r0.length()
            if (r4 == 0) goto L5
        L20:
            if (r1 >= 0) goto L2a
            int r5 = r0.length()
            if (r5 != 0) goto L3f
            r5 = 0
            return r5
        L2a:
            if (r1 != r3) goto L3f
            r1 = 1
            r5.mark(r1)
            int r3 = r5.read()
            if (r3 != r2) goto L3a
            r5.mark(r1)
            goto L3c
        L3a:
            if (r3 <= 0) goto L3f
        L3c:
            r5.reset()
        L3f:
            java.lang.String r5 = r0.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhrk.c(java.io.InputStream):java.lang.String");
    }

    final ASN1Sequence a(InputStream inputStream, boolean z) {
        StringBuffer stringBuffer = new StringBuffer();
        fhrj fhrjVar = null;
        while (fhrjVar == null) {
            String c = c(inputStream);
            if (c == null) {
                break;
            }
            fhrjVar = b(c);
            if (fhrjVar != null && !fhrjVar.b(c)) {
                throw new IOException("malformed PEM data: found footer where header was expected");
            }
        }
        if (fhrjVar == null) {
            if (z) {
                throw new IOException("malformed PEM data: no header found");
            }
            return null;
        }
        fhrj fhrjVar2 = null;
        while (fhrjVar2 == null) {
            String c2 = c(inputStream);
            if (c2 == null) {
                break;
            }
            fhrjVar2 = b(c2);
            if (fhrjVar2 == null) {
                stringBuffer.append(c2);
            } else if (!fhrjVar.a(c2)) {
                throw new IOException("malformed PEM data: header/footer mismatch");
            }
        }
        if (fhrjVar2 == null) {
            throw new IOException("malformed PEM data: no footer found");
        }
        if (stringBuffer.length() == 0) {
            return null;
        }
        try {
            String stringBuffer2 = stringBuffer.toString();
            fidf fidfVar = fidc.a;
            char c3 = 4;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((stringBuffer2.length() / 4) * 3);
            try {
                fidf fidfVar2 = fidc.a;
                byte[] bArr = new byte[54];
                int length = stringBuffer2.length();
                while (length > 0) {
                    int i = length - 1;
                    if (!fidd.a(stringBuffer2.charAt(i))) {
                        break;
                    }
                    length = i;
                }
                if (length != 0) {
                    int i2 = length;
                    int i3 = 0;
                    while (i2 > 0 && i3 != 4) {
                        i2--;
                        if (!fidd.a(stringBuffer2.charAt(i2))) {
                            i3++;
                        }
                    }
                    int b = fidd.b(stringBuffer2, 0, i2);
                    int i4 = 0;
                    while (b < i2) {
                        int i5 = b + 1;
                        byte b2 = ((fidd) fidfVar2).c[stringBuffer2.charAt(b)];
                        int b3 = fidd.b(stringBuffer2, i5, i2);
                        int i6 = b3 + 1;
                        byte b4 = ((fidd) fidfVar2).c[stringBuffer2.charAt(b3)];
                        int b5 = fidd.b(stringBuffer2, i6, i2);
                        int i7 = b5 + 1;
                        byte b6 = ((fidd) fidfVar2).c[stringBuffer2.charAt(b5)];
                        int b7 = fidd.b(stringBuffer2, i7, i2);
                        char c4 = c3;
                        int i8 = b7 + 1;
                        byte b8 = ((fidd) fidfVar2).c[stringBuffer2.charAt(b7)];
                        if ((b2 | b4 | b6 | b8) < 0) {
                            throw new IOException("invalid characters encountered in base64 data");
                        }
                        bArr[i4] = (byte) ((b2 << 2) | (b4 >> 4));
                        int i9 = i4 + 2;
                        bArr[i4 + 1] = (byte) ((b4 << 4) | (b6 >> 2));
                        i4 += 3;
                        bArr[i9] = (byte) ((b6 << 6) | b8);
                        if (i4 == 54) {
                            byteArrayOutputStream.write(bArr);
                            i4 = 0;
                        }
                        b = fidd.b(stringBuffer2, i8, i2);
                        c3 = c4;
                    }
                    if (i4 > 0) {
                        byteArrayOutputStream.write(bArr, 0, i4);
                    }
                    int b9 = fidd.b(stringBuffer2, b, length);
                    int b10 = fidd.b(stringBuffer2, b9 + 1, length);
                    int b11 = fidd.b(stringBuffer2, b10 + 1, length);
                    int b12 = fidd.b(stringBuffer2, b11 + 1, length);
                    char charAt = stringBuffer2.charAt(b9);
                    char charAt2 = stringBuffer2.charAt(b10);
                    char charAt3 = stringBuffer2.charAt(b11);
                    char charAt4 = stringBuffer2.charAt(b12);
                    char c5 = ((fidd) fidfVar2).b;
                    if (charAt3 == c5) {
                        if (charAt4 != c5) {
                            throw new IOException("invalid characters encountered at end of base64 data");
                        }
                        byte[] bArr2 = ((fidd) fidfVar2).c;
                        byte b13 = bArr2[charAt];
                        byte b14 = bArr2[charAt2];
                        if ((b13 | b14) < 0) {
                            throw new IOException("invalid characters encountered at end of base64 data");
                        }
                        byteArrayOutputStream.write((b14 >> 4) | (b13 << 2));
                    } else if (charAt4 == c5) {
                        byte[] bArr3 = ((fidd) fidfVar2).c;
                        byte b15 = bArr3[charAt];
                        byte b16 = bArr3[charAt2];
                        byte b17 = bArr3[charAt3];
                        if ((b15 | b16 | b17) < 0) {
                            throw new IOException("invalid characters encountered at end of base64 data");
                        }
                        byteArrayOutputStream.write((b15 << 2) | (b16 >> 4));
                        byteArrayOutputStream.write((b17 >> 2) | (b16 << 4));
                    } else {
                        byte[] bArr4 = ((fidd) fidfVar2).c;
                        byte b18 = bArr4[charAt];
                        byte b19 = bArr4[charAt2];
                        byte b20 = bArr4[charAt3];
                        byte b21 = bArr4[charAt4];
                        if ((b18 | b19 | b20 | b21) < 0) {
                            throw new IOException("invalid characters encountered at end of base64 data");
                        }
                        byteArrayOutputStream.write((b18 << 2) | (b19 >> 4));
                        byteArrayOutputStream.write((b19 << 4) | (b20 >> 2));
                        byteArrayOutputStream.write(b21 | (b20 << 6));
                    }
                }
                return ASN1Sequence.j(byteArrayOutputStream.toByteArray());
            } catch (Exception e) {
                throw new fide("unable to decode base64 string: ".concat(String.valueOf(e.getMessage())), e);
            }
        } catch (Exception unused) {
            throw new IOException("malformed PEM data encountered");
        }
    }
}
