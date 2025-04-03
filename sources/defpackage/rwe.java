package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rwe extends AbstractSafeParcelable implements SafeParcelable {
    public static final Parcelable.Creator<rwe> CREATOR = new rwf();
    public final List a;
    public final rwh b;
    public final List c;

    public rwe(List list, rwh rwhVar, List list2) {
        this.a = list;
        this.b = rwhVar;
        this.c = list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = dfxk.a(parcel);
        dfxk.D(parcel, 1, list);
        dfxk.k(parcel, 2, this.b, i, false);
        dfxk.n(parcel, 3, this.c, false);
        dfxk.c(parcel, a);
    }
}
