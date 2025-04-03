package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.cpg.callingcard.CallingCardFullScreenImageData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhig implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                f = dfxj.c(parcel, readInt);
            } else if (d == 2) {
                f2 = dfxj.c(parcel, readInt);
            } else if (d != 3) {
                dfxj.C(parcel, readInt);
            } else {
                f3 = dfxj.c(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new CallingCardFullScreenImageData(f, f2, f3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CallingCardFullScreenImageData[i];
    }
}
