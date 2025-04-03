package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drft extends ffhv implements ffjm {
    int a;
    final /* synthetic */ drgb b;
    final /* synthetic */ dren c;
    final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drft(drgb drgbVar, dren drenVar, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = drgbVar;
        this.c = drenVar;
        this.d = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((drft) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dqlx dqlxVar = ((dqls) this.b.bE().invoke()).b;
            dren drenVar = this.c;
            this.a = 1;
            obj = dqlxVar.a(drenVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            this.b.e(this.c, this.d);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new drft(this.b, this.c, this.d, ffguVar);
    }
}
