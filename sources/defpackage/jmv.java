package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jmv extends ffkk implements ffjm {
    public static final jmv a = new jmv();

    public jmv() {
        super(2);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        jlq jlqVar;
        Object a2;
        hqt hqtVar = (hqt) obj;
        jlk jlkVar = (jlk) obj2;
        Object obj3 = jlkVar.a;
        if (obj3 instanceof jmk) {
            jlqVar = jlq.a;
        } else if (obj3 instanceof jou) {
            jlqVar = jlq.b;
        } else if (obj3 instanceof jps) {
            jlqVar = jlq.c;
        } else if (obj3 instanceof jpr) {
            jlqVar = jlq.d;
        } else if (obj3 instanceof jlv) {
            jlqVar = jlq.e;
        } else if (obj3 instanceof jlu) {
            jlqVar = jlq.f;
        } else {
            if (!(obj3 instanceof jox)) {
                throw new UnsupportedOperationException();
            }
            jlqVar = jlq.g;
        }
        switch (jlqVar.ordinal()) {
            case 0:
                Object obj4 = jlkVar.a;
                obj4.getClass();
                a2 = jom.a((jmk) obj4, jom.h, hqtVar);
                break;
            case 1:
                Object obj5 = jlkVar.a;
                obj5.getClass();
                a2 = jom.a((jou) obj5, jom.i, hqtVar);
                break;
            case 2:
                Object obj6 = jlkVar.a;
                obj6.getClass();
                a2 = jom.a((jps) obj6, jom.d, hqtVar);
                break;
            case 3:
                Object obj7 = jlkVar.a;
                obj7.getClass();
                a2 = jom.a((jpr) obj7, jom.e, hqtVar);
                break;
            case 4:
                Object obj8 = jlkVar.a;
                obj8.getClass();
                a2 = jom.a((jlv) obj8, jom.f, hqtVar);
                break;
            case 5:
                Object obj9 = jlkVar.a;
                obj9.getClass();
                a2 = jom.a((jlu) obj9, jom.g, hqtVar);
                break;
            case 6:
                Object obj10 = jlkVar.a;
                obj10.getClass();
                a2 = ((jox) obj10).a;
                break;
            default:
                throw new ffcd();
        }
        return ffdx.f(jlqVar, a2, Integer.valueOf(jlkVar.b), Integer.valueOf(jlkVar.c), jlkVar.d);
    }
}
