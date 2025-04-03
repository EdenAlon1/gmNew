package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddf implements dcr {
    private final /* synthetic */ dcy a;

    public ddf(float f, float f2, cyb cybVar) {
        int[] iArr = dcu.a;
        this.a = new dcy(cybVar != null ? new dcs(cybVar, f, f2) : new dct(f, f2));
    }

    @Override // defpackage.dcr
    public final long a(cyb cybVar, cyb cybVar2, cyb cybVar3) {
        return this.a.a(cybVar, cybVar2, cybVar3);
    }

    @Override // defpackage.dcr
    public final cyb b(cyb cybVar, cyb cybVar2, cyb cybVar3) {
        return this.a.b(cybVar, cybVar2, cybVar3);
    }

    @Override // defpackage.dcr
    public final cyb c(long j, cyb cybVar, cyb cybVar2, cyb cybVar3) {
        return this.a.c(j, cybVar, cybVar2, cybVar3);
    }

    @Override // defpackage.dcr
    public final cyb d(long j, cyb cybVar, cyb cybVar2, cyb cybVar3) {
        return this.a.d(j, cybVar, cybVar2, cybVar3);
    }

    @Override // defpackage.dcr
    public final boolean e() {
        return false;
    }
}
