package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dbb extends ffkk implements ffjm {
    final /* synthetic */ dbe a;
    final /* synthetic */ Object b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbb(dbe dbeVar, Object obj, int i) {
        super(2);
        this.a = dbeVar;
        this.b = obj;
        this.c = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a = hip.a(this.c | 1);
        this.a.g(this.b, (hfd) obj, a);
        return ffcu.a;
    }
}
