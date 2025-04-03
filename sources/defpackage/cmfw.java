package defpackage;

import j$.util.Map;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmfw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cmgg b;
    final /* synthetic */ djrm c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmfw(ffgu ffguVar, cmgg cmggVar, djrm djrmVar) {
        super(2, ffguVar);
        this.b = cmggVar;
        this.c = djrmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmfw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
        Map p = cmggVar.p((cmgn) obj);
        djrm djrmVar = this.c;
        diuo diuoVar = diuo.a;
        diuoVar.getClass();
        return Map.EL.getOrDefault(p, djrmVar, diuoVar);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cmfw cmfwVar = new cmfw(ffguVar, this.b, this.c);
        cmfwVar.d = obj;
        return cmfwVar;
    }
}
