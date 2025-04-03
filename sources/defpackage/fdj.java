package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fdj extends ffkk implements ffix {
    final /* synthetic */ fcw a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdj(fcw fcwVar, int i) {
        super(0);
        this.a = fcwVar;
        this.b = i;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        return Integer.valueOf(this.a.f.h(this.b));
    }
}
