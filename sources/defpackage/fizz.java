package defpackage;

import java.util.Date;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fizz extends fizg {
    private static final long serialVersionUID = -88820909016649306L;
    private fiyt a;
    private Date b;
    private int c;
    private byte[] d;
    private int e;
    private int k;
    private byte[] l;

    @Override // defpackage.fizg
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.a);
        stringBuffer.append(" ");
        if (fiyy.a("multiline")) {
            stringBuffer.append("(\n\t");
        }
        stringBuffer.append(this.b.getTime() / 1000);
        stringBuffer.append(" ");
        stringBuffer.append(this.c);
        stringBuffer.append(" ");
        stringBuffer.append(this.d.length);
        if (fiyy.a("multiline")) {
            stringBuffer.append("\n");
            stringBuffer.append(fjav.b(this.d, false));
        } else {
            stringBuffer.append(" ");
            stringBuffer.append(fjav.a(this.d));
        }
        stringBuffer.append(" ");
        stringBuffer.append(fizf.a(this.k));
        stringBuffer.append(" ");
        byte[] bArr = this.l;
        if (bArr == null) {
            stringBuffer.append(0);
        } else {
            stringBuffer.append(bArr.length);
            if (fiyy.a("multiline")) {
                stringBuffer.append("\n\n\n\t");
            } else {
                stringBuffer.append(" ");
            }
            if (this.k == 18) {
                byte[] bArr2 = this.l;
                if (bArr2.length != 6) {
                    stringBuffer.append("<invalid BADTIME other data>");
                } else {
                    int i = bArr2[0] & 255;
                    int i2 = bArr2[1] & 255;
                    int i3 = bArr2[2] & 255;
                    int i4 = bArr2[3] & 255;
                    int i5 = bArr2[4] & 255;
                    int i6 = bArr2[5] & 255;
                    stringBuffer.append("<server time: ");
                    stringBuffer.append(new Date(((i << 40) + (i2 << 32) + (i3 << 24) + (i4 << 16) + (i5 << 8) + i6) * 1000));
                    stringBuffer.append(">");
                }
            } else {
                stringBuffer.append("<");
                stringBuffer.append(fjav.a(this.l));
                stringBuffer.append(">");
            }
        }
        if (fiyy.a("multiline")) {
            stringBuffer.append(" )");
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.fizg
    public final fizg b() {
        return new fizz();
    }

    @Override // defpackage.fizg
    public final void c(fixb fixbVar) {
        this.a = new fiyt(fixbVar);
        this.b = new Date(((fixbVar.b() << 32) + fixbVar.e()) * 1000);
        this.c = fixbVar.b();
        this.d = fixbVar.i(fixbVar.b());
        this.e = fixbVar.b();
        this.k = fixbVar.b();
        int b = fixbVar.b();
        if (b > 0) {
            this.l = fixbVar.i(b);
        } else {
            this.l = null;
        }
    }

    @Override // defpackage.fizg
    public final void d(fixd fixdVar, fiwv fiwvVar, boolean z) {
        this.a.h(fixdVar, null, z);
        long time = this.b.getTime() / 1000;
        fixdVar.d((int) (time >> 32));
        fixdVar.f(time & 4294967295L);
        fixdVar.d(this.c);
        fixdVar.d(this.d.length);
        fixdVar.a(this.d);
        fixdVar.d(this.e);
        fixdVar.d(this.k);
        byte[] bArr = this.l;
        if (bArr == null) {
            fixdVar.d(0);
        } else {
            fixdVar.d(bArr.length);
            fixdVar.a(this.l);
        }
    }
}
