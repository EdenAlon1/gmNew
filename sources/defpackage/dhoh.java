package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.search.queries.AnnotateCall$Request;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhoh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        String str2 = null;
        int[] iArr = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                str = dfxj.t(parcel, readInt);
            } else if (d == 2) {
                str2 = dfxj.t(parcel, readInt);
            } else if (d == 3) {
                iArr = dfxj.H(parcel, readInt);
            } else if (d != 4) {
                dfxj.C(parcel, readInt);
            } else {
                bundle = dfxj.k(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new AnnotateCall$Request(str, str2, iArr, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AnnotateCall$Request[i];
    }
}
