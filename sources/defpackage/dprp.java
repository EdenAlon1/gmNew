package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dprp extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ dprt c;
    final /* synthetic */ Uri d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dprp(dprt dprtVar, Uri uri, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = dprtVar;
        this.d = uri;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dprp) c((ffxe) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0103, code lost:
    
        if (defpackage.ffra.a(r15, r3, r14) != r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0051, code lost:
    
        if (r15 != r0) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0142  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dprp.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dprp dprpVar = new dprp(this.c, this.d, ffguVar);
        dprpVar.e = obj;
        return dprpVar;
    }
}
