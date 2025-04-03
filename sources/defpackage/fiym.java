package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiym extends fizg {
    private static final long serialVersionUID = -8689038598776316533L;
    private int a;
    private int b;
    private int c;
    private byte[] d;

    @Override // defpackage.fizg
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.a);
        stringBuffer.append(' ');
        stringBuffer.append(this.b);
        stringBuffer.append(' ');
        stringBuffer.append(this.c);
        stringBuffer.append(' ');
        byte[] bArr = this.d;
        if (bArr == null) {
            stringBuffer.append('-');
        } else {
            stringBuffer.append(fjat.a(bArr));
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.fizg
    public final fizg b() {
        return new fiym();
    }

    @Override // defpackage.fizg
    public final void c(fixb fixbVar) {
        this.a = fixbVar.c();
        this.b = fixbVar.c();
        this.c = fixbVar.b();
        int c = fixbVar.c();
        if (c > 0) {
            this.d = fixbVar.i(c);
        } else {
            this.d = null;
        }
    }

    @Override // defpackage.fizg
    public final void d(fixd fixdVar, fiwv fiwvVar, boolean z) {
        fixdVar.g(this.a);
        fixdVar.g(this.b);
        fixdVar.d(this.c);
        byte[] bArr = this.d;
        if (bArr == null) {
            fixdVar.g(0);
        } else {
            fixdVar.g(bArr.length);
            fixdVar.a(this.d);
        }
    }
}
