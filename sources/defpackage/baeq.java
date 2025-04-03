package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ForwardIncomingTypingIndicatorToTachyonAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class baeq implements bbck {
    public final ffbr a;
    public final ffbr b;

    public baeq(ffbr ffbrVar, ffbr ffbrVar2) {
        ffbrVar.getClass();
        this.a = ffbrVar;
        ffbrVar2.getClass();
        this.b = ffbrVar2;
    }

    @Override // defpackage.bbck
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ForwardIncomingTypingIndicatorToTachyonAction c(Parcel parcel) {
        awqj awqjVar = (awqj) this.b.b();
        awqjVar.getClass();
        parcel.getClass();
        return new ForwardIncomingTypingIndicatorToTachyonAction(this.a, awqjVar, parcel);
    }
}
