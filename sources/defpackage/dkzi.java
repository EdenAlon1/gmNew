package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkzi extends ffhv implements ffjm {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ dkzm e;
    final /* synthetic */ rum f;
    final /* synthetic */ List g;
    final /* synthetic */ dlfy h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dkzi(dkzm dkzmVar, rum rumVar, List list, dlfy dlfyVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.e = dkzmVar;
        this.f = rumVar;
        this.g = list;
        this.h = dlfyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dkzi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) {
        /*
            r10 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r10.d
            if (r1 == 0) goto L14
            java.lang.Object r1 = r10.c
            java.lang.Object r2 = r10.b
            java.lang.Object r3 = r10.a
            defpackage.ffci.b(r11)     // Catch: defpackage.dlgk -> L10
            goto L5c
        L10:
            r0 = move-exception
            r11 = r0
            goto Laa
        L14:
            defpackage.ffci.b(r11)
            enru r11 = defpackage.dkzm.a
            ensk r11 = r11.h()
            java.lang.String r1 = "invokeSuspend"
            r2 = 227(0xe3, float:3.18E-43)
            java.lang.String r3 = "com/google/android/libraries/abuse/hades/moirai/MoiraiApi$classifyForInstrumentation$4"
            java.lang.String r4 = "MoiraiApi.kt"
            ensk r11 = r11.h(r3, r1, r2, r4)
            enrr r11 = (defpackage.enrr) r11
            dkzm r1 = r10.e
            java.lang.String r2 = "Calling classify for client %s"
            dlgb r1 = r1.b
            r11.t(r2, r1)
            dkzm r11 = r10.e
            dlfy r1 = r10.h
            dlgb r3 = r11.b
            java.lang.String r2 = r3.b
            dlfe r4 = r11.d
            dlfk r2 = r4.a(r2)
            emyv r4 = defpackage.emyv.b
            emyg r4 = defpackage.emyg.c(r4)
            dlhj r5 = r11.c     // Catch: defpackage.dlgk -> La7
            dlgb r11 = r11.b     // Catch: defpackage.dlgk -> La7
            r10.a = r3     // Catch: defpackage.dlgk -> La7
            r10.b = r2     // Catch: defpackage.dlgk -> La7
            r10.c = r4     // Catch: defpackage.dlgk -> La7
            r6 = 1
            r10.d = r6     // Catch: defpackage.dlgk -> La7
            java.lang.Object r11 = r5.b(r11, r1, r10)     // Catch: defpackage.dlgk -> La7
            if (r11 == r0) goto La6
            r1 = r4
        L5c:
            dlht r11 = (defpackage.dlht) r11     // Catch: defpackage.dlgk -> L10
            dkzm r0 = r10.e
            dlfe r1 = r0.d
            dlgb r0 = r0.b
            java.lang.String r0 = r0.b
            dlfk r0 = r1.a(r0)
            if (r0 == 0) goto L75
            dkzm r1 = r10.e
            rum r2 = r10.f
            dlgb r1 = r1.b
            r0.a(r1, r11, r2)
        L75:
            rum r0 = r10.f
            if (r0 != 0) goto L96
            dkzm r0 = r10.e
            dkze r0 = r0.e
            java.util.List r0 = r10.g
            ffel r1 = defpackage.ffel.a
            dlgj r2 = defpackage.dlgj.d
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L8c
            java.util.List r0 = r11.d
            goto L8e
        L8c:
            ffel r0 = defpackage.ffel.a
        L8e:
            dlgu r11 = r11.a
            dlga r2 = new dlga
            r2.<init>(r1, r11, r0)
            return r2
        L96:
            dlga r11 = new dlga
            dlgu r0 = new dlgu
            dlfs r1 = defpackage.dlfs.a
            r2 = 4
            java.lang.String r3 = "NONE"
            r0.<init>(r3, r1, r2)
            r11.<init>(r0)
            return r11
        La6:
            return r0
        La7:
            r0 = move-exception
            r11 = r0
            r1 = r4
        Laa:
            if (r2 == 0) goto Lc1
            eyee r4 = r11.a
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            emyg r1 = (defpackage.emyg) r1
            long r5 = r1.a(r0)
            int r7 = r11.d
            int r8 = r11.b
            int r9 = r11.c
            dlgb r3 = (defpackage.dlgb) r3
            r2.d(r3, r4, r5, r7, r8, r9)
        Lc1:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkzi.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dkzi(this.e, this.f, this.g, this.h, ffguVar);
    }
}
