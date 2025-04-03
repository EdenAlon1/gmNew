package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ExpireWapPushSiMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class badx implements bbck {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;

    public badx(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.a = ffbrVar;
        ffbrVar2.getClass();
        this.b = ffbrVar2;
        ffbrVar3.getClass();
        this.c = ffbrVar3;
    }

    public final /* bridge */ /* synthetic */ Action a() {
        cqoh cqohVar = (cqoh) this.a.b();
        cqohVar.getClass();
        badx badxVar = (badx) this.b.b();
        badxVar.getClass();
        badw badwVar = (badw) this.c.b();
        badwVar.getClass();
        return new ExpireWapPushSiMessageAction(cqohVar, badxVar, badwVar);
    }

    @Override // defpackage.bbck
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        cqoh cqohVar = (cqoh) this.a.b();
        cqohVar.getClass();
        badx badxVar = (badx) this.b.b();
        badxVar.getClass();
        badw badwVar = (badw) this.c.b();
        badwVar.getClass();
        parcel.getClass();
        return new ExpireWapPushSiMessageAction(cqohVar, badxVar, badwVar, parcel);
    }
}
