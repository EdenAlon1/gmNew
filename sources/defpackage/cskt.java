package defpackage;

import android.net.Uri;
import android.util.Log;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cskt {
    public static String a(ConversationIdType conversationIdType) {
        return b(conversationIdType.toString());
    }

    public static String b(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return Log.isLoggable("Bugle", 3) ? a.b(charSequence, "raw-pii[", "]") : e(charSequence);
    }

    public static String c(aoku aokuVar) {
        return b(aokuVar.toString());
    }

    public static String d(Uri uri) {
        String eodbVar;
        String path = uri.getPath();
        if (path == null) {
            eodbVar = "";
        } else {
            int i = eodh.a;
            eodbVar = eodf.a.c(path, StandardCharsets.UTF_8).toString();
        }
        return uri.getScheme() + "://" + uri.getAuthority() + "/redacted-" + eodbVar;
    }

    public static String e(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return "redacted-pii[" + charSequence.length() + "-chars]";
    }

    public static String f(Uri uri) {
        if (uri == null) {
            return null;
        }
        if (Log.isLoggable("Bugle", 3)) {
            return uri.toString();
        }
        return uri.getScheme() + "://" + uri.getAuthority() + "/...Redacted...";
    }
}
