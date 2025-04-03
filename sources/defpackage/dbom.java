package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbom extends ffhv implements ffjm {
    int a;
    final /* synthetic */ long b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbom(long j, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = j;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dbom) c((ffxy) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002b, code lost:
    
        if (r1.fQ(r6, r5) != r0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
    
        if (defpackage.ffsw.d(r5.b, r5) == r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
    
        return r0;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0038 -> B:5:0x0021). Please report as a decompilation issue!!! */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            r5 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r5.a
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 == r2) goto L11
            java.lang.Object r1 = r5.c
            ffxy r1 = (defpackage.ffxy) r1
            defpackage.ffci.b(r6)
            goto L21
        L11:
            java.lang.Object r1 = r5.c
            ffxy r1 = (defpackage.ffxy) r1
            defpackage.ffci.b(r6)
            goto L2d
        L19:
            defpackage.ffci.b(r6)
            java.lang.Object r6 = r5.c
            r1 = r6
            ffxy r1 = (defpackage.ffxy) r1
        L21:
            ffcu r6 = defpackage.ffcu.a
            r5.c = r1
            r5.a = r2
            java.lang.Object r6 = r1.fQ(r6, r5)
            if (r6 == r0) goto L3a
        L2d:
            r5.c = r1
            r6 = 2
            r5.a = r6
            long r3 = r5.b
            java.lang.Object r6 = defpackage.ffsw.d(r3, r5)
            if (r6 != r0) goto L21
        L3a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbom.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dbom dbomVar = new dbom(this.b, ffguVar);
        dbomVar.c = obj;
        return dbomVar;
    }
}
