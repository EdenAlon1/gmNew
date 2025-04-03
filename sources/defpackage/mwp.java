package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mwp extends mwz implements Comparable {
    private final int e;
    private final int f;

    public mwp(int i, lrv lrvVar, int i2, mws mwsVar, int i3) {
        super(i, lrvVar, i2);
        this.e = mih.g(i3, mwsVar.R) ? 1 : 0;
        this.f = this.d.a();
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(mwp mwpVar) {
        return Integer.compare(this.f, mwpVar.f);
    }

    @Override // defpackage.mwz
    public final int b() {
        return this.e;
    }

    @Override // defpackage.mwz
    public final /* bridge */ /* synthetic */ boolean c(mwz mwzVar) {
        return false;
    }
}
