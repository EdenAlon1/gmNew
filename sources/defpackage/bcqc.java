package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcqc {
    public static Uri a(Context context, ConversationIdType conversationIdType) {
        Uri.Builder buildUpon = Uri.parse(o(context).concat("conversation_images")).buildUpon();
        buildUpon.appendPath(conversationIdType.a());
        return buildUpon.build();
    }

    public static Uri b(Context context, ConversationIdType conversationIdType) {
        return c(context, conversationIdType, bdhb.a, new String[0]);
    }

    public static Uri c(Context context, ConversationIdType conversationIdType, MessageIdType messageIdType, String... strArr) {
        if (conversationIdType.b()) {
            conversationIdType = bdgq.a;
        }
        Uri.Builder buildUpon = h(context).buildUpon();
        buildUpon.appendPath(conversationIdType.a());
        if (!messageIdType.c()) {
            buildUpon.appendPath(messageIdType.b());
        }
        buildUpon.encodedQuery(TextUtils.join("&", strArr));
        return buildUpon.build();
    }

    public static Uri d(Context context, ConversationId conversationId) {
        if (conversationId == null) {
            return e(context, bdgq.a);
        }
        Uri.Builder buildUpon = j(context).buildUpon();
        buildUpon.appendPath(conversationId.b());
        return buildUpon.build();
    }

    public static Uri e(Context context, ConversationIdType conversationIdType) {
        Uri.Builder buildUpon = j(context).buildUpon();
        buildUpon.appendPath(conversationIdType.a());
        return buildUpon.build();
    }

    public static Uri f(Context context, ConversationIdType conversationIdType) {
        Uri.Builder buildUpon = Uri.parse(o(context).concat("draft_images")).buildUpon();
        buildUpon.appendPath(conversationIdType.a());
        return buildUpon.build();
    }

    public static Uri g(Uri.Builder builder, ConversationIdType conversationIdType) {
        if (!conversationIdType.b()) {
            builder.appendPath(conversationIdType.a());
        }
        return builder.build();
    }

    public static Uri h(Context context) {
        return Uri.parse(o(context).concat("messages/conversation"));
    }

    public static Uri i(Context context) {
        return Uri.parse(o(context).concat("participants/conversation"));
    }

    public static Uri j(Context context) {
        return Uri.parse(o(context).concat("conversations"));
    }

    public static Uri k(Context context) {
        return l(context).buildUpon().appendPath("delete").build();
    }

    public static Uri l(Context context) {
        return Uri.parse(o(context).concat("desktops"));
    }

    public static Uri m(Context context) {
        return Uri.parse(o(context).concat("messages"));
    }

    public static Uri n(Context context) {
        return Uri.parse(o(context).concat("expressivestickers/recents"));
    }

    public static String o(Context context) {
        return "content://" + azwg.a(context) + "/";
    }
}
