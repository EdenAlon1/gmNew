package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.reporting.ReportingState;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhaw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        int i3 = 0;
        int i4 = 0;
        boolean z3 = false;
        boolean z4 = false;
        Integer num = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 2:
                    i = dfxj.f(parcel, readInt);
                    break;
                case 3:
                    i2 = dfxj.f(parcel, readInt);
                    break;
                case 4:
                    z = dfxj.D(parcel, readInt);
                    break;
                case 5:
                    z2 = dfxj.D(parcel, readInt);
                    break;
                case 6:
                default:
                    dfxj.C(parcel, readInt);
                    break;
                case 7:
                    i3 = dfxj.f(parcel, readInt);
                    break;
                case 8:
                    num = dfxj.r(parcel, readInt);
                    break;
                case 9:
                    i4 = dfxj.f(parcel, readInt);
                    break;
                case 10:
                    z3 = dfxj.D(parcel, readInt);
                    break;
                case 11:
                    z4 = dfxj.D(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new ReportingState(i, i2, z, z2, i3, i4, num, z3, z4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ReportingState[i];
    }
}
