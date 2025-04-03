package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fixm extends fizg {
    private static final long serialVersionUID = -6349714958085750705L;
    private byte[] a;
    private byte[] b;
    private byte[] c;

    @Override // defpackage.fizg
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(h(this.b, true));
        stringBuffer.append(" ");
        stringBuffer.append(h(this.a, true));
        stringBuffer.append(" ");
        stringBuffer.append(h(this.c, true));
        return stringBuffer.toString();
    }

    @Override // defpackage.fizg
    public final fizg b() {
        return new fixm();
    }

    @Override // defpackage.fizg
    public final void c(fixb fixbVar) {
        this.b = fixbVar.j();
        this.a = fixbVar.j();
        this.c = fixbVar.j();
        try {
            double parseDouble = Double.parseDouble(h(this.b, false));
            double parseDouble2 = Double.parseDouble(h(this.a, false));
            if (parseDouble < -90.0d || parseDouble > 90.0d) {
                StringBuffer stringBuffer = new StringBuffer("illegal longitude ");
                stringBuffer.append(parseDouble);
                throw new IllegalArgumentException(stringBuffer.toString());
            }
            if (parseDouble2 < -180.0d || parseDouble2 > 180.0d) {
                StringBuffer stringBuffer2 = new StringBuffer("illegal latitude ");
                stringBuffer2.append(parseDouble2);
                throw new IllegalArgumentException(stringBuffer2.toString());
            }
        } catch (IllegalArgumentException e) {
            throw new fjan(e.getMessage());
        }
    }

    @Override // defpackage.fizg
    public final void d(fixd fixdVar, fiwv fiwvVar, boolean z) {
        fixdVar.c(this.b);
        fixdVar.c(this.a);
        fixdVar.c(this.c);
    }
}
