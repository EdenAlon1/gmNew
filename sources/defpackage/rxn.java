package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j$.util.Objects;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rxn extends AbstractSafeParcelable implements SafeParcelable {
    public static final Parcelable.Creator<rxn> CREATOR = new rxo();
    public final List a;
    public final rwh b;

    public rxn(List list, rwh rwhVar) {
        this.a = list;
        this.b = rwhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rxn)) {
            return false;
        }
        rxn rxnVar = (rxn) obj;
        return Objects.equals(this.a, rxnVar.a) && Objects.equals(this.b, rxnVar.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = dfxk.a(parcel);
        dfxk.n(parcel, 1, list, false);
        dfxk.k(parcel, 2, this.b, i, false);
        dfxk.c(parcel, a);
    }
}
