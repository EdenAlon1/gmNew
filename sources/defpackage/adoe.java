package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.gaia.signoutaccount.SignOutAccountArguments;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adoe implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new SignOutAccountArguments((eisx) parcel.readParcelable(SignOutAccountArguments.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SignOutAccountArguments[i];
    }
}
