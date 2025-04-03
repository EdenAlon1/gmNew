package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.vision.text.internal.client.BoundingBoxParcel;
import com.google.android.gms.vision.text.internal.client.LineBoxParcel;
import com.google.android.gms.vision.text.internal.client.WordBoxParcel;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhwe implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        int i = 0;
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        WordBoxParcel[] wordBoxParcelArr = null;
        BoundingBoxParcel boundingBoxParcel = null;
        BoundingBoxParcel boundingBoxParcel2 = null;
        BoundingBoxParcel boundingBoxParcel3 = null;
        String str = null;
        String str2 = null;
        float f = 0.0f;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 2:
                    wordBoxParcelArr = (WordBoxParcel[]) dfxj.J(parcel, readInt, WordBoxParcel.CREATOR);
                    break;
                case 3:
                    boundingBoxParcel = (BoundingBoxParcel) dfxj.n(parcel, readInt, BoundingBoxParcel.CREATOR);
                    break;
                case 4:
                    boundingBoxParcel2 = (BoundingBoxParcel) dfxj.n(parcel, readInt, BoundingBoxParcel.CREATOR);
                    break;
                case 5:
                    boundingBoxParcel3 = (BoundingBoxParcel) dfxj.n(parcel, readInt, BoundingBoxParcel.CREATOR);
                    break;
                case 6:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 7:
                    f = dfxj.c(parcel, readInt);
                    break;
                case 8:
                    str2 = dfxj.t(parcel, readInt);
                    break;
                case 9:
                    i = dfxj.f(parcel, readInt);
                    break;
                case 10:
                    z = dfxj.D(parcel, readInt);
                    break;
                case 11:
                    i2 = dfxj.f(parcel, readInt);
                    break;
                case 12:
                    i3 = dfxj.f(parcel, readInt);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new LineBoxParcel(wordBoxParcelArr, boundingBoxParcel, boundingBoxParcel2, boundingBoxParcel3, str, f, str2, i, z, i2, i3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LineBoxParcel[i];
    }
}
