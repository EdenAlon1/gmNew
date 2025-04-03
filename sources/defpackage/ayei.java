package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayei {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/contacts/sync/workprofile/WorkProfileContactsSyncEligibilityChecker");
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;

    public ayei(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(10:5|6|7|(1:(1:10)(2:21|22))(3:23|24|(1:26))|11|(1:13)|14|(1:16)|17|18))|29|6|7|(0)(0)|11|(0)|14|(0)|17|18) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0030, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        r0 = defpackage.ayei.a.j();
        r0.Y(defpackage.ente.a, "BugleContacts");
        ((defpackage.enrr) ((defpackage.enrr) r0).g(r10).h("com/google/android/apps/messaging/shared/contacts/sync/workprofile/WorkProfileContactsSyncEligibilityChecker", "hasWorkProfileContacts", 67, "WorkProfileContactsSyncEligibilityChecker.kt")).q("Failed to check for Managed Work Profile contact directory.");
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056 A[Catch: ejni -> 0x0030, TryCatch #0 {ejni -> 0x0030, blocks: (B:10:0x002c, B:11:0x004e, B:13:0x0056, B:14:0x006e, B:24:0x003d), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffgu r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.ayeh
            if (r0 == 0) goto L13
            r0 = r10
            ayeh r0 = (defpackage.ayeh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ayeh r0 = new ayeh
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 0
            java.lang.String r4 = "hasWorkProfileContacts"
            java.lang.String r5 = "com/google/android/apps/messaging/shared/contacts/sync/workprofile/WorkProfileContactsSyncEligibilityChecker"
            java.lang.String r6 = "WorkProfileContactsSyncEligibilityChecker.kt"
            java.lang.String r7 = "BugleContacts"
            r8 = 1
            if (r2 == 0) goto L3a
            if (r2 != r8) goto L32
            defpackage.ffci.b(r10)     // Catch: defpackage.ejni -> L30
            goto L4e
        L30:
            r10 = move-exception
            goto L76
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L3a:
            defpackage.ffci.b(r10)
            ffbr r10 = r9.d     // Catch: defpackage.ejni -> L30
            java.lang.Object r10 = r10.b()     // Catch: defpackage.ejni -> L30
            axwk r10 = (defpackage.axwk) r10     // Catch: defpackage.ejni -> L30
            r0.c = r8     // Catch: defpackage.ejni -> L30
            java.lang.Object r10 = r10.a(r0)     // Catch: defpackage.ejni -> L30
            if (r10 != r1) goto L4e
            return r1
        L4e:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: defpackage.ejni -> L30
            boolean r0 = r10.booleanValue()     // Catch: defpackage.ejni -> L30
            if (r0 != 0) goto L6e
            enru r0 = defpackage.ayei.a     // Catch: defpackage.ejni -> L30
            ensk r0 = r0.h()     // Catch: defpackage.ejni -> L30
            ensn r1 = defpackage.ente.a     // Catch: defpackage.ejni -> L30
            r0.Y(r1, r7)     // Catch: defpackage.ejni -> L30
            r1 = 60
            ensk r0 = r0.h(r5, r4, r1, r6)     // Catch: defpackage.ejni -> L30
            enrr r0 = (defpackage.enrr) r0     // Catch: defpackage.ejni -> L30
            java.lang.String r1 = "Does not have Managed Work Profile contacts to sync."
            r0.q(r1)     // Catch: defpackage.ejni -> L30
        L6e:
            boolean r10 = r10.booleanValue()     // Catch: defpackage.ejni -> L30
            if (r10 == 0) goto L94
            r3 = r8
            goto L94
        L76:
            enru r0 = defpackage.ayei.a
            ensk r0 = r0.j()
            ensn r1 = defpackage.ente.a
            r0.Y(r1, r7)
            enrr r0 = (defpackage.enrr) r0
            ensk r10 = r0.g(r10)
            r0 = 67
            ensk r10 = r10.h(r5, r4, r0, r6)
            enrr r10 = (defpackage.enrr) r10
            java.lang.String r0 = "Failed to check for Managed Work Profile contact directory."
            r10.q(r0)
        L94:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r3)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayei.a(ffgu):java.lang.Object");
    }

    public final Object b(ffgu ffguVar) {
        if (!((atfe) this.b.b()).a()) {
            ensk h = a.h();
            h.Y(ente.a, "BugleContacts");
            ((enrr) h.h("com/google/android/apps/messaging/shared/contacts/sync/workprofile/WorkProfileContactsSyncEligibilityChecker", "isFeatureFlagEnabled", 43, "WorkProfileContactsSyncEligibilityChecker.kt")).q("Managed Work Profile contacts sync feature not enabled.");
        } else if (((axun) this.c.b()).a()) {
            if (Build.VERSION.SDK_INT >= 34) {
                return a(ffguVar);
            }
            ensk h2 = a.h();
            h2.Y(ente.a, "BugleContacts");
            ((enrr) h2.h("com/google/android/apps/messaging/shared/contacts/sync/workprofile/WorkProfileContactsSyncEligibilityChecker", "meetsAndroidApiLevelRequirements", 52, "WorkProfileContactsSyncEligibilityChecker.kt")).q("Fails minimum API level requirements for Managed Work Profile syncing.");
        }
        return false;
    }
}
