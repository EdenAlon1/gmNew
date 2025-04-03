package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import com.google.android.apps.messaging.ui.conversation.typingindicator.ConversationTypingIndicatorView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czyc extends pbt {
    final /* synthetic */ ConversationTypingIndicatorView b;

    public czyc(ConversationTypingIndicatorView conversationTypingIndicatorView) {
        this.b = conversationTypingIndicatorView;
    }

    @Override // defpackage.pbt
    public final void b(Drawable drawable) {
        ((Animatable) this.b.c).start();
    }
}
