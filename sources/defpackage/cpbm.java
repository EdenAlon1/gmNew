package defpackage;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpbm {
    private static final enru b = enru.c("com/google/android/apps/messaging/shared/sms/config/HiddenContacts");
    public final List a;

    private cpbm(List list) {
        csix.k(!list.isEmpty());
        this.a = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01b4 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.cpbm b(final int r27, java.lang.String r28, final defpackage.ctwb r29) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpbm.b(int, java.lang.String, ctwb):cpbm");
    }

    public final cpbk a(aoku aokuVar) {
        cfva cfvaVar = aoqm.a;
        if (aokuVar.y(((Boolean) new aoqf().get()).booleanValue())) {
            ensk j = b.j();
            j.Y(ente.a, "Bugle");
            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/sms/config/HiddenContacts", "find", 198, "HiddenContacts.java")).q("HiddenContacts: invalid input number (empty)");
            return null;
        }
        String p = aokuVar.p(((Boolean) new aoqf().get()).booleanValue());
        if (p == null) {
            return null;
        }
        int length = p.length();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int digit = Character.digit(p.charAt(i), 10);
            if (digit != -1) {
                sb.append(digit);
            }
        }
        String sb2 = sb.toString();
        if (TextUtils.isEmpty(sb2)) {
            ensk j2 = b.j();
            j2.Y(ente.a, "Bugle");
            ((enrr) ((enrr) j2).h("com/google/android/apps/messaging/shared/sms/config/HiddenContacts", "find", 210, "HiddenContacts.java")).t("HiddenContacts: invalid input number: %s", p);
            return null;
        }
        try {
            long parseLong = Long.parseLong(sb2);
            loop1: for (cpbk cpbkVar : this.a) {
                if (!cpbkVar.b.isEmpty()) {
                    Iterator it = cpbkVar.c.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            cpbl cpblVar = (cpbl) it.next();
                            if (parseLong >= cpblVar.a && parseLong <= cpblVar.b) {
                                break loop1;
                            }
                        } else if (aokuVar.equals(cpbkVar.b.get())) {
                        }
                    }
                    return cpbkVar;
                }
            }
            return null;
        } catch (NumberFormatException unused) {
            ensk j3 = b.j();
            j3.Y(ente.a, "Bugle");
            ((enrr) ((enrr) j3).h("com/google/android/apps/messaging/shared/sms/config/HiddenContacts", "find", 217, "HiddenContacts.java")).t("HiddenContacts: invalid input number: %s", p);
            return null;
        }
    }
}
