package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery;
import com.google.android.apps.messaging.ui.search.presenter.ContactFilterDataItem;
import com.google.android.apps.messaging.ui.search.presenter.ContentFilterDataItem;
import com.google.android.apps.messaging.ui.search.presenter.ConversationFilterDataItem;
import com.google.android.apps.messaging.ui.search.presenter.ConversationListFilterDataItem;
import com.google.android.apps.messaging.ui.search.presenter.FreeTextFilterDataItem;
import com.google.android.apps.messaging.ui.search.presenter.StarFilterDataItem;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ddqh {
    ContactFilterDataItem a(SearchQuery.ParticipantSearchFilter participantSearchFilter, Uri uri, String str);

    ContentFilterDataItem b(SearchQuery.ContentSearchFilter contentSearchFilter);

    ConversationFilterDataItem c(SearchQuery.ConversationSearchFilter conversationSearchFilter);

    ConversationListFilterDataItem d(SearchQuery.ConversationListSearchFilter conversationListSearchFilter);

    FreeTextFilterDataItem e(SearchQuery.FreeTextSearchFilter freeTextSearchFilter);

    StarFilterDataItem f(boolean z);
}
