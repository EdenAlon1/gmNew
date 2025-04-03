package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.protomodel.SourceStatsEntity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhjt implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        Integer num = null;
        Integer num2 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 2) {
                str = dfxj.t(parcel, readInt);
            } else if (d == 3) {
                num = dfxj.r(parcel, readInt);
            } else if (d != 4) {
                dfxj.C(parcel, readInt);
            } else {
                num2 = dfxj.r(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new SourceStatsEntity(str, num, num2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SourceStatsEntity[i];
    }
}
