package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.StampStyle;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhcx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        IBinder iBinder = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            if (dfxj.d(readInt) != 2) {
                dfxj.C(parcel, readInt);
            } else {
                iBinder = dfxj.l(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new StampStyle(iBinder);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new StampStyle[i];
    }
}
