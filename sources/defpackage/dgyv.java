package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.libs.identity.ClientIdentity;
import com.google.android.gms.location.LocationRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgyv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        WorkSource workSource = new WorkSource();
        ClientIdentity clientIdentity = null;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        long j = -1;
        float f = 0.0f;
        int i3 = Integer.MAX_VALUE;
        long j2 = Long.MAX_VALUE;
        long j3 = Long.MAX_VALUE;
        long j4 = 0;
        long j5 = 600000;
        long j6 = 3600000;
        int i4 = 102;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    i4 = dfxj.f(parcel, readInt);
                    break;
                case 2:
                    j6 = dfxj.i(parcel, readInt);
                    break;
                case 3:
                    j5 = dfxj.i(parcel, readInt);
                    break;
                case 4:
                case 14:
                default:
                    dfxj.C(parcel, readInt);
                    break;
                case 5:
                    j2 = dfxj.i(parcel, readInt);
                    break;
                case 6:
                    i3 = dfxj.f(parcel, readInt);
                    break;
                case 7:
                    f = dfxj.c(parcel, readInt);
                    break;
                case 8:
                    j4 = dfxj.i(parcel, readInt);
                    break;
                case 9:
                    z = dfxj.D(parcel, readInt);
                    break;
                case 10:
                    j3 = dfxj.i(parcel, readInt);
                    break;
                case 11:
                    j = dfxj.i(parcel, readInt);
                    break;
                case 12:
                    i = dfxj.f(parcel, readInt);
                    break;
                case 13:
                    i2 = dfxj.f(parcel, readInt);
                    break;
                case 15:
                    z2 = dfxj.D(parcel, readInt);
                    break;
                case 16:
                    workSource = (WorkSource) dfxj.n(parcel, readInt, WorkSource.CREATOR);
                    break;
                case 17:
                    clientIdentity = (ClientIdentity) dfxj.n(parcel, readInt, ClientIdentity.CREATOR);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new LocationRequest(i4, j6, j5, j4, j2, j3, i3, f, z, j, i, i2, z2, workSource, clientIdentity);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationRequest[i];
    }
}
