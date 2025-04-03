package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hpr extends ffkk implements ffjm {
    final /* synthetic */ hpw a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hpr(hpw hpwVar, Object obj, Object obj2, Object obj3, int i) {
        super(2);
        this.a = hpwVar;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        this.a.e(this.b, this.c, this.d, (hfd) obj, hip.a(this.e) | 1);
        return ffcu.a;
    }
}
