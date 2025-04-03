package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fizp extends fizg {
    private static final long serialVersionUID = -3886460132387522052L;
    public int a;
    public int b;
    public int c;
    public fiyt d;

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
        StringBuffer stringBuffer4 = new StringBuffer();
        stringBuffer4.append(this.c);
        stringBuffer4.append(" ");
        stringBuffer.append(stringBuffer4.toString());
        stringBuffer.append(this.d);
        return stringBuffer.toString();
    }

    @Override // defpackage.fizg
    public final fizg b() {
        return new fizp();
    }

    @Override // defpackage.fizg
    public final void c(fixb fixbVar) {
        this.a = fixbVar.b();
        this.b = fixbVar.b();
        this.c = fixbVar.b();
        this.d = new fiyt(fixbVar);
    }

    @Override // defpackage.fizg
    public final void d(fixd fixdVar, fiwv fiwvVar, boolean z) {
        fixdVar.d(this.a);
        fixdVar.d(this.b);
        fixdVar.d(this.c);
        this.d.h(fixdVar, null, z);
    }

    @Override // defpackage.fizg
    public final fiyt ie() {
        return this.d;
    }
}
