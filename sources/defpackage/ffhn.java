package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
class ffhn {
    public static final Object a(ffjm ffjmVar, Object obj, ffgu ffguVar) {
        ffjmVar.getClass();
        ffhd u = ffguVar.u();
        Object ffhlVar = u == ffhe.a ? new ffhl(ffguVar) : new ffhm(ffguVar, u);
        fflf.e(ffjmVar, 2);
        return ffjmVar.a(obj, ffhlVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ffgu b(ffjm ffjmVar, Object obj, ffgu ffguVar) {
        ffjmVar.getClass();
        if (ffjmVar instanceof ffhp) {
            return ((ffhp) ffjmVar).c(obj, ffguVar);
        }
        ffhd u = ffguVar.u();
        return u == ffhe.a ? new ffhj(ffguVar, ffjmVar, obj) : new ffhk(ffguVar, u, ffjmVar, obj);
    }

    public static final ffgu c(ffgu ffguVar) {
        ffguVar.getClass();
        ffhr ffhrVar = ffguVar instanceof ffhr ? (ffhr) ffguVar : null;
        if (ffhrVar != null && (ffguVar = ffhrVar.B) == null) {
            ffgw ffgwVar = (ffgw) ffhrVar.u().get(ffgw.k);
            ffguVar = ffgwVar != null ? ffgwVar.e(ffhrVar) : ffhrVar;
            ffhrVar.B = ffguVar;
        }
        return ffguVar;
    }
}
