package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqwh extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ dqwi c;
    final /* synthetic */ dqwj d;
    final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqwh(dqwi dqwiVar, dqwj dqwjVar, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = dqwiVar;
        this.d = dqwjVar;
        this.e = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqwh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0076, code lost:
    
        if (r7.o(r6) != r0) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.b
            r2 = 1
            if (r1 == 0) goto L14
            if (r1 == r2) goto L10
            java.lang.Object r0 = r6.a
            defpackage.ffci.b(r7)
            goto L8e
        L10:
            defpackage.ffci.b(r7)
            goto L78
        L14:
            defpackage.ffci.b(r7)
            dqwi r7 = r6.c
            dqwj r7 = r7.a
            ffud r7 = r7.g
            java.lang.String r1 = "checkInitJobBeforeSearch"
            java.lang.String r3 = "com/google/android/libraries/compose/emoji/ui/screen/search/EmojiSearchRenderer$resultsRenderer$1"
            java.lang.String r4 = "EmojiSearchRenderer.kt"
            if (r7 != 0) goto L40
            enru r7 = defpackage.dqwj.a
            ensk r7 = r7.i()
            enrr r7 = (defpackage.enrr) r7
            ensy r5 = defpackage.ensy.MEDIUM
            r7.aa(r5)
            r5 = 92
            ensk r7 = r7.h(r3, r1, r5, r4)
            enrr r7 = (defpackage.enrr) r7
            java.lang.String r1 = "`search` called before enabled."
            r7.q(r1)
            goto L60
        L40:
            boolean r7 = r7.x()
            if (r7 == 0) goto L6a
            enru r7 = defpackage.dqwj.a
            ensk r7 = r7.i()
            enrr r7 = (defpackage.enrr) r7
            ensy r5 = defpackage.ensy.MEDIUM
            r7.aa(r5)
            r5 = 95
            ensk r7 = r7.h(r3, r1, r5, r4)
            enrr r7 = (defpackage.enrr) r7
            java.lang.String r1 = "`enable` job was canceled."
            r7.q(r1)
        L60:
            dqwj r7 = r6.d
            r1 = 0
            r7.g = r1
            dqwi r7 = r6.c
            r7.b()
        L6a:
            dqwj r7 = r6.d
            ffud r7 = r7.g
            if (r7 == 0) goto L78
            r6.b = r2
            java.lang.Object r7 = r7.o(r6)
            if (r7 == r0) goto L96
        L78:
            dqwj r7 = r6.d
            java.lang.String r1 = r6.e
            r7.i = r1
            ffjm r2 = r7.e
            r6.a = r2
            r3 = 2
            r6.b = r3
            dqru r7 = r7.d
            java.lang.Object r7 = r7.b(r1, r6)
            if (r7 == r0) goto L96
            r0 = r2
        L8e:
            java.lang.String r1 = r6.e
            r0.a(r7, r1)
            ffcu r7 = defpackage.ffcu.a
            return r7
        L96:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqwh.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dqwh(this.c, this.d, this.e, ffguVar);
    }
}
