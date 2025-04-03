package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.StampStyle;
import com.google.android.gms.maps.model.StrokeStyle;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhdd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        StampStyle stampStyle = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        float f = 0.0f;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 2) {
                f = dfxj.c(parcel, readInt);
            } else if (d == 3) {
                i = dfxj.f(parcel, readInt);
            } else if (d == 4) {
                i2 = dfxj.f(parcel, readInt);
            } else if (d == 5) {
                z = dfxj.D(parcel, readInt);
            } else if (d != 6) {
                dfxj.C(parcel, readInt);
            } else {
                stampStyle = (StampStyle) dfxj.n(parcel, readInt, StampStyle.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new StrokeStyle(f, i, i2, z, stampStyle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new StrokeStyle[i];
    }
}
