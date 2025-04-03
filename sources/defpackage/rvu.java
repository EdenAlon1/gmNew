package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rvu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<rvu> CREATOR = new rvv();
    public final int a;
    public final engw b;
    public final engw c;
    public final boolean d;
    public final boolean e;

    public rvu(int i, List list, List list2, boolean z, boolean z2) {
        this.a = i;
        this.b = engw.n(list);
        this.c = engw.n(list2);
        this.d = z;
        this.e = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, i2);
        dfxk.D(parcel, 2, this.b);
        dfxk.D(parcel, 3, this.c);
        dfxk.d(parcel, 4, this.d);
        dfxk.d(parcel, 5, this.e);
        dfxk.c(parcel, a);
    }
}
