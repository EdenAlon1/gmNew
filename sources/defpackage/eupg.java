package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.appindexing.internal.Thing;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eupg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<eupg> CREATOR = new eupb();
    public final boolean a;
    public final int b;
    public final String c;
    public final Bundle d;
    public final Bundle e;

    public eupg(boolean z, int i, String str, Bundle bundle, Bundle bundle2) {
        this.a = z;
        this.b = i;
        this.c = str;
        this.d = bundle == null ? new Bundle() : bundle;
        bundle2 = bundle2 == null ? new Bundle() : bundle2;
        this.e = bundle2;
        ClassLoader classLoader = getClass().getClassLoader();
        emyw.e(classLoader);
        bundle2.setClassLoader(classLoader);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eupg)) {
            return false;
        }
        eupg eupgVar = (eupg) obj;
        if (dfwq.a(Boolean.valueOf(this.a), Boolean.valueOf(eupgVar.a))) {
            if (dfwq.a(Integer.valueOf(this.b), Integer.valueOf(eupgVar.b)) && dfwq.a(this.c, eupgVar.c) && Thing.c(this.d, eupgVar.d) && Thing.c(this.e, eupgVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Integer.valueOf(this.b), this.c, Integer.valueOf(Thing.a(this.d)), Integer.valueOf(Thing.a(this.e))});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("worksOffline: ");
        sb.append(this.a);
        sb.append(", score: ");
        sb.append(this.b);
        if (!this.c.isEmpty()) {
            sb.append(", accountEmail: ");
            sb.append(this.c);
        }
        if (!this.d.isEmpty()) {
            sb.append(", Properties { ");
            Thing.b(this.d, sb);
            sb.append("}");
        }
        if (!this.e.isEmpty()) {
            sb.append(", embeddingProperties { ");
            Thing.b(this.e, sb);
            sb.append("}");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int a = dfxk.a(parcel);
        dfxk.d(parcel, 1, z);
        dfxk.i(parcel, 2, this.b);
        dfxk.m(parcel, 3, this.c, false);
        dfxk.p(parcel, 4, this.d);
        dfxk.p(parcel, 5, this.e);
        dfxk.c(parcel, a);
    }
}
