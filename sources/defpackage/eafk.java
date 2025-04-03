package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class eafk {
    public static Object a(eafl eaflVar) {
        if (eaflVar instanceof eafo) {
            return ((eafo) eaflVar).a;
        }
        return null;
    }

    public static Object b(eafl eaflVar) {
        if (eaflVar instanceof eafo) {
            return ((eafo) eaflVar).a;
        }
        if (eaflVar instanceof eafh) {
            throw ((eafh) eaflVar).a();
        }
        throw new ffcd();
    }

    public static Throwable c(eafl eaflVar) {
        if (eaflVar instanceof eafo) {
            return null;
        }
        if (eaflVar instanceof eafh) {
            return ((eafh) eaflVar).a();
        }
        throw new ffcd();
    }
}
