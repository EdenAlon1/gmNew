package defpackage;

import com.google.android.apps.messaging.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yxi extends ffhv implements ffjm {
    int a;
    final /* synthetic */ yxj b;
    final /* synthetic */ ffji c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yxi(yxj yxjVar, ffji ffjiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = yxjVar;
        this.c = ffjiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yxi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            yxj yxjVar = this.b;
            this.a = 1;
            obj = fgbj.a(yxjVar.d, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        final engw engwVar = (engw) obj;
        if (engwVar.isEmpty()) {
            ensk e = yxj.a.e();
            e.Y(ente.a, "BugleComposeRow2");
            ((enrr) e.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/sim/ActiveSimChecker$check$1", "invokeSuspend", 52, "ActiveSimChecker.kt")).q("No active self identities, not showing SIM picker dialog");
            return ffcu.a;
        }
        if (engwVar.size() == 1) {
            ensk h = yxj.a.h();
            h.Y(ente.a, "BugleComposeRow2");
            ((enrr) h.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/sim/ActiveSimChecker$check$1", "invokeSuspend", 59, "ActiveSimChecker.kt")).B("Automatically switching SIM to id: %s, subId: %s", ((aqux) ffdx.T(engwVar)).g(), ((aqux) ffdx.T(engwVar)).b());
            ffji ffjiVar = this.c;
            Object T = ffdx.T(engwVar);
            T.getClass();
            ffjiVar.invoke(T);
            return ffcu.a;
        }
        if (!this.b.f.compareAndSet(false, true)) {
            ensk e2 = yxj.a.e();
            e2.Y(ente.a, "BugleComposeRow2");
            ((enrr) e2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/sim/ActiveSimChecker$check$1", "invokeSuspend", 69, "ActiveSimChecker.kt")).q("Already displaying SIM picker dialog");
            return ffcu.a;
        }
        ensk e3 = yxj.a.e();
        e3.Y(ente.a, "BugleComposeRow2");
        ((enrr) e3.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/sim/ActiveSimChecker$check$1", "invokeSuspend", 73, "ActiveSimChecker.kt")).r("Displaying SIM picker dialog with %d subscriptions", engwVar.size());
        final yxj yxjVar2 = this.b;
        final ffji ffjiVar2 = this.c;
        yxjVar2.e.d(false, new ffji() { // from class: yxh
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                final ajiy ajiyVar = (ajiy) obj2;
                ajiyVar.getClass();
                final yxj yxjVar3 = yxj.this;
                String string = yxjVar3.c.getString(R.string.sim_dialog_picker_title);
                string.getClass();
                engw engwVar2 = engwVar;
                ArrayList arrayList = new ArrayList(ffdx.n(engwVar2, 10));
                int i2 = 0;
                for (Object obj3 : engwVar2) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        ffdx.l();
                    }
                    final aqux aquxVar = (aqux) obj3;
                    char c = ffol.c(i3);
                    int color = aquxVar.a() == 0 ? yxjVar3.c.getColor(R.color.sim_icon_text_color) : doxi.a(yxjVar3.c, aquxVar.a());
                    final ffji ffjiVar3 = ffjiVar2;
                    doie doieVar = new doie(c, color);
                    String string2 = yxjVar3.c.getString(R.string.sim_dialog_picker_row_text, aquxVar.o(), Integer.valueOf(i3));
                    string2.getClass();
                    arrayList.add(new dnjg(doieVar, string2, aquxVar.n(), new ffix() { // from class: yxg
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            ajiy.this.a();
                            yxjVar3.f.set(false);
                            ensk h2 = yxj.a.h();
                            h2.Y(ente.a, "BugleComposeRow2");
                            enrr enrrVar = (enrr) h2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/sim/ActiveSimChecker", "showSimDialog$lambda$2$lambda$1$lambda$0", 113, "ActiveSimChecker.kt");
                            aqux aquxVar2 = aquxVar;
                            enrrVar.B("Switching SIM from mSim dialog to id: %s, subId: %s", aquxVar2.g(), aquxVar2.b());
                            aquxVar2.getClass();
                            ffjiVar3.invoke(aquxVar2);
                            return ffcu.a;
                        }
                    }));
                    i2 = i3;
                }
                return new dmvi(string, arrayList, null, null, null, null, null, 124);
            }
        });
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new yxi(this.b, this.c, ffguVar);
    }
}
