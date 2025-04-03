package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhvp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        ArrayList arrayList = null;
        String str = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 2:
                    i = dfxj.f(parcel, readInt);
                    break;
                case 3:
                    z = dfxj.D(parcel, readInt);
                    break;
                case 4:
                    arrayList = dfxj.y(parcel, readInt);
                    break;
                case 5:
                    i2 = dfxj.f(parcel, readInt);
                    break;
                case 6:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 7:
                    z2 = dfxj.D(parcel, readInt);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new UsageReportingOptInOptions(i, z, arrayList, i2, str, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new UsageReportingOptInOptions[i];
    }
}
