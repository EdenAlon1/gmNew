package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.DocumentId;
import com.google.android.gms.appdatasearch.ResultClickInfo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dewm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        int i = 0;
        String str = null;
        DocumentId[] documentIdArr = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                str = dfxj.t(parcel, readInt);
            } else if (d == 2) {
                documentIdArr = (DocumentId[]) dfxj.J(parcel, readInt, DocumentId.CREATOR);
            } else if (d != 3) {
                dfxj.C(parcel, readInt);
            } else {
                i = dfxj.f(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new ResultClickInfo(str, documentIdArr, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ResultClickInfo[i];
    }
}
