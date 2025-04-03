package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateMessagePartSizeAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbaj implements bbck {
    public final ffbr a;

    public bbaj(ffbr ffbrVar) {
        ffbrVar.getClass();
        this.a = ffbrVar;
    }

    @Override // defpackage.bbck
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final UpdateMessagePartSizeAction c(Parcel parcel) {
        parcel.getClass();
        return new UpdateMessagePartSizeAction(this.a, parcel);
    }
}
