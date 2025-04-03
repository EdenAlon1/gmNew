package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.AppTheme;
import com.google.android.gms.wearable.internal.GetAppThemeResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class didf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        AppTheme appTheme = null;
        int i = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 2) {
                i = dfxj.f(parcel, readInt);
            } else if (d != 3) {
                dfxj.C(parcel, readInt);
            } else {
                appTheme = (AppTheme) dfxj.n(parcel, readInt, AppTheme.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new GetAppThemeResponse(i, appTheme);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetAppThemeResponse[i];
    }
}
