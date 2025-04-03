package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fjal extends fizg {
    private static final long serialVersionUID = 7955422413971804232L;
    private int a;
    private int b;
    private byte[] c = new byte[0];

    @Override // defpackage.fizg
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(this.a);
        stringBuffer2.append(" ");
        stringBuffer.append(stringBuffer2.toString());
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append(this.b);
        stringBuffer3.append(" ");
        stringBuffer.append(stringBuffer3.toString());
        stringBuffer.append(h(this.c, true));
        return stringBuffer.toString();
    }

    @Override // defpackage.fizg
    public final fizg b() {
        return new fjal();
    }

    @Override // defpackage.fizg
    public final void c(fixb fixbVar) {
        this.a = fixbVar.b();
        this.b = fixbVar.b();
        this.c = fixbVar.h();
    }

    @Override // defpackage.fizg
    public final void d(fixd fixdVar, fiwv fiwvVar, boolean z) {
        fixdVar.d(this.a);
        fixdVar.d(this.b);
        fixdVar.a(this.c);
    }
}
