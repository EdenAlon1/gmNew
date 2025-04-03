package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtbn implements dtbu {
    public static final Parcelable.Creator<dtbn> CREATOR = new dtbm();
    public final int a;
    public final dsat b;

    public dtbn(int i, dsat dsatVar) {
        this.a = i;
        this.b = dsatVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dtbn)) {
            return false;
        }
        dtbn dtbnVar = (dtbn) obj;
        return this.a == dtbnVar.a && ffkj.e(this.b, dtbnVar.b);
    }

    public final int hashCode() {
        dsat dsatVar = this.b;
        return (this.a * 31) + (dsatVar == null ? 0 : dsatVar.hashCode());
    }

    public final String toString() {
        return "Shortcut(shortcut=" + this.a + ", configuration=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a);
    }
}
