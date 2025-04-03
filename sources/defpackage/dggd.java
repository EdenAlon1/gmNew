package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.duokit.DuoId;
import com.google.android.gms.duokit.StartGroupCreationFlowRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dggd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        boolean z = false;
        DuoId[] duoIdArr = null;
        String str = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                duoIdArr = (DuoId[]) dfxj.J(parcel, readInt, DuoId.CREATOR);
            } else if (d == 2) {
                str = dfxj.t(parcel, readInt);
            } else if (d != 3) {
                dfxj.C(parcel, readInt);
            } else {
                z = dfxj.D(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new StartGroupCreationFlowRequest(duoIdArr, str, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new StartGroupCreationFlowRequest[i];
    }
}
