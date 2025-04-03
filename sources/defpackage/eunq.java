package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eunq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<eunq> CREATOR = new eunr();
    public final String a;
    public final boolean b;

    public eunq(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.d(parcel, 2, this.b);
        dfxk.c(parcel, a);
    }
}
