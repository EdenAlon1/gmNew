package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.search.administration.AppIndexingErrorInfo;
import com.google.firebase.appindexing.internal.Thing;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhmi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        String str2 = null;
        Thing thing = null;
        euof euofVar = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
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
                    str2 = dfxj.t(parcel, readInt);
                    break;
                case 5:
                    j = dfxj.i(parcel, readInt);
                    break;
                case 6:
                    thing = (Thing) dfxj.n(parcel, readInt, Thing.CREATOR);
                    break;
                case 7:
                    euofVar = (euof) dfxj.n(parcel, readInt, euof.CREATOR);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new AppIndexingErrorInfo(str, i, i2, str2, j, thing, euofVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AppIndexingErrorInfo[i];
    }
}
