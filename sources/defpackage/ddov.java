package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery;
import com.google.android.apps.messaging.ui.search.ZeroStateSearchActivity;
import com.google.android.apps.messaging.ui.search.presenter.ConversationFilterDataItem;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddov implements ddou {
    private final fazb a;
    private final ffbr b;
    private final ffbr c;

    public ddov(fazb fazbVar, ffbr ffbrVar, ffbr ffbrVar2) {
        this.a = fazbVar;
        this.b = ffbrVar;
        this.c = ffbrVar2;
    }

    private final void e(Context context, Intent intent, int i) {
        ((alrv) this.c.b()).e(ddrd.a);
        ((ddpl) this.b.b()).d(i);
        context.startActivity(intent, null);
    }

    @Override // defpackage.ddou
    public final void a(eisx eisxVar, Context context, int i, ConversationIdType conversationIdType, boolean z, boolean z2, boolean z3) {
        Intent d = d(context, i, conversationIdType, z, z2, z3);
        eiuy.c(d, eisxVar);
        e(context, d, i);
    }

    @Override // defpackage.ddou
    public final void b(eisx eisxVar, Context context) {
        Intent intent = new Intent(context, (Class<?>) ZeroStateSearchActivity.class);
        eiuy.c(intent, eisxVar);
        e(context, intent, 10);
    }

    @Override // defpackage.ddou
    public final void c(eisx eisxVar, Context context, ConversationIdType conversationIdType) {
        Intent d = d(context, 19, conversationIdType, true, false, false);
        eiuy.c(d, eisxVar);
        d.putExtra("search_filter_data_item", ((ddqh) this.a.b()).b(new SearchQuery.ContentSearchFilter(2)));
        d.putExtra("skip_back_press", true);
        e(context, d, 19);
    }

    public final Intent d(Context context, int i, ConversationIdType conversationIdType, boolean z, boolean z2, boolean z3) {
        ConversationFilterDataItem c = ((ddqh) this.a.b()).c(new SearchQuery.ConversationSearchFilter(conversationIdType));
        Intent intent = new Intent(context, (Class<?>) ZeroStateSearchActivity.class);
        intent.putExtra("base_search_filter_data_item", c);
        intent.putExtra("conversation_contain_message", z);
        intent.putExtra("is_bubble_activity", z3);
        if (z2) {
            boolean z4 = true;
            if (i != 18 && i != 15) {
                z4 = false;
            }
            intent.putExtra("search_filter_data_item", ((ddqh) this.a.b()).f(z4));
        }
        return intent;
    }
}
