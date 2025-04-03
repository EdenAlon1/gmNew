package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.MessagingResult;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eibv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        eibw d = MessagingResult.d();
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d2 = dfxj.d(readInt);
            if (d2 == 1) {
                d.c(dfxj.f(parcel, readInt));
            } else if (d2 == 2) {
                d.b(dfxj.f(parcel, readInt));
            } else if (d2 == 3) {
                d.d(Duration.ofSeconds(dfxj.i(parcel, readInt)));
            } else {
                dfxj.C(parcel, readInt);
            }
        }
        return d.e();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MessagingResult[i];
    }
}
