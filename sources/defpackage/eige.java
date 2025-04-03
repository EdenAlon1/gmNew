package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.data.LocationInformation;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eige implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        eien eienVar = new eien();
        int h = dfxj.h(parcel);
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    eienVar.d(dfxj.t(parcel, readInt));
                    break;
                case 2:
                    eienVar.i(eihh.a(parcel, readInt));
                    break;
                case 3:
                    eienVar.c(eihh.a(parcel, readInt));
                    break;
                case 4:
                    eienVar.e(dfxj.t(parcel, readInt));
                    break;
                case 5:
                    eienVar.a = Optional.of(dfxj.t(parcel, readInt));
                    break;
                case 6:
                    eienVar.g(dfxj.b(parcel, readInt));
                    break;
                case 7:
                    eienVar.f(dfxj.b(parcel, readInt));
                    break;
                case 8:
                    eienVar.h(dfxj.b(parcel, readInt));
                    break;
                case 9:
                    eienVar.b(dfxj.t(parcel, readInt));
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        return eienVar.j();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationInformation[i];
    }
}
