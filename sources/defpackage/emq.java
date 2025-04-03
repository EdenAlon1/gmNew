package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class emq extends ffkk implements ffix {
    final /* synthetic */ hkx a;
    final /* synthetic */ hkx b;
    final /* synthetic */ ffix c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emq(hkx hkxVar, hkx hkxVar2, ffix ffixVar) {
        super(0);
        this.a = hkxVar;
        this.b = hkxVar2;
        this.c = ffixVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        return new enq((ffjo) this.a.a(), (ffji) this.b.a(), ((Number) this.c.invoke()).intValue());
    }
}
