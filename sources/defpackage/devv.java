package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class devv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 2:
                    i = dfxj.f(parcel, readInt);
                    break;
                case 3:
                    i2 = dfxj.f(parcel, readInt);
                    break;
                case 4:
                    i3 = dfxj.f(parcel, readInt);
                    break;
                case 5:
                    str3 = dfxj.t(parcel, readInt);
                    break;
                case 6:
                    str4 = dfxj.t(parcel, readInt);
                    break;
                case 7:
                    str5 = dfxj.t(parcel, readInt);
                    break;
                case 8:
                    str2 = dfxj.t(parcel, readInt);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new GlobalSearchApplicationInfo(str, str2, i, i2, i3, str3, str4, str5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GlobalSearchApplicationInfo[i];
    }
}
