package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class fjah extends fizg {
    private static final long serialVersionUID = -8315884183112502995L;
    protected int a;
    protected fiyt b;

    protected fjah() {
    }

    @Override // defpackage.fizg
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.a);
        stringBuffer.append(" ");
        stringBuffer.append(this.b);
        return stringBuffer.toString();
    }

    @Override // defpackage.fizg
    public final void c(fixb fixbVar) {
        this.a = fixbVar.b();
        this.b = new fiyt(fixbVar);
    }

    @Override // defpackage.fizg
    public void d(fixd fixdVar, fiwv fiwvVar, boolean z) {
        fixdVar.d(this.a);
        this.b.h(fixdVar, null, z);
    }
}
