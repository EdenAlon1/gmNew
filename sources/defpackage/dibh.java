package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.AppParcelable;
import com.google.android.gms.wearable.internal.AppWearDetailsParcelable;
import com.google.android.gms.wearable.internal.WebIconParcelable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dibh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        String str2 = null;
        WebIconParcelable webIconParcelable = null;
        String str3 = null;
        String str4 = null;
        Float f = null;
        AppWearDetailsParcelable appWearDetailsParcelable = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 2:
                    str2 = dfxj.t(parcel, readInt);
                    break;
                case 3:
                    webIconParcelable = (WebIconParcelable) dfxj.n(parcel, readInt, WebIconParcelable.CREATOR);
                    break;
                case 4:
                    str3 = dfxj.t(parcel, readInt);
                    break;
                case 5:
                    str4 = dfxj.t(parcel, readInt);
                    break;
                case 6:
                    f = dfxj.q(parcel, readInt);
                    break;
                case 7:
                    appWearDetailsParcelable = (AppWearDetailsParcelable) dfxj.n(parcel, readInt, AppWearDetailsParcelable.CREATOR);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new AppParcelable(str, str2, webIconParcelable, str3, str4, f, appWearDetailsParcelable);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AppParcelable[i];
    }
}
