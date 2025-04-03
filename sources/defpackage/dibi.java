package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.AppParcelable;
import com.google.android.gms.wearable.internal.AppRecommendationsResponse;
import com.google.android.gms.wearable.internal.WebIconParcelable;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dibi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        ArrayList arrayList = null;
        int i = 0;
        WebIconParcelable webIconParcelable = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                i = dfxj.f(parcel, readInt);
            } else if (d == 2) {
                arrayList = dfxj.z(parcel, readInt, AppParcelable.CREATOR);
            } else if (d != 3) {
                dfxj.C(parcel, readInt);
            } else {
                webIconParcelable = (WebIconParcelable) dfxj.n(parcel, readInt, WebIconParcelable.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new AppRecommendationsResponse(i, arrayList, webIconParcelable);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AppRecommendationsResponse[i];
    }
}
