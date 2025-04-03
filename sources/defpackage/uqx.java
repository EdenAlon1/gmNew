package defpackage;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.scheduledsend.conversation.ConversationScheduledMessageToggleView;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageBubbleView;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageView;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uqx extends ktb {
    final /* synthetic */ uqy a;

    public uqx(uqy uqyVar) {
        this.a = uqyVar;
    }

    @Override // defpackage.ktb
    public final void c(View view, kxu kxuVar) {
        engw engwVar;
        super.c(view, kxuVar);
        uqy uqyVar = this.a;
        uqyVar.e = true;
        if (((view instanceof ConversationMessageView) || (view instanceof ConversationMessageBubbleView)) && (engwVar = uqyVar.f) != null) {
            int size = engwVar.size();
            for (int i = 0; i < size; i++) {
                MenuItem menuItem = (MenuItem) engwVar.get(i);
                String title = menuItem.getTitle() != null ? menuItem.getTitle() : "";
                int itemId = menuItem.getItemId();
                title.getClass();
                kxuVar.i(new kxr(itemId, title));
            }
        }
        if (view instanceof ConversationScheduledMessageToggleView) {
            kxuVar.i(new kxr(16, ((ConversationScheduledMessageToggleView) view).c ? view.getResources().getString(R.string.toggle_view_collapse_action) : view.getResources().getString(R.string.toggle_view_expand_action)));
        }
    }

    @Override // defpackage.ktb
    public final boolean h(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32768 && (viewGroup instanceof ConversationMessageView)) {
            uqy uqyVar = this.a;
            if (uqyVar.e) {
                uqyVar.e = false;
            } else {
                ekzm b = uqyVar.d.b("ConversationMessageView_sendAccessibilityEvent");
                try {
                    ellj.g(new uqs((ConversationMessageView) viewGroup), viewGroup);
                    b.close();
                } catch (Throwable th) {
                    try {
                        b.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
        return super.h(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.ktb
    public final boolean i(View view, int i, Bundle bundle) {
        boolean test;
        if ((view instanceof ConversationMessageView) || (view instanceof ConversationMessageBubbleView)) {
            uqy uqyVar = this.a;
            if (uqyVar.f != null) {
                test = uqyVar.c.test(i);
                return test || super.i(view, i, bundle);
            }
        }
        return super.i(view, i, bundle);
    }
}
