package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hpq extends ffkk implements ffjm {
    final /* synthetic */ hpw a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hpq(hpw hpwVar, Object obj, Object obj2, int i) {
        super(2);
        this.a = hpwVar;
        this.b = obj;
        this.c = obj2;
        this.d = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a = hip.a(this.d) | 1;
        this.a.d(this.b, this.c, (hfd) obj, a);
        return ffcu.a;
    }
}
