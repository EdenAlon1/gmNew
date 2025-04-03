package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.car.app.navigation.model.Maneuver;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rwi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        byte[] bArr = null;
        int[] iArr = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        boolean z = false;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = -1;
        int i23 = -1;
        float f = 0.0f;
        double d = 0.0d;
        double d2 = 0.0d;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    i = dfxj.f(parcel, readInt);
                    break;
                case 2:
                    i2 = dfxj.f(parcel, readInt);
                    break;
                case 3:
                    i3 = dfxj.f(parcel, readInt);
                    break;
                case 4:
                    i4 = dfxj.f(parcel, readInt);
                    break;
                case 5:
                    j = dfxj.i(parcel, readInt);
                    break;
                case 6:
                    i5 = dfxj.f(parcel, readInt);
                    break;
                case 7:
                    i6 = dfxj.f(parcel, readInt);
                    break;
                case 8:
                    i7 = dfxj.f(parcel, readInt);
                    break;
                case 9:
                    j2 = dfxj.i(parcel, readInt);
                    break;
                case 10:
                    j3 = dfxj.i(parcel, readInt);
                    break;
                case 11:
                    j4 = dfxj.i(parcel, readInt);
                    break;
                case 12:
                    j5 = dfxj.i(parcel, readInt);
                    break;
                case 13:
                    j6 = dfxj.i(parcel, readInt);
                    break;
                case 14:
                    j7 = dfxj.i(parcel, readInt);
                    break;
                case 15:
                    i8 = dfxj.f(parcel, readInt);
                    break;
                case 16:
                    i9 = dfxj.f(parcel, readInt);
                    break;
                case 17:
                    i10 = dfxj.f(parcel, readInt);
                    break;
                case 18:
                    i11 = dfxj.f(parcel, readInt);
                    break;
                case 19:
                    z = dfxj.D(parcel, readInt);
                    break;
                case 20:
                    i12 = dfxj.f(parcel, readInt);
                    break;
                case 21:
                    j8 = dfxj.i(parcel, readInt);
                    break;
                case 22:
                    d = dfxj.b(parcel, readInt);
                    break;
                case 23:
                    d2 = dfxj.b(parcel, readInt);
                    break;
                case 24:
                    i13 = dfxj.f(parcel, readInt);
                    break;
                case 25:
                    f = dfxj.c(parcel, readInt);
                    break;
                case 26:
                    bArr = dfxj.E(parcel, readInt);
                    break;
                case 27:
                    i14 = dfxj.f(parcel, readInt);
                    break;
                case 28:
                    i15 = dfxj.f(parcel, readInt);
                    break;
                case 29:
                    j9 = dfxj.i(parcel, readInt);
                    break;
                case 30:
                    j10 = dfxj.i(parcel, readInt);
                    break;
                case 31:
                    i22 = dfxj.f(parcel, readInt);
                    break;
                case 32:
                    i16 = dfxj.f(parcel, readInt);
                    break;
                case 33:
                    i17 = dfxj.f(parcel, readInt);
                    break;
                case 34:
                    i18 = dfxj.f(parcel, readInt);
                    break;
                case 35:
                    i19 = dfxj.f(parcel, readInt);
                    break;
                case 36:
                    i20 = dfxj.f(parcel, readInt);
                    break;
                case 37:
                    i23 = dfxj.f(parcel, readInt);
                    break;
                case 38:
                    i21 = dfxj.f(parcel, readInt);
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    j11 = dfxj.i(parcel, readInt);
                    break;
                case 40:
                    j12 = dfxj.i(parcel, readInt);
                    break;
                case 41:
                    iArr = dfxj.H(parcel, readInt);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new rwh(i, i2, i3, i4, j, i5, i6, i7, j2, j3, j4, j5, j6, j7, i8, i9, i10, i11, z, i12, j8, d, d2, i13, f, bArr, i14, i15, j9, j10, i22, i16, i17, i18, i19, i20, i23, i21, j11, j12, iArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new rwh[i];
    }
}
