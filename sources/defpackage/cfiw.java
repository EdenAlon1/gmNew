package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfiw extends ffhv implements ffjn {
    /* synthetic */ Object a;
    /* synthetic */ Object b;

    public cfiw(ffgu ffguVar) {
        super(3, ffguVar);
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cfiw cfiwVar = new cfiw((ffgu) obj3);
        cfiwVar.a = (Map) obj;
        cfiwVar.b = (ffcf) obj2;
        return cfiwVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ?? r3 = this.a;
        ffcf ffcfVar = (ffcf) this.b;
        String str = (String) ffcfVar.a;
        cfip cfipVar = (cfip) ffcfVar.b;
        Map m = ffew.m(r3);
        m.put(str, cfipVar);
        return m;
    }
}
