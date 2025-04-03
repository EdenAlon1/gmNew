package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fjak extends fizg {
    private static final long serialVersionUID = -4193583311594626915L;
    private byte[] a;

    @Override // defpackage.fizg
    public final String a() {
        return i(this.a);
    }

    @Override // defpackage.fizg
    public final fizg b() {
        return new fjak();
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
