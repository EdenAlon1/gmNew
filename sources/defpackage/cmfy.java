package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmfy extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cmgg b;
    final /* synthetic */ djrm c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmfy(ffgu ffguVar, cmgg cmggVar, djrm djrmVar) {
        super(2, ffguVar);
        this.b = cmggVar;
        this.c = djrmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmfy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        cmgg cmggVar;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            cmggVar = (cmgg) this.d;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            cmgg cmggVar2 = this.b;
            this.d = cmggVar2;
            this.a = 1;
            Object m = cmggVar2.m(this);
            if (m == ffhhVar) {
                return ffhhVar;
            }
            cmggVar = cmggVar2;
            obj = m;
        }
        enru enruVar = cmgg.a;
        return Boolean.valueOf(cmggVar.p((cmgn) obj).containsKey(this.c));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cmfy cmfyVar = new cmfy(ffguVar, this.b, this.c);
        cmfyVar.d = obj;
        return cmfyVar;
    }
}
