package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.GetOrCreateConversationAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bafp extends bbeq {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;

    public bafp(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        this.a = ffbrVar;
        ffbrVar2.getClass();
        this.b = ffbrVar2;
        ffbrVar3.getClass();
        this.c = ffbrVar3;
        ffbrVar4.getClass();
        this.d = ffbrVar4;
    }

    @Override // defpackage.bbeq
    public final /* bridge */ /* synthetic */ Action a(Optional optional, List list, boolean z, String str, axad axadVar) {
        cqoh cqohVar = (cqoh) this.a.b();
        cqohVar.getClass();
        errl errlVar = (errl) this.d.b();
        errlVar.getClass();
        optional.getClass();
        return new GetOrCreateConversationAction(cqohVar, this.b, this.c, errlVar, optional, list, z, str, axadVar);
    }

    @Override // defpackage.bbck
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        cqoh cqohVar = (cqoh) this.a.b();
        cqohVar.getClass();
        errl errlVar = (errl) this.d.b();
        errlVar.getClass();
        parcel.getClass();
        return new GetOrCreateConversationAction(cqohVar, this.b, this.c, errlVar, parcel);
    }
}
