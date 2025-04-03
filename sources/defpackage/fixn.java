package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fixn extends fixg {
    private byte[] a;

    public fixn(int i) {
        super(i);
    }

    @Override // defpackage.fixg
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer("<");
        stringBuffer.append(fjat.a(this.a));
        stringBuffer.append(">");
        return stringBuffer.toString();
    }

    @Override // defpackage.fixg
    public final void b(fixb fixbVar) {
        this.a = fixbVar.h();
    }

    @Override // defpackage.fixg
    public final void c(fixd fixdVar) {
        fixdVar.a(this.a);
    }
}
