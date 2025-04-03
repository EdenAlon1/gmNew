package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajbv extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ ajbx c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajbv(ffgu ffguVar, ajbx ajbxVar) {
        super(3, ffguVar);
        this.c = ajbxVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ajbv ajbvVar = new ajbv((ffgu) obj3, this.c);
        ajbvVar.d = (ffxy) obj;
        ajbvVar.b = obj2;
        return ajbvVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [ffxy, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffxx a;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ?? r6 = this.d;
            if (((Boolean) this.b).booleanValue()) {
                ajbx ajbxVar = this.c;
                a = fgck.a(ajbxVar.e.b, ajbxVar.l, ajbxVar.m, new ajbq(ajbxVar, null));
            } else {
                a = new ffyg(null);
            }
            this.a = 1;
            if (ffyk.c(r6, a, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }
}
