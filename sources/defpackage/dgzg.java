package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.UserPreferredSleepWindow;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgzg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                i = dfxj.f(parcel, readInt);
            } else if (d == 2) {
                i2 = dfxj.f(parcel, readInt);
            } else if (d == 3) {
                i3 = dfxj.f(parcel, readInt);
            } else if (d != 4) {
                dfxj.C(parcel, readInt);
            } else {
                i4 = dfxj.f(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new UserPreferredSleepWindow(i, i2, i3, i4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new UserPreferredSleepWindow[i];
    }
}
