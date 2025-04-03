package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.pck;
import defpackage.pcm;
import defpackage.pcn;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new pck();
    private final pcn a;

    public ParcelImpl(Parcel parcel) {
        this.a = new pcm(parcel).f();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new pcm(parcel).x(this.a);
    }
}
