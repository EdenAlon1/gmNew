package defpackage;

import java.util.Date;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class fizk extends fizg {
    private static final long serialVersionUID = -3738444391533812369L;
    protected int a;
    protected int b;
    protected int c;
    protected long d;
    protected Date e;
    protected Date k;
    protected int l;
    protected fiyt m;
    protected byte[] n;

    protected fizk() {
    }

    @Override // defpackage.fizg
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(fjaf.a(this.a));
        stringBuffer.append(" ");
        stringBuffer.append(this.b);
        stringBuffer.append(" ");
        stringBuffer.append(this.c);
        stringBuffer.append(" ");
        stringBuffer.append(this.d);
        stringBuffer.append(" ");
        if (fiyy.a("multiline")) {
            stringBuffer.append("(\n\t");
        }
        stringBuffer.append(fixl.a(this.e));
        stringBuffer.append(" ");
        stringBuffer.append(fixl.a(this.k));
        stringBuffer.append(" ");
        stringBuffer.append(this.l);
        stringBuffer.append(" ");
        stringBuffer.append(this.m);
        if (fiyy.a("multiline")) {
            stringBuffer.append("\n");
            stringBuffer.append(fjav.b(this.n, true));
        } else {
            stringBuffer.append(" ");
            stringBuffer.append(fjav.a(this.n));
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.fizg
    public final void c(fixb fixbVar) {
        this.a = fixbVar.b();
        this.b = fixbVar.c();
        this.c = fixbVar.c();
        this.d = fixbVar.e();
        this.e = new Date(fixbVar.e() * 1000);
        this.k = new Date(fixbVar.e() * 1000);
        this.l = fixbVar.b();
        this.m = new fiyt(fixbVar);
        this.n = fixbVar.h();
    }

    @Override // defpackage.fizg
    public final void d(fixd fixdVar, fiwv fiwvVar, boolean z) {
        fixdVar.d(this.a);
        fixdVar.g(this.b);
        fixdVar.g(this.c);
        fixdVar.f(this.d);
        fixdVar.f(this.e.getTime() / 1000);
        fixdVar.f(this.k.getTime() / 1000);
        fixdVar.d(this.l);
        this.m.h(fixdVar, null, z);
        fixdVar.a(this.n);
    }
}
