package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xvf extends ffhv implements ffjm {
    int a;
    final /* synthetic */ xvs b;
    final /* synthetic */ List c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xvf(xvs xvsVar, List list, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = xvsVar;
        this.c = list;
        this.d = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xvf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0147, code lost:
    
        if (r2 == r1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x017e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0132, code lost:
    
        if (r9 != r1) goto L54;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xvf.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new xvf(this.b, this.c, this.d, ffguVar);
    }
}
