package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery;
import com.google.android.apps.messaging.ui.search.presenter.ContactFilterDataItem;
import com.google.android.apps.messaging.ui.search.presenter.ContentFilterDataItem;
import com.google.android.apps.messaging.ui.search.presenter.ConversationFilterDataItem;
import com.google.android.apps.messaging.ui.search.presenter.ConversationListFilterDataItem;
import com.google.android.apps.messaging.ui.search.presenter.FreeTextFilterDataItem;
import com.google.android.apps.messaging.ui.search.presenter.StarFilterDataItem;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddqi implements ddqh {
    private final Context a;

    public ddqi(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // defpackage.ddqh
    public final ContactFilterDataItem a(SearchQuery.ParticipantSearchFilter participantSearchFilter, Uri uri, String str) {
        return new ContactFilterDataItem(participantSearchFilter, uri, str);
    }

    @Override // defpackage.ddqh
    public final ContentFilterDataItem b(SearchQuery.ContentSearchFilter contentSearchFilter) {
        int i;
        int i2;
        Resources resources = this.a.getResources();
        int i3 = contentSearchFilter.a;
        switch (i3) {
            case 1:
                i = R.array.zss_conversations_synonyms;
                i2 = R.string.zero_state_search_conversations;
                break;
            case 2:
                i = R.array.zss_images_synonyms;
                i2 = R.string.zero_state_search_images;
                break;
            case 3:
                i = R.array.zss_videos_synonyms;
                i2 = R.string.zero_state_search_videos;
                break;
            case 4:
                i = R.array.zss_links_synonyms;
                i2 = R.string.zero_state_search_links;
                break;
            case 5:
                i = R.array.zss_places_synonyms;
                i2 = R.string.zero_state_search_places;
                break;
            case 6:
                i = R.array.zss_contacts_synonyms;
                i2 = R.string.zero_state_search_contacts;
                break;
            case 7:
                i = R.array.zss_starred_synonyms;
                i2 = R.string.zero_state_search_text;
                break;
            default:
                throw new UnsupportedOperationException(a.h(i3, "Unknown content type "));
        }
        return new ContentFilterDataItem(contentSearchFilter, resources, i2, i);
    }

    @Override // defpackage.ddqh
    public final ConversationFilterDataItem c(SearchQuery.ConversationSearchFilter conversationSearchFilter) {
        return new ConversationFilterDataItem(conversationSearchFilter);
    }

    @Override // defpackage.ddqh
    public final ConversationListFilterDataItem d(SearchQuery.ConversationListSearchFilter conversationListSearchFilter) {
        return new ConversationListFilterDataItem(conversationListSearchFilter);
    }

    @Override // defpackage.ddqh
    public final FreeTextFilterDataItem e(SearchQuery.FreeTextSearchFilter freeTextSearchFilter) {
        return new FreeTextFilterDataItem(freeTextSearchFilter, this.a.getResources().getString(R.string.zero_state_search_dropdown_free_text, freeTextSearchFilter.a));
    }

    @Override // defpackage.ddqh
    public final StarFilterDataItem f(boolean z) {
        return new StarFilterDataItem(new SearchQuery.StarSearchFilter(), this.a.getResources(), z);
    }
}
