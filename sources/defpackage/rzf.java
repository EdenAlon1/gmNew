package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rzf extends AbstractSafeParcelable implements SafeParcelable {
    public static final Parcelable.Creator<rzf> CREATOR = new rzg();
    public final engw a;
    public final rwh b;
    public final float c;

    public rzf(List list, rwh rwhVar, float f) {
        this.a = engw.n(list);
        this.b = rwhVar;
        this.c = f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        engw engwVar = this.a;
        int a = dfxk.a(parcel);
        dfxk.n(parcel, 1, engwVar, false);
        dfxk.k(parcel, 2, this.b, i, false);
        dfxk.h(parcel, 3, this.c);
        dfxk.c(parcel, a);
    }
}
