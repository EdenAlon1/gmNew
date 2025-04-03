package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final /* synthetic */ class bdiy {
    public static Object a(bdiz bdizVar, ffji ffjiVar, ffji ffjiVar2) {
        if (bdizVar instanceof bdix) {
            return ffjiVar.invoke(((bdix) bdizVar).a);
        }
        if (bdizVar instanceof bdja) {
            return ffjiVar2.invoke(((bdja) bdizVar).a);
        }
        throw new ffcd();
    }

    public static boolean b(bdiz bdizVar) {
        return !bdizVar.c();
    }
}
