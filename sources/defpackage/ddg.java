package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddg implements dcw {
    private final int a;
    private final int b;
    private final cym c;
    private final dcy d;

    public ddg(int i, int i2, cym cymVar) {
        this.a = i;
        this.b = i2;
        this.c = cymVar;
        this.d = new dcy(new cyw(i, i2, cymVar));
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
        return this.d.c(j, cybVar, cybVar2, cybVar3);
    }

    @Override // defpackage.dcr
    public final cyb d(long j, cyb cybVar, cyb cybVar2, cyb cybVar3) {
        return this.d.d(j, cybVar, cybVar2, cybVar3);
    }

    @Override // defpackage.dcr
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // defpackage.dcw
    public final int f() {
        return this.b;
    }

    @Override // defpackage.dcw
    public final int g() {
        return this.a;
    }

    public ddg() {
        this(300, 0, cyp.a);
    }
}
