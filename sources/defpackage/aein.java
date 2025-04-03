package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.home.list.ConversationListItemView;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aein {
    public static final cskc a = cskc.g("Bugle", "ConversationListItemViewPeer");
    public final Map b;
    private final ffbr c;

    public aein(ConversationListItemView conversationListItemView, Map map, ffbr ffbrVar) {
        this.b = map;
        this.c = ffbrVar;
        int paddingLeft = conversationListItemView.getPaddingLeft();
        int paddingTop = conversationListItemView.getPaddingTop();
        int paddingRight = conversationListItemView.getPaddingRight();
        int paddingBottom = conversationListItemView.getPaddingBottom();
        if (((auyb) ffbrVar.b()).a()) {
            conversationListItemView.setBackgroundResource(R.drawable.conversation_list_item_view_bg_coolranch);
        } else {
            conversationListItemView.setBackgroundResource(R.drawable.conversation_list_item_view_bg);
        }
        conversationListItemView.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        Iterator<E> it = ((enhk) map).values().iterator();
        while (it.hasNext()) {
            ((aema) it.next()).c(conversationListItemView);
        }
    }

    public final void a(aely aelyVar, boolean z) {
        Iterator<E> it = ((enhk) this.b).values().iterator();
        while (it.hasNext()) {
            ((aema) it.next()).b(aelyVar, z);
        }
    }
}
