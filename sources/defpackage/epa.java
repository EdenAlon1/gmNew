package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class epa extends ffkk implements ffji {
    final /* synthetic */ epb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public epa(epb epbVar) {
        super(1);
        this.a = epbVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.a.a.B(ffln.b(this.a.a.l() != 0 ? ((Number) obj).floatValue() / this.a.a.l() : 0.0f) + this.a.a.j());
        return ffcu.a;
    }
}
