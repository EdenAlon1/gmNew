package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ryp extends AbstractSafeParcelable implements SafeParcelable {
    public static final Parcelable.Creator<ryp> CREATOR = new ryq();
    public final rwh a;

    public ryp(rwh rwhVar) {
        this.a = rwhVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        rwh rwhVar = this.a;
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, rwhVar, i, false);
        dfxk.c(parcel, a);
    }
}
