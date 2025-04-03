package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.RedownloadMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class batq extends bbff {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;
    private final ffbr j;
    private final ffbr k;

    public batq(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11) {
        ffbrVar.getClass();
        this.a = ffbrVar;
        ffbrVar2.getClass();
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        ffbrVar4.getClass();
        this.d = ffbrVar4;
        ffbrVar5.getClass();
        this.e = ffbrVar5;
        ffbrVar6.getClass();
        this.f = ffbrVar6;
        ffbrVar7.getClass();
        this.g = ffbrVar7;
        ffbrVar8.getClass();
        this.h = ffbrVar8;
        ffbrVar9.getClass();
        this.i = ffbrVar9;
        ffbrVar10.getClass();
        this.j = ffbrVar10;
        ffbrVar11.getClass();
        this.k = ffbrVar11;
    }

    @Override // defpackage.bbff
    public final /* bridge */ /* synthetic */ Action a(MessageIdType messageIdType) {
        Context context = (Context) this.a.b();
        context.getClass();
        cqoh cqohVar = (cqoh) this.c.b();
        cqohVar.getClass();
        ayfg ayfgVar = (ayfg) this.d.b();
        ayfgVar.getClass();
        bbgc bbgcVar = (bbgc) this.e.b();
        bbgcVar.getClass();
        bbfw bbfwVar = (bbfw) this.f.b();
        bbfwVar.getClass();
        banu banuVar = (banu) this.g.b();
        banuVar.getClass();
        messageIdType.getClass();
        return new RedownloadMessageAction(context, this.b, cqohVar, ayfgVar, bbgcVar, bbfwVar, banuVar, this.h, this.i, this.j, this.k, messageIdType, false);
    }

    @Override // defpackage.bbff
    public final /* bridge */ /* synthetic */ Action b(MessageIdType messageIdType, boolean z) {
        Context context = (Context) this.a.b();
        context.getClass();
        cqoh cqohVar = (cqoh) this.c.b();
        cqohVar.getClass();
        ayfg ayfgVar = (ayfg) this.d.b();
        ayfgVar.getClass();
        bbgc bbgcVar = (bbgc) this.e.b();
        bbgcVar.getClass();
        bbfw bbfwVar = (bbfw) this.f.b();
        bbfwVar.getClass();
        banu banuVar = (banu) this.g.b();
        banuVar.getClass();
        return new RedownloadMessageAction(context, this.b, cqohVar, ayfgVar, bbgcVar, bbfwVar, banuVar, this.h, this.i, this.j, this.k, messageIdType, true, z);
    }

    @Override // defpackage.bbck
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        Context context = (Context) this.a.b();
        context.getClass();
        cqoh cqohVar = (cqoh) this.c.b();
        cqohVar.getClass();
        ayfg ayfgVar = (ayfg) this.d.b();
        ayfgVar.getClass();
        bbgc bbgcVar = (bbgc) this.e.b();
        bbgcVar.getClass();
        ((bbfw) this.f.b()).getClass();
        banu banuVar = (banu) this.g.b();
        banuVar.getClass();
        parcel.getClass();
        return new RedownloadMessageAction(context, this.b, cqohVar, ayfgVar, bbgcVar, banuVar, this.h, this.i, this.j, this.k, parcel);
    }
}
