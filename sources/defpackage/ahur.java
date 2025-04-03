package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.multishare.chip.ChipId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahur implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        ChipId.a aVar = (ChipId.a) ctba.a(ChipId.a.class);
        Bundle readBundle = parcel.readBundle(ahuq.class.getClassLoader());
        if (readBundle == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        aolm I = aVar.I();
        Object a = ih.a(readBundle, "identity", eyjv.class);
        if (a != null) {
            return new ChipId.Identity(I.c((eyjv) a));
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ChipId.Identity[i];
    }
}
