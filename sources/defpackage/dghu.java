package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.feedback.LogOptions;
import com.google.android.gms.feedback.ServiceDumpRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dghu implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        ServiceDumpRequest[] serviceDumpRequestArr = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 2:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 3:
                    z = dfxj.D(parcel, readInt);
                    break;
                case 4:
                    z2 = dfxj.D(parcel, readInt);
                    break;
                case 5:
                    z3 = dfxj.D(parcel, readInt);
                    break;
                case 6:
                    z4 = dfxj.D(parcel, readInt);
                    break;
                case 7:
                    serviceDumpRequestArr = (ServiceDumpRequest[]) dfxj.J(parcel, readInt, ServiceDumpRequest.CREATOR);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new LogOptions(str, z, z2, z3, z4, serviceDumpRequestArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LogOptions[i];
    }
}
