package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtbp implements dtbu {
    public static final Parcelable.Creator<dtbp> CREATOR = new dtbo();
    public final View a;

    public dtbp() {
        this((byte[]) null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dtbp) && ffkj.e(this.a, ((dtbp) obj).a);
    }

    public final int hashCode() {
        View view = this.a;
        if (view == null) {
            return 0;
        }
        return view.hashCode();
    }

    public final String toString() {
        return "Keyboard(target=" + this.a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }

    public dtbp(View view) {
        this.a = view;
    }

    public /* synthetic */ dtbp(byte[] bArr) {
        this((View) null);
    }
}
