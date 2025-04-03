package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class drt extends ffkk implements ffji {
    final /* synthetic */ dsp a;
    final /* synthetic */ dsl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drt(dsl dslVar, dsp dspVar) {
        super(1);
        this.b = dslVar;
        this.a = dspVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.b.a(this.a.e(((dnm) obj).a), 1);
        return ffcu.a;
    }
}
