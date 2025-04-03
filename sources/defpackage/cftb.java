package defpackage;

import j$.time.Instant;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cftb extends ffhv implements ffjm {
    final /* synthetic */ cftc a;
    final /* synthetic */ eiks b;
    final /* synthetic */ esop c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cftb(cftc cftcVar, eiks eiksVar, esop esopVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cftcVar;
        this.b = eiksVar;
        this.c = esopVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cftb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        dtuu dtuuVar = (dtuu) this.a.d.b();
        final cftc cftcVar = this.a;
        final eiks eiksVar = this.b;
        final esop esopVar = this.c;
        dtuuVar.d("IncomingSessionNotificationHandler", new Runnable() { // from class: cfta
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                cftc cftcVar2;
                final eiks eiksVar2 = eiksVar;
                final String str = ((awui) eiksVar2.c.e().get()).d;
                str.getClass();
                String[] strArr = bszm.a;
                bszh bszhVar = new bszh(bszm.a);
                bszhVar.z("IncomingSessionNotificationHandler.createEmergencySessionsTableQuery");
                bszhVar.c(new Function() { // from class: cfsy
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bszl bszlVar = (bszl) obj2;
                        bszlVar.b(str);
                        bszlVar.c(aplf.a);
                        return bszlVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                engw y = bszhVar.b().y();
                y.getClass();
                ArrayList arrayList = new ArrayList();
                enqv it = y.iterator();
                while (true) {
                    cftcVar2 = cftc.this;
                    if (!it.hasNext()) {
                        break;
                    }
                    E next = it.next();
                    if (((bsyh) next).m().isAfter(((cqoh) cftcVar2.e.b()).f())) {
                        arrayList.add(next);
                    }
                }
                if (arrayList.size() > 1) {
                    throw new IllegalStateException("Multiple EmergencySessionsTable entries returned.");
                }
                if (arrayList.isEmpty()) {
                    enrr enrrVar = (enrr) cftc.a.j();
                    enrrVar.Y(csux.E, eiksVar2.c.j());
                    ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/emergency/session/IncomingSessionNotificationHandler$onMessageReceived$1", "invokeSuspend$lambda$3", 86, "IncomingSessionNotificationHandler.kt")).q("Received an emergency SessionNotification when there are no active sessions.");
                    return;
                }
                String str2 = ((awui) eiksVar2.c.e().get()).d;
                str2.getClass();
                Instant n = ((bsyh) ffdx.K(arrayList)).n();
                n.getClass();
                long j = cftcVar2.b ? cftcVar2.c : esopVar.b;
                ffbr ffbrVar = cftcVar2.e;
                aplf aplfVar = aplf.a;
                Instant plusMillis = ((cqoh) ffbrVar.b()).f().plusMillis(j);
                plusMillis.getClass();
                apko.b(new apkn(str2, aplfVar, j, n, plusMillis)).q(new Function() { // from class: cfsz
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bszl bszlVar = (bszl) obj2;
                        bszlVar.b(((awui) eiks.this.c.e().get()).d);
                        bszlVar.c(aplf.a);
                        return bszlVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
            }
        });
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cftb(this.a, this.b, this.c, ffguVar);
    }
}
