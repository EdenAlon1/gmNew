package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fixr extends fizg {
    private static final long serialVersionUID = -8730801385178968798L;
    private byte[] a;
    private byte[] b;

    @Override // defpackage.fizg
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(h(this.a, true));
        if (this.b != null) {
            stringBuffer.append(" ");
            stringBuffer.append(h(this.b, true));
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.fizg
    public final fizg b() {
        return new fixr();
    }

    @Override // defpackage.fizg
    public final void c(fixb fixbVar) {
        this.a = fixbVar.j();
        if (fixbVar.d() > 0) {
            this.b = fixbVar.j();
        }
    }

    @Override // defpackage.fizg
    public final void d(fixd fixdVar, fiwv fiwvVar, boolean z) {
        fixdVar.c(this.a);
        byte[] bArr = this.b;
        if (bArr != null) {
            fixdVar.c(bArr);
        }
    }
}
