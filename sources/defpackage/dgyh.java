package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.libs.identity.ClientIdentity;
import com.google.android.gms.location.CurrentLocationRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgyh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        WorkSource workSource = new WorkSource();
        ClientIdentity clientIdentity = null;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        long j = Long.MAX_VALUE;
        long j2 = Long.MAX_VALUE;
        int i3 = 102;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    j = dfxj.i(parcel, readInt);
                    break;
                case 2:
                    i = dfxj.f(parcel, readInt);
                    break;
                case 3:
                    i3 = dfxj.f(parcel, readInt);
                    break;
                case 4:
                    j2 = dfxj.i(parcel, readInt);
                    break;
                case 5:
                    z = dfxj.D(parcel, readInt);
                    break;
                case 6:
                    workSource = (WorkSource) dfxj.n(parcel, readInt, WorkSource.CREATOR);
                    break;
                case 7:
                    i2 = dfxj.f(parcel, readInt);
                    break;
                case 8:
                default:
                    dfxj.C(parcel, readInt);
                    break;
                case 9:
                    clientIdentity = (ClientIdentity) dfxj.n(parcel, readInt, ClientIdentity.CREATOR);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new CurrentLocationRequest(j, i, i3, j2, z, i2, workSource, clientIdentity);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CurrentLocationRequest[i];
    }
}
