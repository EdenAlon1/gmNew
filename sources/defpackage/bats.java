package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.RefreshStatefulNotificationsAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bats extends bbfw {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;

    public bats(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        ffbrVar.getClass();
        this.a = ffbrVar;
        ffbrVar2.getClass();
        this.b = ffbrVar2;
        this.c = ffbrVar3;
    }

    @Override // defpackage.bbfw, defpackage.bbck
    /* renamed from: a, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final RefreshStatefulNotificationsAction c(Parcel parcel) {
        cins cinsVar = (cins) this.a.b();
        cinsVar.getClass();
        alrv alrvVar = (alrv) this.b.b();
        alrvVar.getClass();
        csxu csxuVar = (csxu) this.c.b();
        csxuVar.getClass();
        parcel.getClass();
        return new RefreshStatefulNotificationsAction(cinsVar, alrvVar, csxuVar, parcel);
    }

    @Override // defpackage.bbfw
    public final /* bridge */ /* synthetic */ ThrottledAction d(boolean z, boolean z2, boolean z3, ConversationIdType conversationIdType) {
        cins cinsVar = (cins) this.a.b();
        cinsVar.getClass();
        alrv alrvVar = (alrv) this.b.b();
        alrvVar.getClass();
        csxu csxuVar = (csxu) this.c.b();
        csxuVar.getClass();
        conversationIdType.getClass();
        return new RefreshStatefulNotificationsAction(cinsVar, alrvVar, csxuVar, z, z2, z3, conversationIdType);
    }
}
