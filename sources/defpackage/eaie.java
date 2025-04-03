package defpackage;

import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaie implements eahm {
    private static final entd a = entd.c("GnpSdk");
    private final eapp b;
    private final eaku c;

    public eaie(eapp eappVar, eaku eakuVar) {
        this.b = eappVar;
        this.c = eakuVar;
    }

    @Override // defpackage.eahm
    public final eagt a(exwl exwlVar) {
        String str;
        String str2;
        if (fdod.b()) {
            if ((exwlVar.b & 2) != 0) {
                exyb exybVar = exwlVar.d;
                if (exybVar == null) {
                    exybVar = exyb.a;
                }
                str2 = exybVar.d;
            } else {
                str2 = null;
            }
            if (TextUtils.isEmpty(str2)) {
                ((ensz) ((ensz) a.i()).h("com/google/android/libraries/notifications/platform/entrypoints/push/impl/AndroidPayloadsHelperImpl", "getGnpAccountByRtid", 169, "AndroidPayloadsHelperImpl.java")).q("Representative target id in payload is empty, can't find account");
                return null;
            }
            for (eagt eagtVar : this.b.e()) {
                String p = eagtVar.p();
                if (p != null && p.equals(str2)) {
                    return eagtVar;
                }
            }
            ((ensz) ((ensz) a.j()).h("com/google/android/libraries/notifications/platform/entrypoints/push/impl/AndroidPayloadsHelperImpl", "getGnpAccountByRtid", 179, "AndroidPayloadsHelperImpl.java")).q("No accounts matching the notification payload RTID were found");
            return null;
        }
        String str3 = exwlVar.c;
        if (TextUtils.isEmpty(str3)) {
            exyb exybVar2 = exwlVar.d;
            if (exybVar2 == null) {
                exybVar2 = exyb.a;
            }
            if (exybVar2.b != 6 || !((Boolean) exybVar2.c).booleanValue()) {
                return null;
            }
            try {
                eagt b = this.b.b(eaty.a);
                if (b == null) {
                    ((ensz) ((ensz) a.j()).h("com/google/android/libraries/notifications/platform/entrypoints/push/impl/AndroidPayloadsHelperImpl", "getGnpAccountByObfuscatedGaiaIdOrSignedOutIndicator", 152, "AndroidPayloadsHelperImpl.java")).q("YouTube visitor is not found in SDK's storage.");
                }
                return b;
            } catch (SQLiteException e) {
                ((ensz) ((ensz) ((ensz) a.j()).g(e)).h("com/google/android/libraries/notifications/platform/entrypoints/push/impl/AndroidPayloadsHelperImpl", "getGnpAccountByObfuscatedGaiaIdOrSignedOutIndicator", (char) 156, "AndroidPayloadsHelperImpl.java")).q("Failed to get YouTube visitor from account storage.");
                return null;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (eagt eagtVar2 : this.b.e()) {
            arrayList.add(String.valueOf(eagtVar2.e()));
            if (TextUtils.isEmpty(eagtVar2.n()) && !eagtVar2.t()) {
                try {
                    str = this.c.b(eagtVar2.j());
                } catch (Exception e2) {
                    ((ensz) ((ensz) ((ensz) a.i()).g(e2)).h("com/google/android/libraries/notifications/platform/entrypoints/push/impl/AndroidPayloadsHelperImpl", "getObfuscatedGaiaId", 196, "AndroidPayloadsHelperImpl.java")).s("Failed to get the obfuscated account ID for account with ID [%s].", eagtVar2.e());
                }
                if (TextUtils.isEmpty(str)) {
                    ((ensz) ((ensz) a.i()).h("com/google/android/libraries/notifications/platform/entrypoints/push/impl/AndroidPayloadsHelperImpl", "getObfuscatedGaiaId", 189, "AndroidPayloadsHelperImpl.java")).s("AuthUtil returned empty obfuscated account ID for account with ID [%s].", eagtVar2.e());
                    str = null;
                }
                if (str != null) {
                    eags h = eagtVar2.h();
                    ((eagq) h).a = str;
                    eagtVar2 = h.a();
                    this.b.h(engw.r(eagtVar2));
                }
            }
            if (str3.equals(eagtVar2.n())) {
                return eagtVar2;
            }
        }
        ((ensz) ((ensz) a.j()).h("com/google/android/libraries/notifications/platform/entrypoints/push/impl/AndroidPayloadsHelperImpl", "getGnpAccountByObfuscatedGaiaIdOrSignedOutIndicator", 141, "AndroidPayloadsHelperImpl.java")).J("The recipient [%s] is not found in SDK's storage. Accounts IDs found: [%s] (%s)", str3, arrayList.isEmpty() ? "None" : TextUtils.join(", ", arrayList), new evhq(evhp.NO_USER_DATA, Integer.valueOf(arrayList.size())));
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x004e, code lost:
    
        if (r5.b == 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0067, code lost:
    
        if (r0.d.isEmpty() == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0073, code lost:
    
        r5 = r5.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0075, code lost:
    
        if (r5 != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0077, code lost:
    
        r5 = defpackage.exyl.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0079, code lost:
    
        r5 = defpackage.exxw.a(r5.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x007f, code lost:
    
        if (r5 != 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0081, code lost:
    
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0085, code lost:
    
        if ((r5 - 1) == 2) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x008a, code lost:
    
        return defpackage.eaid.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0070, code lost:
    
        if (r5.c.isEmpty() != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
    
        if (r5.e.isEmpty() != false) goto L62;
     */
    @Override // defpackage.eahm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.eaid b(defpackage.exwl r5) {
        /*
            r4 = this;
            int r0 = r5.b
            r1 = r0 & 4
            if (r1 == 0) goto L16
            exxk r5 = r5.e
            if (r5 != 0) goto Lc
            exxk r5 = defpackage.exxk.a
        Lc:
            java.lang.String r5 = r5.e
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L8b
            goto L8e
        L16:
            r0 = r0 & 8
            if (r0 == 0) goto L8e
            exyl r0 = r5.f
            if (r0 != 0) goto L20
            exyl r0 = defpackage.exyl.a
        L20:
            int r0 = r0.b
            exyk r0 = defpackage.exyk.b(r0)
            if (r0 != 0) goto L2a
            exyk r0 = defpackage.exyk.UNKNOWN_INSTRUCTION
        L2a:
            exyk r1 = defpackage.exyk.SYNC
            if (r0 == r1) goto L3e
            exyk r1 = defpackage.exyk.FULL_SYNC
            if (r0 == r1) goto L3e
            exyk r1 = defpackage.exyk.STORE_ALL_ACCOUNTS
            if (r0 == r1) goto L3e
            exyk r1 = defpackage.exyk.UPDATE_THREAD
            if (r0 == r1) goto L3e
            exyk r1 = defpackage.exyk.UPDATE_BADGE_COUNT
            if (r0 != r1) goto L8e
        L3e:
            exyk r1 = defpackage.exyk.UPDATE_BADGE_COUNT
            if (r0 != r1) goto L51
            exxy r5 = r5.g
            if (r5 != 0) goto L48
            exxy r5 = defpackage.exxy.a
        L48:
            long r0 = r5.b
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L8b
            goto L8e
        L51:
            exyk r1 = defpackage.exyk.STORE_ALL_ACCOUNTS
            if (r0 == r1) goto L8b
            boolean r0 = defpackage.fdod.b()
            if (r0 == 0) goto L6a
            exyb r0 = r5.d
            if (r0 != 0) goto L61
            exyb r0 = defpackage.exyb.a
        L61:
            java.lang.String r0 = r0.d
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L8e
            goto L73
        L6a:
            java.lang.String r0 = r5.c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L73
            goto L8e
        L73:
            exyl r5 = r5.f
            if (r5 != 0) goto L79
            exyl r5 = defpackage.exyl.a
        L79:
            int r5 = r5.c
            int r5 = defpackage.exxw.a(r5)
            if (r5 != 0) goto L82
            r5 = 1
        L82:
            int r5 = r5 + (-1)
            r0 = 2
            if (r5 == r0) goto L88
            goto L8b
        L88:
            eaid r5 = defpackage.eaid.c
            return r5
        L8b:
            eaid r5 = defpackage.eaid.b
            return r5
        L8e:
            eaid r5 = defpackage.eaid.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eaie.b(exwl):eaid");
    }
}
