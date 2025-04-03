package defpackage;

import android.net.Uri;
import android.util.Base64;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekck {
    final /* synthetic */ ekbo a;

    public ekck(ekbo ekboVar) {
        this.a = ekboVar;
    }

    public final ekah a(String str) {
        ekcv ekcvVar;
        int P = ffpc.P(str, ' ', 0, 6);
        if (P <= 0 || P >= str.length() - 1) {
            throw new IllegalStateException("Bad flag format for ".concat(str));
        }
        ekbo ekboVar = this.a;
        String substring = str.substring(0, P);
        substring.getClass();
        String substring2 = str.substring(P + 1);
        substring2.getClass();
        ekbl ekblVar = new ekbl(substring, substring2);
        String str2 = ekblVar.a;
        Map map = ekboVar.b;
        String a = ekboVar.c.a(str2);
        Object obj = map.get(a);
        obj.getClass();
        String str3 = ekblVar.b;
        final ekek ekekVar = (ekek) obj;
        try {
            Boolean bool = null;
            if (ekekVar.v.e()) {
                ekcvVar = (ekcv) erqt.q(ekekVar.v.c());
            } else {
                ekzz f = eleg.f("Blocking for: " + ekekVar.w);
                try {
                    ekcv ekcvVar2 = (ekcv) ekekVar.m.b(new erog() { // from class: ekdx
                        @Override // defpackage.erog
                        public final ListenableFuture a() {
                            return ekek.this.v.c();
                        }
                    });
                    ffig.a(f, null);
                    ekcvVar = ekcvVar2;
                } finally {
                }
            }
            ekcvVar.getClass();
            ekah a2 = ekcvVar.a(str3, new ffji() { // from class: ekdd
                /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
                /* JADX WARN: Removed duplicated region for block: B:5:0x003c  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x007a  */
                /* JADX WARN: Type inference failed for: r4v9, types: [ekap, java.lang.Object] */
                @Override // defpackage.ffji
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invoke(java.lang.Object r8) {
                    /*
                        r7 = this;
                        java.lang.String r0 = "MendelPackageState"
                        ekeg r8 = (defpackage.ekeg) r8
                        r8.getClass()
                        ekek r1 = defpackage.ekek.this
                        r2 = 0
                        ffix r3 = r1.u     // Catch: java.lang.Throwable -> L13 defpackage.dtoy -> L20
                        java.lang.Object r3 = r3.invoke()     // Catch: java.lang.Throwable -> L13 defpackage.dtoy -> L20
                        java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L13 defpackage.dtoy -> L20
                        goto L3a
                    L13:
                        r3 = move-exception
                        java.lang.String r4 = r1.l
                        java.lang.String r5 = "Failed to get account name to commit for "
                        java.lang.String r4 = r5.concat(r4)
                        android.util.Log.e(r0, r4, r3)
                        goto L39
                    L20:
                        r3 = move-exception
                        java.lang.String r4 = r1.l
                        java.lang.StringBuilder r5 = new java.lang.StringBuilder
                        java.lang.String r6 = "Getting account name to commit for "
                        r5.<init>(r6)
                        r5.append(r4)
                        java.lang.String r4 = " would block"
                        r5.append(r4)
                        java.lang.String r4 = r5.toString()
                        android.util.Log.e(r0, r4, r3)
                    L39:
                        r3 = r2
                    L3a:
                        if (r3 == 0) goto L4b
                        eyee r0 = r8.b
                        ecwu r2 = r8.d
                        ffbr r4 = r1.s
                        java.lang.Object r4 = r4.b()
                        com.google.common.util.concurrent.ListenableFuture r0 = r4.a(r3, r0, r2)
                        goto L4f
                    L4b:
                        com.google.common.util.concurrent.ListenableFuture r0 = defpackage.erqt.i(r2)
                    L4f:
                        java.lang.String r2 = "Failed to commit to config"
                        defpackage.eked.a(r0, r2)
                        ekeh r0 = r1.k
                        java.lang.String r2 = r1.l
                        java.util.Set r0 = r0.a
                        r0.add(r2)
                        dlpw r0 = r1.c
                        j$.time.Instant r0 = r0.f()
                        long r2 = r0.toEpochMilli()
                        long r4 = r8.c
                        long r2 = r2 - r4
                        long r2 = java.lang.Math.abs(r2)
                        java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.DAYS
                        r4 = 1
                        long r4 = r8.toMillis(r4)
                        int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                        if (r8 <= 0) goto L8b
                        erog r8 = r1.t
                        errl r0 = r1.b
                        erog r8 = defpackage.eldl.c(r8)
                        com.google.common.util.concurrent.ListenableFuture r8 = defpackage.erqt.n(r8, r0)
                        java.lang.String r0 = "Failed to fetch after encountering old config"
                        defpackage.eked.a(r8, r0)
                    L8b:
                        java.lang.String r8 = r1.w
                        r8.getClass()
                        ffcu r8 = defpackage.ffcu.a
                        return r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.ekdd.invoke(java.lang.Object):java.lang.Object");
                }
            });
            if (!ekboVar.a.g()) {
                return a2;
            }
            Object obj2 = ekboVar.b.get(a);
            obj2.getClass();
            String str4 = ekblVar.b;
            ekek ekekVar2 = (ekek) obj2;
            ecuu ecuuVar = (ecuu) ekboVar.a.c();
            String str5 = ekekVar2.w;
            ffbr ffbrVar = ekekVar2.o;
            Uri a3 = ecvd.a(str5);
            final ekah a4 = ((ekai) ffbrVar.b()).a(str4);
            if (a4 == null) {
                throw new IllegalArgumentException("No known flag " + str4 + ", known flags: " + ((ekai) ekekVar2.o.b()).b());
            }
            final String a5 = ecuuVar.a(a3, null, null, str4);
            if (a5 != null) {
                int i = a4.b - 1;
                if (i == 0) {
                    return ekag.c(Long.parseLong(a5));
                }
                if (i == 1) {
                    if (digv.c.matcher(a5).matches()) {
                        bool = true;
                    } else if (digv.d.matcher(a5).matches()) {
                        bool = false;
                    }
                    return ekag.a(bool != null ? bool.booleanValue() : a4.e());
                }
                if (i == 2) {
                    return ekag.b(Double.parseDouble(a5));
                }
                if (i == 3) {
                    return ekag.e(a5);
                }
                if (i == 4) {
                    return new ekah(new ffix() { // from class: ekbf
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            return eyee.x(Base64.decode(a5, 3));
                        }
                    }, 5);
                }
                try {
                    ffix ffixVar = new ffix() { // from class: ekbg
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            eyhs build = ekah.this.c().newBuilderForType().mergeFrom(Base64.decode(a5, 3)).build();
                            build.getClass();
                            return build;
                        }
                    };
                    eyhs eyhsVar = a4.a;
                    eyhsVar.getClass();
                    return ekag.d(ffixVar, eyhsVar);
                } catch (eygu unused) {
                }
            }
            return a4;
        } catch (ExecutionException e) {
            throw new RuntimeException(e.getCause());
        }
    }
}
