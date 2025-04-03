package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjcj {
    private final Context a;

    public cjcj(Context context) {
        this.a = context;
        Pattern.compile("(?<=" + context.getString(R.string.im_notification_tag_suffix) + ")\\d+$");
    }

    public final String a(ConversationIdType conversationIdType) {
        String valueOf = String.valueOf(this.a.getPackageName());
        String valueOf2 = String.valueOf(this.a.getString(R.string.im_notification_tag_suffix));
        return valueOf.concat(valueOf2).concat(String.valueOf(conversationIdType.a()));
    }
}
