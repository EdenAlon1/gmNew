package defpackage;

import android.content.Context;
import android.content.pm.ShortcutInfo;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class csll {
    static {
        enip.r("com.google.android.apps.messaging.ui.conversationlist.SHARE_TARGET_CATEGORY", "com.google.android.apps.messaging.ui.conversationlist.VIDEO_SHARE_TARGET_CATEGORY");
    }

    public abstract ShortcutInfo a(Context context, ConversationId conversationId, String str, aoku aokuVar, IconCompat iconCompat, String str2, int i, boolean z);

    public abstract ConversationId b(String str);

    public abstract elfl c(ConversationId conversationId, String str, aoku aokuVar, String str2, boolean z);

    public abstract elfl d(String str, Context context, boolean z, int i);

    public abstract String e(String str);

    public abstract String f(ConversationIdType conversationIdType);

    public abstract void g(Context context, String str);

    public abstract void h(Context context);

    public abstract void i();

    public abstract void j();

    public abstract boolean k(String str);

    public abstract elfl l();
}
