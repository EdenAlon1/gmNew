package defpackage;

import java.io.ByteArrayOutputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiyn extends fizg {
    private static final fjau a = new fjau();
    private static final long serialVersionUID = -7123504635968932855L;
    private int b;
    private int c;
    private int d;
    private byte[] e;
    private byte[] k;
    private fjag l;

    @Override // defpackage.fizg
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.b);
        stringBuffer.append(' ');
        stringBuffer.append(this.c);
        stringBuffer.append(' ');
        stringBuffer.append(this.d);
        stringBuffer.append(' ');
        byte[] bArr = this.e;
        if (bArr == null) {
            stringBuffer.append('-');
        } else {
            stringBuffer.append(fjat.a(bArr));
        }
        stringBuffer.append(' ');
        fjau fjauVar = a;
        byte[] bArr2 = this.k;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i = 0; i < (bArr2.length + 4) / 5; i++) {
            short[] sArr = new short[5];
            int i2 = 5;
            for (int i3 = 0; i3 < 5; i3++) {
                int i4 = (i * 5) + i3;
                if (i4 < bArr2.length) {
                    sArr[i3] = (short) (bArr2[i4] & 255);
                } else {
                    sArr[i3] = 0;
                    i2--;
                }
            }
            int i5 = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? -1 : 0 : 1 : 3 : 4 : 6;
            short s = sArr[0];
            short s2 = sArr[1];
            short s3 = sArr[2];
            int i6 = ((s2 & 1) << 4) | ((s3 >> 4) & 15);
            int i7 = s3 & 15;
            short s4 = sArr[3];
            short s5 = sArr[4];
            int[] iArr = {(s >> 3) & 31, ((s & 7) << 2) | ((s2 >> 6) & 3), (s2 >> 1) & 31, i6, (i7 + i7) | (1 & (s4 >> 7)), (s4 >> 2) & 31, ((s4 & 3) << 3) | ((s5 >> 5) & 7), s5 & 31};
            for (int i8 = 0; i8 < 8 - i5; i8++) {
                byteArrayOutputStream.write(fjauVar.a.charAt(iArr[i8]));
            }
        }
        stringBuffer.append(new String(byteArrayOutputStream.toByteArray()));
        if (!this.l.b()) {
            stringBuffer.append(' ');
            stringBuffer.append(this.l.toString());
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.fizg
    public final fizg b() {
        return new fiyn();
    }

    @Override // defpackage.fizg
    public final void c(fixb fixbVar) {
        this.b = fixbVar.c();
        this.c = fixbVar.c();
        this.d = fixbVar.b();
        int c = fixbVar.c();
        if (c > 0) {
            this.e = fixbVar.i(c);
        } else {
            this.e = null;
        }
        this.k = fixbVar.i(fixbVar.c());
        this.l = new fjag(fixbVar);
    }

    @Override // defpackage.fizg
    public final void d(fixd fixdVar, fiwv fiwvVar, boolean z) {
        fixdVar.g(this.b);
        fixdVar.g(this.c);
        fixdVar.d(this.d);
        byte[] bArr = this.e;
        if (bArr != null) {
            fixdVar.g(bArr.length);
            fixdVar.a(this.e);
        } else {
            fixdVar.g(0);
        }
        fixdVar.g(this.k.length);
        fixdVar.a(this.k);
        this.l.a(fixdVar);
    }
}
