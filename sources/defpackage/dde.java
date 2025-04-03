package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dde implements dcw {
    private final int a;

    public dde(int i) {
        this.a = i;
    }

    @Override // defpackage.dcr
    public final /* synthetic */ long a(cyb cybVar, cyb cybVar2, cyb cybVar3) {
        return dcv.a(this);
    }

    @Override // defpackage.dcr
    public final /* synthetic */ cyb b(cyb cybVar, cyb cybVar2, cyb cybVar3) {
        return dcq.a(this, cybVar, cybVar2, cybVar3);
    }

    @Override // defpackage.dcr
    public final cyb c(long j, cyb cybVar, cyb cybVar2, cyb cybVar3) {
        return j < ((long) this.a) * 1000000 ? cybVar : cybVar2;
    }

    @Override // defpackage.dcr
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // defpackage.dcw
    public final int f() {
        return this.a;
    }

    @Override // defpackage.dcw
    public final int g() {
        return 0;
    }

    public dde() {
        this(0);
    }

    @Override // defpackage.dcr
    public final cyb d(long j, cyb cybVar, cyb cybVar2, cyb cybVar3) {
        return cybVar3;
    }
}
