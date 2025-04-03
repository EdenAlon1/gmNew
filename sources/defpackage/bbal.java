package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateParticipantColorAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbal extends bbfj {
    public final ffbr a;

    public bbal(ffbr ffbrVar) {
        ffbrVar.getClass();
        this.a = ffbrVar;
    }

    @Override // defpackage.bbck
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final UpdateParticipantColorAction c(Parcel parcel) {
        parcel.getClass();
        return new UpdateParticipantColorAction(this.a, parcel);
    }
}
