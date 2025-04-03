package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.administration.AppIndexingErrorInfo;
import com.google.android.gms.search.administration.AppIndexingUserActionInfo;
import com.google.android.gms.search.administration.CorpusConfigParcelable;
import com.google.android.gms.search.administration.GetAppIndexingPackageDetailsCall$Response;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhmp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        boolean z = false;
        boolean z2 = false;
        Status status = null;
        CorpusConfigParcelable[] corpusConfigParcelableArr = null;
        AppIndexingErrorInfo[] appIndexingErrorInfoArr = null;
        AppIndexingUserActionInfo[] appIndexingUserActionInfoArr = null;
        long j = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    status = (Status) dfxj.n(parcel, readInt, Status.CREATOR);
                    break;
                case 2:
                    corpusConfigParcelableArr = (CorpusConfigParcelable[]) dfxj.J(parcel, readInt, CorpusConfigParcelable.CREATOR);
                    break;
                case 3:
                    j = dfxj.i(parcel, readInt);
                    break;
                case 4:
                    appIndexingErrorInfoArr = (AppIndexingErrorInfo[]) dfxj.J(parcel, readInt, AppIndexingErrorInfo.CREATOR);
                    break;
                case 5:
                    appIndexingUserActionInfoArr = (AppIndexingUserActionInfo[]) dfxj.J(parcel, readInt, AppIndexingUserActionInfo.CREATOR);
                    break;
                case 6:
                    z = dfxj.D(parcel, readInt);
                    break;
                case 7:
                    z2 = dfxj.D(parcel, readInt);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new GetAppIndexingPackageDetailsCall$Response(status, corpusConfigParcelableArr, j, appIndexingErrorInfoArr, appIndexingUserActionInfoArr, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetAppIndexingPackageDetailsCall$Response[i];
    }
}
