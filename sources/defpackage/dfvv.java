package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfvv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        RootTelemetryConfiguration rootTelemetryConfiguration = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    rootTelemetryConfiguration = (RootTelemetryConfiguration) dfxj.n(parcel, readInt, RootTelemetryConfiguration.CREATOR);
                    break;
                case 2:
                    z = dfxj.D(parcel, readInt);
                    break;
                case 3:
                    z2 = dfxj.D(parcel, readInt);
                    break;
                case 4:
                    iArr = dfxj.H(parcel, readInt);
                    break;
                case 5:
                    i = dfxj.f(parcel, readInt);
                    break;
                case 6:
                    iArr2 = dfxj.H(parcel, readInt);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new ConnectionTelemetryConfiguration(rootTelemetryConfiguration, z, z2, iArr, i, iArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionTelemetryConfiguration[i];
    }
}
