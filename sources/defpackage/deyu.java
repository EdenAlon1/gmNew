package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.asterism.GetAsterismConsentResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deyu implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        String str = "";
        String str2 = str;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                i = dfxj.f(parcel, readInt);
            } else if (d == 2) {
                i2 = dfxj.f(parcel, readInt);
            } else if (d == 3) {
                str = dfxj.t(parcel, readInt);
            } else if (d == 4) {
                str2 = dfxj.t(parcel, readInt);
            } else if (d != 5) {
                dfxj.C(parcel, readInt);
            } else {
                i3 = dfxj.f(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new GetAsterismConsentResponse(i, i2, str, str2, i3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetAsterismConsentResponse[i];
    }
}
