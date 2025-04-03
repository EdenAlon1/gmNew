package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class azls extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ Iterable c;
    final /* synthetic */ Iterable d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azls(Iterable iterable, Iterable iterable2, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = iterable;
        this.d = iterable2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((azls) c((azmp) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            azmp azmpVar = (azmp) this.b;
            Iterable iterable = this.c;
            Iterable iterable2 = this.d;
            this.a = 1;
            if (azmpVar.n(iterable, iterable2, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        azls azlsVar = new azls(this.c, this.d, ffguVar);
        azlsVar.b = obj;
        return azlsVar;
    }
}
