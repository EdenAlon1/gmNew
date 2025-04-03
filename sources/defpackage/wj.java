package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class wj extends kzu {
    public static final Parcelable.Creator<wj> CREATOR = new wi();
    public Parcelable a;

    public wj(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readParcelable(classLoader == null ? vx.class.getClassLoader() : classLoader);
    }

    @Override // defpackage.kzu, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.a, 0);
    }

    public wj(Parcelable parcelable) {
        super(parcelable);
    }
}
