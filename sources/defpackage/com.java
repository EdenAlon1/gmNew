package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class com extends ffhu implements ffjm {
    Object a;
    Object b;
    Object c;
    int d;
    int e;
    final /* synthetic */ coo f;
    final /* synthetic */ con g;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public com(coo cooVar, con conVar, ffgu ffguVar) {
        super(ffguVar);
        this.f = cooVar;
        this.g = conVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((com) c((ffnn) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffnn ffnnVar;
        Object obj2;
        Object obj3;
        int i;
        Object obj4;
        ffhh ffhhVar = ffhh.a;
        if (this.e != 0) {
            i = this.d;
            obj3 = this.c;
            Object obj5 = this.b;
            obj2 = this.a;
            ffnnVar = (ffnn) this.h;
            ffci.b(obj);
            obj4 = obj5;
        } else {
            ffci.b(obj);
            ffnnVar = (ffnn) this.h;
            coo cooVar = this.f;
            obj2 = this.g;
            col colVar = cooVar.a;
            obj3 = colVar.c;
            i = colVar.e;
            obj4 = cooVar;
        }
        while (i != Integer.MAX_VALUE) {
            long j = ((long[]) obj3)[i] >> 31;
            ((con) obj2).a = i;
            Object obj6 = ((coo) obj4).a.b[i];
            this.h = ffnnVar;
            this.a = obj2;
            this.b = obj4;
            this.c = obj3;
            i = (int) (j & 2147483647L);
            this.d = i;
            this.e = 1;
            if (ffnnVar.a(obj6, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        com comVar = new com(this.f, this.g, ffguVar);
        comVar.h = obj;
        return comVar;
    }
}
