package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.internal.LocationReceiver;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dham implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        PendingIntent pendingIntent = null;
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                i = dfxj.f(parcel, readInt);
            } else if (d == 2) {
                iBinder = dfxj.l(parcel, readInt);
            } else if (d == 3) {
                iBinder2 = dfxj.l(parcel, readInt);
            } else if (d == 4) {
                pendingIntent = (PendingIntent) dfxj.n(parcel, readInt, PendingIntent.CREATOR);
            } else if (d != 6) {
                dfxj.C(parcel, readInt);
            } else {
                str = dfxj.t(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new LocationReceiver(i, iBinder, iBinder2, pendingIntent, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationReceiver[i];
    }
}
