package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drju extends drjx {
    public static final Parcelable.Creator<drju> CREATOR = new drjt();
    private final String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drju(String str) {
        super(str);
        str.getClass();
        this.a = str;
    }

    @Override // defpackage.drjx, defpackage.drka
    public final String a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof drju) && ffkj.e(this.a, ((drju) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UnknownAudioFormat(subType=" + this.a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
    }
}
