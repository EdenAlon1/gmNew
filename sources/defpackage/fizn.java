package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fizn extends fizg {
    private static final long serialVersionUID = 1049740098229303931L;
    public long a;
    public long b;
    private fiyt c;
    private fiyt d;
    private long e;
    private long k;
    private long l;

    public fizn() {
    }

    @Override // defpackage.fizg
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.c);
        stringBuffer.append(" ");
        stringBuffer.append(this.d);
        if (fiyy.a("multiline")) {
            stringBuffer.append(" (\n\t\t\t\t\t");
            stringBuffer.append(this.a);
            stringBuffer.append("\t; serial\n\t\t\t\t\t");
            stringBuffer.append(this.e);
            stringBuffer.append("\t; refresh\n\t\t\t\t\t");
            stringBuffer.append(this.k);
            stringBuffer.append("\t; retry\n\t\t\t\t\t");
            stringBuffer.append(this.l);
            stringBuffer.append("\t; expire\n\t\t\t\t\t");
            stringBuffer.append(this.b);
            stringBuffer.append(" )\t; minimum");
        } else {
            stringBuffer.append(" ");
            stringBuffer.append(this.a);
            stringBuffer.append(" ");
            stringBuffer.append(this.e);
            stringBuffer.append(" ");
            stringBuffer.append(this.k);
            stringBuffer.append(" ");
            stringBuffer.append(this.l);
            stringBuffer.append(" ");
            stringBuffer.append(this.b);
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.fizg
    public final fizg b() {
        return new fizn();
    }

    @Override // defpackage.fizg
    public final void c(fixb fixbVar) {
        this.c = new fiyt(fixbVar);
        this.d = new fiyt(fixbVar);
        this.a = fixbVar.e();
        this.e = fixbVar.e();
        this.k = fixbVar.e();
        this.l = fixbVar.e();
        this.b = fixbVar.e();
    }

    @Override // defpackage.fizg
    public final void d(fixd fixdVar, fiwv fiwvVar, boolean z) {
        this.c.h(fixdVar, fiwvVar, z);
        this.d.h(fixdVar, fiwvVar, z);
        fixdVar.f(this.a);
        fixdVar.f(this.e);
        fixdVar.f(this.k);
        fixdVar.f(this.l);
        fixdVar.f(this.b);
    }

    public fizn(fiyt fiytVar, int i, fiyt fiytVar2, fiyt fiytVar3) {
        super(fiytVar, i);
        p(fiytVar2);
        this.c = fiytVar2;
        p(fiytVar3);
        this.d = fiytVar3;
        this.a = 0L;
        this.e = 0L;
        this.k = 0L;
        this.l = 0L;
        this.b = 0L;
    }
}
