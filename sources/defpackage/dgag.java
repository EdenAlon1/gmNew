package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.contactkeys.E2eeContactKeyListParcelable;
import com.google.android.gms.contactkeys.E2eeContactKeyParcelable;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgag implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            if (dfxj.d(readInt) != 1) {
                dfxj.C(parcel, readInt);
            } else {
                arrayList = dfxj.z(parcel, readInt, E2eeContactKeyParcelable.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new E2eeContactKeyListParcelable(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new E2eeContactKeyListParcelable[i];
    }
}
