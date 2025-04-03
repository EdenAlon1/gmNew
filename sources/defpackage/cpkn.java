package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpkn {
    private static final entd a = entd.c("BugleTachygram");

    public static Iterable a(esqr esqrVar) {
        int i = engw.d;
        engr engrVar = new engr();
        esqj esqjVar = (esqj) esqrVar;
        int ordinal = esqjVar.b.ordinal();
        if (ordinal == 0) {
            ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramGroupFeaturesConverter", "convert", 29, "TachygramGroupFeaturesConverter.java")).q("getGroupInfo() tachygram group has unknown renaming policy.");
        } else if (ordinal == 2) {
            engrVar.h(awvh.SUBJECT_UPDATE);
        }
        int ordinal2 = esqjVar.a.ordinal();
        if (ordinal2 == 0) {
            ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramGroupFeaturesConverter", "convert", 44, "TachygramGroupFeaturesConverter.java")).q("getGroupInfo() tachygram group has unknown removal policy.");
        } else if (ordinal2 == 2) {
            engrVar.h(awvh.REMOVE_PARTICIPANT_BY_ALL);
        } else if (ordinal2 == 3) {
            engrVar.h(awvh.REMOVE_PARTICIPANT_BY_ADMIN);
        }
        if (ersy.a("bugle.propagate_icon_modification_policy", "bugle")) {
            int ordinal3 = esqjVar.c.ordinal();
            if (ordinal3 == 0) {
                ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramGroupFeaturesConverter", "convert", 58, "TachygramGroupFeaturesConverter.java")).q("getGroupInfo() tachygram group has unknown icon modification policy.");
            } else if (ordinal3 == 2) {
                engrVar.h(awvh.ICON_UPDATE);
            }
        }
        return engrVar.g();
    }
}
