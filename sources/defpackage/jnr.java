package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jnr extends ffkk implements ffji {
    public static final jnr a = new jnr();

    public jnr() {
        super(1);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        jyv jyvVar = null;
        jyj jyjVar = obj2 != null ? (jyj) obj2 : null;
        jyjVar.getClass();
        Object obj3 = list.get(1);
        jyl jylVar = obj3 != null ? (jyl) obj3 : null;
        jylVar.getClass();
        Object obj4 = list.get(2);
        long j = kak.a;
        jnn jnnVar = jom.v;
        ffkj.e(obj4, false);
        kak kakVar = obj4 != null ? (kak) jnnVar.a(obj4) : null;
        kakVar.getClass();
        Object obj5 = list.get(3);
        jyt jytVar = jyt.a;
        jyt jytVar2 = (ffkj.e(obj5, false) || obj5 == null) ? null : (jyt) jom.m.a(obj5);
        Object obj6 = list.get(4);
        jmo jmoVar = (ffkj.e(obj6, false) || obj6 == null) ? null : (jmo) jot.a.a(obj6);
        Object obj7 = list.get(5);
        jyh jyhVar = jyh.a;
        jyh jyhVar2 = (ffkj.e(obj7, false) || obj7 == null) ? null : (jyh) jom.t.a(obj7);
        Object obj8 = list.get(6);
        jyc jycVar = (ffkj.e(obj8, false) || obj8 == null) ? null : (jyc) jot.b.a(obj8);
        jycVar.getClass();
        Object obj9 = list.get(7);
        jxy jxyVar = obj9 != null ? (jxy) obj9 : null;
        jxyVar.getClass();
        Object obj10 = list.get(8);
        hrh hrhVar = jot.c;
        if (!ffkj.e(obj10, false) && obj10 != null) {
            jyvVar = (jyv) hrhVar.a(obj10);
        }
        int i = jxyVar.a;
        int i2 = jycVar.a;
        return new jmk(jyjVar.a, jylVar.a, kakVar.b, jytVar2, jmoVar, jyhVar2, i2, i, jyvVar);
    }
}
