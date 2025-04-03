package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.phenotype.ExperimentTokens;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhkd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        byte[] bArr = null;
        byte[][] bArr2 = null;
        byte[][] bArr3 = null;
        byte[][] bArr4 = null;
        byte[][] bArr5 = null;
        int[] iArr = null;
        byte[][] bArr6 = null;
        int[] iArr2 = null;
        byte[][] bArr7 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 2:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 3:
                    bArr = dfxj.E(parcel, readInt);
                    break;
                case 4:
                    bArr2 = dfxj.L(parcel, readInt);
                    break;
                case 5:
                    bArr3 = dfxj.L(parcel, readInt);
                    break;
                case 6:
                    bArr4 = dfxj.L(parcel, readInt);
                    break;
                case 7:
                    bArr5 = dfxj.L(parcel, readInt);
                    break;
                case 8:
                    iArr = dfxj.H(parcel, readInt);
                    break;
                case 9:
                    bArr6 = dfxj.L(parcel, readInt);
                    break;
                case 10:
                    iArr2 = dfxj.H(parcel, readInt);
                    break;
                case 11:
                    bArr7 = dfxj.L(parcel, readInt);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new ExperimentTokens(str, bArr, bArr2, bArr3, bArr4, bArr5, iArr, bArr6, iArr2, bArr7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ExperimentTokens[i];
    }
}
