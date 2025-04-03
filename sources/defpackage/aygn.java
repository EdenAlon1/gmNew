package defpackage;

import com.google.android.apps.messaging.shared.conversation.draft.ComposeRowState;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aygn {
    public static final ComposeRowState a(ComposeRowState composeRowState, int i) {
        if (!atdp.a()) {
            return composeRowState;
        }
        if (composeRowState == null) {
            return null;
        }
        return composeRowState instanceof aygp ? aygp.c((aygp) composeRowState, 0, i, 3) : new aygp(composeRowState, 0, i, 2);
    }

    public static final ComposeRowState b(ComposeRowState composeRowState, int i) {
        return atdp.a() ? composeRowState instanceof aygp ? aygp.c((aygp) composeRowState, i, 0, 5) : new aygp(composeRowState, i, 0, 4) : composeRowState;
    }
}
