package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dprb extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ dprt c;
    final /* synthetic */ Uri d;
    final /* synthetic */ dpgo e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dprb(dprt dprtVar, Uri uri, dpgo dpgoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = dprtVar;
        this.d = uri;
        this.e = dpgoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dprb) c((dpvu) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a5, code lost:
    
        if (r9.fQ(r2, r8) == r0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c3, code lost:
    
        if (r9 != r0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x003d, code lost:
    
        if (r9.fQ(r1, r8) == r0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0055, code lost:
    
        if (r9.fQ(r3, r8) != r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00d8, code lost:
    
        if (r1.fQ(r2, r8) == r0) goto L47;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dprb.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dprb dprbVar = new dprb(this.c, this.d, this.e, ffguVar);
        dprbVar.b = obj;
        return dprbVar;
    }
}
