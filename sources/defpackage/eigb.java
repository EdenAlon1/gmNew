package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.data.IsComposingMessage;
import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eigb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        eiem eiemVar = new eiem();
        int h = dfxj.h(parcel);
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                eiemVar.c(eigd.values()[dfxj.f(parcel, readInt)]);
            } else if (d == 2) {
                eiemVar.b(Duration.ofSeconds(dfxj.i(parcel, readInt)));
            } else if (d != 3) {
                dfxj.C(parcel, readInt);
            } else {
                eiemVar.d(Instant.ofEpochMilli(dfxj.i(parcel, readInt)));
            }
        }
        return eiemVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new IsComposingMessage[i];
    }
}
