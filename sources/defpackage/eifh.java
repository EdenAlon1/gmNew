package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.android.rcs.client.messaging.data.FileInformation;
import j$.time.Duration;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eifh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        eieb eiebVar = new eieb();
        int h = dfxj.h(parcel);
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    eiebVar.e(dfxj.t(parcel, readInt));
                    break;
                case 2:
                    eiebVar.f(dfxj.f(parcel, readInt));
                    break;
                case 3:
                    eiebVar.c((ContentType) dfxj.n(parcel, readInt, ContentType.CREATOR));
                    break;
                case 4:
                    eiebVar.g(dfxj.t(parcel, readInt));
                    break;
                case 5:
                    eiebVar.h(eihh.a(parcel, readInt));
                    break;
                case 6:
                    int f = dfxj.f(parcel, readInt);
                    if (f >= 0 && f < eifj.values().length) {
                        eiebVar.d(eifj.values()[f]);
                        break;
                    }
                    break;
                case 7:
                    eiebVar.a = Optional.of(eyee.x(dfxj.E(parcel, readInt)));
                    break;
                case 8:
                    eiebVar.b(Duration.ofSeconds(dfxj.i(parcel, readInt)));
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        return eiebVar.i();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FileInformation[i];
    }
}
