package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class fixv extends fizg {
    private static final long serialVersionUID = 3469321722693285454L;
    protected int a;
    protected int b;
    protected int c;
    protected byte[] d;
    protected int e = -1;

    protected fixv() {
    }

    @Override // defpackage.fizg
    public final String a() {
        int i;
        int length;
        int i2;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.a);
        stringBuffer.append(" ");
        stringBuffer.append(this.b);
        stringBuffer.append(" ");
        stringBuffer.append(this.c);
        if (this.d != null) {
            if (fiyy.a("multiline")) {
                stringBuffer.append(" (\n");
                stringBuffer.append(fjav.b(this.d, true));
                stringBuffer.append(" ; key_tag = ");
                int i3 = this.e;
                if (i3 < 0) {
                    fixd fixdVar = new fixd();
                    int i4 = 0;
                    d(fixdVar, null, false);
                    byte[] h = fixdVar.h();
                    if (this.c == 1) {
                        int length2 = h.length;
                        int i5 = h[length2 - 3] & 255;
                        i2 = h[length2 - 2] & 255;
                        i = i5 << 8;
                    } else {
                        i = 0;
                        while (true) {
                            length = h.length;
                            if (i4 >= length - 1) {
                                break;
                            }
                            i += ((h[i4] & 255) << 8) + (h[i4 + 1] & 255);
                            i4 += 2;
                        }
                        if (i4 < length) {
                            i += (h[i4] & 255) << 8;
                        }
                        i2 = (char) (i >> 16);
                    }
                    i3 = (char) (i + i2);
                    this.e = i3;
                }
                stringBuffer.append(i3);
            } else {
                stringBuffer.append(" ");
                stringBuffer.append(fjav.a(this.d));
            }
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.fizg
    public final void c(fixb fixbVar) {
        this.a = fixbVar.b();
        this.b = fixbVar.c();
        this.c = fixbVar.c();
        if (fixbVar.d() > 0) {
            this.d = fixbVar.h();
        }
    }

    @Override // defpackage.fizg
    public final void d(fixd fixdVar, fiwv fiwvVar, boolean z) {
        fixdVar.d(this.a);
        fixdVar.g(this.b);
        fixdVar.g(this.c);
        byte[] bArr = this.d;
        if (bArr != null) {
            fixdVar.a(bArr);
        }
    }
}
