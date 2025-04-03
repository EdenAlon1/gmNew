package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.SleepSegmentRequest;
import com.google.android.gms.location.UserPreferredSleepWindow;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgze implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        int i = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                arrayList = dfxj.z(parcel, readInt, UserPreferredSleepWindow.CREATOR);
            } else if (d != 2) {
                dfxj.C(parcel, readInt);
            } else {
                i = dfxj.f(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new SleepSegmentRequest(arrayList, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SleepSegmentRequest[i];
    }
}
