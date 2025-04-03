package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.duokit.DuoId;
import com.google.android.gms.duokit.SetupDuoRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgfv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        DuoId[] duoIdArr = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            if (dfxj.d(readInt) != 1) {
                dfxj.C(parcel, readInt);
            } else {
                duoIdArr = (DuoId[]) dfxj.J(parcel, readInt, DuoId.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new SetupDuoRequest(duoIdArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SetupDuoRequest[i];
    }
}
