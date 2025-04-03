package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccxk extends ffhv implements ffjm {
    int a;
    final /* synthetic */ Map b;
    final /* synthetic */ ccxy c;
    final /* synthetic */ ccvl d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccxk(ffgu ffguVar, Map map, ccxy ccxyVar, ccvl ccvlVar) {
        super(2, ffguVar);
        this.b = map;
        this.c = ccxyVar;
        this.d = ccvlVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccxk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0068, code lost:
    
        if (r8 != r0) goto L18;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccxk.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ccxk ccxkVar = new ccxk(ffguVar, this.b, this.c, this.d);
        ccxkVar.e = obj;
        return ccxkVar;
    }
}
