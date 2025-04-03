package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jod extends ffkk implements ffji {
    public static final jod a = new jod();

    public jod() {
        super(1);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        jou jouVar = null;
        jou jouVar2 = (ffkj.e(obj2, false) || obj2 == null) ? null : (jou) jom.i.a(obj2);
        Object obj3 = list.get(1);
        jou jouVar3 = (ffkj.e(obj3, false) || obj3 == null) ? null : (jou) jom.i.a(obj3);
        Object obj4 = list.get(2);
        jou jouVar4 = (ffkj.e(obj4, false) || obj4 == null) ? null : (jou) jom.i.a(obj4);
        Object obj5 = list.get(3);
        hrh hrhVar = jom.i;
        if (!ffkj.e(obj5, false) && obj5 != null) {
            jouVar = (jou) hrhVar.a(obj5);
        }
        return new jph(jouVar2, jouVar3, jouVar4, jouVar);
    }
}
