package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqzm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        byte[] createByteArray = parcel.createByteArray();
        if (createByteArray != null) {
            return new dqzn((droa) eyfy.parseFrom(droa.a, createByteArray));
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new dqzn[i];
    }
}
