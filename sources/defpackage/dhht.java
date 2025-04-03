package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.contactssync.model.ExtendedSyncStatus;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhht implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        long j = 0;
        String str = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 2:
                    i = dfxj.f(parcel, readInt);
                    break;
                case 3:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 4:
                    j = dfxj.i(parcel, readInt);
                    break;
                case 5:
                    i2 = dfxj.f(parcel, readInt);
                    break;
                case 6:
                    i3 = dfxj.f(parcel, readInt);
                    break;
                case 7:
                    i4 = dfxj.f(parcel, readInt);
                    break;
                case 8:
                    i5 = dfxj.f(parcel, readInt);
                    break;
                case 9:
                    i6 = dfxj.f(parcel, readInt);
                    break;
                case 10:
                    i7 = dfxj.f(parcel, readInt);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new ExtendedSyncStatus(i, str, j, i2, i3, i4, i5, i6, i7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ExtendedSyncStatus[i];
    }
}
