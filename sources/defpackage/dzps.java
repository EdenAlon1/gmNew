package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class dzps implements Parcelable, Serializable {
    public static final Parcelable.Creator<dzps> CREATOR = new dzpr();
    private static final long serialVersionUID = 0;

    public abstract dzpn a();

    public abstract dzpq b();

    public abstract dzpg c();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(b(), i);
        int ordinal = b().ordinal();
        if (ordinal == 0) {
            parcel.writeParcelable(c(), i);
        } else {
            if (ordinal != 1) {
                return;
            }
            parcel.writeParcelable(a(), i);
        }
    }
}
