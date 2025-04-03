package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ryz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ryz> CREATOR = new rza();
    public final engw a;
    public final engw b;

    public ryz(List list, List list2) {
        this.a = engw.n(list);
        this.b = engw.n(list2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        engw engwVar = this.a;
        int a = dfxk.a(parcel);
        dfxk.D(parcel, 1, engwVar);
        dfxk.D(parcel, 2, this.b);
        dfxk.c(parcel, a);
    }
}
