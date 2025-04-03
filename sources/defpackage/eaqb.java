package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaqb implements eapp {
    private static final entd a = entd.c("GnpSdk");
    private final eapq b;

    public eaqb(eapq eapqVar) {
        this.b = eapqVar;
    }

    @Override // defpackage.eapp
    public final int a(easy easyVar) {
        try {
            eapq eapqVar = this.b;
            final int a2 = eagu.a(easyVar);
            final String a3 = easyVar.a();
            return ((Integer) ovw.b(((eapz) eapqVar).a, false, true, new ffji() { // from class: eaps
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    ouz ouzVar = (ouz) obj;
                    ovi a4 = ouzVar.a("DELETE FROM gnp_accounts WHERE account_type = ? AND account_specific_id = ?");
                    int i = a2;
                    String str = a3;
                    try {
                        a4.e(1, i);
                        a4.g(2, str);
                        a4.j();
                        return Integer.valueOf(owb.a(ouzVar));
                    } finally {
                        a4.close();
                    }
                }
            })).intValue();
        } catch (Exception e) {
            ((ensz) ((ensz) a.j()).g(e)).o();
            return 0;
        }
    }

    @Override // defpackage.eapp
    public final eagt b(easy easyVar) {
        return this.b.c(eagu.a(easyVar), easyVar.a());
    }

    @Override // defpackage.eapp
    public final eagt c(easy easyVar) {
        eagt eagtVar;
        try {
            eagtVar = this.b.c(eagu.a(easyVar), easyVar.a());
        } catch (Exception e) {
            ((ensz) ((ensz) a.j()).g(e)).o();
            eagtVar = null;
        }
        if (eagtVar != null) {
            return eagtVar;
        }
        throw new eago();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:15|16))(3:17|18|(2:20|(1:22))(2:23|24))|11|12|13))|27|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0027, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        r7 = defpackage.ffci.a(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // defpackage.eapp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(final java.util.List r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.eaqa
            if (r0 == 0) goto L13
            r0 = r7
            eaqa r0 = (defpackage.eaqa) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            eaqa r0 = new eaqa
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.ffci.b(r7)     // Catch: java.lang.Throwable -> L27
            goto L4e
        L27:
            r6 = move-exception
            goto L5c
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.ffci.b(r7)
            eapq r7 = r5.b     // Catch: java.lang.Throwable -> L27
            r0.c = r3     // Catch: java.lang.Throwable -> L27
            if (r6 == 0) goto L5a
            r2 = r7
            eapz r2 = (defpackage.eapz) r2     // Catch: java.lang.Throwable -> L27
            otb r2 = r2.a     // Catch: java.lang.Throwable -> L27
            eapt r4 = new eapt     // Catch: java.lang.Throwable -> L27
            eapz r7 = (defpackage.eapz) r7     // Catch: java.lang.Throwable -> L27
            r4.<init>()     // Catch: java.lang.Throwable -> L27
            r6 = 0
            java.lang.Object r7 = defpackage.ovw.c(r2, r6, r3, r4, r0)     // Catch: java.lang.Throwable -> L27
            if (r7 != r1) goto L4e
            return r1
        L4e:
            java.lang.Number r7 = (java.lang.Number) r7     // Catch: java.lang.Throwable -> L27
            int r6 = r7.intValue()     // Catch: java.lang.Throwable -> L27
            java.lang.Integer r7 = new java.lang.Integer     // Catch: java.lang.Throwable -> L27
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L27
            goto L60
        L5a:
            r6 = 0
            throw r6     // Catch: java.lang.Throwable -> L27
        L5c:
            java.lang.Object r7 = defpackage.ffci.a(r6)
        L60:
            eafl r6 = defpackage.eafm.a(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eaqb.d(java.util.List, ffgu):java.lang.Object");
    }

    @Override // defpackage.eapp
    public final List e() {
        try {
            return this.b.a();
        } catch (Exception e) {
            ((ensz) ((ensz) a.j()).g(e)).o();
            return ffel.a;
        }
    }

    @Override // defpackage.eapp
    public final List f() {
        return this.b.a();
    }

    @Override // defpackage.eapp
    public final Long[] g(final List list) {
        final eapz eapzVar = (eapz) this.b;
        return (Long[]) ovw.b(eapzVar.a, false, true, new ffji() { // from class: eapw
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ouz ouzVar = (ouz) obj;
                ouzVar.getClass();
                ort ortVar = eapz.this.b;
                ovi a2 = ouzVar.a("INSERT OR ABORT INTO `gnp_accounts` (`id`,`account_specific_id`,`account_type`,`obfuscated_gaia_id`,`actual_account_name`,`actual_account_oid`,`registration_status`,`registration_id`,`sync_sources`,`representative_target_id`,`sync_version`,`last_registration_time_ms`,`last_registration_request_hash`,`first_registration_version`,`internal_target_id`,`fitbit_decoded_id`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                List list2 = list;
                try {
                    int size = list2.size();
                    Long[] lArr = new Long[size];
                    for (int i = 0; i < size; i++) {
                        Object obj2 = list2.get(i);
                        long j = -1;
                        if (obj2 != null) {
                            ortVar.b(a2, obj2);
                            a2.j();
                            a2.h();
                            if (owb.a(ouzVar) != 0) {
                                a2 = ouzVar.a("SELECT last_insert_rowid()");
                                try {
                                    a2.j();
                                    j = a2.b(0);
                                    ffit.a(a2, null);
                                } finally {
                                }
                            }
                        }
                        lArr[i] = Long.valueOf(j);
                    }
                    ffit.a(a2, null);
                    return lArr;
                } finally {
                }
            }
        });
    }

    @Override // defpackage.eapp
    public final void h(List list) {
        list.getClass();
        try {
            this.b.b(list);
        } catch (Exception e) {
            ((ensz) ((ensz) a.j()).g(e)).o();
        }
    }

    @Override // defpackage.eapp
    public final void i(List list) {
        this.b.b(list);
    }
}
