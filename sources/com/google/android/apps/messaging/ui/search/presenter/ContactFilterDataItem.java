package com.google.android.apps.messaging.ui.search.presenter;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ContactFilterDataItem extends SearchFilterDataItem {
    public final Uri a;

    public ContactFilterDataItem(SearchQuery.ParticipantSearchFilter participantSearchFilter, Uri uri, String str) {
        super(participantSearchFilter, str, str);
        this.a = uri;
    }

    @Override // com.google.android.apps.messaging.ui.search.presenter.SearchFilterDataItem
    public final /* bridge */ /* synthetic */ SearchQuery.SearchFilter a() {
        return (SearchQuery.ParticipantSearchFilter) this.b;
    }

    @Override // defpackage.ddpr
    public final int b() {
        return 7;
    }

    @Override // com.google.android.apps.messaging.ui.search.presenter.SearchFilterDataItem, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.a, i);
    }

    public ContactFilterDataItem(SearchQuery.ParticipantSearchFilter participantSearchFilter, String str, Parcel parcel) {
        super(participantSearchFilter, str, str);
        this.a = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }
}
