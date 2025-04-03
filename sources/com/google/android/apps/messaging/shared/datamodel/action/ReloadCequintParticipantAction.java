package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import defpackage.batt;
import defpackage.bbfx;
import defpackage.bcpy;
import defpackage.bcpz;
import defpackage.bczy;
import defpackage.bdqu;
import defpackage.bvpo;
import defpackage.carb;
import defpackage.cbfs;
import defpackage.csjb;
import defpackage.cskc;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.enru;
import defpackage.eogt;
import defpackage.ffbr;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ReloadCequintParticipantAction extends Action<Void> implements Parcelable {
    private final Context b;
    private final bcpz c;
    private final bbfx d;
    private final ffbr e;
    private final cbfs f;
    private static final cskc a = cskc.g("Bugle", "ReloadCequintParticipantAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new batt();

    /* compiled from: PG */
    public interface a {
        bbfx bn();
    }

    public ReloadCequintParticipantAction(Context context, bcpz bcpzVar, bbfx bbfxVar, ffbr ffbrVar, cbfs cbfsVar, Parcel parcel) {
        super(parcel, eogt.RELOAD_CEQUINT_PARTICIPANT_ACTION);
        this.b = context;
        this.c = bcpzVar;
        this.d = bbfxVar;
        this.e = ffbrVar;
        this.f = cbfsVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("ReloadCequintParticipantAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        String W;
        bcpy a2;
        String l = this.t.l("participant_id");
        if (l == null) {
            a.p("Empty id.");
            return null;
        }
        enru enruVar = bdqu.a;
        ParticipantsTable.BindData b = ParticipantsTable.b(l);
        if (b == null) {
            a.p("Empty participant.");
            return null;
        }
        if (!this.c.b(this.b) || (a2 = this.c.a(this.b, (W = b.W()))) == null) {
            return null;
        }
        if (!a2.d) {
            if (TextUtils.isEmpty(a2.a)) {
                return null;
            }
            bvpo C = b.C();
            C.u(a2.a);
            C.t(a2.a);
            C.R(a2.c);
            C.N(a2.b);
            C.l(-4L);
            this.f.b(C.a());
            ((bczy) this.e.b()).R(l);
            return null;
        }
        int a3 = this.t.a("try_count");
        if (a3 <= 0) {
            this.t.v("participant_id", b.S());
            this.t.r("try_count", 1);
            this.d.a(b).y(115, TimeUnit.SECONDS.toMillis(10L));
            return null;
        }
        csjb c = a.c();
        c.I("Can't get info from Cequint after");
        c.G(a3 + 1);
        c.I("tries for");
        c.D("address", W);
        c.r();
        bvpo C2 = b.C();
        C2.l(-2L);
        this.f.b(C2.a());
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ReloadCequintParticipant.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public ReloadCequintParticipantAction(Context context, ffbr<carb> ffbrVar, bcpz bcpzVar, bbfx bbfxVar, ffbr<bczy> ffbrVar2, cbfs cbfsVar, ParticipantsTable.BindData bindData) {
        super(eogt.RELOAD_CEQUINT_PARTICIPANT_ACTION);
        this.b = context;
        this.c = bcpzVar;
        this.d = bbfxVar;
        this.e = ffbrVar2;
        this.f = cbfsVar;
        this.t.v("participant_id", bindData.S());
    }
}
