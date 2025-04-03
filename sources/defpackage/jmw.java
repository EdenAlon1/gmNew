package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jmw extends ffkk implements ffji {
    public static final jmw a = new jmw();

    public jmw() {
        super(1);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        jmk jmkVar = null;
        r2 = null;
        jlu jluVar = null;
        r2 = null;
        jlv jlvVar = null;
        r2 = null;
        jpr jprVar = null;
        r2 = null;
        jps jpsVar = null;
        r2 = null;
        jou jouVar = null;
        jmkVar = null;
        jlq jlqVar = obj2 != null ? (jlq) obj2 : null;
        jlqVar.getClass();
        Object obj3 = list.get(2);
        Integer num = obj3 != null ? (Integer) obj3 : null;
        num.getClass();
        int intValue = num.intValue();
        Object obj4 = list.get(3);
        Integer num2 = obj4 != null ? (Integer) obj4 : null;
        num2.getClass();
        int intValue2 = num2.intValue();
        Object obj5 = list.get(4);
        String str = obj5 != null ? (String) obj5 : null;
        str.getClass();
        switch (jlqVar.ordinal()) {
            case 0:
                Object obj6 = list.get(1);
                hrh hrhVar = jom.h;
                if (!ffkj.e(obj6, false) && obj6 != null) {
                    jmkVar = (jmk) hrhVar.a(obj6);
                }
                jmkVar.getClass();
                return new jlk(jmkVar, intValue, intValue2, str);
            case 1:
                Object obj7 = list.get(1);
                hrh hrhVar2 = jom.i;
                if (!ffkj.e(obj7, false) && obj7 != null) {
                    jouVar = (jou) hrhVar2.a(obj7);
                }
                jouVar.getClass();
                return new jlk(jouVar, intValue, intValue2, str);
            case 2:
                Object obj8 = list.get(1);
                hrh hrhVar3 = jom.d;
                if (!ffkj.e(obj8, false) && obj8 != null) {
                    jpsVar = (jps) hrhVar3.a(obj8);
                }
                jpsVar.getClass();
                return new jlk(jpsVar, intValue, intValue2, str);
            case 3:
                Object obj9 = list.get(1);
                hrh hrhVar4 = jom.e;
                if (!ffkj.e(obj9, false) && obj9 != null) {
                    jprVar = (jpr) hrhVar4.a(obj9);
                }
                jprVar.getClass();
                return new jlk(jprVar, intValue, intValue2, str);
            case 4:
                Object obj10 = list.get(1);
                hrh hrhVar5 = jom.f;
                if (!ffkj.e(obj10, false) && obj10 != null) {
                    jlvVar = (jlv) hrhVar5.a(obj10);
                }
                jlvVar.getClass();
                return new jlk(jlvVar, intValue, intValue2, str);
            case 5:
                Object obj11 = list.get(1);
                hrh hrhVar6 = jom.g;
                if (!ffkj.e(obj11, false) && obj11 != null) {
                    jluVar = (jlu) hrhVar6.a(obj11);
                }
                jluVar.getClass();
                return new jlk(jluVar, intValue, intValue2, str);
            case 6:
                Object obj12 = list.get(1);
                String str2 = obj12 != null ? (String) obj12 : null;
                str2.getClass();
                return new jlk(new jox(str2), intValue, intValue2, str);
            default:
                throw new ffcd();
        }
    }
}
