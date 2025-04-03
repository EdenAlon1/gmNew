package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j$.util.Objects;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ryf implements SafeParcelable {
    public static final Parcelable.Creator<ryf> CREATOR = new ryg();
    public final engw a;
    public final rwh b;

    public ryf(List list, rwh rwhVar) {
        this.a = engw.n(list);
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
        if (!(obj instanceof ryf)) {
            return false;
        }
        ryf ryfVar = (ryf) obj;
        return Objects.equals(this.a, ryfVar.a) && Objects.equals(this.b, ryfVar.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        engw engwVar = this.a;
        int a = dfxk.a(parcel);
        dfxk.n(parcel, 1, engwVar, false);
        dfxk.k(parcel, 2, this.b, i, false);
        dfxk.c(parcel, a);
    }
}
