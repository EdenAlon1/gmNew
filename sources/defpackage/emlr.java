package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emlr {
    public static int a(List list, Set set) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (!set.contains(b((fbxa) it.next()))) {
                i++;
            }
        }
        return i;
    }

    public static fbri b(fbxa fbxaVar) {
        int i = fbxaVar.c;
        return i != 7 ? i != 3 ? i != 4 ? i != 5 ? i != 6 ? i != 9 ? i != 20 ? i != 2 ? i != 11 ? i != 12 ? i != 13 ? i != 14 ? i != 15 ? i != 16 ? i != 17 ? i != 18 ? i != 19 ? i != 21 ? i != 22 ? i != 23 ? i != 24 ? i != 25 ? i != 26 ? i != 27 ? i != 28 ? i != 29 ? i != 30 ? i != 31 ? i == 32 ? fbri.RECORD_VOICE_MESSAGE : fbri.UNKNOWN_SUGGESTION_TYPE : fbri.OPEN_MAGIC_COMPOSE : fbri.CATEGORY_BERT : fbri.CREATE_PHOTOMOJI : fbri.SELFIE_GIF : fbri.SCREEN_EFFECTS : fbri.STARRING : fbri.SAVE_BIRTHDAY : fbri.EXPIRATION_SENTINEL : fbri.NUDGE : fbri.BUSINESS_MESSAGE : fbri.WEB : fbri.CALENDAR : fbri.COPY_OTP : fbri.RECENT_IMAGE : fbri.SENSITIVE_IMAGE : fbri.SCRIPTED_REPLY : fbri.DUO_CALL : fbri.EMOTION : fbri.REMINDER : fbri.CONTEXT : fbri.FULL_MESSAGE : fbri.SILENT : fbri.SPAM : fbri.CONTACT : fbri.GIF : fbri.PAYMENT : fbri.LOCATION : fbri.ASSISTANT_QUERY;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int c(fbup fbupVar, String str) {
        if (fbupVar.b.size() != 0) {
            return str.equals(((fbun) fbupVar.b.get(fbupVar.b.size() + (-1))).d) ? 4 : 3;
        }
        return 3;
    }
}
