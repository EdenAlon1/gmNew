package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aijt {
    public static final Bundle a(aijp aijpVar) {
        Bundle bundle = new Bundle();
        if (aijpVar.b) {
            bundle.putBoolean("render_add_recipient_button", true);
        }
        if (aijpVar.c) {
            bundle.putBoolean("delete_empty_conversation_on_back", true);
        }
        int i = aijpVar.i;
        if (i == 2) {
            bundle.putBoolean("via_start_chat_intent", true);
            return bundle;
        }
        if (i == 3) {
            bundle.putBoolean("via_share_intent", true);
        }
        return bundle;
    }
}
