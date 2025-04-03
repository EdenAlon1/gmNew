package com.google.android.apps.messaging.shared.datamodel.databasegen.queries;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.LocationSearchQuery;
import defpackage.beck;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class AnnotationSearchResult extends LocationSearchQuery.BindData implements Parcelable {
    public static final Parcelable.Creator<AnnotationSearchResult> CREATOR = new beck();

    public AnnotationSearchResult() {
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.databasegen.queries.LocationSearchQuery.BindData, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public AnnotationSearchResult(Parcel parcel) {
        aA(parcel);
    }
}
