package com.google.android.apps.messaging.shared.datamodel.databasegen.queries;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.UrlSearchQuery;
import defpackage.bpyi;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class UrlSearchResult extends UrlSearchQuery.BindData implements Parcelable {
    public static final Parcelable.Creator<UrlSearchResult> CREATOR = new bpyi();

    public UrlSearchResult() {
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.databasegen.queries.UrlSearchQuery.BindData, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public UrlSearchResult(Parcel parcel) {
        aA(parcel);
    }
}
