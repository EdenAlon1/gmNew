package defpackage;

import android.animation.Animator;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageBubbleView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czhl implements Animator.AnimatorListener {
    final /* synthetic */ ConversationMessageBubbleView a;

    public czhl(ConversationMessageBubbleView conversationMessageBubbleView) {
        this.a = conversationMessageBubbleView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ConversationMessageBubbleView conversationMessageBubbleView = this.a;
        conversationMessageBubbleView.a = null;
        conversationMessageBubbleView.d.getLayoutParams().width = -2;
        ConversationMessageBubbleView conversationMessageBubbleView2 = this.a;
        conversationMessageBubbleView2.d.setMinimumWidth(conversationMessageBubbleView2.a(conversationMessageBubbleView2.b()));
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
