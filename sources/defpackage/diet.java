package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.RecordTermConsentRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class diet implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    i = dfxj.f(parcel, readInt);
                    break;
                case 2:
                    i2 = dfxj.f(parcel, readInt);
                    break;
                case 3:
                    z = dfxj.D(parcel, readInt);
                    break;
                case 4:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 5:
                    str2 = dfxj.t(parcel, readInt);
                    break;
                case 6:
                    str3 = dfxj.t(parcel, readInt);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new RecordTermConsentRequest(i, i2, z, str, str2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RecordTermConsentRequest[i];
    }
}
