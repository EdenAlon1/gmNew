package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rvy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<rvy> CREATOR = new rvz();
    public final int a;
    public final rwh b;

    public rvy(int i, rwh rwhVar) {
        this.a = i;
        this.b = rwhVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, i2);
        dfxk.k(parcel, 2, this.b, i, false);
        dfxk.c(parcel, a);
    }
}
