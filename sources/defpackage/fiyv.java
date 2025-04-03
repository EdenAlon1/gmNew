package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiyv extends fizg {
    private static final long serialVersionUID = -1277262990243423062L;
    private byte[] a;

    @Override // defpackage.fizg
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.a != null) {
            if (fiyy.a("multiline")) {
                stringBuffer.append("(\n");
                stringBuffer.append(fjav.b(this.a, true));
            } else {
                stringBuffer.append(fjav.a(this.a));
            }
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.fizg
    public final fizg b() {
        return new fiyv();
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
