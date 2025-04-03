package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cpd extends ffhu implements ffjm {
    Object a;
    Object b;
    int c;
    int d;
    final /* synthetic */ cpe e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpd(cpe cpeVar, ffgu ffguVar) {
        super(ffguVar);
        this.e = cpeVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cpd) c((ffnn) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffnn ffnnVar;
        Object obj2;
        int i;
        Object obj3;
        ffhh ffhhVar = ffhh.a;
        if (this.d != 0) {
            i = this.c;
            obj2 = this.b;
            Object obj4 = this.a;
            ffnnVar = (ffnn) this.f;
            ffci.b(obj);
            obj3 = obj4;
        } else {
            ffci.b(obj);
            ffnnVar = (ffnn) this.f;
            cpb cpbVar = this.e.b;
            Object obj5 = cpbVar.b;
            obj2 = cpbVar.c;
            i = cpbVar.e;
            obj3 = obj5;
        }
        while (i != Integer.MAX_VALUE) {
            long j = ((long[]) obj2)[i] >> 31;
            Object obj6 = ((Object[]) obj3)[i];
            this.f = ffnnVar;
            this.a = obj3;
            this.b = obj2;
            i = (int) (j & 2147483647L);
            this.c = i;
            this.d = 1;
            if (ffnnVar.a(obj6, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cpd cpdVar = new cpd(this.e, ffguVar);
        cpdVar.f = obj;
        return cpdVar;
    }
}
