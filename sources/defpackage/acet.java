package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.diagnostics.LogTelephonyDatabaseAction;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acet implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((LogTelephonyDatabaseAction.a) ctba.a(LogTelephonyDatabaseAction.a.class)).F().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LogTelephonyDatabaseAction[i];
    }
}
