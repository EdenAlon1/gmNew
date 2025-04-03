package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.people.data.AudienceMember;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfxx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Bundle bundle = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d != 1000) {
                switch (d) {
                    case 1:
                        i2 = dfxj.f(parcel, readInt);
                        break;
                    case 2:
                        i3 = dfxj.f(parcel, readInt);
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
                        bundle = dfxj.k(parcel, readInt);
                        break;
                    default:
                        dfxj.C(parcel, readInt);
                        break;
                }
            } else {
                i = dfxj.f(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new AudienceMember(i, i2, i3, str, str2, str3, str4, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AudienceMember[i];
    }
}
