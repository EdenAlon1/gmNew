package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.search.resultsview.conversation.SearchConversationResultItemView;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddvr {
    public static final cskc a = cskc.g("Bugle", "SearchConversationResultItemViewPeer");
    public final Map b;
    private final ffbr c;
    private final ffbr d;

    public ddvr(SearchConversationResultItemView searchConversationResultItemView, Map map, ffbr ffbrVar, ffbr ffbrVar2) {
        this.b = map;
        this.c = ffbrVar;
        this.d = ffbrVar2;
        if (!((auyd) ffbrVar2.b()).a()) {
            int paddingLeft = searchConversationResultItemView.getPaddingLeft();
            int paddingTop = searchConversationResultItemView.getPaddingTop();
            int paddingRight = searchConversationResultItemView.getPaddingRight();
            int paddingBottom = searchConversationResultItemView.getPaddingBottom();
            if (((auyb) ffbrVar.b()).a()) {
                searchConversationResultItemView.setBackgroundResource(R.drawable.conversation_list_item_view_bg_coolranch);
            } else {
                searchConversationResultItemView.setBackgroundResource(R.drawable.conversation_list_item_view_bg_gm3);
            }
            searchConversationResultItemView.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        }
        Iterator<E> it = ((enhk) map).values().iterator();
        while (it.hasNext()) {
            ((aema) it.next()).c(searchConversationResultItemView);
        }
    }

    public final void a(aely aelyVar) {
        Iterator<E> it = ((enhk) this.b).values().iterator();
        while (it.hasNext()) {
            ((aema) it.next()).b(aelyVar, false);
        }
    }
}
