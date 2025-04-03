package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjxs extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cjxt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjxs(cjxt cjxtVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cjxtVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjxs) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00cc, code lost:
    
        if (r8.e.b(r7) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00ee, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00cf, code lost:
    
        r8 = defpackage.cjxt.a.h();
        r8.Y(defpackage.ente.a, "BugleProfiles");
        ((defpackage.enrr) r8.h("com/google/android/apps/messaging/shared/profile/synclet/ProfileRefreshSynclet$sync$1", "invokeSuspend", 71, "ProfileRefreshSynclet.kt")).t("Profiles daily synclet full refresh worker finished: %s", r7.b.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00ed, code lost:
    
        return defpackage.ffcu.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007c, code lost:
    
        if (r8 != r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0012, code lost:
    
        if (r1 != 1) goto L23;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjxs.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cjxs(this.b, ffguVar);
    }
}
