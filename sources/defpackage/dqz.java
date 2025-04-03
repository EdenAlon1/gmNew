package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dqz extends ffkk implements ffjm {
    final /* synthetic */ ffky a;
    final /* synthetic */ drd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqz(ffky ffkyVar, drd drdVar) {
        super(2);
        this.a = ffkyVar;
        this.b = drdVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        float floatValue = ((Number) obj).floatValue();
        ((Number) obj2).floatValue();
        float f = this.a.a;
        this.a.a = f + this.b.a(floatValue - f);
        return ffcu.a;
    }
}
