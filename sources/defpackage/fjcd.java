package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fjcd extends fjcf {
    private final fjbl a;

    public fjcd(fjdt fjdtVar, fhfd fhfdVar, fjbu fjbuVar, fjbl fjblVar) {
        super(fjdtVar, fhfdVar, fjbuVar);
        this.a = fjblVar;
    }

    @Override // defpackage.fjcf
    protected final Object a(fjbj fjbjVar, Object[] objArr) {
        fjbj fjbjVar2 = (fjbj) this.a.adapt(fjbjVar);
        ffgu ffguVar = (ffgu) objArr[objArr.length - 1];
        try {
            ffrh ffrhVar = new ffrh(ffhi.c(ffguVar), 1);
            ffrhVar.B();
            ffrhVar.d(new fjch(fjbjVar2));
            fjbjVar2.d(new fjci(ffrhVar));
            Object m = ffrhVar.m();
            if (m == ffhh.a) {
                ffguVar.getClass();
            }
            return m;
        } catch (Exception e) {
            return fjcn.a(e, ffguVar);
        }
    }
}
