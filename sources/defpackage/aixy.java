package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aixy extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aiyb b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aixy(ffgu ffguVar, aiyb aiybVar) {
        super(2, ffguVar);
        this.b = aiybVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aixy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        if (defpackage.fgfz.c(r4, r3) != r0) goto L10;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r4) {
        /*
            r3 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r3.a
            r2 = 1
            if (r1 == 0) goto L11
            if (r1 == r2) goto Ld
            defpackage.ffci.b(r4)
            return r4
        Ld:
            defpackage.ffci.b(r4)
            goto L31
        L11:
            defpackage.ffci.b(r4)
            java.lang.Object r4 = r3.c
            ffsk r4 = (defpackage.ffsk) r4
            aiyb r4 = r3.b
            ffbr r4 = r4.b
            java.lang.Object r4 = r4.b()
            cgmf r4 = (defpackage.cgmf) r4
            elfl r4 = r4.c()
            r4.getClass()
            r3.a = r2
            java.lang.Object r4 = defpackage.fgfz.c(r4, r3)
            if (r4 == r0) goto L57
        L31:
            aiyb r4 = r3.b
            ffbr r4 = r4.b
            java.lang.Object r4 = r4.b()
            cgmf r4 = (defpackage.cgmf) r4
            aiyb r1 = r3.b
            ffbr r1 = r1.c
            java.lang.Object r1 = r1.b()
            java.lang.String r1 = (java.lang.String) r1
            elfl r4 = r4.b(r1)
            r4.getClass()
            r1 = 2
            r3.a = r1
            java.lang.Object r4 = defpackage.fgfz.c(r4, r3)
            if (r4 != r0) goto L56
            goto L57
        L56:
            return r4
        L57:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aixy.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        aixy aixyVar = new aixy(ffguVar, this.b);
        aixyVar.c = obj;
        return aixyVar;
    }
}
