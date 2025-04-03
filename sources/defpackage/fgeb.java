package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgeb {
    public static final Object a(ffhd ffhdVar, Object obj, Object obj2, ffjm ffjmVar, ffgu ffguVar) {
        Object a;
        Object b = fghv.b(ffhdVar, obj2);
        try {
            fgfn fgfnVar = new fgfn(ffguVar, ffhdVar);
            if (ffjmVar instanceof ffhp) {
                fflf.e(ffjmVar, 2);
                a = ffjmVar.a(obj, fgfnVar);
            } else {
                a = ffhi.a(ffjmVar, obj, fgfnVar);
            }
            fghv.c(ffhdVar, b);
            if (a == ffhh.a) {
                ffguVar.getClass();
            }
            return a;
        } catch (Throwable th) {
            fghv.c(ffhdVar, b);
            throw th;
        }
    }
}
