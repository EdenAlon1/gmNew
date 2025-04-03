package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ReceiveP2pSuggestionsAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class barq implements bbck {
    public final ffbr a;

    public barq(ffbr ffbrVar) {
        ffbrVar.getClass();
        this.a = ffbrVar;
    }

    @Override // defpackage.bbck
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ReceiveP2pSuggestionsAction c(Parcel parcel) {
        barw barwVar = (barw) this.a.b();
        barwVar.getClass();
        parcel.getClass();
        return new ReceiveP2pSuggestionsAction(barwVar, parcel);
    }
}
