package defpackage;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.AddListenerRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dibc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        IBinder iBinder = null;
        IntentFilter[] intentFilterArr = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 2) {
                iBinder = dfxj.l(parcel, readInt);
            } else if (d == 3) {
                intentFilterArr = (IntentFilter[]) dfxj.J(parcel, readInt, IntentFilter.CREATOR);
            } else if (d == 4) {
                str = dfxj.t(parcel, readInt);
            } else if (d != 5) {
                dfxj.C(parcel, readInt);
            } else {
                str2 = dfxj.t(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new AddListenerRequest(iBinder, intentFilterArr, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AddListenerRequest[i];
    }
}
