package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.appindexing.internal.Thing;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eupe implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        Thing[] thingArr = null;
        String[] strArr = null;
        String[] strArr2 = null;
        euof euofVar = null;
        String str = null;
        String str2 = null;
        int i = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    i = dfxj.f(parcel, readInt);
                    break;
                case 2:
                    thingArr = (Thing[]) dfxj.J(parcel, readInt, Thing.CREATOR);
                    break;
                case 3:
                    strArr = dfxj.K(parcel, readInt);
                    break;
                case 4:
                default:
                    dfxj.C(parcel, readInt);
                    break;
                case 5:
                    strArr2 = dfxj.K(parcel, readInt);
                    break;
                case 6:
                    euofVar = (euof) dfxj.n(parcel, readInt, euof.CREATOR);
                    break;
                case 7:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 8:
                    str2 = dfxj.t(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new eupd(i, thingArr, strArr, strArr2, euofVar, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new eupd[i];
    }
}
