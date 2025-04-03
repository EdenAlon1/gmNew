package defpackage;

import com.google.android.apps.messaging.shared.conversation.draft.ComposeRowState;
import com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aygi {
    static final /* synthetic */ aygi a = new aygi();

    private aygi() {
    }

    public static final ComposeRowState a(IncomingDraft incomingDraft, int i) {
        try {
            aygk aygkVar = new aygk(incomingDraft, i);
            return atdp.a() ? new aygp(aygkVar, 0, 2, 2) : aygkVar;
        } catch (aygs unused) {
            return null;
        }
    }
}
