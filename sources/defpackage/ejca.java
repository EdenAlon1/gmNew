package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejca implements rao {
    private final rao a;
    private final ejbz b;

    public ejca(rao raoVar, ejbz ejbzVar) {
        this.a = raoVar;
        this.b = ejbzVar;
    }

    @Override // defpackage.rao
    public final /* bridge */ /* synthetic */ ran a(Object obj, int i, int i2, qtu qtuVar) {
        return this.a.a(ebtq.c((ejfs) obj, this.b), i, i2, qtuVar);
    }

    @Override // defpackage.rao
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return this.a.b(ebtq.c((ejfs) obj, this.b));
    }
}
