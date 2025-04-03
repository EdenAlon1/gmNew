package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.AccountConsentRecordParcelable;
import com.google.android.gms.wearable.internal.ConsentResponse;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dicd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        ArrayList arrayList = null;
        String str = null;
        Long l = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    i = dfxj.f(parcel, readInt);
                    break;
                case 2:
                    z = dfxj.D(parcel, readInt);
                    break;
                case 3:
                    z2 = dfxj.D(parcel, readInt);
                    break;
                case 4:
                    z3 = dfxj.D(parcel, readInt);
                    break;
                case 5:
                    z4 = dfxj.D(parcel, readInt);
                    break;
                case 6:
                    arrayList = dfxj.z(parcel, readInt, AccountConsentRecordParcelable.CREATOR);
                    break;
                case 7:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 8:
                    l = dfxj.s(parcel, readInt);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new ConsentResponse(i, z, z2, z3, z4, arrayList, str, l);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ConsentResponse[i];
    }
}
