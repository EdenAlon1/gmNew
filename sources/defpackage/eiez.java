package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.data.ChatMessage;
import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiez implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        eidy eidyVar = new eidy();
        int h = dfxj.h(parcel);
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                eidyVar.c((ContentType) dfxj.n(parcel, readInt, ContentType.CREATOR));
            } else if (d != 2) {
                dfxj.C(parcel, readInt);
            } else {
                eidyVar.b(eyee.x(dfxj.E(parcel, readInt)));
            }
        }
        return eidyVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ChatMessage[i];
    }
}
