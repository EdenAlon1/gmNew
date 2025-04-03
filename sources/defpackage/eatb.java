package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eatb implements easy {
    public static final Parcelable.Creator<eatb> CREATOR = new eata();
    public final String a;

    public eatb(String str) {
        str.getClass();
        this.a = str;
    }

    @Override // defpackage.easy
    public final String a() {
        return this.a;
    }

    @Override // defpackage.easy
    public final /* synthetic */ boolean b() {
        return easx.a(this);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eatb) && ffkj.e(this.a, ((eatb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DelegatedGaia(obfuscatedGaiaId=" + this.a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
    }
}
