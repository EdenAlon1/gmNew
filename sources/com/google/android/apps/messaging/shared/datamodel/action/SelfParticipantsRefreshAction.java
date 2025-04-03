package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction;
import defpackage.aukf;
import defpackage.bavy;
import defpackage.bavz;
import defpackage.cbeq;
import defpackage.ctwb;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.eogt;
import defpackage.ffbr;
import j$.time.Duration;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class SelfParticipantsRefreshAction extends ThrottledAction {
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final aukf e;

    @Deprecated
    private static final long a = TimeUnit.MINUTES.toMillis(2);
    public static final Parcelable.Creator<ThrottledAction> CREATOR = new bavy();

    /* compiled from: PG */
    public interface SelfParticipantsRefreshActionInjector {
        bavz im();
    }

    public SelfParticipantsRefreshAction(ffbr ffbrVar, ffbr ffbrVar2, aukf aukfVar, ffbr ffbrVar3) {
        super(eogt.SELF_PARTICIPANTS_REFRESH_ACTION);
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.e = aukfVar;
        this.d = ffbrVar3;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction, com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("SelfParticipantsRefreshAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.SelfParticipantsRefresh.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final int f() {
        return 105;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final long g() {
        return this.e.a() ? Duration.ofSeconds(((Long) this.d.b()).longValue()).toMillis() : a;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final String h() {
        return "SelfParticipantsRefreshAction";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final void i() {
        ((ctwb) this.c.b()).n();
        ((cbeq) this.b.b()).c();
    }

    public SelfParticipantsRefreshAction(ffbr ffbrVar, ffbr ffbrVar2, aukf aukfVar, ffbr ffbrVar3, Parcel parcel) {
        super(parcel, eogt.SELF_PARTICIPANTS_REFRESH_ACTION);
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.e = aukfVar;
        this.d = ffbrVar3;
    }
}
