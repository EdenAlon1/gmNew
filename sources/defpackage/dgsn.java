package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.kids.IndividualContactRequest;
import com.google.android.gms.kids.UriWithType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgsn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        UriWithType[] uriWithTypeArr = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                str = dfxj.t(parcel, readInt);
            } else if (d != 2) {
                dfxj.C(parcel, readInt);
            } else {
                uriWithTypeArr = (UriWithType[]) dfxj.J(parcel, readInt, UriWithType.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new IndividualContactRequest(str, uriWithTypeArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new IndividualContactRequest[i];
    }
}
