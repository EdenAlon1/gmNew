package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eatd implements easy {
    public static final Parcelable.Creator<eatd> CREATOR = new eatc();
    public final String a;
    public final long b;

    public eatd(String str, long j) {
        str.getClass();
        this.a = str;
        this.b = j;
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
        if (!(obj instanceof eatd)) {
            return false;
        }
        eatd eatdVar = (eatd) obj;
        return ffkj.e(this.a, eatdVar.a) && this.b == eatdVar.b;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        long j = this.b;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "Fitbit(fitbitEncodedId=" + this.a + ", fitbitDecodedId=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeLong(this.b);
    }
}
