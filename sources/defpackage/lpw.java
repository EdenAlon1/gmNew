package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lpw implements Comparator<lpv>, Parcelable {
    public static final Parcelable.Creator<lpw> CREATOR = new lpt();
    public final String a;
    public final int b;
    private final lpv[] c;
    private int d;

    public lpw(Parcel parcel) {
        this.a = parcel.readString();
        lpv[] lpvVarArr = (lpv[]) parcel.createTypedArray(lpv.CREATOR);
        int i = lvf.a;
        this.c = lpvVarArr;
        this.b = lpvVarArr.length;
    }

    public final lpv a(int i) {
        return this.c[i];
    }

    public final lpw b(String str) {
        int i = lvf.a;
        return Objects.equals(this.a, str) ? this : new lpw(str, false, this.c);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(lpv lpvVar, lpv lpvVar2) {
        lpv lpvVar3 = lpvVar;
        lpv lpvVar4 = lpvVar2;
        return lpn.a.equals(lpvVar3.a) ? !lpn.a.equals(lpvVar4.a) ? 1 : 0 : lpvVar3.a.compareTo(lpvVar4.a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            lpw lpwVar = (lpw) obj;
            String str = this.a;
            String str2 = lpwVar.a;
            int i = lvf.a;
            if (Objects.equals(str, str2) && Arrays.equals(this.c, lpwVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        String str = this.a;
        int hashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.c);
        this.d = hashCode;
        return hashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeTypedArray(this.c, 0);
    }

    public lpw(String str, boolean z, lpv... lpvVarArr) {
        this.a = str;
        lpvVarArr = z ? (lpv[]) lpvVarArr.clone() : lpvVarArr;
        this.c = lpvVarArr;
        this.b = lpvVarArr.length;
        Arrays.sort(lpvVarArr, this);
    }
}
