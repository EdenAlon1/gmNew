package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.RegisterCorpusIMEInfo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dewh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String[] strArr = null;
        String str = null;
        String str2 = null;
        String[] strArr2 = null;
        String str3 = null;
        int i = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                i = dfxj.f(parcel, readInt);
            } else if (d == 2) {
                strArr = dfxj.K(parcel, readInt);
            } else if (d == 3) {
                str = dfxj.t(parcel, readInt);
            } else if (d == 4) {
                str2 = dfxj.t(parcel, readInt);
            } else if (d == 6) {
                str3 = dfxj.t(parcel, readInt);
            } else if (d != 7) {
                dfxj.C(parcel, readInt);
            } else {
                strArr2 = dfxj.K(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new RegisterCorpusIMEInfo(i, strArr, str, str2, strArr2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RegisterCorpusIMEInfo[i];
    }
}
