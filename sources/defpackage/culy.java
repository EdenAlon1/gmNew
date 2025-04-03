package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class culy {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/util/spam/common/SpamRejectionHandler");
    public static final cfup b = cfvl.i(cfvl.b, "cs_messages_from_contact", false);
    public static final cfup c = cfvl.e(cfvl.b, "cs_conversation_age_threshold", -1);
    public static final cfup d = cfvl.i(cfvl.b, "enable_logging_spam_protection_rejection_reason", true);
    public static final cfup e = cfvl.i(cfvl.b, "enable_logging_allowlisted_rejection_reason", true);
    public final ffbr f;
    private final ffbr g;

    public culy(ffbr ffbrVar, ffbr ffbrVar2) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        this.f = ffbrVar;
        this.g = ffbrVar2;
    }

    public static final void a(String str) {
        ensk h = a.h();
        h.Y(ente.a, "BugleSpam");
        ((enrr) h.h("com/google/android/apps/messaging/shared/util/spam/common/SpamRejectionHandler", "logToLogcat", 139, "SpamRejectionHandler.kt")).q(str);
    }

    public static /* synthetic */ Object b(culy culyVar, cujo cujoVar, cukx cukxVar, erdy erdyVar, Integer num, boolean z, Integer num2, ffgu ffguVar, int i) {
        cukx cukxVar2 = (i & 2) != 0 ? null : cukxVar;
        erdy erdyVar2 = (i & 4) != 0 ? null : erdyVar;
        boolean z2 = (i & 64) != 0;
        if (z2) {
            if (cukxVar2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            if (erdyVar2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        int i2 = i & 32;
        int i3 = i & 8;
        boolean z3 = (i & 16) == 0;
        Integer num3 = i2 != 0 ? null : num2;
        boolean z4 = z3 & z;
        Integer num4 = i3 != 0 ? null : num;
        Object b2 = culyVar.g.b();
        b2.getClass();
        return ffra.a(ekxi.a((ffhd) b2), new culx(null, cujoVar, culyVar, z4, num3, z2, cukxVar2, erdyVar2, num4), ffguVar);
    }
}
