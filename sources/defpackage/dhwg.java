package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.vision.text.internal.client.BoundingBoxParcel;
import com.google.android.gms.vision.text.internal.client.SymbolBoxParcel;
import com.google.android.gms.vision.text.internal.client.WordBoxParcel;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhwg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        boolean z = false;
        SymbolBoxParcel[] symbolBoxParcelArr = null;
        BoundingBoxParcel boundingBoxParcel = null;
        BoundingBoxParcel boundingBoxParcel2 = null;
        String str = null;
        String str2 = null;
        float f = 0.0f;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 2:
                    symbolBoxParcelArr = (SymbolBoxParcel[]) dfxj.J(parcel, readInt, SymbolBoxParcel.CREATOR);
                    break;
                case 3:
                    boundingBoxParcel = (BoundingBoxParcel) dfxj.n(parcel, readInt, BoundingBoxParcel.CREATOR);
                    break;
                case 4:
                    boundingBoxParcel2 = (BoundingBoxParcel) dfxj.n(parcel, readInt, BoundingBoxParcel.CREATOR);
                    break;
                case 5:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 6:
                    f = dfxj.c(parcel, readInt);
                    break;
                case 7:
                    str2 = dfxj.t(parcel, readInt);
                    break;
                case 8:
                    z = dfxj.D(parcel, readInt);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new WordBoxParcel(symbolBoxParcelArr, boundingBoxParcel, boundingBoxParcel2, str, f, str2, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new WordBoxParcel[i];
    }
}
