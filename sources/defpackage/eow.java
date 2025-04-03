package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eow extends ffkk implements ffjm {
    final /* synthetic */ ffky a;
    final /* synthetic */ ekn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eow(ffky ffkyVar, ekn eknVar) {
        super(2);
        this.a = ffkyVar;
        this.b = eknVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        float floatValue = ((Number) obj).floatValue();
        ((Number) obj2).floatValue();
        ffky ffkyVar = this.a;
        this.a.a = ffkyVar.a + this.b.a(floatValue - ffkyVar.a);
        return ffcu.a;
    }
}
