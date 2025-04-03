package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.cpg.callingcard.CallingCardFontData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhif implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    f = dfxj.c(parcel, readInt);
                    break;
                case 2:
                    f2 = dfxj.c(parcel, readInt);
                    break;
                case 3:
                    f3 = dfxj.c(parcel, readInt);
                    break;
                case 4:
                    f4 = dfxj.c(parcel, readInt);
                    break;
                case 5:
                    f5 = dfxj.c(parcel, readInt);
                    break;
                case 6:
                    f6 = dfxj.c(parcel, readInt);
                    break;
                case 7:
                    i = dfxj.f(parcel, readInt);
                    break;
                case 8:
                    i2 = dfxj.f(parcel, readInt);
                    break;
                case 9:
                    f7 = dfxj.c(parcel, readInt);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new CallingCardFontData(f, f2, f3, f4, f5, f6, i, i2, f7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CallingCardFontData[i];
    }
}
