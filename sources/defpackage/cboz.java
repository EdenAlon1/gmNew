package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cboz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        byte readByte = parcel.readByte();
        if (readByte == 1) {
            return new SearchQuery.FreeTextSearchFilter(parcel);
        }
        if (readByte == 2) {
            return new SearchQuery.ParticipantSearchFilter(parcel);
        }
        if (readByte == 3) {
            return new SearchQuery.ConversationSearchFilter(parcel);
        }
        if (readByte == 4) {
            return new SearchQuery.ContentSearchFilter(parcel);
        }
        if (readByte == 5) {
            return new SearchQuery.StarSearchFilter();
        }
        throw new IllegalStateException(a.h(readByte, "SearchFilter#createFromParcel failed with contentsDescriptor = "));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SearchQuery.SearchFilter[i];
    }
}
