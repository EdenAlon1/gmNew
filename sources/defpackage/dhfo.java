package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mobstore.RenameRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhfo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        Uri uri = null;
        Uri uri2 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                uri = (Uri) dfxj.n(parcel, readInt, Uri.CREATOR);
            } else if (d != 2) {
                dfxj.C(parcel, readInt);
            } else {
                uri2 = (Uri) dfxj.n(parcel, readInt, Uri.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new RenameRequest(uri, uri2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RenameRequest[i];
    }
}
