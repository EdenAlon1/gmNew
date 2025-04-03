package defpackage;

import j$.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayex implements ayed {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/contacts/sync/workprofile/WorkProfileContactsSyncImpl");
    public final ffhd b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;
    private final ffbr j;

    public ayex(ffhd ffhdVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9) {
        ffhdVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        ffbrVar7.getClass();
        ffbrVar9.getClass();
        this.b = ffhdVar;
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.f = ffbrVar4;
        this.e = ffbrVar5;
        this.g = ffbrVar6;
        this.h = ffbrVar7;
        this.i = ffbrVar8;
        this.j = ffbrVar9;
    }

    private final void j(Collection collection) {
        try {
            aydm aydmVar = (aydm) aydn.a.createBuilder();
            ArrayList arrayList = new ArrayList(ffdx.n(collection, 10));
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(axwj.a((axwi) it.next()));
            }
            aydmVar.a(arrayList);
            aydmVar.copyOnWrite();
            aydn aydnVar = (aydn) aydmVar.instance;
            aydnVar.f = aydf.a(4);
            aydnVar.b = 4 | aydnVar.b;
            eyfy build = aydmVar.build();
            build.getClass();
            ((aydo) this.g.b()).a((aydn) build);
        } catch (Throwable th) {
            ensk i = a.i();
            i.Y(ente.a, "BugleWorkContactsSync");
            ((enrr) ((enrr) i).g(th).h("com/google/android/apps/messaging/shared/contacts/sync/workprofile/WorkProfileContactsSyncImpl", "queueChangedContactsForRecipientSync", 193, "WorkProfileContactsSyncImpl.kt")).q("Failed to queue changes.");
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.ayed
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffgu r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.ayen
            if (r0 == 0) goto L13
            r0 = r8
            ayen r0 = (defpackage.ayen) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ayen r0 = new ayen
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            ekzz r0 = r0.d
            defpackage.ffci.b(r8)     // Catch: java.lang.Throwable -> L2a
            goto L59
        L2a:
            r8 = move-exception
            goto L64
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            defpackage.ffci.b(r8)
            ffhd r8 = r0.u()
            boolean r8 = defpackage.ekxi.b(r8)
            if (r8 == 0) goto L6a
            java.lang.String r8 = "WorkProfileContactsSyncImpl#syncFull"
            ekzz r8 = defpackage.eleg.f(r8)
            ecda r2 = defpackage.axup.u     // Catch: java.lang.Throwable -> L60
            ayep r5 = new ayep     // Catch: java.lang.Throwable -> L60
            r5.<init>(r7, r3)     // Catch: java.lang.Throwable -> L60
            r0.d = r8     // Catch: java.lang.Throwable -> L60
            r0.c = r4     // Catch: java.lang.Throwable -> L60
            java.lang.Object r0 = r7.e(r2, r5, r0)     // Catch: java.lang.Throwable -> L60
            if (r0 == r1) goto L5f
            r0 = r8
        L59:
            defpackage.ffig.a(r0, r3)
            ffcu r8 = defpackage.ffcu.a
            return r8
        L5f:
            return r1
        L60:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L64:
            throw r8     // Catch: java.lang.Throwable -> L65
        L65:
            r1 = move-exception
            defpackage.ffig.a(r0, r8)
            throw r1
        L6a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "TikTok trace may not live through suspension without TikTok provided CoroutineContext"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayex.a(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.ayed
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ffgu r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.ayeq
            if (r0 == 0) goto L13
            r0 = r8
            ayeq r0 = (defpackage.ayeq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ayeq r0 = new ayeq
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            ekzz r0 = r0.d
            defpackage.ffci.b(r8)     // Catch: java.lang.Throwable -> L2a
            goto L59
        L2a:
            r8 = move-exception
            goto L64
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            defpackage.ffci.b(r8)
            ffhd r8 = r0.u()
            boolean r8 = defpackage.ekxi.b(r8)
            if (r8 == 0) goto L6a
            java.lang.String r8 = "WorkProfileContactsSyncImpl#syncIncremental"
            ekzz r8 = defpackage.eleg.f(r8)
            ecda r2 = defpackage.axup.v     // Catch: java.lang.Throwable -> L60
            ayes r5 = new ayes     // Catch: java.lang.Throwable -> L60
            r5.<init>(r7, r3)     // Catch: java.lang.Throwable -> L60
            r0.d = r8     // Catch: java.lang.Throwable -> L60
            r0.c = r4     // Catch: java.lang.Throwable -> L60
            java.lang.Object r0 = r7.e(r2, r5, r0)     // Catch: java.lang.Throwable -> L60
            if (r0 == r1) goto L5f
            r0 = r8
        L59:
            defpackage.ffig.a(r0, r3)
            ffcu r8 = defpackage.ffcu.a
            return r8
        L5f:
            return r1
        L60:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L64:
            throw r8     // Catch: java.lang.Throwable -> L65
        L65:
            r1 = move-exception
            defpackage.ffig.a(r0, r8)
            throw r1
        L6a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "TikTok trace may not live through suspension without TikTok provided CoroutineContext"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayex.b(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.ayed
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ffgu r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.ayet
            if (r0 == 0) goto L13
            r0 = r8
            ayet r0 = (defpackage.ayet) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ayet r0 = new ayet
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            ekzz r0 = r0.d
            defpackage.ffci.b(r8)     // Catch: java.lang.Throwable -> L2a
            goto L59
        L2a:
            r8 = move-exception
            goto L64
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            defpackage.ffci.b(r8)
            ffhd r8 = r0.u()
            boolean r8 = defpackage.ekxi.b(r8)
            if (r8 == 0) goto L6a
            java.lang.String r8 = "WorkProfileContactsSyncImpl#syncDeleted"
            ekzz r8 = defpackage.eleg.f(r8)
            ecda r2 = defpackage.axup.w     // Catch: java.lang.Throwable -> L60
            ayew r5 = new ayew     // Catch: java.lang.Throwable -> L60
            r5.<init>(r7, r3)     // Catch: java.lang.Throwable -> L60
            r0.d = r8     // Catch: java.lang.Throwable -> L60
            r0.c = r4     // Catch: java.lang.Throwable -> L60
            java.lang.Object r0 = r7.e(r2, r5, r0)     // Catch: java.lang.Throwable -> L60
            if (r0 == r1) goto L5f
            r0 = r8
        L59:
            defpackage.ffig.a(r0, r3)
            ffcu r8 = defpackage.ffcu.a
            return r8
        L5f:
            return r1
        L60:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L64:
            throw r8     // Catch: java.lang.Throwable -> L65
        L65:
            r1 = move-exception
            defpackage.ffig.a(r0, r8)
            throw r1
        L6a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "TikTok trace may not live through suspension without TikTok provided CoroutineContext"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayex.c(ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c A[Catch: all -> 0x0077, TryCatch #0 {all -> 0x0077, blocks: (B:11:0x0025, B:12:0x004b, B:13:0x0056, B:15:0x005c, B:18:0x0072, B:29:0x0034), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.Set r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.ayek
            if (r0 == 0) goto L13
            r0 = r7
            ayek r0 = (defpackage.ayek) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ayek r0 = new ayek
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r6 = r0.a
            defpackage.ffci.b(r7)     // Catch: java.lang.Throwable -> L77
            goto L4b
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.ffci.b(r7)
            ffbr r7 = r5.f     // Catch: java.lang.Throwable -> L77
            java.lang.Object r7 = r7.b()     // Catch: java.lang.Throwable -> L77
            axwk r7 = (defpackage.axwk) r7     // Catch: java.lang.Throwable -> L77
            java.util.List r2 = defpackage.ffdx.ak(r6)     // Catch: java.lang.Throwable -> L77
            r0.a = r6     // Catch: java.lang.Throwable -> L77
            r0.d = r3     // Catch: java.lang.Throwable -> L77
            java.lang.Object r7 = r7.o(r2, r0)     // Catch: java.lang.Throwable -> L77
            if (r7 != r1) goto L4b
            return r1
        L4b:
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> L77
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L77
            r0.<init>()     // Catch: java.lang.Throwable -> L77
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L77
        L56:
            boolean r1 = r6.hasNext()     // Catch: java.lang.Throwable -> L77
            if (r1 == 0) goto L76
            java.lang.Object r1 = r6.next()     // Catch: java.lang.Throwable -> L77
            r2 = r1
            java.lang.Number r2 = (java.lang.Number) r2     // Catch: java.lang.Throwable -> L77
            long r2 = r2.longValue()     // Catch: java.lang.Throwable -> L77
            java.lang.Long r4 = new java.lang.Long     // Catch: java.lang.Throwable -> L77
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L77
            boolean r2 = r7.contains(r4)     // Catch: java.lang.Throwable -> L77
            if (r2 != 0) goto L56
            r0.add(r1)     // Catch: java.lang.Throwable -> L77
            goto L56
        L76:
            return r0
        L77:
            r6 = move-exception
            enru r7 = defpackage.ayex.a
            ensk r7 = r7.i()
            ensn r0 = defpackage.ente.a
            java.lang.String r1 = "BugleWorkContactsSync"
            r7.Y(r0, r1)
            enrr r7 = (defpackage.enrr) r7
            ensk r7 = r7.g(r6)
            java.lang.String r0 = "filterDeletedContacts"
            r1 = 119(0x77, float:1.67E-43)
            java.lang.String r2 = "com/google/android/apps/messaging/shared/contacts/sync/workprofile/WorkProfileContactsSyncImpl"
            java.lang.String r3 = "WorkProfileContactsSyncImpl.kt"
            ensk r7 = r7.h(r2, r0, r1, r3)
            enrr r7 = (defpackage.enrr) r7
            java.lang.String r0 = "Failed to query for contact deletion"
            r7.q(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayex.d(java.util.Set, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.ecda r6, defpackage.ffji r7, defpackage.ffgu r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.ayel
            if (r0 == 0) goto L13
            r0 = r8
            ayel r0 = (defpackage.ayel) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ayel r0 = new ayel
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 != r4) goto L36
            ecrh r6 = r0.g
            ecri r7 = r0.f
            ecda r1 = r0.e
            ayex r0 = r0.d
            defpackage.ffci.b(r8)     // Catch: java.lang.Throwable -> L32
            r2 = r6
            r6 = r1
            goto L61
        L32:
            r8 = move-exception
            r2 = r6
            r6 = r1
            goto L75
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            defpackage.ffci.b(r8)
            ffbr r8 = r5.i
            java.lang.Object r8 = r8.b()
            ecrj r8 = (defpackage.ecrj) r8
            ecri r8 = r8.d()
            ecrh r2 = defpackage.ecrh.SUCCESS
            r0.d = r5     // Catch: java.lang.Throwable -> L70
            r0.e = r6     // Catch: java.lang.Throwable -> L70
            r0.f = r8     // Catch: java.lang.Throwable -> L70
            r0.g = r2     // Catch: java.lang.Throwable -> L70
            r0.c = r4     // Catch: java.lang.Throwable -> L70
            java.lang.Object r7 = r7.invoke(r0)     // Catch: java.lang.Throwable -> L70
            if (r7 == r1) goto L6f
            r0 = r5
            r7 = r8
        L61:
            ffbr r8 = r0.i
            java.lang.Object r8 = r8.b()
            ecrj r8 = (defpackage.ecrj) r8
            r8.f(r7, r6, r3, r2)
            ffcu r6 = defpackage.ffcu.a
            return r6
        L6f:
            return r1
        L70:
            r7 = move-exception
            r0 = r8
            r8 = r7
            r7 = r0
            r0 = r5
        L75:
            ecrh r2 = defpackage.ecrh.ERROR     // Catch: java.lang.Throwable -> L78
            throw r8     // Catch: java.lang.Throwable -> L78
        L78:
            r8 = move-exception
            ffbr r0 = r0.i
            java.lang.Object r0 = r0.b()
            ecrj r0 = (defpackage.ecrj) r0
            r0.f(r7, r6, r3, r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayex.e(ecda, ffji, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0063 A[Catch: all -> 0x00e2, TryCatch #0 {all -> 0x00e2, blocks: (B:12:0x0055, B:13:0x005d, B:15:0x0063, B:17:0x007c, B:19:0x0084, B:23:0x008f, B:22:0x009e, B:27:0x00a2, B:29:0x00a8), top: B:11:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a8 A[Catch: all -> 0x00e2, TRY_LEAVE, TryCatch #0 {all -> 0x00e2, blocks: (B:12:0x0055, B:13:0x005d, B:15:0x0063, B:17:0x007c, B:19:0x0084, B:23:0x008f, B:22:0x009e, B:27:0x00a2, B:29:0x00a8), top: B:11:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(j$.time.Instant r10, defpackage.ffgu r11) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayex.f(j$.time.Instant, ffgu):java.lang.Object");
    }

    public final Object g(final Instant instant, final boolean z, ffgu ffguVar) {
        Object d = ((comc) this.d.b()).d(new ffji() { // from class: ayej
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                axvx axvxVar = (axvx) obj;
                axvxVar.getClass();
                axvt axvtVar = (axvt) axvxVar.toBuilder();
                Instant instant2 = Instant.this;
                eyja b = eykn.b(instant2);
                axvtVar.copyOnWrite();
                axvx axvxVar2 = (axvx) axvtVar.instance;
                axvxVar2.h = b;
                axvxVar2.b |= 16;
                if (z) {
                    eyja b2 = eykn.b(instant2);
                    axvtVar.copyOnWrite();
                    axvx axvxVar3 = (axvx) axvtVar.instance;
                    axvxVar3.i = b2;
                    axvxVar3.b |= 32;
                }
                eyfy build = axvtVar.build();
                build.getClass();
                return (axvx) build;
            }
        }, ffguVar);
        return d == ffhh.a ? d : ffcu.a;
    }

    public final void h(String str, int i) {
        ((akzt) this.j.b()).e(str, i);
    }

    public final void i(Collection collection) {
        try {
            Instant f = ((cqoh) this.c.b()).f();
            aydr aydrVar = (aydr) ayds.a.createBuilder();
            ArrayList arrayList = new ArrayList(ffdx.n(collection, 10));
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                long longValue = ((Number) it.next()).longValue();
                f.getClass();
                arrayList.add(axvs.a(new axvr(longValue, f)));
            }
            aydrVar.a(arrayList);
            aydrVar.copyOnWrite();
            ayds aydsVar = (ayds) aydrVar.instance;
            aydsVar.e = ayec.a(4);
            aydsVar.b |= 1;
            eyfy build = aydrVar.build();
            build.getClass();
            ((aydt) this.h.b()).a((ayds) build);
        } catch (Throwable th) {
            ensk i = a.i();
            i.Y(ente.a, "BugleWorkContactsSync");
            ((enrr) ((enrr) i).g(th).h("com/google/android/apps/messaging/shared/contacts/sync/workprofile/WorkProfileContactsSyncImpl", "queueDeletedContactsForRecipientSync", 210, "WorkProfileContactsSyncImpl.kt")).q("Failed to queue deletions.");
            throw th;
        }
    }
}
