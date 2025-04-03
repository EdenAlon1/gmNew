package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cihr implements cigv {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/net/handler/reflectedmessage/ReflectedMessageInboxMessageHandler");
    private final ffsk b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final Map f;
    private final Map g;

    public cihr(ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, Map map, Map map2) {
        ffskVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        this.b = ffskVar;
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.f = map;
        this.g = map2;
        Iterator<E> it = ((enhk) map).keySet().iterator();
        while (it.hasNext()) {
            ((enrr) a.h().h("com/google/android/apps/messaging/shared/net/handler/reflectedmessage/ReflectedMessageInboxMessageHandler", "<init>", 50, "ReflectedMessageInboxMessageHandler.kt")).t("Registered ReflectedMessageContentHandler for %s ", ((eohj) it.next()).name());
        }
    }

    private static final String e(fbzt fbztVar) {
        fbzs b = fbzs.b(fbztVar.d);
        if (b == null) {
            b = fbzs.UNRECOGNIZED;
        }
        String format = String.format("messageType: %s, messageId: %s", Arrays.copyOf(new Object[]{b.name(), fbztVar.c}, 2));
        format.getClass();
        return format;
    }

    @Override // defpackage.cigv
    public final elfl a(fbzt fbztVar) {
        elfl c;
        fbztVar.getClass();
        c = axol.c(this.b, ffhe.a, ffsm.a, new ciho(this, fbztVar, null));
        return c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fckg r11, defpackage.ciht r12, defpackage.ffgu r13) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cihr.b(fckg, ciht, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x017c, code lost:
    
        r5 = r10;
        r10 = r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.fbzt r18, defpackage.ffgu r19) {
        /*
            Method dump skipped, instructions count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cihr.c(fbzt, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00f8 A[Catch: Exception -> 0x0105, TryCatch #2 {Exception -> 0x0105, blocks: (B:12:0x008e, B:16:0x00e0, B:18:0x00f8, B:19:0x00fa, B:28:0x0101, B:29:0x0104, B:25:0x00ff, B:14:0x00ac), top: B:11:0x008e, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.fbzt r7, defpackage.ffgu r8) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cihr.d(fbzt, ffgu):java.lang.Object");
    }
}
