package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.CorpusStatus;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class devl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        Bundle bundle = null;
        String str = null;
        String str2 = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        boolean z = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    z = dfxj.D(parcel, readInt);
                    break;
                case 2:
                    j = dfxj.i(parcel, readInt);
                    break;
                case 3:
                    j2 = dfxj.i(parcel, readInt);
                    break;
                case 4:
                    j3 = dfxj.i(parcel, readInt);
                    break;
                case 5:
                    bundle = dfxj.k(parcel, readInt);
                    break;
                case 6:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 7:
                    str2 = dfxj.t(parcel, readInt);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new CorpusStatus(z, j, j2, j3, bundle, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CorpusStatus[i];
    }
}
