package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification;
import com.google.android.gms.search.queries.GlobalQueryCall$Request;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhoo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        GlobalSearchQuerySpecification globalSearchQuerySpecification = null;
        Bundle bundle = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                str = dfxj.t(parcel, readInt);
            } else if (d == 2) {
                i = dfxj.f(parcel, readInt);
            } else if (d == 3) {
                i2 = dfxj.f(parcel, readInt);
            } else if (d == 4) {
                globalSearchQuerySpecification = (GlobalSearchQuerySpecification) dfxj.n(parcel, readInt, GlobalSearchQuerySpecification.CREATOR);
            } else if (d != 5) {
                dfxj.C(parcel, readInt);
            } else {
                bundle = dfxj.k(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new GlobalQueryCall$Request(str, i, i2, globalSearchQuerySpecification, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GlobalQueryCall$Request[i];
    }
}
