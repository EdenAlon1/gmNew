package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ryj extends AbstractSafeParcelable implements SafeParcelable {
    public static final Parcelable.Creator<ryj> CREATOR = new ryk();
    public final engw a;
    public final int b;

    public ryj(List list, int i) {
        this.a = engw.n(list);
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        engw engwVar = this.a;
        int a = dfxk.a(parcel);
        dfxk.D(parcel, 1, engwVar);
        dfxk.i(parcel, 2, this.b);
        dfxk.c(parcel, a);
    }
}
