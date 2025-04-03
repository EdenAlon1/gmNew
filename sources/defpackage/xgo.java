package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xgo {
    private static final enru a = enru.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/TextAttachmentInfoCreator");
    private final cstx b;

    public xgo(cstx cstxVar) {
        cstxVar.getClass();
        this.b = cstxVar;
    }

    private static final List b(int i, Integer num, boolean z) {
        fffs fffsVar = new fffs((byte[]) null);
        epog a2 = epof.a((eppq) eppr.a.createBuilder());
        eprv eprvVar = (eprv) eprw.a.createBuilder();
        eprvVar.getClass();
        erbb.b(xgn.a(i), eprvVar);
        if (z) {
            erbb.c(eprvVar);
        }
        a2.f(erbb.a(eprvVar));
        fffsVar.add(a2.a());
        if (num != null) {
            eppr b = xgd.b(1, null);
            int intValue = num.intValue();
            ArrayList arrayList = new ArrayList(intValue);
            for (int i2 = 0; i2 < intValue; i2++) {
                arrayList.add(b);
            }
            ffdx.w(fffsVar, arrayList);
        }
        return ffdx.a(fffsVar);
    }

    public final List a(String str, xgc xgcVar, boolean z) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("Cannot get AttachmentInfo for empty text");
        }
        ksr a2 = this.b.a(str);
        if (((Number) a2.a).intValue() < 0 && ((Number) a2.b).intValue() < 0) {
            ensk j = a.j();
            j.Y(ente.a, "BugleComposeRow2");
            ((enrr) j.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/TextAttachmentInfoCreator", "infoFromText", 55, "TextAttachmentInfoCreator.kt")).q("EmojiUtils returned negative pair, treating all text as not emoji");
        }
        Object obj = a2.a;
        if (((Integer) obj).intValue() <= 0) {
            obj = null;
        }
        ffcf ffcfVar = new ffcf(obj, Integer.valueOf(str.length()));
        Integer num = (Integer) ffcfVar.a;
        int intValue = ((Number) ffcfVar.b).intValue();
        if (xgcVar == null) {
            return b(intValue, num, z);
        }
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Map.Entry entry : xgcVar.a.entrySet()) {
            xgf xgfVar = (xgf) entry.getKey();
            int intValue2 = ((Number) entry.getValue()).intValue();
            if (intValue2 <= 0) {
                throw new IllegalStateException("Check failed.");
            }
            i += intValue2;
            eppr b = xgd.b(xgfVar.b, Boolean.valueOf(xgfVar.a));
            ArrayList arrayList2 = new ArrayList(intValue2);
            for (int i2 = 0; i2 < intValue2; i2++) {
                arrayList2.add(b);
            }
            ffdx.w(arrayList, arrayList2);
        }
        List ak = ffdx.ak(arrayList);
        if (num != null && num.intValue() != i) {
            ensk j2 = a.j();
            j2.Y(ente.a, "BugleComposeRow2");
            ((enrr) j2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/TextAttachmentInfoCreator", "createAttachmentInfoComparingEmojiAnnotations", 103, "TextAttachmentInfoCreator.kt")).w("Manual count of emojis does not match count of EmojiAnnotations: %d, %s", num.intValue(), xgcVar);
            return b(length, num, z);
        }
        fffs fffsVar = new fffs((byte[]) null);
        epog a3 = epof.a((eppq) eppr.a.createBuilder());
        eprv eprvVar = (eprv) eprw.a.createBuilder();
        eprvVar.getClass();
        erbb.b(xgn.a(length), eprvVar);
        if (z) {
            erbb.c(eprvVar);
        }
        a3.f(erbb.a(eprvVar));
        fffsVar.add(a3.a());
        ffdx.w(fffsVar, ak);
        return ffdx.a(fffsVar);
    }
}
