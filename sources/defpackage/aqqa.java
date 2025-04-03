package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqqa implements bdqg {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/api/messaging/recipient/sync/ParticipantContactUpdater");
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    private final ffbr e;

    public aqqa(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        this.e = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.d = ffbrVar4;
    }

    @Override // defpackage.bdqg
    public final ekzz a() {
        return eleg.f("ParticipantContactUpdater#afterParticipantInserted");
    }

    @Override // defpackage.bdqg
    public final void c(String str, ParticipantsTable.BindData bindData, boolean z) {
        String T;
        String N;
        if (z || bindData.u() <= -1 || (T = bindData.T()) == null || ffpc.J(T) || (N = bindData.N()) == null || ffpc.J(N)) {
            return;
        }
        Object b = this.e.b();
        b.getClass();
        axol.m((ffsk) b, new aqpz(this, str, bindData, null));
    }

    @Override // defpackage.bdqg
    public final /* synthetic */ void b(String str) {
    }
}
