package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class alev extends ffhv implements ffjm {
    int a;
    final /* synthetic */ alex b;
    final /* synthetic */ aler c;
    final /* synthetic */ Long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alev(alex alexVar, aler alerVar, Long l, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = alexVar;
        this.c = alerVar;
        this.d = l;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((alev) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            alex alexVar = this.b;
            aler alerVar = this.c;
            Long l = this.d;
            l.getClass();
            long longValue = l.longValue();
            this.a = 1;
            if (alexVar.d(alerVar, longValue, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new alev(this.b, this.c, this.d, ffguVar);
    }
}
