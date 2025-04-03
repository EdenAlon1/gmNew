package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dywb {
    public static Uri a(long j, dzxf dzxfVar) {
        return f("conversations", "REGISTRATION", String.valueOf(j), "BLOCKS_PATH", String.valueOf(dzxfVar.hashCode()));
    }

    public static Uri b(long j, dzpg dzpgVar) {
        return f("contacts", "REGISTRATION", String.valueOf(j), "CONTACT_PATH", String.valueOf(dzpgVar.hashCode()));
    }

    public static Uri c(long j, dzpt dzptVar) {
        return f("conversations", "REGISTRATION", String.valueOf(j), "CONVERSATION_PATH", String.valueOf(dzptVar.hashCode()));
    }

    public static Uri d(long j, dzpt dzptVar) {
        return f("messages", "REGISTRATION", String.valueOf(j), "MESSAGES_FOR_CONVERSATION_PATH", String.valueOf(dzptVar.hashCode()));
    }

    public static Uri e(long j, dzpt dzptVar) {
        return f("participants", "REGISTRATION", String.valueOf(j), "PARTICIPANTS_LIST_PATH", String.valueOf(dzptVar.hashCode()));
    }

    public static Uri f(String str, String... strArr) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("content");
        builder.authority("com.google.android.libraries.messaging.lighter.internal.data");
        builder.appendEncodedPath(str);
        for (String str2 : strArr) {
            builder.appendEncodedPath(str2);
        }
        return builder.build();
    }
}
