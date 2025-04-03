package defpackage;

import android.database.Cursor;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqvu {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/api/messaging/selfidentity/contactfetcher/ContactUtilBasedSelfContactFetcher");
    private final csqw b;

    public aqvu(csqw csqwVar) {
        csqwVar.getClass();
        this.b = csqwVar;
    }

    public final aqvv a() {
        aqvv aqvvVar;
        try {
            Cursor a2 = this.b.f().a();
            if (a2 != null) {
                try {
                    if (a2.moveToFirst()) {
                        String string = a2.getString(1);
                        string.getClass();
                        Uri parse = Uri.parse(a2.getString(2));
                        parse.getClass();
                        aqvvVar = new aqvv(string, parse);
                        ffig.a(a2, null);
                        return aqvvVar;
                    }
                } finally {
                }
            }
            aqvvVar = new aqvv(null);
            ffig.a(a2, null);
            return aqvvVar;
        } catch (Exception e) {
            ((enrr) ((enrr) a.i()).g(e).h("com/google/android/apps/messaging/shared/api/messaging/selfidentity/contactfetcher/ContactUtilBasedSelfContactFetcher", "getSelfParticipantProperties", 30, "ContactUtilBasedSelfContactFetcher.kt")).q("failed to get SelfParticipantProperties from self profile");
            return new aqvv(null);
        }
    }
}
