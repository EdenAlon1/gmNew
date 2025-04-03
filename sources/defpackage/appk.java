package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class appk extends ffhv implements ffjm {
    int a;
    final /* synthetic */ appm b;
    final /* synthetic */ awap c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public appk(ffgu ffguVar, appm appmVar, awap awapVar) {
        super(2, ffguVar);
        this.b = appmVar;
        this.c = awapVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((appk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            appm appmVar = this.b;
            awap awapVar = this.c;
            this.a = 1;
            if (appmVar.c.a(awapVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        appk appkVar = new appk(ffguVar, this.b, this.c);
        appkVar.d = obj;
        return appkVar;
    }
}
