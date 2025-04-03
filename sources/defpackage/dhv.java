package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dhv extends ffkk implements ffix {
    final /* synthetic */ dhw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhv(dhw dhwVar) {
        super(0);
        this.a = dhwVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        dhw dhwVar = this.a;
        isx.g(dhwVar);
        dhwVar.j();
        return Integer.valueOf(ffln.b(dhwVar.i() * 0.33333334f));
    }
}
