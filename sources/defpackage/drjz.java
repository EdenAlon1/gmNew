package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drjz {
    static final /* synthetic */ drjz a = new drjz();
    private static final enru b = enru.c("com/google/android/libraries/compose/media/Format$MediaFormat");

    private drjz() {
    }

    public static final drka a(drlx drlxVar, boolean z) {
        try {
            drlw drlwVar = drlxVar.b;
            boolean e = ffkj.e(drlwVar, drlr.a);
            String str = drlxVar.c;
            String str2 = true != z ? str : null;
            if (str2 == null) {
                str2 = "*";
            }
            if (e) {
                int i = drjx.b;
                return e(str, z ? ffdx.g(drji.a, drjk.a) : ffdx.g(drjw.a, drjg.a, drji.a, drjk.a, drjm.a, drjo.a, drjq.a, drjs.a), new drju(str2));
            }
            if (ffkj.e(drlwVar, drlu.a)) {
                String str3 = drlxVar.c;
                drkw drkwVar = drld.b;
                return e(str3, drki.a(), new drkw(str2));
            }
            if (ffkj.e(drlwVar, drlv.a)) {
                String str4 = drlxVar.c;
                ffbz ffbzVar = drnd.b;
                return e(str4, drmi.a(), new drmu(str2));
            }
            throw new IllegalArgumentException(drlxVar.b.b() + " doesn't have any registered format");
        } catch (IllegalArgumentException e2) {
            ((enrr) ((enrr) b.j()).g(e2).h("com/google/android/libraries/compose/media/Format$MediaFormat", "fromMediaType", 60, "Format.kt")).t("No media type matches %s", drlxVar);
            return null;
        }
    }

    public static final drka b(String str) {
        drlx a2 = drlo.a(str);
        if (a2 != null) {
            return a(a2, false);
        }
        return null;
    }

    public static final drka c(drlx drlxVar) {
        drka a2 = a(drlxVar, false);
        if (a2 != null) {
            return a2;
        }
        throw new IllegalArgumentException(a.i(drlxVar, "Cannot get Format for ", "."));
    }

    public static final drka d(String str) {
        drlx a2 = drlo.a(str);
        if (a2 != null) {
            return c(a2);
        }
        throw new IllegalArgumentException("Cannot infer Media Type from ".concat(str));
    }

    private static final drka e(String str, Iterable iterable, drka drkaVar) {
        Object obj;
        Iterator it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (ffkj.e(((drka) obj).a(), str)) {
                break;
            }
        }
        drka drkaVar2 = (drka) obj;
        return drkaVar2 == null ? drkaVar : drkaVar2;
    }
}
