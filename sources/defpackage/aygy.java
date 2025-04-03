package defpackage;

import android.content.Intent;
import com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aygy {
    @ffbs
    public static final IncomingDraft a(llv llvVar) {
        return (IncomingDraft) llvVar.b("incoming_draft");
    }

    @ffbs
    public static final void b(Intent intent, IncomingDraft incomingDraft) {
        intent.putExtra("incoming_draft", incomingDraft).getClass();
    }
}
