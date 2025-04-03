package defpackage;

import java.util.Date;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fizx extends fizg {
    private static final long serialVersionUID = 8828458121926391756L;
    private fiyt a;
    private Date b;
    private Date c;
    private int d;
    private int e;
    private byte[] k;
    private byte[] l;

    @Override // defpackage.fizg
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.a);
        stringBuffer.append(" ");
        if (fiyy.a("multiline")) {
            stringBuffer.append("(\n\t");
        }
        stringBuffer.append(fixl.a(this.b));
        stringBuffer.append(" ");
        stringBuffer.append(fixl.a(this.c));
        stringBuffer.append(" ");
        int i = this.d;
        stringBuffer.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? Integer.toString(i) : "DELETE" : "RESOLVERASSIGNED" : "GSSAPI" : "DIFFIEHELLMAN" : "SERVERASSIGNED");
        stringBuffer.append(" ");
        stringBuffer.append(fizf.a(this.e));
        if (fiyy.a("multiline")) {
            stringBuffer.append("\n");
            byte[] bArr = this.k;
            if (bArr != null) {
                stringBuffer.append(fjav.b(bArr, false));
                stringBuffer.append("\n");
            }
            byte[] bArr2 = this.l;
            if (bArr2 != null) {
                stringBuffer.append(fjav.b(bArr2, false));
            }
            stringBuffer.append(" )");
        } else {
            stringBuffer.append(" ");
            byte[] bArr3 = this.k;
            if (bArr3 != null) {
                stringBuffer.append(fjav.a(bArr3));
                stringBuffer.append(" ");
            }
            byte[] bArr4 = this.l;
            if (bArr4 != null) {
                stringBuffer.append(fjav.a(bArr4));
            }
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.fizg
    public final fizg b() {
        return new fizx();
    }

    @Override // defpackage.fizg
    public final void c(fixb fixbVar) {
        this.a = new fiyt(fixbVar);
        this.b = new Date(fixbVar.e() * 1000);
        this.c = new Date(fixbVar.e() * 1000);
        this.d = fixbVar.b();
        this.e = fixbVar.b();
        int b = fixbVar.b();
        if (b > 0) {
            this.k = fixbVar.i(b);
        } else {
            this.k = null;
        }
        int b2 = fixbVar.b();
        if (b2 > 0) {
            this.l = fixbVar.i(b2);
        } else {
            this.l = null;
        }
    }

    @Override // defpackage.fizg
    public final void d(fixd fixdVar, fiwv fiwvVar, boolean z) {
        this.a.h(fixdVar, null, z);
        fixdVar.f(this.b.getTime() / 1000);
        fixdVar.f(this.c.getTime() / 1000);
        fixdVar.d(this.d);
        fixdVar.d(this.e);
        byte[] bArr = this.k;
        if (bArr != null) {
            fixdVar.d(bArr.length);
            fixdVar.a(this.k);
        } else {
            fixdVar.d(0);
        }
        byte[] bArr2 = this.l;
        if (bArr2 == null) {
            fixdVar.d(0);
        } else {
            fixdVar.d(bArr2.length);
            fixdVar.a(this.l);
        }
    }
}
