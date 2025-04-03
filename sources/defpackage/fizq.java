package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fizq extends fizg {
    private static final long serialVersionUID = -8104701402654687025L;
    private int a;
    private int b;
    private byte[] c;

    @Override // defpackage.fizg
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.a);
        stringBuffer.append(" ");
        stringBuffer.append(this.b);
        stringBuffer.append(" ");
        stringBuffer.append(fjat.a(this.c));
        return stringBuffer.toString();
    }

    @Override // defpackage.fizg
    public final fizg b() {
        return new fizq();
    }

    @Override // defpackage.fizg
    public final void c(fixb fixbVar) {
        this.a = fixbVar.c();
        this.b = fixbVar.c();
        this.c = fixbVar.h();
    }

    @Override // defpackage.fizg
    public final void d(fixd fixdVar, fiwv fiwvVar, boolean z) {
        fixdVar.g(this.a);
        fixdVar.g(this.b);
        fixdVar.a(this.c);
    }
}
