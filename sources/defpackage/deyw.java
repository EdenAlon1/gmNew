package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.asterism.SetAsterismConsentRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deyw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        String str = "";
        String str2 = str;
        String str3 = str2;
        int[] iArr = null;
        Long l = null;
        Bundle bundle = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
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
                    iArr = dfxj.H(parcel, readInt);
                    break;
                case 5:
                    l = dfxj.s(parcel, readInt);
                    break;
                case 6:
                    i4 = dfxj.f(parcel, readInt);
                    break;
                case 7:
                    bundle = dfxj.k(parcel, readInt);
                    break;
                case 8:
                    i5 = dfxj.f(parcel, readInt);
                    break;
                case 9:
                    str4 = dfxj.t(parcel, readInt);
                    break;
                case 10:
                    str5 = dfxj.t(parcel, readInt);
                    break;
                case 11:
                    str6 = dfxj.t(parcel, readInt);
                    break;
                case 12:
                    str7 = dfxj.t(parcel, readInt);
                    break;
                case 13:
                    str8 = dfxj.t(parcel, readInt);
                    break;
                case 14:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 15:
                    str2 = dfxj.t(parcel, readInt);
                    break;
                case 16:
                    str3 = dfxj.t(parcel, readInt);
                    break;
                case 17:
                    i6 = dfxj.f(parcel, readInt);
                    break;
                case 18:
                    i7 = dfxj.f(parcel, readInt);
                    break;
                case 19:
                    i8 = dfxj.f(parcel, readInt);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new SetAsterismConsentRequest(i, i2, i3, iArr, l, i4, bundle, i5, str4, str5, str6, str7, str8, str, str2, str3, i6, i7, i8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SetAsterismConsentRequest[i];
    }
}
