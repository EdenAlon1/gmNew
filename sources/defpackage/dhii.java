package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.cpg.callingcard.CallingCardFontData;
import com.google.android.gms.people.cpg.callingcard.CallingCardFullScreenImageData;
import com.google.android.gms.people.cpg.callingcard.CallingCardMetadata;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhii implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        CallingCardFontData callingCardFontData = null;
        CallingCardFullScreenImageData callingCardFullScreenImageData = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                callingCardFontData = (CallingCardFontData) dfxj.n(parcel, readInt, CallingCardFontData.CREATOR);
            } else if (d != 2) {
                dfxj.C(parcel, readInt);
            } else {
                callingCardFullScreenImageData = (CallingCardFullScreenImageData) dfxj.n(parcel, readInt, CallingCardFullScreenImageData.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new CallingCardMetadata(callingCardFontData, callingCardFullScreenImageData);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CallingCardMetadata[i];
    }
}
