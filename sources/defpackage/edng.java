package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class edng implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ednh((Duration) parcel.readSerializable(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ednh[i];
    }
}
