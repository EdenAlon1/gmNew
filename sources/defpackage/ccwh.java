package defpackage;

import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ccwh extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ ccwm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccwh(ccwm ccwmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = ccwmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccwh) c((Map) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        Map map = (Map) this.b;
        ccwm ccwmVar = this.c;
        Set keySet = map.keySet();
        this.a = 1;
        Object a = ffra.a(ekxi.a(ccwmVar.b), new ccwj(null, keySet), this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ccwh ccwhVar = new ccwh(this.c, ffguVar);
        ccwhVar.b = obj;
        return ccwhVar;
    }
}
