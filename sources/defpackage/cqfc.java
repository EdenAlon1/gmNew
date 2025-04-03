package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqfc extends ceut {
    public static final cskc a = cskc.g("Bugle", "PwqForwardSyncEngineWorkItemHandler");
    public final ffbr b;
    public final ffbr c;
    private final ffbr d;
    private final ffsk e;
    private final Context f;

    public cqfc(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, cqoh cqohVar, cqew cqewVar, ffsk ffskVar, Context context) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        cqohVar.getClass();
        cqewVar.getClass();
        ffskVar.getClass();
        context.getClass();
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = ffskVar;
        this.f = context;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cevc a2 = cpze.a();
        cetx l = cety.l();
        Object e = cpze.a.e();
        e.getClass();
        l.c(((Number) e).intValue());
        l.b(a2);
        ((ceti) l).b = ((cins) this.d.b()).c(this.f.getString(R.string.forward_sync_foreground_notification_text));
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("PwqForwardSyncEngineWorkItemHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        eyhz parserForType = cqey.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.ceut
    public final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        cqey cqeyVar = (cqey) eyhsVar;
        cqeyVar.getClass();
        ffhe ffheVar = ffhe.a;
        ffsm ffsmVar = ffsm.a;
        return axol.a(ffra.b(this.e, ekxi.a(ffheVar), ffsmVar, new cqfb(null, this, cqeyVar)));
    }
}
