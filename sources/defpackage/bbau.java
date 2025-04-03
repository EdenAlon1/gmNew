package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.UploadAttachmentsToBlobstoreAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbau implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((UploadAttachmentsToBlobstoreAction.a) ctba.a(UploadAttachmentsToBlobstoreAction.a.class)).bv().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new UploadAttachmentsToBlobstoreAction[i];
    }
}
