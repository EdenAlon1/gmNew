package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.diagnostics.DumpDatabaseAction;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aceo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((DumpDatabaseAction.a) ctba.a(DumpDatabaseAction.a.class)).E().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DumpDatabaseAction[i];
    }
}
