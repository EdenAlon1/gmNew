package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.SetDittoSessionInactiveAction;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bayc implements bbck {
    private final ffbr a;

    public bayc(ffbr ffbrVar) {
        ffbrVar.getClass();
        this.a = ffbrVar;
    }

    public final SetDittoSessionInactiveAction a() {
        Optional optional = (Optional) this.a.b();
        optional.getClass();
        return new SetDittoSessionInactiveAction(optional);
    }

    @Override // defpackage.bbck
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final SetDittoSessionInactiveAction c(Parcel parcel) {
        Optional optional = (Optional) this.a.b();
        optional.getClass();
        parcel.getClass();
        return new SetDittoSessionInactiveAction(optional, parcel);
    }
}
