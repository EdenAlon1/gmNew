package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehnp extends kzu {
    public static final Parcelable.Creator<ehnp> CREATOR = new ehno();
    public String a;
    public int b;

    public ehnp(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readString();
        this.b = parcel.readInt();
    }

    @Override // defpackage.kzu, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
    }

    public ehnp(Parcelable parcelable) {
        super(parcelable);
    }
}
