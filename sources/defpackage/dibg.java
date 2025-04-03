package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dibg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        int i = 0;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 2:
                    i = dfxj.f(parcel, readInt);
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
                    str5 = dfxj.t(parcel, readInt);
                    break;
                case 8:
                    str6 = dfxj.t(parcel, readInt);
                    break;
                case 9:
                    b = dfxj.a(parcel, readInt);
                    break;
                case 10:
                    b2 = dfxj.a(parcel, readInt);
                    break;
                case 11:
                    b3 = dfxj.a(parcel, readInt);
                    break;
                case 12:
                    b4 = dfxj.a(parcel, readInt);
                    break;
                case 13:
                    str7 = dfxj.t(parcel, readInt);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new AncsNotificationParcelable(i, str, str2, str3, str4, str5, str6, b, b2, b3, b4, str7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AncsNotificationParcelable[i];
    }
}
