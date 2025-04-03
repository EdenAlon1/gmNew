package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjsk extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cjsn b;
    final /* synthetic */ String c;
    final /* synthetic */ boolean d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjsk(ffgu ffguVar, cjsn cjsnVar, String str, boolean z) {
        super(2, ffguVar);
        this.b = cjsnVar;
        this.c = str;
        this.d = z;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjsk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cjsn cjsnVar = this.b;
        String str = this.c;
        boolean z = this.d;
        this.a = 1;
        Object b = cjsnVar.b.b(str, z, this);
        return b == ffhhVar ? ffhhVar : b;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cjsk cjskVar = new cjsk(ffguVar, this.b, this.c, this.d);
        cjskVar.e = obj;
        return cjskVar;
    }
}
