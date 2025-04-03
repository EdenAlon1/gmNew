package defpackage;

import android.R;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahsf implements eivv {
    final /* synthetic */ ahsg a;

    public ahsf(ahsg ahsgVar) {
        this.a = ahsgVar;
    }

    @Override // defpackage.eivv
    public final void aa(eivt eivtVar) {
        Parcelable parcelableExtra;
        Parcelable parcelableExtra2;
        Object parcelableExtra3;
        Object parcelableExtra4;
        eisx a = eivtVar.a();
        a.getClass();
        ahsg ahsgVar = this.a;
        Intent intent = ahsgVar.b.getIntent();
        intent.getClass();
        if (Build.VERSION.SDK_INT > 33) {
            parcelableExtra4 = intent.getParcelableExtra("mapi_conversation_id", ConversationId.class);
            parcelableExtra = (Parcelable) parcelableExtra4;
        } else {
            parcelableExtra = intent.getParcelableExtra("mapi_conversation_id");
        }
        parcelableExtra.getClass();
        ConversationId conversationId = (ConversationId) parcelableExtra;
        Intent intent2 = ahsgVar.b.getIntent();
        intent2.getClass();
        if (Build.VERSION.SDK_INT > 33) {
            parcelableExtra3 = intent2.getParcelableExtra("MESSAGE_ID", MessageId.class);
            parcelableExtra2 = (Parcelable) parcelableExtra3;
        } else {
            parcelableExtra2 = intent2.getParcelableExtra("MESSAGE_ID");
        }
        parcelableExtra2.getClass();
        ahsi ahsiVar = new ahsi();
        fbae.e(ahsiVar);
        ekky.b(ahsiVar, a);
        Bundle bundle = ahsiVar.m;
        bundle.getClass();
        xin.b(bundle, xim.a);
        bundle.putParcelable("mapi_conversation_id", conversationId);
        bundle.putParcelable("MESSAGE_ID", (MessageId) parcelableExtra2);
        cg cgVar = new cg(ahsgVar.b.a());
        cgVar.x(R.id.content, ahsiVar, "MessageDetailsFragment");
        cgVar.c();
    }

    @Override // defpackage.eivv
    public final void ac(eiup eiupVar) {
        ensk i = ahsg.a.i();
        i.Y(ente.a, "MessageDetails");
        ((enrr) ((enrr) i).g(eiupVar).h("com/google/android/apps/messaging/messagedetails/MessageDetailsActivityPeer$AccountSelectionCallback", "onNoAccountAvailable", 81, "MessageDetailsActivityPeer.kt")).q("Cannot create MessageDetailsActivity because account is not available");
    }

    @Override // defpackage.eivv
    public final /* synthetic */ void ab() {
    }

    @Override // defpackage.eivv
    public final /* synthetic */ void d() {
    }
}
