package defpackage;

import j$.util.DesugarCollections;
import j$.util.Map;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmfx extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cmgg b;
    final /* synthetic */ djrm c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmfx(ffgu ffguVar, cmgg cmggVar, djrm djrmVar) {
        super(2, ffguVar);
        this.b = cmggVar;
        this.c = djrmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmfx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            cmgg cmggVar = this.b;
            this.d = cmggVar;
            this.a = 1;
            obj = cmggVar.m(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        enru enruVar = cmgg.a;
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(((cmgn) obj).b);
        unmodifiableMap.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(ffew.a(unmodifiableMap.size()));
        for (Map.Entry entry : unmodifiableMap.entrySet()) {
            Object key = entry.getKey();
            key.getClass();
            linkedHashMap.put(new djro((String) key), entry.getValue());
        }
        djrm djrmVar = this.c;
        diuo diuoVar = diuo.a;
        diuoVar.getClass();
        return Map.EL.getOrDefault(linkedHashMap, djrmVar, diuoVar);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cmfx cmfxVar = new cmfx(ffguVar, this.b, this.c);
        cmfxVar.d = obj;
        return cmfxVar;
    }
}
