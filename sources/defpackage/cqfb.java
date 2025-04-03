package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqfb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cqfc b;
    final /* synthetic */ cqey c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqfb(ffgu ffguVar, cqfc cqfcVar, cqey cqeyVar) {
        super(2, ffguVar);
        this.b = cqfcVar;
        this.c = cqeyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cqfb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                cqfc.a.m("Start processing batches.");
                cqfs cqfsVar = (cqfs) this.b.b.b();
                Object b = this.b.c.b();
                b.getClass();
                this.a = 1;
                if (cqfsVar.b((cqel) b, this) == ffhhVar) {
                    return ffhhVar;
                }
            }
            return ceyt.i();
        } catch (cqfg unused) {
            csjb c = cqfc.a.c();
            c.I("Work Organizer requested a delay before retrying this batch");
            c.r();
            cqey cqeyVar = this.c;
            cetp cetpVar = new cetp();
            Object e = cpze.j.e();
            e.getClass();
            cetpVar.c = Duration.ofMillis(((Number) e).longValue());
            return ceyt.j(engw.r(ceyr.h("forward_sync_engine", cqeyVar, cetpVar.a())));
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cqfb cqfbVar = new cqfb(ffguVar, this.b, this.c);
        cqfbVar.d = obj;
        return cqfbVar;
    }
}
