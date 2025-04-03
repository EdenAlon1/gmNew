package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.gms.location.internal.LocationRequestUpdateData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhao implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        LocationRequestInternal locationRequestInternal = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder3 = null;
        String str = null;
        int i = 1;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    i = dfxj.f(parcel, readInt);
                    break;
                case 2:
                    locationRequestInternal = (LocationRequestInternal) dfxj.n(parcel, readInt, LocationRequestInternal.CREATOR);
                    break;
                case 3:
                    iBinder = dfxj.l(parcel, readInt);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) dfxj.n(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinder2 = dfxj.l(parcel, readInt);
                    break;
                case 6:
                    iBinder3 = dfxj.l(parcel, readInt);
                    break;
                case 7:
                default:
                    dfxj.C(parcel, readInt);
                    break;
                case 8:
                    str = dfxj.t(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new LocationRequestUpdateData(i, locationRequestInternal, iBinder, iBinder2, pendingIntent, iBinder3, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationRequestUpdateData[i];
    }
}
