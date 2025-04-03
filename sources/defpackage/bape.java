package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.RebuildShortcutsAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bape implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((RebuildShortcutsAction.a) ctba.a(RebuildShortcutsAction.a.class)).mo163if().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RebuildShortcutsAction[i];
    }
}
