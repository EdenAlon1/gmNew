package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.search.resultsview.StarredMessagesResultItemView;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dduk {
    public static final cskc a = cskc.g("Bugle", "StarredMessagesResultItemViewPeer");
    public final Map b;
    private final ffbr c;
    private final ffbr d;

    public dduk(StarredMessagesResultItemView starredMessagesResultItemView, Map map, ffbr ffbrVar, ffbr ffbrVar2) {
        this.b = map;
        this.c = ffbrVar;
        this.d = ffbrVar2;
        if (!((auyd) ffbrVar2.b()).a()) {
            int paddingLeft = starredMessagesResultItemView.getPaddingLeft();
            int paddingTop = starredMessagesResultItemView.getPaddingTop();
            int paddingRight = starredMessagesResultItemView.getPaddingRight();
            int paddingBottom = starredMessagesResultItemView.getPaddingBottom();
            if (((auyb) ffbrVar.b()).a()) {
                starredMessagesResultItemView.setBackgroundResource(R.drawable.conversation_list_item_view_bg_coolranch);
            } else {
                starredMessagesResultItemView.setBackgroundResource(R.drawable.conversation_list_item_view_bg_gm3);
            }
            starredMessagesResultItemView.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        }
        Iterator<E> it = ((enhk) map).values().iterator();
        while (it.hasNext()) {
            ((aema) it.next()).c(starredMessagesResultItemView);
        }
    }

    public final void a(aely aelyVar) {
        Iterator<E> it = ((enhk) this.b).values().iterator();
        while (it.hasNext()) {
            ((aema) it.next()).b(aelyVar, false);
        }
    }
}
