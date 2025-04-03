package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.InitializeP2pConversationTrainingAction;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class baft implements bbck {
    public final ffbr a;

    public baft(ffbr ffbrVar) {
        ffbrVar.getClass();
        this.a = ffbrVar;
    }

    @Override // defpackage.bbck
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final InitializeP2pConversationTrainingAction c(Parcel parcel) {
        Optional optional = (Optional) this.a.b();
        optional.getClass();
        parcel.getClass();
        return new InitializeP2pConversationTrainingAction(optional, parcel);
    }
}
