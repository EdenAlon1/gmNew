package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.NodeMigratedEventParcelable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class diem implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        DataHolder dataHolder = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                str = dfxj.t(parcel, readInt);
            } else if (d != 2) {
                dfxj.C(parcel, readInt);
            } else {
                dataHolder = (DataHolder) dfxj.n(parcel, readInt, DataHolder.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new NodeMigratedEventParcelable(str, dataHolder);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new NodeMigratedEventParcelable[i];
    }
}
