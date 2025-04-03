package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpgo implements dpgr {
    public static final Parcelable.Creator<dpgo> CREATOR = new dpgm();
    public final dpgl a;
    public final boolean b;
    public final Integer c;
    public final String d;
    public final int e;
    public final int f;

    public dpgo(dpgl dpglVar, int i, int i2, boolean z, Integer num, String str) {
        dpglVar.getClass();
        this.a = dpglVar;
        this.e = i;
        this.f = i2;
        this.b = z;
        this.c = num;
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpgo)) {
            return false;
        }
        dpgo dpgoVar = (dpgo) obj;
        return this.a == dpgoVar.a && this.e == dpgoVar.e && this.f == dpgoVar.f && this.b == dpgoVar.b && ffkj.e(this.c, dpgoVar.c) && ffkj.e(this.d, dpgoVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.c;
        int hashCode2 = (((((((hashCode + this.e) * 31) + this.f) * 31) + (true != this.b ? 1237 : 1231)) * 31) + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.d;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "InApp(layout=" + this.a + ", facing=" + ((Object) dpgk.a(this.e)) + ", orientation=" + ((Object) dpgn.a(this.f)) + ", isFlashOn=" + this.b + ", previewViewId=" + this.c + ", effectId=" + this.d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int intValue;
        parcel.getClass();
        parcel.writeString(this.a.name());
        parcel.writeString(dpgk.a(this.e));
        parcel.writeString(dpgn.a(this.f));
        parcel.writeInt(this.b ? 1 : 0);
        Integer num = this.c;
        if (num == null) {
            intValue = 0;
        } else {
            parcel.writeInt(1);
            intValue = num.intValue();
        }
        parcel.writeInt(intValue);
        parcel.writeString(this.d);
    }

    public /* synthetic */ dpgo(dpgl dpglVar, int i, int i2, boolean z, Integer num, String str, int i3) {
        this(dpglVar, i, i2, z, (i3 & 16) != 0 ? null : num, (i3 & 32) != 0 ? null : str);
    }
}
