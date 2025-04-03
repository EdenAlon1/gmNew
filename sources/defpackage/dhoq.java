package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.search.queries.QueryCall$Request;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhoq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        String str2 = null;
        String[] strArr = null;
        QuerySpecification querySpecification = null;
        Bundle bundle = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 2:
                    str2 = dfxj.t(parcel, readInt);
                    break;
                case 3:
                    strArr = dfxj.K(parcel, readInt);
                    break;
                case 4:
                    i = dfxj.f(parcel, readInt);
                    break;
                case 5:
                    i2 = dfxj.f(parcel, readInt);
                    break;
                case 6:
                    querySpecification = (QuerySpecification) dfxj.n(parcel, readInt, QuerySpecification.CREATOR);
                    break;
                case 7:
                    bundle = dfxj.k(parcel, readInt);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new QueryCall$Request(str, str2, strArr, i, i2, querySpecification, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new QueryCall$Request[i];
    }
}
