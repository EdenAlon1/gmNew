package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiye extends fizg {
    private static final long serialVersionUID = -3962147172340353796L;
    private fiyt a;
    private fiyt b;

    @Override // defpackage.fizg
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.a);
        stringBuffer.append(" ");
        stringBuffer.append(this.b);
        return stringBuffer.toString();
    }

    @Override // defpackage.fizg
    public final fizg b() {
        return new fiye();
    }

    @Override // defpackage.fizg
    public final void c(fixb fixbVar) {
        this.a = new fiyt(fixbVar);
        this.b = new fiyt(fixbVar);
    }

    @Override // defpackage.fizg
    public final void d(fixd fixdVar, fiwv fiwvVar, boolean z) {
        this.a.h(fixdVar, null, z);
        this.b.h(fixdVar, null, z);
    }
}
