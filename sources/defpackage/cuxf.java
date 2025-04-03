package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuxf {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/util/text/GroupNameValueFilter");

    /* compiled from: PG */
    public interface a {
        cuwz cW();

        akzt s();
    }

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        cuwz cW = ((a) ctba.a(a.class)).cW();
        akzt s = ((a) ctba.a(a.class)).s();
        if (!emxb.a(str, cW.a(str))) {
            enrr enrrVar = (enrr) a.j();
            enrrVar.aa(ensy.MEDIUM);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/util/text/GroupNameValueFilter", "analyzeForBase32GroupName", 64, "GroupNameValueFilter.java")).q("Conversation has a base32-encoded conversation name");
            s.c("Bugle.Conversations.GroupNameInvalid.Count");
        }
        return str;
    }
}
