package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rvs implements SafeParcelable {
    public static final Parcelable.Creator<rvs> CREATOR = new rvt();
    public final String a;
    public final rwh b;

    public rvs(String str, rwh rwhVar) {
        this.a = str;
        this.b = rwhVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rvs)) {
            return false;
        }
        rvs rvsVar = (rvs) obj;
        return Objects.equals(this.a, rvsVar.a) && Objects.equals(this.b, rvsVar.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.k(parcel, 2, this.b, i, false);
        dfxk.c(parcel, a);
    }
}
