package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpyn extends ceut {
    private final Context a;
    private final ffbr b;
    private final ffbr c;

    public cpyn(Context context, ffbr ffbrVar, ffbr ffbrVar2) {
        this.a = context;
        this.b = ffbrVar;
        this.c = ffbrVar2;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cevc a = cpze.a();
        cetx l = cety.l();
        l.c(((Integer) cpze.a.e()).intValue());
        l.b(a);
        if (cevc.FOREGROUND_SERVICE.equals(a)) {
            ((ceti) l).b = ((cins) this.b.b()).c(this.a.getString(R.string.forward_sync_foreground_notification_text));
        }
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("ForwardSyncBatchWorkItemHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return cpyp.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        final cpyp cpypVar = (cpyp) eyhsVar;
        final cpyk cpykVar = (cpyk) this.c.b();
        if (((Boolean) ((cfup) coxg.a.get()).e()).booleanValue()) {
            cpyk.a.p("Legacy Forward Sync cannot start: sync redesign is enabled.");
            ((cqcl) cpykVar.n.b()).b(cpzf.b(cpypVar.i), eqqd.REDESIGN_ENABLED_DURING_EXECUTION);
            return elfo.e(ceyt.i());
        }
        if (!((auwy) cpykVar.s.b()).a() || ((ctud) cpykVar.r.b()).k()) {
            return ((coxg) cpykVar.j.b()).d().h(new emwl() { // from class: cpyi
                /* JADX WARN: Removed duplicated region for block: B:61:0x03bd  */
                /* JADX WARN: Removed duplicated region for block: B:64:0x0430  */
                @Override // defpackage.emwl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object apply(java.lang.Object r48) {
                    /*
                        Method dump skipped, instructions count: 2181
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.cpyi.apply(java.lang.Object):java.lang.Object");
                }
            }, cpykVar.b);
        }
        cpyk.a.p("Legacy Forward Sync cannot start: missing permissions.");
        return elfo.e(ceyt.k());
    }
}
