package defpackage;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rws implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        int i = 0;
        int i2 = 0;
        boolean z = false;
        String str = null;
        Bitmap bitmap = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    i = dfxj.f(parcel, readInt);
                    break;
                case 2:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 3:
                    bitmap = (Bitmap) dfxj.n(parcel, readInt, Bitmap.CREATOR);
                    break;
                case 4:
                    i2 = dfxj.f(parcel, readInt);
                    break;
                case 5:
                    parcelFileDescriptor = (ParcelFileDescriptor) dfxj.n(parcel, readInt, ParcelFileDescriptor.CREATOR);
                    break;
                case 6:
                    z = dfxj.D(parcel, readInt);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new rwr(i, str, bitmap, i2, parcelFileDescriptor, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new rwr[i];
    }
}
