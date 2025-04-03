package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eanl {
    public final fazb a;

    public eanl(fazb fazbVar) {
        fazbVar.getClass();
        this.a = fazbVar;
    }

    public final eamb a() {
        int i = ((SharedPreferences) this.a.b()).getInt("last_successful_registration_account_type", eamb.b.f);
        boolean z = false;
        eamb eambVar = null;
        for (eamb eambVar2 : eamb.values()) {
            if (eambVar2.f == i) {
                if (z) {
                    return null;
                }
                z = true;
                eambVar = eambVar2;
            }
        }
        if (z) {
            return eambVar;
        }
        return null;
    }

    public final String b() {
        String string = ((SharedPreferences) this.a.b()).getString("internal_target_id", "");
        if (string != null) {
            return string;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final String c() {
        String string = ((SharedPreferences) this.a.b()).getString("last_successful_registration_environment_url", "");
        if (string != null) {
            return string;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final String d() {
        String string = ((SharedPreferences) this.a.b()).getString("last_successful_registration_pseudonymous_cookie", "");
        if (string != null) {
            return string;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final boolean e() {
        return ((SharedPreferences) this.a.b()).getBoolean("is_registered_to_unified_fcm_registration", false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        if (r4 == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f() {
        /*
            r9 = this;
            fazb r0 = r9.a
            java.lang.Object r0 = r0.b()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            java.lang.String r1 = "last_used_registration_api"
            r2 = 3
            int r0 = r0.getInt(r1, r2)
            r1 = 2
            r3 = 1
            int[] r1 = new int[]{r3, r1, r2}
            r4 = 0
            r5 = r4
            r6 = r5
            r7 = r6
        L19:
            if (r5 >= r2) goto L2b
            r8 = r1[r5]
            if (r8 == 0) goto L29
            if (r8 != r0) goto L26
            if (r6 == 0) goto L24
            goto L2f
        L24:
            r6 = r3
            r7 = r8
        L26:
            int r5 = r5 + 1
            goto L19
        L29:
            r0 = 0
            throw r0
        L2b:
            if (r6 != 0) goto L2e
            goto L2f
        L2e:
            r4 = r7
        L2f:
            if (r4 == 0) goto L32
            return r4
        L32:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Required value was null."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eanl.f():int");
    }
}
