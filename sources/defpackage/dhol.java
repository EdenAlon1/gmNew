package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.DocumentResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.queries.GetDocumentsCall$Response;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhol implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        Status status = null;
        DocumentResults documentResults = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                status = (Status) dfxj.n(parcel, readInt, Status.CREATOR);
            } else if (d == 2) {
                documentResults = (DocumentResults) dfxj.n(parcel, readInt, DocumentResults.CREATOR);
            } else if (d != 3) {
                dfxj.C(parcel, readInt);
            } else {
                bundle = dfxj.k(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new GetDocumentsCall$Response(status, documentResults, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetDocumentsCall$Response[i];
    }
}
