package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hsu extends hto {
    public hnp a;
    public int b;

    public hsu(long j, hnp hnpVar) {
        super(j);
        this.a = hnpVar;
    }

    @Override // defpackage.hto
    public final hto a(long j) {
        return new hsu(j, this.a);
    }

    @Override // defpackage.hto
    public final void b(hto htoVar) {
        htoVar.getClass();
        hsu hsuVar = (hsu) htoVar;
        synchronized (hsw.a) {
            this.a = hsuVar.a;
            this.b = hsuVar.b;
        }
    }
}
