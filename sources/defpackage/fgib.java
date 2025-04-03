package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgib {
    public static final Object a(fghk fghkVar, Object obj, ffjm ffjmVar) {
        Object ffrtVar;
        try {
            if (ffjmVar instanceof ffhp) {
                fflf.e(ffjmVar, 2);
                ffrtVar = ffjmVar.a(obj, fghkVar);
            } else {
                ffrtVar = ffhi.a(ffjmVar, obj, fghkVar);
            }
        } catch (Throwable th) {
            ffrtVar = new ffrt(th);
        }
        ffhh ffhhVar = ffhh.a;
        if (ffrtVar == ffhhVar) {
            return ffhhVar;
        }
        Object F = fghkVar.F(ffrtVar);
        if (F == ffur.b) {
            return ffhh.a;
        }
        if (!(F instanceof ffrt)) {
            return ffur.b(F);
        }
        Throwable th2 = ((ffrt) F).b;
        ffgu ffguVar = fghkVar.e;
        if (ffso.b && (ffguVar instanceof ffhs)) {
            throw fghn.a(th2, (ffhs) ffguVar);
        }
        throw th2;
    }
}
