package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.ui.conversation.message.MessageDetails;
import com.google.android.apps.messaging.ui.conversation.message.statuschangelist.MessageStatusListActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
class uuv implements ejlr<Void, MessageDetails> {
    final /* synthetic */ uuy a;

    public uuv(uuy uuyVar) {
        this.a = uuyVar;
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        Button button;
        MessageDetails messageDetails = (MessageDetails) obj2;
        String str = messageDetails.b;
        uuy uuyVar = this.a;
        final eg fe = uuyVar.e.fe();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        czlc czlcVar = uuyVar.g;
        View inflate = LayoutInflater.from(fe).inflate(R.layout.message_details_dialog_view, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.message);
        textView.setText(messageDetails.b);
        textView.setContentDescription(messageDetails.c);
        textView.setTextIsSelectable(true);
        czmu czmuVar = czlcVar.a;
        View findViewById = inflate.findViewById(R.id.container);
        final MessageIdType messageIdType = messageDetails.a;
        if (((Boolean) czmw.a.e()).booleanValue() && (button = (Button) LayoutInflater.from(fe).inflate(R.layout.message_status_button, (ViewGroup) findViewById, true).findViewById(R.id.message_status_button)) != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: czmv
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    cfva cfvaVar = czmw.a;
                    Context context = fe;
                    context.startActivity(new Intent(context, (Class<?>) MessageStatusListActivity.class).putExtra("message_id", messageIdType.b()));
                }
            });
        }
        inflate.findViewById(R.id.container);
        MessageIdType messageIdType2 = messageDetails.a;
        if (((Boolean) adwg.a.e()).booleanValue() && ((Boolean) adwg.c.e()).booleanValue()) {
            adtn adtnVar = czlcVar.b;
            View findViewById2 = inflate.findViewById(R.id.container);
            MessageIdType messageIdType3 = messageDetails.a;
            adtnVar.c(fe, findViewById2);
        }
        ehft ehftVar = new ehft(fe);
        ehftVar.x(R.string.message_details_title);
        ehftVar.z(inflate);
        ehftVar.j(true);
        ehftVar.a();
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
        csjy.h("Bugle", th, "Unable to show message details dialog");
    }

    @Override // defpackage.ejlr
    public final /* synthetic */ void b(Object obj) {
    }
}
