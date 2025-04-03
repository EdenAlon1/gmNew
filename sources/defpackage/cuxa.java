package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cuxa {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/util/text/ConferenceUriFilterUtil");

    public static Boolean a(String str) {
        List i = emye.b(':').i(str);
        return (((String) i.get(0)).equals("sip") || ((String) i.get(0)).equals("proto")) && i.size() >= 2 && !((String) i.get(1)).equals("sip") && !((String) i.get(1)).equals("proto");
    }

    public static String b(String str, boolean z) {
        if (str == null) {
            return null;
        }
        if (!a(str).booleanValue()) {
            if (z) {
                enrr enrrVar = (enrr) a.j();
                enrrVar.aa(ensy.MEDIUM);
                ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/util/text/ConferenceUriFilterUtil", "extractConferenceUriFromSerializedTransactionId", 44, "ConferenceUriFilterUtil.java")).t("Attempting to reformat invalid conferenceUri: %s", c(str));
            }
            List i = emye.b(':').i(str);
            int i2 = 0;
            while (i2 < i.size() && (((String) i.get(i2)).contains("sip") || ((String) i.get(i2)).contains("proto"))) {
                i2++;
            }
            List subList = i.subList(i2, i.size());
            StringBuilder sb = new StringBuilder();
            Iterator it = subList.iterator();
            if (it.hasNext()) {
                while (true) {
                    sb.append((CharSequence) it.next());
                    if (!it.hasNext()) {
                        break;
                    }
                    sb.append((CharSequence) ":");
                }
            }
            try {
                ckex d = ckey.d(sb.toString(), true);
                if (d == null) {
                    if (z) {
                        enrr enrrVar2 = (enrr) a.j();
                        enrrVar2.aa(ensy.MEDIUM);
                        ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/util/text/ConferenceUriFilterUtil", "extractConferenceUriFromSerializedTransactionId", 68, "ConferenceUriFilterUtil.java")).t("Failed to format invalid RCS conferenceUri - metadata is empty: %s", c(str));
                    }
                    return null;
                }
                Object obj = ((ckbd) d).c.get();
                String str2 = (((ckbt) obj).c == 2 ? (ckbr) ((ckbt) obj).d : ckbr.a).d;
                if (true == a(str2).booleanValue()) {
                    return str2;
                }
            } catch (IllegalArgumentException | NoSuchElementException e) {
                if (z) {
                    enrr enrrVar3 = (enrr) a.j();
                    enrrVar3.aa(ensy.MEDIUM);
                    ((enrr) ((enrr) enrrVar3.g(e)).h("com/google/android/apps/messaging/shared/util/text/ConferenceUriFilterUtil", "extractConferenceUriFromSerializedTransactionId", 83, "ConferenceUriFilterUtil.java")).t("Failed to format invalid RCS conferenceUri, returning original uri: %s", c(str));
                }
            }
        }
        return str;
    }

    private static evhq c(String str) {
        return str.length() > 20 ? new evhq(evhp.SERVER_KNOWN_USER_DATA, str.substring(0, 20)) : new evhq(evhp.SERVER_KNOWN_USER_DATA, str);
    }
}
