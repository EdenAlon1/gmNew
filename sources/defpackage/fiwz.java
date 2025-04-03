package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiwz extends fizg {
    private static final long serialVersionUID = 1960742375677534148L;
    private int a;
    private int b;
    private int c;
    private byte[] d;

    @Override // defpackage.fizg
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.a);
        stringBuffer.append(" ");
        stringBuffer.append(this.b);
        stringBuffer.append(" ");
        stringBuffer.append(this.c);
        if (this.d != null) {
            stringBuffer.append(" ");
            stringBuffer.append(fjat.a(this.d));
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.fizg
    public final fizg b() {
        return new fiwz();
    }

    @Override // defpackage.fizg
    public final void c(fixb fixbVar) {
        this.a = fixbVar.b();
        this.b = fixbVar.c();
        this.c = fixbVar.c();
        this.d = fixbVar.h();
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
