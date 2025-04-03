package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.learning.InAppTrainerOptions;
import com.google.android.gms.learning.InAppTrainingConstraints;
import com.google.android.gms.learning.TrainingInterval;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgud implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        String str2 = null;
        Uri uri = null;
        InAppTrainingConstraints inAppTrainingConstraints = null;
        Uri uri2 = null;
        TrainingInterval trainingInterval = null;
        byte[] bArr = null;
        Uri uri3 = null;
        Bundle bundle = null;
        byte[] bArr2 = null;
        long j = 0;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 2:
                    i = dfxj.f(parcel, readInt);
                    break;
                case 3:
                    z = dfxj.D(parcel, readInt);
                    break;
                case 4:
                    str2 = dfxj.t(parcel, readInt);
                    break;
                case 5:
                    i2 = dfxj.f(parcel, readInt);
                    break;
                case 6:
                    uri = (Uri) dfxj.n(parcel, readInt, Uri.CREATOR);
                    break;
                case 7:
                case 8:
                default:
                    dfxj.C(parcel, readInt);
                    break;
                case 9:
                    inAppTrainingConstraints = (InAppTrainingConstraints) dfxj.n(parcel, readInt, InAppTrainingConstraints.CREATOR);
                    break;
                case 10:
                    j = dfxj.i(parcel, readInt);
                    break;
                case 11:
                    uri2 = (Uri) dfxj.n(parcel, readInt, Uri.CREATOR);
                    break;
                case 12:
                    trainingInterval = (TrainingInterval) dfxj.n(parcel, readInt, TrainingInterval.CREATOR);
                    break;
                case 13:
                    bArr = dfxj.E(parcel, readInt);
                    break;
                case 14:
                    uri3 = (Uri) dfxj.n(parcel, readInt, Uri.CREATOR);
                    break;
                case 15:
                    bundle = dfxj.k(parcel, readInt);
                    break;
                case 16:
                    bArr2 = dfxj.E(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new InAppTrainerOptions(str, i, z, str2, i2, uri, inAppTrainingConstraints, j, uri2, trainingInterval, bArr, uri3, bundle, bArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new InAppTrainerOptions[i];
    }
}
