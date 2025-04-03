package com.google.android.apps.messaging.ui.conversation;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import defpackage.amet;
import defpackage.ayfg;
import defpackage.cxwm;
import defpackage.ffbr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LaunchConversationShimActivity extends cxwm {
    public ayfg a;
    public ffbr b;

    @Override // defpackage.cxwm, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        ConversationId a = ((amet) this.b.b()).a(intent);
        if (a != null) {
            intent.getBooleanExtra("force_conversation_1", false);
            startActivity(this.a.n(this, a, (MessageCoreData) intent.getParcelableExtra("draft_data"), intent.getBooleanExtra("open_keyboard", false), intent.getExtras()));
        }
        finish();
    }
}
