package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jnt extends ffkk implements ffji {
    public static final jnt a = new jnt();

    public jnt() {
        super(1);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        long j = ibw.a;
        jnn jnnVar = jom.u;
        ffkj.e(obj2, false);
        ibw ibwVar = obj2 != null ? (ibw) jnnVar.a(obj2) : null;
        ibwVar.getClass();
        Object obj3 = list.get(1);
        jnn jnnVar2 = jom.w;
        ffkj.e(obj3, false);
        iak iakVar = obj3 != null ? (iak) jnnVar2.a(obj3) : null;
        iakVar.getClass();
        Object obj4 = list.get(2);
        Float f = obj4 != null ? (Float) obj4 : null;
        f.getClass();
        return new idg(ibwVar.i, iakVar.a, f.floatValue());
    }
}
