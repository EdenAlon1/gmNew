package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class defh extends ffhv implements ffjm {
    int a;
    final /* synthetic */ agkk b;
    final /* synthetic */ defp c;
    Object d;
    Object e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public defh(ffgu ffguVar, agkk agkkVar, defp defpVar) {
        super(2, ffguVar);
        this.b = agkkVar;
        this.c = defpVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((defh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0038  */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x005f -> B:4:0x0060). Please report as a decompilation issue!!! */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.a
            if (r1 == 0) goto L12
            java.lang.Object r1 = r6.e
            java.lang.Object r2 = r6.d
            java.lang.Object r3 = r6.f
            java.util.Collection r3 = (java.util.Collection) r3
            defpackage.ffci.b(r7)
            goto L60
        L12:
            defpackage.ffci.b(r7)
            java.lang.Object r7 = r6.f
            ffsk r7 = (defpackage.ffsk) r7
            agkk r7 = r6.b
            engw r7 = r7.y()
            r7.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.ffdx.n(r7, r2)
            r1.<init>(r2)
            enqv r7 = r7.iterator()
            r2 = r7
        L32:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L68
            java.lang.Object r7 = r2.next()
            afke r7 = (defpackage.afke) r7
            defp r3 = r6.c
            com.google.android.apps.messaging.label.data.classification.SuperSortLabel r4 = com.google.android.apps.messaging.label.data.classification.SuperSortLabel.ALL
            entd r5 = defpackage.defp.a
            ffbr r5 = r3.b
            java.lang.Object r5 = r5.b()
            cqoh r5 = (defpackage.cqoh) r5
            aeki r7 = defpackage.aeki.ai(r7, r4, r5)
            r6.f = r1
            r6.d = r2
            r6.e = r1
            r4 = 1
            r6.a = r4
            java.lang.Object r7 = r3.d(r7, r6)
            if (r7 == r0) goto L67
            r3 = r1
        L60:
            cvgp r7 = (defpackage.cvgp) r7
            r1.add(r7)
            r1 = r3
            goto L32
        L67:
            return r0
        L68:
            java.util.List r1 = (java.util.List) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.defh.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        defh defhVar = new defh(ffguVar, this.b, this.c);
        defhVar.f = obj;
        return defhVar;
    }
}
