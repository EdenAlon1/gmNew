package defpackage;

import j$.time.Duration;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajyx extends ffhv implements ffjm {
    final /* synthetic */ ajza a;
    final /* synthetic */ eqza b;
    final /* synthetic */ UUID c;
    final /* synthetic */ Duration d;
    final /* synthetic */ int e;
    final /* synthetic */ int f;
    final /* synthetic */ int g;
    final /* synthetic */ eqyv h;
    final /* synthetic */ akdb i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajyx(ajza ajzaVar, eqza eqzaVar, UUID uuid, Duration duration, int i, int i2, int i3, eqyv eqyvVar, akdb akdbVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = ajzaVar;
        this.b = eqzaVar;
        this.c = uuid;
        this.d = duration;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = eqyvVar;
        this.i = akdbVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajyx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        eqyx a;
        ffci.b(obj);
        ensk h = ajza.a.h();
        h.Y(ente.a, "BugleBackup");
        enrr enrrVar = (enrr) h;
        enrrVar.W(10, TimeUnit.SECONDS);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/restore/analytics/RestoreEventLogger$logCompleteEvent$1", "invokeSuspend", 129, "RestoreEventLogger.kt")).q("Logging restore complete event to clearcut");
        eqyy eqyyVar = (eqyy) eqzb.a.createBuilder();
        eqyyVar.getClass();
        eqyo.b(this.b, eqyyVar);
        eqyo.d(cqjf.a(this.c), eqyyVar);
        eqzc eqzcVar = (eqzc) eqzd.a.createBuilder();
        eqzcVar.getClass();
        eyev a2 = eykn.a(this.d);
        eqzcVar.copyOnWrite();
        eqzd eqzdVar = (eqzd) eqzcVar.instance;
        eqzdVar.c = a2;
        eqzdVar.b |= 1;
        eyfy build = eqzcVar.build();
        build.getClass();
        eqyyVar.copyOnWrite();
        eqzb eqzbVar = (eqzb) eqyyVar.instance;
        eqzbVar.d = (eqzd) build;
        eqzbVar.c = 5;
        eyfq builder = eqyo.a(eqyyVar).toBuilder();
        builder.getClass();
        eqyy eqyyVar2 = (eqyy) builder;
        Duration duration = this.d;
        long millis = duration.toMillis();
        int i = this.g;
        eqyv eqyvVar = this.h;
        if (millis == 0) {
            eqyw eqywVar = (eqyw) eqyx.a.createBuilder();
            eqywVar.getClass();
            eqyn.c(cptn.a(i), eqywVar);
            if (eqyvVar != null) {
                eqyn.b(eqyvVar, eqywVar);
            }
            a = eqyn.a(eqywVar);
        } else {
            int i2 = this.f;
            int i3 = this.e;
            eqyw eqywVar2 = (eqyw) eqyx.a.createBuilder();
            eqywVar2.getClass();
            int b = ajza.b(i3, duration);
            eqywVar2.copyOnWrite();
            eqyx eqyxVar = (eqyx) eqywVar2.instance;
            eqyxVar.b |= 1;
            eqyxVar.c = b;
            int b2 = ajza.b(i2, duration);
            eqywVar2.copyOnWrite();
            eqyx eqyxVar2 = (eqyx) eqywVar2.instance;
            eqyxVar2.b |= 2;
            eqyxVar2.d = b2;
            eqyn.c(cptn.a(i), eqywVar2);
            if (eqyvVar != null) {
                eqyn.b(eqyvVar, eqywVar2);
            }
            a = eqyn.a(eqywVar2);
        }
        eqyyVar2.copyOnWrite();
        eqzb eqzbVar2 = (eqzb) eqyyVar2.instance;
        eqzbVar2.g = a;
        eqzbVar2.b |= 4;
        akdb akdbVar = this.i;
        eqyyVar2.copyOnWrite();
        eqzb eqzbVar3 = (eqzb) eqyyVar2.instance;
        eqzbVar3.h = akdbVar.d;
        eqzbVar3.b |= 8;
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eoluVar.getClass();
        eogy.g(eolt.RESTORE_WORKFLOW_EVENT, eoluVar);
        eogy.h((eqzb) eqyyVar2.build(), eoluVar);
        eyfq builder2 = eogy.a(eoluVar).toBuilder();
        builder2.getClass();
        akxn a3 = ((akyb) this.a.a(true).b()).a();
        a3.d(epyw.RESTORE_WORKFLOW_EVENT);
        a3.j((eolu) builder2, alal.LOG_SPEC_RESTORE_WORKFLOW_EVENTS);
        ensk h2 = ajza.a.h();
        h2.Y(ente.a, "BugleBackup");
        enrr enrrVar2 = (enrr) h2;
        enrrVar2.W(10, TimeUnit.SECONDS);
        ((enrr) enrrVar2.h("com/google/android/apps/messaging/restore/analytics/RestoreEventLogger$logCompleteEvent$1", "invokeSuspend", 152, "RestoreEventLogger.kt")).q("Logged restore complete event to clearcut");
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ajyx(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, ffguVar);
    }
}
