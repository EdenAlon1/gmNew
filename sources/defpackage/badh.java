package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.DeleteConversationAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class badh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((badi) ((DeleteConversationAction.a) ctba.a(DeleteConversationAction.a.class)).aS()).c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DeleteConversationAction[i];
    }
}
