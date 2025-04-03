package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.PrivacyRecordOptinRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dier implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        int i = 0;
        boolean z = false;
        String str2 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                str = dfxj.t(parcel, readInt);
            } else if (d == 2) {
                i = dfxj.f(parcel, readInt);
            } else if (d == 3) {
                z = dfxj.D(parcel, readInt);
            } else if (d != 4) {
                dfxj.C(parcel, readInt);
            } else {
                str2 = dfxj.t(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new PrivacyRecordOptinRequest(str, i, z, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PrivacyRecordOptinRequest[i];
    }
}
