package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjhk extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cjho b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjhk(cjho cjhoVar, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cjhoVar;
        this.c = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjhk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                cjho cjhoVar = this.b;
                drud drudVar = new drud(this.c);
                this.a = 1;
                Object a = cjhoVar.a.b.a(new drtj(drudVar, null), this);
                ffhh ffhhVar2 = ffhh.a;
                if (a != ffhhVar2) {
                    a = ffcu.a;
                }
                if (a != ffhhVar2) {
                    a = ffcu.a;
                }
                if (a == ffhhVar) {
                    return ffhhVar;
                }
            }
        } catch (drrt e) {
            axnw.h(this.b.b.b(e));
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cjhk(this.b, this.c, ffguVar);
    }
}
