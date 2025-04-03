package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessFileTransferAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bane implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((banf) ((ProcessFileTransferAction.a) ctba.a(ProcessFileTransferAction.a.class)).bf()).c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ProcessFileTransferAction[i];
    }
}
