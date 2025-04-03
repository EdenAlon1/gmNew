package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rvw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<rvw> CREATOR = new rvx();
    public final String a;
    public final int b;
    public final float c;

    public rvw(String str, int i, float f) {
        this.a = str;
        this.b = i;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rvw)) {
            return false;
        }
        rvw rvwVar = (rvw) obj;
        return this.a.equals(rvwVar.a) && this.b == rvwVar.b && this.c == rvwVar.c;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), Float.valueOf(this.c));
    }

    public final String toString() {
        return "Category{categoryName='" + this.a + "', index=" + this.b + ", score=" + this.c + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.i(parcel, 2, this.b);
        dfxk.h(parcel, 3, this.c);
        dfxk.c(parcel, a);
    }
}
