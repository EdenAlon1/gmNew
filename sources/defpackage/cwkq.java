package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.suggestions.notifications.receiver.NotificationSmartActionReceiver;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwkq {
    private final Context a;
    private final amet b;

    public cwkq(Context context, amet ametVar) {
        this.a = context;
        this.b = ametVar;
    }

    public final kma a(ConversationId conversationId, String str, int i, boolean z, String str2) {
        Context context = this.a;
        Intent intent = new Intent(context, (Class<?>) NotificationSmartActionReceiver.class);
        Uri.Builder buildUpon = bcqc.j(context).buildUpon();
        buildUpon.appendPath(conversationId.b());
        buildUpon.encodedQuery(TextUtils.join("&", new String[]{str}));
        intent.setData(buildUpon.build());
        intent.setAction("com.google.android.apps.messaging.accept_suggestion");
        amet.d(conversationId, intent, true);
        intent.putExtra("suggestion_id", str);
        PendingIntent d = eepf.d(context, 0, intent, ctie.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS));
        d.getClass();
        IconCompat h = IconCompat.h(this.a, i);
        if (z) {
            h.h = ColorStateList.valueOf(this.a.getColor(R.color.primary_brand_icon_color));
        }
        klz klzVar = new klz(h, str2, d);
        klzVar.d = true;
        klzVar.e = true;
        return klzVar.a();
    }
}
