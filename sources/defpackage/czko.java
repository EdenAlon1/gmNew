package defpackage;

import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageView;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czko {
    public final Optional a;

    public czko(Optional optional) {
        this.a = optional;
    }

    public static int a(ConversationMessageView conversationMessageView, int i, int i2, int i3, int i4) {
        int[] iArr = new int[2];
        conversationMessageView.getLocationInWindow(iArr);
        int i5 = i + i4;
        int i6 = iArr[1] + i5;
        czic czicVar = conversationMessageView.t;
        int max = i5 + Math.max((czicVar != null ? ((vvn) ((uuy) czicVar).ay).D : 0) - i6, 0);
        return max + i3 > i2 ? i2 - i3 : max;
    }
}
