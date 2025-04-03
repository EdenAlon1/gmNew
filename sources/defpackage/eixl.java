package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eixl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Class<?> cls = getClass();
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        return new eiwx(readInt == 1, readInt2 == 1, (Intent) parcel.readParcelable(cls.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new eixm[i];
    }
}
