package defpackage;

import j$.util.DesugarCollections;
import j$.util.Map;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmhf extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cmii b;
    final /* synthetic */ djrm c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmhf(ffgu ffguVar, cmii cmiiVar, djrm djrmVar) {
        super(2, ffguVar);
        this.b = cmiiVar;
        this.c = djrmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmhf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            cmii cmiiVar = this.b;
            this.a = 1;
            obj = cmiiVar.t(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        cmim cmimVar = ((cmiu) obj).d;
        if (cmimVar == null) {
            cmimVar = cmim.a;
        }
        return Map.EL.getOrDefault(DesugarCollections.unmodifiableMap(cmimVar.c), this.b.z(this.c), new Integer(0));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cmhf cmhfVar = new cmhf(ffguVar, this.b, this.c);
        cmhfVar.d = obj;
        return cmhfVar;
    }
}
