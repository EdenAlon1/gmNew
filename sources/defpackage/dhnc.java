package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.corpora.DeleteUsageReportCall$Response;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhnc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        Status status = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            if (dfxj.d(readInt) != 1) {
                dfxj.C(parcel, readInt);
            } else {
                status = (Status) dfxj.n(parcel, readInt, Status.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new DeleteUsageReportCall$Response(status);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DeleteUsageReportCall$Response[i];
    }
}
