package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtbl implements Parcelable {
    public static final Parcelable.Creator<dtbl> CREATOR = new dtbk();
    public final dszr a;
    public final dtab b;
    public final ffji c;

    public dtbl(dszr dszrVar, dtab dtabVar, ffji ffjiVar) {
        dszrVar.getClass();
        ffjiVar.getClass();
        this.a = dszrVar;
        this.b = dtabVar;
        this.c = ffjiVar;
    }

    public static /* synthetic */ dtbl a(dtbl dtblVar, dtab dtabVar, ffji ffjiVar, int i) {
        dszr dszrVar = (i & 1) != 0 ? dtblVar.a : null;
        if ((i & 2) != 0) {
            dtabVar = dtblVar.b;
        }
        dszrVar.getClass();
        return new dtbl(dszrVar, dtabVar, ffjiVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dtbl)) {
            return false;
        }
        dtbl dtblVar = (dtbl) obj;
        return this.a == dtblVar.a && ffkj.e(this.b, dtblVar.b) && ffkj.e(this.c, dtblVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        dtab dtabVar = this.b;
        return ((hashCode + (dtabVar == null ? 0 : dtabVar.hashCode())) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "HugoScreenDisplay(category=" + this.a + ", configuration=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a.name());
    }

    public /* synthetic */ dtbl(dszr dszrVar, ffji ffjiVar, int i) {
        this(dszrVar, (dtab) null, (i & 4) != 0 ? new ffji() { // from class: dtbj
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ((Context) obj).getClass();
                return 0;
            }
        } : ffjiVar);
    }
}
