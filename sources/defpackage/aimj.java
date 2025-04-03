package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aimj implements aigt {
    private final Context a;

    public aimj(Context context) {
        this.a = context;
    }

    @Override // defpackage.aigt
    public final /* bridge */ /* synthetic */ Object a(aihs aihsVar, ffgu ffguVar) {
        Intent data = ctid.e ? new Intent("android.settings.PREMIUM_SMS_SETTINGS").setData(Uri.parse("package: com.android.settings")) : new Intent("android.settings.APP_SEARCH_SETTINGS").putExtra(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_QUERY, this.a.getString(R.string.premium_sms_search_query));
        data.getClass();
        eldl.p(this.a, data);
        return ffcu.a;
    }
}
