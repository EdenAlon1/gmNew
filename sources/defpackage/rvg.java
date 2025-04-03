package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rvg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<rvg> CREATOR = new rvh();
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public rvg(String str, String str2, int i, int i2, int i3, int i4) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rvg)) {
            return false;
        }
        rvg rvgVar = (rvg) obj;
        return this.c == rvgVar.c && this.d == rvgVar.d && Objects.equals(this.a, rvgVar.a) && this.e == rvgVar.e && this.f == rvgVar.f;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f));
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.b("name", this.a);
        b.b("modelName", this.b);
        b.f(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, this.c);
        b.f("variant", this.d);
        b.f("id", this.e);
        b.f(BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.VERSION, this.f);
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.m(parcel, 2, this.b, false);
        dfxk.i(parcel, 3, this.c);
        dfxk.i(parcel, 4, this.d);
        dfxk.i(parcel, 5, this.e);
        dfxk.i(parcel, 6, this.f);
        dfxk.c(parcel, a);
    }
}
