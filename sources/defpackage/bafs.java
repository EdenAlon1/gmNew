package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.InitializeP2pConversationTrainingAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bafs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((InitializeP2pConversationTrainingAction.a) ctba.a(InitializeP2pConversationTrainingAction.a.class)).hP().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new InitializeP2pConversationTrainingAction[i];
    }
}
