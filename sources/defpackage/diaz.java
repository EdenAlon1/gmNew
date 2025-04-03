package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.AcceptTermsRequest;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class diaz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        int i = 0;
        boolean z = false;
        ArrayList arrayList = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        ArrayList arrayList2 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    i = dfxj.f(parcel, readInt);
                    break;
                case 2:
                    arrayList = dfxj.w(parcel, readInt);
                    break;
                case 3:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 4:
                    str2 = dfxj.t(parcel, readInt);
                    break;
                case 5:
                    str3 = dfxj.t(parcel, readInt);
                    break;
                case 6:
                    str4 = dfxj.t(parcel, readInt);
                    break;
                case 7:
                    arrayList2 = dfxj.w(parcel, readInt);
                    break;
                case 8:
                    z = dfxj.D(parcel, readInt);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new AcceptTermsRequest(i, arrayList, str, str2, str3, str4, arrayList2, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AcceptTermsRequest[i];
    }
}
