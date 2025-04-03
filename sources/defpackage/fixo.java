package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fixo extends fizg {
    private static final long serialVersionUID = -4732870630947452112L;
    private byte[] a;
    private byte[] b;

    @Override // defpackage.fizg
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(h(this.a, true));
        stringBuffer.append(" ");
        stringBuffer.append(h(this.b, true));
        return stringBuffer.toString();
    }

    @Override // defpackage.fizg
    public final fizg b() {
        return new fixo();
    }

    @Override // defpackage.fizg
    public final void c(fixb fixbVar) {
        this.a = fixbVar.j();
        this.b = fixbVar.j();
    }

    @Override // defpackage.fizg
    public final void d(fixd fixdVar, fiwv fiwvVar, boolean z) {
        fixdVar.c(this.a);
        fixdVar.c(this.b);
    }
}
