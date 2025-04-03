package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fjao extends fizg {
    private static final long serialVersionUID = 4267576252335579764L;
    private byte[] a;

    @Override // defpackage.fizg
    public final String a() {
        return h(this.a, true);
    }

    @Override // defpackage.fizg
    public final fizg b() {
        return new fjao();
    }

    @Override // defpackage.fizg
    public final void c(fixb fixbVar) {
        this.a = fixbVar.j();
    }

    @Override // defpackage.fizg
    public final void d(fixd fixdVar, fiwv fiwvVar, boolean z) {
        fixdVar.c(this.a);
    }
}
