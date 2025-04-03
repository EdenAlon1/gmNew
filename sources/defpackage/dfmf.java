package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.clearcut.internal.DataCollectionIdentifierParcelable;
import com.google.android.gms.clearcut.internal.LogVerifierResultParcelable;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import com.google.android.gms.phenotype.ExperimentTokens;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfmf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        PlayLoggerContext playLoggerContext = null;
        byte[] bArr = null;
        int[] iArr = null;
        String[] strArr = null;
        int[] iArr2 = null;
        byte[][] bArr2 = null;
        ExperimentTokens[] experimentTokensArr = null;
        LogVerifierResultParcelable logVerifierResultParcelable = null;
        String[] strArr2 = null;
        DataCollectionIdentifierParcelable dataCollectionIdentifierParcelable = null;
        int i = 0;
        boolean z = true;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 2:
                    playLoggerContext = (PlayLoggerContext) dfxj.n(parcel, readInt, PlayLoggerContext.CREATOR);
                    break;
                case 3:
                    bArr = dfxj.E(parcel, readInt);
                    break;
                case 4:
                    iArr = dfxj.H(parcel, readInt);
                    break;
                case 5:
                    strArr = dfxj.K(parcel, readInt);
                    break;
                case 6:
                    iArr2 = dfxj.H(parcel, readInt);
                    break;
                case 7:
                    bArr2 = dfxj.L(parcel, readInt);
                    break;
                case 8:
                    z = dfxj.D(parcel, readInt);
                    break;
                case 9:
                    experimentTokensArr = (ExperimentTokens[]) dfxj.J(parcel, readInt, ExperimentTokens.CREATOR);
                    break;
                case 10:
                default:
                    dfxj.C(parcel, readInt);
                    break;
                case 11:
                    logVerifierResultParcelable = (LogVerifierResultParcelable) dfxj.n(parcel, readInt, LogVerifierResultParcelable.CREATOR);
                    break;
                case 12:
                    strArr2 = dfxj.K(parcel, readInt);
                    break;
                case 13:
                    i = dfxj.f(parcel, readInt);
                    break;
                case 14:
                    dataCollectionIdentifierParcelable = (DataCollectionIdentifierParcelable) dfxj.n(parcel, readInt, DataCollectionIdentifierParcelable.CREATOR);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new LogEventParcelable(playLoggerContext, bArr, iArr, strArr, iArr2, bArr2, z, experimentTokensArr, logVerifierResultParcelable, strArr2, i, dataCollectionIdentifierParcelable);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LogEventParcelable[i];
    }
}
