package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.os.Build;
import android.widget.Toast;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddua {
    public final eg a;
    public final akvg b;
    public final ffbr c;
    public final int d;
    private final ayfg e;
    private final tam f;

    public ddua(eg egVar, akvg akvgVar, ayfg ayfgVar, ffbr ffbrVar, tam tamVar, int i) {
        this.a = egVar;
        this.b = akvgVar;
        this.e = ayfgVar;
        this.c = ffbrVar;
        this.f = tamVar;
        this.d = i;
    }

    public final void a(String str, int i) {
        ((ddpm) this.c.b()).a("Bugle.Search.Result.Copy.Clicked", this.d);
        ((ClipboardManager) this.a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(null, str));
        if (Build.VERSION.SDK_INT <= 32) {
            eg egVar = this.a;
            Toast.makeText(egVar, egVar.getResources().getText(i), 0).show();
        }
    }

    public final void b(ConversationId conversationId, MessageIdType messageIdType) {
        ((ddpm) this.c.b()).h(this.d);
        if (this.f.a) {
            this.e.E(this.a, conversationId, messageIdType, null);
        } else {
            this.e.t(this.a, conversationId, messageIdType, null, new bdja(null), null, null, null, false);
        }
    }

    public final void c(String str) {
        ((ddpm) this.c.b()).a("Bugle.Search.Result.Share.Clicked", this.d);
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.setType("text/plain");
        this.a.startActivity(Intent.createChooser(intent, this.a.getResources().getText(R.string.action_share)));
    }
}
