package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fizm extends fizg {
    private static final long serialVersionUID = 1640247915216425235L;
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
        stringBuffer.append(" ");
        stringBuffer.append(fjat.a(this.d));
        return stringBuffer.toString();
    }

    @Override // defpackage.fizg
    public final fizg b() {
        return new fizm();
    }

    @Override // defpackage.fizg
    public final void c(fixb fixbVar) {
        this.a = fixbVar.c();
        this.b = fixbVar.c();
        this.c = fixbVar.c();
        this.d = fixbVar.h();
    }

    @Override // defpackage.fizg
    public final void d(fixd fixdVar, fiwv fiwvVar, boolean z) {
        fixdVar.g(this.a);
        fixdVar.g(this.b);
        fixdVar.g(this.c);
        fixdVar.a(this.d);
    }
}
