package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.SuggestSpecification;
import com.google.android.gms.search.queries.QuerySuggestCall$Request;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhos implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        String str2 = null;
        String[] strArr = null;
        SuggestSpecification suggestSpecification = null;
        Bundle bundle = null;
        int i = 0;
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
                    suggestSpecification = (SuggestSpecification) dfxj.n(parcel, readInt, SuggestSpecification.CREATOR);
                    break;
                case 6:
                    bundle = dfxj.k(parcel, readInt);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new QuerySuggestCall$Request(str, str2, strArr, i, suggestSpecification, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new QuerySuggestCall$Request[i];
    }
}
