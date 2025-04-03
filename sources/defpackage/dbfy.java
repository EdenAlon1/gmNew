package defpackage;

import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbfy {
    public final Optional c;
    public final ffsk d;
    public String e;
    public final croi f;
    private final ejvb h;
    private final eixo i;
    private final ffbr j;
    public static final cskc a = cskc.g("BugleCms", "KeyRetrievalClientData");
    private static final Map g = ffew.g(new ffcf(0, "UNKNOWN"), new ffcf(1, "CANNOT_GENERATE_KEY_UNSUPPORTED_FRAMEWORK"), new ffcf(2, "CANNOT_GENERATE_MISSING_LSKF"), new ffcf(3, "WAITING_FOR_KEY_GENERATION"), new ffcf(4, "WAITING_FOR_KEY_SNAPSHOT"), new ffcf(5, "WAITING_FOR_CONSENT"), new ffcf(6, "SYNC_IN_PROGRESS"), new ffcf(7, "SYNCED"), new ffcf(8, "PERMANENT_FAILURE"));
    public static final Map b = ffew.g(new ffcf(0, "UNSPECIFIED"), new ffcf(1, "PHYSICAL_DEVICE"), new ffcf(2, "LOCKSCREEN_KNOWLEDGE_FACTOR"), new ffcf(3, "GAIA_PASSWORD"));

    public dbfy(ejvb ejvbVar, eixo eixoVar, ejar ejarVar, Optional optional, ffbr ffbrVar, ffsk ffskVar) {
        ejvbVar.getClass();
        eixoVar.getClass();
        ejarVar.getClass();
        ffbrVar.getClass();
        ffskVar.getClass();
        this.h = ejvbVar;
        this.i = eixoVar;
        this.c = optional;
        this.j = ffbrVar;
        this.d = ffskVar;
        this.e = "";
        this.f = ((crok) ffbrVar.b()).a(croj.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.dbfo
            if (r0 == 0) goto L13
            r0 = r6
            dbfo r0 = (defpackage.dbfo) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dbfo r0 = new dbfo
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r6)
            goto L4b
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.ffci.b(r6)
            ejvb r6 = r5.h
            eixo r2 = r5.i
            ejuh r2 = r2.b()
            ejwa r4 = defpackage.ejwa.DONT_CARE
            com.google.common.util.concurrent.ListenableFuture r6 = r6.b(r2, r4)
            r6.getClass()
            r0.c = r3
            java.lang.Object r6 = defpackage.fgfz.c(r6, r0)
            if (r6 == r1) goto L7b
        L4b:
            java.util.List r6 = (java.util.List) r6
            r6.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L59:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L7a
            java.lang.Object r1 = r6.next()
            r2 = r1
            eixn r2 = (defpackage.eixn) r2
            if (r2 == 0) goto L59
            eixz r2 = r2.b()
            java.lang.String r2 = r2.k
            java.lang.String r3 = "pseudonymous"
            boolean r2 = defpackage.ffkj.e(r2, r3)
            if (r2 != 0) goto L59
            r0.add(r1)
            goto L59
        L7a:
            return r0
        L7b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbfy.a(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.dbfr
            if (r0 == 0) goto L13
            r0 = r5
            dbfr r0 = (defpackage.dbfr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dbfr r0 = new dbfr
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.ffci.b(r5)     // Catch: defpackage.dfqu -> L27
            goto L45
        L27:
            r5 = move-exception
            goto L62
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.ffci.b(r5)
            croi r5 = r4.f     // Catch: defpackage.dfqu -> L27
            java.lang.String r2 = r4.e     // Catch: defpackage.dfqu -> L27
            elfl r5 = r5.b(r2)     // Catch: defpackage.dfqu -> L27
            r0.c = r3     // Catch: defpackage.dfqu -> L27
            java.lang.Object r5 = defpackage.fgfz.c(r5, r0)     // Catch: defpackage.dfqu -> L27
            if (r5 != r1) goto L45
            return r1
        L45:
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: defpackage.dfqu -> L27
            java.util.Map r0 = defpackage.dbfy.g     // Catch: defpackage.dfqu -> L27
            java.lang.Object r0 = r0.get(r5)     // Catch: defpackage.dfqu -> L27
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: defpackage.dfqu -> L27
            r1.<init>()     // Catch: defpackage.dfqu -> L27
            r1.append(r5)     // Catch: defpackage.dfqu -> L27
            java.lang.String r5 = " "
            r1.append(r5)     // Catch: defpackage.dfqu -> L27
            r1.append(r0)     // Catch: defpackage.dfqu -> L27
            java.lang.String r5 = r1.toString()     // Catch: defpackage.dfqu -> L27
            return r5
        L62:
            r5.toString()
            java.lang.String r5 = r5.toString()
            java.lang.String r0 = "Failed. "
            java.lang.String r5 = r0.concat(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbfy.b(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ffgu r9) {
        /*
            r8 = this;
            java.lang.String r0 = "Recovered security domains size "
            boolean r1 = r9 instanceof defpackage.dbfs
            if (r1 == 0) goto L15
            r1 = r9
            dbfs r1 = (defpackage.dbfs) r1
            int r2 = r1.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.c = r2
            goto L1a
        L15:
            dbfs r1 = new dbfs
            r1.<init>(r8, r9)
        L1a:
            java.lang.Object r9 = r1.a
            ffhh r2 = defpackage.ffhh.a
            int r3 = r1.c
            r4 = 1
            if (r3 == 0) goto L34
            if (r3 != r4) goto L2c
            defpackage.ffci.b(r9)     // Catch: defpackage.dfqu -> L29
            goto L8c
        L29:
            r9 = move-exception
            goto Lb2
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L34:
            defpackage.ffci.b(r9)
            croi r9 = r8.f     // Catch: defpackage.dfqu -> L29
            java.lang.String r3 = r8.e     // Catch: defpackage.dfqu -> L29
            r3.getClass()     // Catch: defpackage.dfqu -> L29
            dfun r5 = new dfun     // Catch: defpackage.dfqu -> L29
            r5.<init>()     // Catch: defpackage.dfqu -> L29
            dfhj r6 = new dfhj     // Catch: defpackage.dfqu -> L29
            crpn r9 = (defpackage.crpn) r9     // Catch: defpackage.dfqu -> L29
            dfhm r9 = r9.d     // Catch: defpackage.dfqu -> L29
            r6.<init>(r3)     // Catch: defpackage.dfqu -> L29
            r5.a = r6     // Catch: defpackage.dfqu -> L29
            com.google.android.gms.common.Feature[] r3 = new com.google.android.gms.common.Feature[r4]     // Catch: defpackage.dfqu -> L29
            com.google.android.gms.common.Feature r6 = defpackage.dfiu.b     // Catch: defpackage.dfqu -> L29
            r7 = 0
            r3[r7] = r6     // Catch: defpackage.dfqu -> L29
            r5.b = r3     // Catch: defpackage.dfqu -> L29
            r3 = 1583(0x62f, float:2.218E-42)
            r5.c = r3     // Catch: defpackage.dfqu -> L29
            dfuo r3 = r5.a()     // Catch: defpackage.dfqu -> L29
            dhre r9 = r9.i(r3)     // Catch: defpackage.dfqu -> L29
            crot r3 = new crot     // Catch: defpackage.dfqu -> L29
            r3.<init>()     // Catch: defpackage.dfqu -> L29
            crou r5 = new crou     // Catch: defpackage.dfqu -> L29
            r5.<init>()     // Catch: defpackage.dfqu -> L29
            r9.a(r5)     // Catch: defpackage.dfqu -> L29
            crov r3 = new crov     // Catch: defpackage.dfqu -> L29
            r3.<init>()     // Catch: defpackage.dfqu -> L29
            r9.t(r3)     // Catch: defpackage.dfqu -> L29
            com.google.common.util.concurrent.ListenableFuture r9 = defpackage.duin.a(r9)     // Catch: defpackage.dfqu -> L29
            elfl r9 = defpackage.elfl.g(r9)     // Catch: defpackage.dfqu -> L29
            r9.getClass()     // Catch: defpackage.dfqu -> L29
            r1.c = r4     // Catch: defpackage.dfqu -> L29
            java.lang.Object r9 = defpackage.fgfz.c(r9, r1)     // Catch: defpackage.dfqu -> L29
            if (r9 != r2) goto L8c
            return r2
        L8c:
            java.util.List r9 = (java.util.List) r9     // Catch: defpackage.dfqu -> L29
            int r1 = r9.size()     // Catch: defpackage.dfqu -> L29
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: defpackage.dfqu -> L29
            r2.<init>(r0)     // Catch: defpackage.dfqu -> L29
            r2.append(r1)     // Catch: defpackage.dfqu -> L29
            java.lang.String r0 = "\n\n"
            r2.append(r0)     // Catch: defpackage.dfqu -> L29
            r2.append(r9)     // Catch: defpackage.dfqu -> L29
            java.lang.String r9 = r2.toString()     // Catch: defpackage.dfqu -> L29
            cskc r0 = defpackage.dbfy.a     // Catch: defpackage.dfqu -> L29
            java.lang.String r1 = "Recovered Security Domains: \n\n"
            java.lang.String r1 = defpackage.a.t(r9, r1)     // Catch: defpackage.dfqu -> L29
            r0.p(r1)     // Catch: defpackage.dfqu -> L29
            return r9
        Lb2:
            r9.toString()
            java.lang.String r9 = r9.toString()
            java.lang.String r0 = "Failed. "
            java.lang.String r9 = r0.concat(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbfy.c(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ffgu r8) {
        /*
            r7 = this;
            java.lang.String r0 = "Security domain members size "
            boolean r1 = r8 instanceof defpackage.dbft
            if (r1 == 0) goto L15
            r1 = r8
            dbft r1 = (defpackage.dbft) r1
            int r2 = r1.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.c = r2
            goto L1a
        L15:
            dbft r1 = new dbft
            r1.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r1.a
            ffhh r2 = defpackage.ffhh.a
            int r3 = r1.c
            r4 = 1
            if (r3 == 0) goto L34
            if (r3 != r4) goto L2c
            defpackage.ffci.b(r8)     // Catch: java.lang.Exception -> L29
            goto L48
        L29:
            r0 = move-exception
            r8 = r0
            goto L81
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            defpackage.ffci.b(r8)
            croi r8 = r7.f     // Catch: java.lang.Exception -> L29
            java.lang.String r3 = r7.e     // Catch: java.lang.Exception -> L29
            elfl r8 = r8.c(r3)     // Catch: java.lang.Exception -> L29
            r1.c = r4     // Catch: java.lang.Exception -> L29
            java.lang.Object r8 = defpackage.fgfz.c(r8, r1)     // Catch: java.lang.Exception -> L29
            if (r8 != r2) goto L48
            return r2
        L48:
            r1 = r8
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Exception -> L29
            int r8 = r1.size()     // Catch: java.lang.Exception -> L29
            r1.getClass()     // Catch: java.lang.Exception -> L29
            java.lang.String r2 = "\n***********************************\n\n"
            dbfm r5 = new dbfm     // Catch: java.lang.Exception -> L29
            r5.<init>()     // Catch: java.lang.Exception -> L29
            r4 = 0
            r6 = 30
            r3 = 0
            java.lang.String r1 = defpackage.ffdx.aA(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L29
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L29
            r2.<init>(r0)     // Catch: java.lang.Exception -> L29
            r2.append(r8)     // Catch: java.lang.Exception -> L29
            java.lang.String r8 = "\n***********************************\n\n"
            r2.append(r8)     // Catch: java.lang.Exception -> L29
            r2.append(r1)     // Catch: java.lang.Exception -> L29
            java.lang.String r8 = r2.toString()     // Catch: java.lang.Exception -> L29
            cskc r0 = defpackage.dbfy.a     // Catch: java.lang.Exception -> L29
            java.lang.String r1 = "Security Domain Members: \n\n"
            java.lang.String r1 = defpackage.a.t(r8, r1)     // Catch: java.lang.Exception -> L29
            r0.p(r1)     // Catch: java.lang.Exception -> L29
            return r8
        L81:
            r8.toString()
            java.lang.String r8 = r8.toString()
            java.lang.String r0 = "Failed. "
            java.lang.String r8 = r0.concat(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbfy.d(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.ffgu r9) {
        /*
            r8 = this;
            java.lang.String r0 = "vaults size "
            boolean r1 = r9 instanceof defpackage.dbfu
            if (r1 == 0) goto L15
            r1 = r9
            dbfu r1 = (defpackage.dbfu) r1
            int r2 = r1.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.c = r2
            goto L1a
        L15:
            dbfu r1 = new dbfu
            r1.<init>(r8, r9)
        L1a:
            java.lang.Object r9 = r1.a
            ffhh r2 = defpackage.ffhh.a
            int r3 = r1.c
            r4 = 1
            if (r3 == 0) goto L35
            if (r3 != r4) goto L2d
            defpackage.ffci.b(r9)     // Catch: java.lang.Exception -> L29
            goto L8d
        L29:
            r0 = move-exception
            r9 = r0
            goto Lc6
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L35:
            defpackage.ffci.b(r9)
            croi r9 = r8.f     // Catch: java.lang.Exception -> L29
            java.lang.String r3 = r8.e     // Catch: java.lang.Exception -> L29
            r3.getClass()     // Catch: java.lang.Exception -> L29
            dfun r5 = new dfun     // Catch: java.lang.Exception -> L29
            r5.<init>()     // Catch: java.lang.Exception -> L29
            dfhl r6 = new dfhl     // Catch: java.lang.Exception -> L29
            crpn r9 = (defpackage.crpn) r9     // Catch: java.lang.Exception -> L29
            dfhm r9 = r9.d     // Catch: java.lang.Exception -> L29
            r6.<init>(r3)     // Catch: java.lang.Exception -> L29
            r5.a = r6     // Catch: java.lang.Exception -> L29
            com.google.android.gms.common.Feature[] r3 = new com.google.android.gms.common.Feature[r4]     // Catch: java.lang.Exception -> L29
            com.google.android.gms.common.Feature r6 = defpackage.dfiu.c     // Catch: java.lang.Exception -> L29
            r7 = 0
            r3[r7] = r6     // Catch: java.lang.Exception -> L29
            r5.b = r3     // Catch: java.lang.Exception -> L29
            r3 = 1641(0x669, float:2.3E-42)
            r5.c = r3     // Catch: java.lang.Exception -> L29
            dfuo r3 = r5.a()     // Catch: java.lang.Exception -> L29
            dhre r9 = r9.i(r3)     // Catch: java.lang.Exception -> L29
            crox r3 = new crox     // Catch: java.lang.Exception -> L29
            r3.<init>()     // Catch: java.lang.Exception -> L29
            croy r5 = new croy     // Catch: java.lang.Exception -> L29
            r5.<init>()     // Catch: java.lang.Exception -> L29
            r9.a(r5)     // Catch: java.lang.Exception -> L29
            croz r3 = new croz     // Catch: java.lang.Exception -> L29
            r3.<init>()     // Catch: java.lang.Exception -> L29
            r9.t(r3)     // Catch: java.lang.Exception -> L29
            com.google.common.util.concurrent.ListenableFuture r9 = defpackage.duin.a(r9)     // Catch: java.lang.Exception -> L29
            elfl r9 = defpackage.elfl.g(r9)     // Catch: java.lang.Exception -> L29
            r9.getClass()     // Catch: java.lang.Exception -> L29
            r1.c = r4     // Catch: java.lang.Exception -> L29
            java.lang.Object r9 = defpackage.fgfz.c(r9, r1)     // Catch: java.lang.Exception -> L29
            if (r9 != r2) goto L8d
            return r2
        L8d:
            r1 = r9
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Exception -> L29
            int r9 = r1.size()     // Catch: java.lang.Exception -> L29
            r1.getClass()     // Catch: java.lang.Exception -> L29
            java.lang.String r2 = "\n***********************************\n\n"
            dbfn r5 = new dbfn     // Catch: java.lang.Exception -> L29
            r5.<init>()     // Catch: java.lang.Exception -> L29
            r4 = 0
            r6 = 30
            r3 = 0
            java.lang.String r1 = defpackage.ffdx.aA(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L29
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L29
            r2.<init>(r0)     // Catch: java.lang.Exception -> L29
            r2.append(r9)     // Catch: java.lang.Exception -> L29
            java.lang.String r9 = "\n***********************************\n\n"
            r2.append(r9)     // Catch: java.lang.Exception -> L29
            r2.append(r1)     // Catch: java.lang.Exception -> L29
            java.lang.String r9 = r2.toString()     // Catch: java.lang.Exception -> L29
            cskc r0 = defpackage.dbfy.a     // Catch: java.lang.Exception -> L29
            java.lang.String r1 = "vaults: \n\n"
            java.lang.String r1 = defpackage.a.t(r9, r1)     // Catch: java.lang.Exception -> L29
            r0.p(r1)     // Catch: java.lang.Exception -> L29
            return r9
        Lc6:
            r9.toString()
            java.lang.String r9 = r9.toString()
            java.lang.String r0 = "Failed. "
            java.lang.String r9 = r0.concat(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbfy.e(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.ffgu r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.dbfv
            if (r0 == 0) goto L13
            r0 = r8
            dbfv r0 = (defpackage.dbfv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dbfv r0 = new dbfv
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.ffci.b(r8)     // Catch: defpackage.dfqu -> L27
            goto L88
        L27:
            r8 = move-exception
            goto L8c
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L31:
            defpackage.ffci.b(r8)
            croi r8 = r7.f     // Catch: defpackage.dfqu -> L27
            java.lang.String r2 = r7.e     // Catch: defpackage.dfqu -> L27
            r2.getClass()     // Catch: defpackage.dfqu -> L27
            dfun r4 = new dfun     // Catch: defpackage.dfqu -> L27
            r4.<init>()     // Catch: defpackage.dfqu -> L27
            dfhh r5 = new dfhh     // Catch: defpackage.dfqu -> L27
            crpn r8 = (defpackage.crpn) r8     // Catch: defpackage.dfqu -> L27
            dfhm r8 = r8.d     // Catch: defpackage.dfqu -> L27
            r5.<init>(r2)     // Catch: defpackage.dfqu -> L27
            r4.a = r5     // Catch: defpackage.dfqu -> L27
            com.google.android.gms.common.Feature[] r2 = new com.google.android.gms.common.Feature[r3]     // Catch: defpackage.dfqu -> L27
            com.google.android.gms.common.Feature r5 = defpackage.dfiu.a     // Catch: defpackage.dfqu -> L27
            r6 = 0
            r2[r6] = r5     // Catch: defpackage.dfqu -> L27
            r4.b = r2     // Catch: defpackage.dfqu -> L27
            r2 = 1582(0x62e, float:2.217E-42)
            r4.c = r2     // Catch: defpackage.dfqu -> L27
            dfuo r2 = r4.a()     // Catch: defpackage.dfqu -> L27
            dhre r8 = r8.i(r2)     // Catch: defpackage.dfqu -> L27
            crol r2 = new crol     // Catch: defpackage.dfqu -> L27
            r2.<init>()     // Catch: defpackage.dfqu -> L27
            crop r4 = new crop     // Catch: defpackage.dfqu -> L27
            r4.<init>()     // Catch: defpackage.dfqu -> L27
            r8.a(r4)     // Catch: defpackage.dfqu -> L27
            crow r2 = new crow     // Catch: defpackage.dfqu -> L27
            r2.<init>()     // Catch: defpackage.dfqu -> L27
            r8.t(r2)     // Catch: defpackage.dfqu -> L27
            com.google.common.util.concurrent.ListenableFuture r8 = defpackage.duin.a(r8)     // Catch: defpackage.dfqu -> L27
            elfl r8 = defpackage.elfl.g(r8)     // Catch: defpackage.dfqu -> L27
            r8.getClass()     // Catch: defpackage.dfqu -> L27
            r0.c = r3     // Catch: defpackage.dfqu -> L27
            java.lang.Object r8 = defpackage.fgfz.c(r8, r0)     // Catch: defpackage.dfqu -> L27
            if (r8 == r1) goto L8b
        L88:
            java.lang.String r8 = "markLocalKeysAsStale succeeded."
            return r8
        L8b:
            return r1
        L8c:
            r8.toString()
            java.lang.String r8 = r8.toString()
            java.lang.String r0 = "markLocalKeysAsStale failed. "
            java.lang.String r8 = r0.concat(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbfy.f(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.dbfw
            if (r0 == 0) goto L13
            r0 = r5
            dbfw r0 = (defpackage.dbfw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dbfw r0 = new dbfw
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.ffci.b(r5)     // Catch: defpackage.dfqu -> L27
            goto L44
        L27:
            r5 = move-exception
            goto L48
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.ffci.b(r5)
            croi r5 = r4.f     // Catch: defpackage.dfqu -> L27
            java.lang.String r2 = r4.e     // Catch: defpackage.dfqu -> L27
            elfl r5 = r5.d(r2)     // Catch: defpackage.dfqu -> L27
            r0.c = r3     // Catch: defpackage.dfqu -> L27
            java.lang.Object r5 = defpackage.fgfz.c(r5, r0)     // Catch: defpackage.dfqu -> L27
            if (r5 == r1) goto L47
        L44:
            java.lang.String r5 = "Success"
            return r5
        L47:
            return r1
        L48:
            r5.toString()
            java.lang.String r5 = r5.toString()
            java.lang.String r0 = "Failed. "
            java.lang.String r5 = r0.concat(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbfy.g(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(boolean r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.dbfx
            if (r0 == 0) goto L13
            r0 = r6
            dbfx r0 = (defpackage.dbfx) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dbfx r0 = new dbfx
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.ffci.b(r6)     // Catch: defpackage.dfqu -> L27
            goto L44
        L27:
            r5 = move-exception
            goto L48
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ffci.b(r6)
            croi r6 = r4.f     // Catch: defpackage.dfqu -> L27
            java.lang.String r2 = r4.e     // Catch: defpackage.dfqu -> L27
            elfl r5 = r6.e(r2, r5)     // Catch: defpackage.dfqu -> L27
            r0.c = r3     // Catch: defpackage.dfqu -> L27
            java.lang.Object r5 = defpackage.fgfz.c(r5, r0)     // Catch: defpackage.dfqu -> L27
            if (r5 == r1) goto L47
        L44:
            java.lang.String r5 = "Success"
            return r5
        L47:
            return r1
        L48:
            r5.toString()
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "Failed. "
            java.lang.String r5 = r6.concat(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbfy.h(boolean, ffgu):java.lang.Object");
    }
}
