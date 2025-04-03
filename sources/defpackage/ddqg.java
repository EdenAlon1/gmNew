package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery;
import com.google.android.apps.messaging.ui.search.presenter.ContactFilterDataItem;
import com.google.android.apps.messaging.ui.search.presenter.SearchFilterDataItem;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddqg implements Parcelable.Creator {
    private ddqh a;

    private final ddqh a() {
        if (this.a == null) {
            this.a = ((SearchFilterDataItem.a) ctba.a(SearchFilterDataItem.a.class)).dg();
        }
        return this.a;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        SearchQuery.SearchFilter searchFilter = (SearchQuery.SearchFilter) parcel.readParcelable(SearchQuery.SearchFilter.class.getClassLoader());
        boolean z = searchFilter instanceof SearchQuery.FreeTextSearchFilter;
        String readString = parcel.readString();
        int readInt = parcel.readInt();
        if (z) {
            return a().e((SearchQuery.FreeTextSearchFilter) searchFilter);
        }
        if (searchFilter instanceof SearchQuery.ContentSearchFilter) {
            return a().b((SearchQuery.ContentSearchFilter) searchFilter);
        }
        if (searchFilter instanceof SearchQuery.ParticipantSearchFilter) {
            return new ContactFilterDataItem((SearchQuery.ParticipantSearchFilter) searchFilter, readString, parcel);
        }
        if (searchFilter instanceof SearchQuery.ConversationSearchFilter) {
            return a().c((SearchQuery.ConversationSearchFilter) searchFilter);
        }
        if (searchFilter instanceof SearchQuery.StarSearchFilter) {
            return a().f(readInt != 0);
        }
        return null;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SearchFilterDataItem[i];
    }
}
