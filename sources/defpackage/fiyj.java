package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiyj extends fizg {
    private static final long serialVersionUID = 5191232392044947002L;
    public int a;
    public int b;
    public fiyt c;
    private byte[] d;
    private byte[] e;
    private byte[] k;

    @Override // defpackage.fizg
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.a);
        stringBuffer.append(" ");
        stringBuffer.append(this.b);
        stringBuffer.append(" ");
        stringBuffer.append(h(this.d, true));
        stringBuffer.append(" ");
        stringBuffer.append(h(this.e, true));
        stringBuffer.append(" ");
        stringBuffer.append(h(this.k, true));
        stringBuffer.append(" ");
        stringBuffer.append(this.c);
        return stringBuffer.toString();
    }

    @Override // defpackage.fizg
    public final fizg b() {
        return new fiyj();
    }

    @Override // defpackage.fizg
    public final void c(fixb fixbVar) {
        this.a = fixbVar.b();
        this.b = fixbVar.b();
        this.d = fixbVar.j();
        this.e = fixbVar.j();
        this.k = fixbVar.j();
        this.c = new fiyt(fixbVar);
    }

    @Override // defpackage.fizg
    public final void d(fixd fixdVar, fiwv fiwvVar, boolean z) {
        fixdVar.d(this.a);
        fixdVar.d(this.b);
        fixdVar.c(this.d);
        fixdVar.c(this.e);
        fixdVar.c(this.k);
        this.c.h(fixdVar, null, z);
    }

    @Override // defpackage.fizg
    public final fiyt ie() {
        return this.c;
    }
}
