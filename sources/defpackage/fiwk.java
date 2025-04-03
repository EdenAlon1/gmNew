package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiwk extends fizg {
    private static final long serialVersionUID = 4763014646517016835L;
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
            if (fiyy.a("multiline")) {
                stringBuffer.append(" (\n");
                stringBuffer.append(fjav.b(this.d, true));
            } else {
                stringBuffer.append(" ");
                stringBuffer.append(fjav.a(this.d));
            }
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.fizg
    public final fizg b() {
        return new fiwk();
    }

    @Override // defpackage.fizg
    public final void c(fixb fixbVar) {
        this.a = fixbVar.b();
        this.b = fixbVar.b();
        this.c = fixbVar.c();
        this.d = fixbVar.h();
    }

    @Override // defpackage.fizg
    public final void d(fixd fixdVar, fiwv fiwvVar, boolean z) {
        fixdVar.d(this.a);
        fixdVar.d(this.b);
        fixdVar.g(this.c);
        fixdVar.a(this.d);
    }
}
