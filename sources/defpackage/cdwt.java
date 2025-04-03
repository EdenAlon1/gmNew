package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdwt implements cdwp {
    private static final cskc a = cskc.g("BugleCms", "EmptyCmsWorkItemErrorHandler");

    @Override // defpackage.cdwp
    public final Object a(Object obj, Object obj2, ceuw ceuwVar, cdws cdwsVar, Exception exc, ffgu ffguVar) {
        String canonicalName = cdwsVar.getClass().getCanonicalName();
        if (exc != null) {
            csjb e = a.e();
            e.I("Permanent error happened for ".concat(String.valueOf(canonicalName)));
            e.s(exc);
        } else {
            a.r(a.a(canonicalName, "Permanent error happened for ", " with no specified error."));
        }
        return ffcu.a;
    }
}
