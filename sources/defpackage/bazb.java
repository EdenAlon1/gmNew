package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.SyncTelephonyThreadsAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.actionfactories.SyncTelephonyThreadsActionFactory$SchedulableSyncTelephonyThreadsAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bazb implements bbck {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;

    public bazb(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9) {
        ffbrVar.getClass();
        this.a = ffbrVar;
        ffbrVar2.getClass();
        this.b = ffbrVar2;
        ffbrVar3.getClass();
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
    }

    public final /* bridge */ /* synthetic */ SyncTelephonyThreadsActionFactory$SchedulableSyncTelephonyThreadsAction a(boolean z) {
        covs covsVar = (covs) this.d.b();
        covsVar.getClass();
        clbd clbdVar = (clbd) this.g.b();
        clbdVar.getClass();
        ffbr ffbrVar = this.h;
        ffbr ffbrVar2 = this.i;
        return new SyncTelephonyThreadsAction((ffbr<coxg>) this.a, (ffbr<bdfw>) this.b, (ffbr<cgpv>) this.c, covsVar, (ffbr<cpvq>) this.e, (ffbr<bbfw>) this.f, clbdVar, (ffbr<akxl>) ffbrVar, (ffbr<cqdt>) ffbrVar2, z);
    }

    @Override // defpackage.bbck
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        covs covsVar = (covs) this.d.b();
        covsVar.getClass();
        clbd clbdVar = (clbd) this.g.b();
        clbdVar.getClass();
        parcel.getClass();
        ffbr ffbrVar = this.h;
        ffbr ffbrVar2 = this.i;
        return new SyncTelephonyThreadsAction((ffbr<coxg>) this.a, (ffbr<bdfw>) this.b, (ffbr<cgpv>) this.c, covsVar, (ffbr<cpvq>) this.e, (ffbr<bbfw>) this.f, clbdVar, (ffbr<akxl>) ffbrVar, (ffbr<cqdt>) ffbrVar2, parcel);
    }
}
