package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.feedback.ServiceDump;
import com.google.android.gms.feedback.ServiceDumpRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dghv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        ServiceDumpRequest serviceDumpRequest = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 2) {
                serviceDumpRequest = (ServiceDumpRequest) dfxj.n(parcel, readInt, ServiceDumpRequest.CREATOR);
            } else if (d != 3) {
                dfxj.C(parcel, readInt);
            } else {
                bArr = dfxj.E(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new ServiceDump(serviceDumpRequest, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ServiceDump[i];
    }
}
