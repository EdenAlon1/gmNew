package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtbt implements dtbu {
    public static final Parcelable.Creator<dtbt> CREATOR = new dtbs();
    public final List a;
    public final dszr b;
    public final String c;
    private final drxd d;

    public dtbt(List list, dszr dszrVar, String str) {
        list.getClass();
        dszrVar.getClass();
        this.a = list;
        this.b = dszrVar;
        this.c = str;
        this.d = null;
    }

    public static /* synthetic */ dtbt a(dtbt dtbtVar, List list, dszr dszrVar, int i) {
        if ((i & 1) != 0) {
            list = dtbtVar.a;
        }
        if ((i & 2) != 0) {
            dszrVar = dtbtVar.b;
        }
        String str = dtbtVar.c;
        drxd drxdVar = dtbtVar.d;
        list.getClass();
        dszrVar.getClass();
        return new dtbt(list, dszrVar, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dtbt)) {
            return false;
        }
        dtbt dtbtVar = (dtbt) obj;
        if (!ffkj.e(this.a, dtbtVar.a) || this.b != dtbtVar.b || !ffkj.e(this.c, dtbtVar.c)) {
            return false;
        }
        drxd drxdVar = dtbtVar.d;
        return ffkj.e(null, null);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        String str = this.c;
        return ((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31;
    }

    public final String toString() {
        return "ScreenWithSearch(screens=" + this.a + ", currentCategory=" + this.b + ", currentSearchTerm=" + this.c + ", configuration=null)";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        List list = this.a;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((dtbl) it.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.b.name());
        parcel.writeString(this.c);
    }

    public /* synthetic */ dtbt(List list, dszr dszrVar, String str, int i) {
        this(list, (i & 2) != 0 ? ((dtbl) ffdx.K(list)).a : dszrVar, (i & 4) != 0 ? null : str);
    }
}
