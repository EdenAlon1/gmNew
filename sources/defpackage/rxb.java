package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j$.util.Objects;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rxb extends AbstractSafeParcelable implements SafeParcelable {
    public static final Parcelable.Creator<rxb> CREATOR = new rxc();
    public final engw a;
    public final rwh b;

    public rxb(List list, rwh rwhVar) {
        this.a = engw.n(list);
        this.b = rwhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rxb)) {
            return false;
        }
        rxb rxbVar = (rxb) obj;
        return Objects.equals(this.a, rxbVar.a) && Objects.equals(this.b, rxbVar.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        rwh rwhVar = this.b;
        return "MagicRewriteResult{results=" + String.valueOf(this.a) + ", inferenceEventTraceResult=" + String.valueOf(rwhVar) + "}";
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
