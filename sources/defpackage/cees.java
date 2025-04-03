package defpackage;

import j$.util.DesugarDate;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cees extends ffhv implements ffjm {
    final /* synthetic */ ceet a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cees(ffgu ffguVar, ceet ceetVar) {
        super(2, ffguVar);
        this.a = ceetVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cees) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        cfba a = cfbf.a();
        a.z("ForwardSyncPauseLatch#isLatched");
        cfae cfaeVar = cfbf.c;
        boolean z = false;
        a.c(cfaeVar.e, cfaeVar.j);
        final ceet ceetVar = this.a;
        a.e(new Function() { // from class: ceer
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                cfbe cfbeVar = (cfbe) obj2;
                int intValue = cfbf.c().intValue();
                if (intValue < 41030) {
                    dtub.w("queue", intValue);
                }
                ceet ceetVar2 = ceet.this;
                cfbeVar.aq(new dtrt("work_queue.queue", 11, "cms_restore_page%"));
                cfbeVar.e(DesugarDate.from(ceetVar2.a.f()));
                return cfbeVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        a.B(new dtzq("MAX(timestamp,minimum_start_time) DESC", new Object[0]));
        a.x(1);
        dtsu o = a.b().o();
        try {
            cfag cfagVar = (cfag) o;
            if (cfagVar.moveToNext()) {
                long max = Math.max(cfagVar.c(), cfagVar.g().getTime());
                long epochMilli = ceetVar.a.f().toEpochMilli();
                Object e = ceetVar.b.e();
                e.getClass();
                if (max > epochMilli - ((Number) e).longValue()) {
                    z = true;
                }
            }
            ffig.a(o, null);
            return Boolean.valueOf(z);
        } finally {
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cees ceesVar = new cees(ffguVar, this.a);
        ceesVar.b = obj;
        return ceesVar;
    }
}
