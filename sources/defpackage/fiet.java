package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.chromium.base.UnguessableToken;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiet implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        long readLong = parcel.readLong();
        long readLong2 = parcel.readLong();
        if (readLong == 0 || readLong2 == 0) {
            return null;
        }
        return new UnguessableToken(readLong, readLong2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new UnguessableToken[i];
    }
}
