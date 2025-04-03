package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfni implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        int i4 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Integer num = null;
        boolean z3 = true;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 2:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 3:
                    i = dfxj.f(parcel, readInt);
                    break;
                case 4:
                    i2 = dfxj.f(parcel, readInt);
                    break;
                case 5:
                    str2 = dfxj.t(parcel, readInt);
                    break;
                case 6:
                default:
                    dfxj.C(parcel, readInt);
                    break;
                case 7:
                    z3 = dfxj.D(parcel, readInt);
                    break;
                case 8:
                    str3 = dfxj.t(parcel, readInt);
                    break;
                case 9:
                    z = dfxj.D(parcel, readInt);
                    break;
                case 10:
                    i3 = dfxj.f(parcel, readInt);
                    break;
                case 11:
                    num = dfxj.r(parcel, readInt);
                    break;
                case 12:
                    z2 = dfxj.D(parcel, readInt);
                    break;
                case 13:
                    i4 = dfxj.f(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new PlayLoggerContext(str, i, i2, str2, z3, str3, z, i3, num, z2, i4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PlayLoggerContext[i];
    }
}
