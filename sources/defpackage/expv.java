package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class expv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<expv> CREATOR = new expw();
    public final String a;
    public final List b;

    public expv(String str, List list) {
        this.a = str;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.n(parcel, 2, this.b, false);
        dfxk.c(parcel, a);
    }
}
