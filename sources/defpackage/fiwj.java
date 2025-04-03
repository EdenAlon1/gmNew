package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiwj extends fizg {
    private static final long serialVersionUID = 8544304287274216443L;
    private int a;
    private byte[] b;
    private byte[] c;

    @Override // defpackage.fizg
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.a);
        stringBuffer.append(" ");
        stringBuffer.append(h(this.b, false));
        stringBuffer.append(" ");
        stringBuffer.append(h(this.c, true));
        return stringBuffer.toString();
    }

    @Override // defpackage.fizg
    public final fizg b() {
        return new fiwj();
    }

    @Override // defpackage.fizg
    public final void c(fixb fixbVar) {
        this.a = fixbVar.c();
        this.b = fixbVar.j();
        this.c = fixbVar.h();
    }

    @Override // defpackage.fizg
    public final void d(fixd fixdVar, fiwv fiwvVar, boolean z) {
        fixdVar.g(this.a);
        fixdVar.c(this.b);
        fixdVar.a(this.c);
    }
}
