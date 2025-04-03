package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.MethodInvocation;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfwo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        String str = null;
        String str2 = null;
        long j = 0;
        long j2 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    i2 = dfxj.f(parcel, readInt);
                    break;
                case 2:
                    i3 = dfxj.f(parcel, readInt);
                    break;
                case 3:
                    i4 = dfxj.f(parcel, readInt);
                    break;
                case 4:
                    j = dfxj.i(parcel, readInt);
                    break;
                case 5:
                    j2 = dfxj.i(parcel, readInt);
                    break;
                case 6:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 7:
                    str2 = dfxj.t(parcel, readInt);
                    break;
                case 8:
                    i5 = dfxj.f(parcel, readInt);
                    break;
                case 9:
                    i = dfxj.f(parcel, readInt);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new MethodInvocation(i2, i3, i4, j, j2, str, str2, i5, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MethodInvocation[i];
    }
}
