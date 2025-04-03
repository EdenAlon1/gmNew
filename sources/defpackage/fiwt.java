package defpackage;

import java.io.UnsupportedEncodingException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiwt extends fixg {
    public long a;
    public long b;
    public byte[] c;
    public byte[] d;

    public fiwt() {
        super(20732);
    }

    @Override // defpackage.fixg
    public final String a() {
        try {
            StringBuffer stringBuffer = new StringBuffer("{task ");
            stringBuffer.append(this.a);
            stringBuffer.append("/");
            stringBuffer.append(this.b);
            stringBuffer.append(" ");
            stringBuffer.append(new String(this.c, "UTF-8"));
            stringBuffer.append("/");
            stringBuffer.append(new String(this.d, "UTF-8"));
            stringBuffer.append("}");
            return stringBuffer.toString();
        } catch (UnsupportedEncodingException unused) {
            StringBuffer stringBuffer2 = new StringBuffer("{task ");
            stringBuffer2.append(this.a);
            stringBuffer2.append("/");
            stringBuffer2.append(this.b);
            stringBuffer2.append("}");
            return stringBuffer2.toString();
        }
    }

    @Override // defpackage.fixg
    public final void b(fixb fixbVar) {
        this.a = fixbVar.e();
        this.b = fixbVar.e();
        this.c = fixbVar.i(fixbVar.c());
        this.d = fixbVar.i(fixbVar.c());
    }

    @Override // defpackage.fixg
    public final void c(fixd fixdVar) {
        fixdVar.f(this.a);
        fixdVar.f(this.b);
        fixdVar.g(this.c.length);
        fixdVar.a(this.c);
        fixdVar.g(this.d.length);
        fixdVar.a(this.d);
    }
}
