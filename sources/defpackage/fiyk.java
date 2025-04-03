package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiyk extends fizg {
    private static final long serialVersionUID = -1037209403185658593L;
    private byte[] a;

    @Override // defpackage.fizg
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer("0x");
        stringBuffer.append(fjat.a(this.a));
        return stringBuffer.toString();
    }

    @Override // defpackage.fizg
    public final fizg b() {
        return new fiyk();
    }

    @Override // defpackage.fizg
    public final void c(fixb fixbVar) {
        this.a = fixbVar.h();
    }

    @Override // defpackage.fizg
    public final void d(fixd fixdVar, fiwv fiwvVar, boolean z) {
        fixdVar.a(this.a);
    }
}
