package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehrh extends kzu {
    public static final Parcelable.Creator<ehrh> CREATOR = new ehrg();
    public final cpn a;

    public ehrh(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.a = new cpn(readInt);
        for (int i = 0; i < readInt; i++) {
            this.a.put(strArr[i], bundleArr[i]);
        }
    }

    public final String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.a.toString() + "}";
    }

    @Override // defpackage.kzu, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int i2 = this.a.d;
        parcel.writeInt(i2);
        String[] strArr = new String[i2];
        Bundle[] bundleArr = new Bundle[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = (String) this.a.d(i3);
            bundleArr[i3] = (Bundle) this.a.g(i3);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public ehrh(Parcelable parcelable) {
        super(parcelable);
        this.a = new cpn();
    }
}
