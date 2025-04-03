package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.search.queries.GetDocumentsCall$Request;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhok implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        String str2 = null;
        String[] strArr = null;
        QuerySpecification querySpecification = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                str = dfxj.t(parcel, readInt);
            } else if (d == 2) {
                str2 = dfxj.t(parcel, readInt);
            } else if (d == 3) {
                strArr = dfxj.K(parcel, readInt);
            } else if (d == 4) {
                querySpecification = (QuerySpecification) dfxj.n(parcel, readInt, QuerySpecification.CREATOR);
            } else if (d != 5) {
                dfxj.C(parcel, readInt);
            } else {
                bundle = dfxj.k(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new GetDocumentsCall$Request(str, str2, strArr, querySpecification, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetDocumentsCall$Request[i];
    }
}
