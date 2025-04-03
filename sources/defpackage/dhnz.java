package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.search.ime.GetCorpusHandlesRegisteredForIMECall$Request;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhnz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        while (parcel.dataPosition() < h) {
            dfxj.C(parcel, parcel.readInt());
        }
        dfxj.B(parcel, h);
        return new GetCorpusHandlesRegisteredForIMECall$Request();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetCorpusHandlesRegisteredForIMECall$Request[i];
    }
}
