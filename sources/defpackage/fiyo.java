package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiyo extends fizg {
    private static final long serialVersionUID = -5165065768816265385L;
    private fiyt a;
    private fjag b;

    @Override // defpackage.fizg
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.a);
        if (!this.b.b()) {
            stringBuffer.append(' ');
            stringBuffer.append(this.b.toString());
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.fizg
    public final fizg b() {
        return new fiyo();
    }

    @Override // defpackage.fizg
    public final void c(fixb fixbVar) {
        this.a = new fiyt(fixbVar);
        this.b = new fjag(fixbVar);
    }

    @Override // defpackage.fizg
    public final void d(fixd fixdVar, fiwv fiwvVar, boolean z) {
        this.a.h(fixdVar, null, false);
        this.b.a(fixdVar);
    }
}
