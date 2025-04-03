package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiza extends fizg {
    private static final long serialVersionUID = 1811540008806660667L;
    private int a;
    private fiyt b;
    private fiyt c;

    @Override // defpackage.fizg
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.a);
        stringBuffer.append(" ");
        stringBuffer.append(this.b);
        stringBuffer.append(" ");
        stringBuffer.append(this.c);
        return stringBuffer.toString();
    }

    @Override // defpackage.fizg
    public final fizg b() {
        return new fiza();
    }

    @Override // defpackage.fizg
    public final void c(fixb fixbVar) {
        this.a = fixbVar.b();
        this.b = new fiyt(fixbVar);
        this.c = new fiyt(fixbVar);
    }

    @Override // defpackage.fizg
    public final void d(fixd fixdVar, fiwv fiwvVar, boolean z) {
        fixdVar.d(this.a);
        this.b.h(fixdVar, null, z);
        this.c.h(fixdVar, null, z);
    }
}
