package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ParticipantFullRefreshAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class baiv implements bbck {
    private final ffbr a;

    public baiv(ffbr ffbrVar) {
        ffbrVar.getClass();
        this.a = ffbrVar;
    }

    public final /* bridge */ /* synthetic */ Action a() {
        cbeq cbeqVar = (cbeq) this.a.b();
        cbeqVar.getClass();
        return new ParticipantFullRefreshAction(cbeqVar);
    }

    @Override // defpackage.bbck
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        cbeq cbeqVar = (cbeq) this.a.b();
        cbeqVar.getClass();
        parcel.getClass();
        return new ParticipantFullRefreshAction(cbeqVar, parcel);
    }
}
