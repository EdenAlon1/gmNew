package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gyn extends ffkk implements ffjm {
    final /* synthetic */ ffky a;
    final /* synthetic */ gzd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gyn(gzd gzdVar, ffky ffkyVar) {
        super(2);
        this.b = gzdVar;
        this.a = ffkyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        float floatValue = ((Number) obj).floatValue();
        this.b.a(floatValue, ((Number) obj2).floatValue());
        this.a.a = floatValue;
        return ffcu.a;
    }
}
