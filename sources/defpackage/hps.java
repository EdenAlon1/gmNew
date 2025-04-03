package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hps extends ffkk implements ffjm {
    final /* synthetic */ hpw a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hps(hpw hpwVar, Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(2);
        this.a = hpwVar;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        this.a.g(this.b, this.c, this.d, this.e, (hfd) obj, hip.a(this.f) | 1);
        return ffcu.a;
    }
}
