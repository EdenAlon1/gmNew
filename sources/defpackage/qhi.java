package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qhi extends ffhv implements ffjm {
    Object a;
    int b;
    int c;
    final /* synthetic */ ffjn d;
    final /* synthetic */ Context e;
    final /* synthetic */ qgw f;
    final /* synthetic */ String g = "fonts/";
    final /* synthetic */ String h = "__LottieInternalDefaultCacheKey__";
    final /* synthetic */ hho i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qhi(ffjn ffjnVar, Context context, qgw qgwVar, hho hhoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = ffjnVar;
        this.e = context;
        this.f = qgwVar;
        this.i = hhoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((qhi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:(3:14|(2:18|19)|16)|21|22|23|(2:25|(1:27))|29|30|31|32) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        if (((java.lang.Boolean) r14).booleanValue() == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0092, code lost:
    
        if (r14 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bc A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0092 -> B:8:0x0095). Please report as a decompilation issue!!! */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qhi.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new qhi(this.d, this.e, this.f, this.i, ffguVar);
    }
}
