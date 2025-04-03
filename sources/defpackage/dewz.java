package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.DocumentContents;
import com.google.android.gms.appdatasearch.DocumentId;
import com.google.android.gms.appdatasearch.UsageInfo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dewz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        DocumentId documentId = null;
        String str = null;
        DocumentContents documentContents = null;
        String str2 = null;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        int i3 = -1;
        long j = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    documentId = (DocumentId) dfxj.n(parcel, readInt, DocumentId.CREATOR);
                    break;
                case 2:
                    j = dfxj.i(parcel, readInt);
                    break;
                case 3:
                    i = dfxj.f(parcel, readInt);
                    break;
                case 4:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 5:
                    documentContents = (DocumentContents) dfxj.n(parcel, readInt, DocumentContents.CREATOR);
                    break;
                case 6:
                    z = dfxj.D(parcel, readInt);
                    break;
                case 7:
                    i3 = dfxj.f(parcel, readInt);
                    break;
                case 8:
                    i2 = dfxj.f(parcel, readInt);
                    break;
                case 9:
                    str2 = dfxj.t(parcel, readInt);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new UsageInfo(documentId, j, i, str, documentContents, z, i3, i2, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new UsageInfo[i];
    }
}
