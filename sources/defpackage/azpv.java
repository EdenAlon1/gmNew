package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.HashSet;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class azpv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ azpw b;
    final /* synthetic */ Optional c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azpv(azpw azpwVar, Optional optional, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = azpwVar;
        this.c = optional;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((azpv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            this.a = 1;
            aznq aznqVar = (aznq) azoi.a().b().p(azoi.c.a);
            try {
                engw c = aznqVar.c();
                aznqVar.close();
                c.getClass();
                HashSet V = ffdx.V(c);
                bvvn e = ParticipantsTable.e();
                e.z("MyIdentityForeignKeyUpgrader.upgrade");
                e.h(new Function() { // from class: azpq
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bvvw bvvwVar = (bvvw) obj2;
                        int intValue = ParticipantsTable.i().intValue();
                        if (intValue < 59930) {
                            dtub.w("my_identity_token", intValue);
                        }
                        bvvwVar.aq(new dtrx("participants.my_identity_token", 6));
                        return bvvwVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                e.r();
                enqv it = e.b().y().iterator();
                it.getClass();
                while (it.hasNext()) {
                    ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) it.next();
                    if (V.contains(bindData.A())) {
                        bvvr f = ParticipantsTable.f();
                        f.ap("upgradeupgrade");
                        f.E(bindData.A());
                        f.e(bindData.S());
                    } else {
                        ensk j = azpw.a.j();
                        j.Y(ente.a, "BugleCME");
                        ((enrr) j.h("com/google/android/apps/messaging/shared/core/myidentity/MyIdentityForeignKeyUpgrader", "upgrade", 64, "MyIdentityForeignKeyUpgrader.kt")).D("Skip writing SelfParticipant MyIdentityToken %s to fk column, foreign key does not exist in MyIdentitiesTable: %s", bindData.A(), V);
                    }
                }
                azut a = azuy.a();
                a.z("subscriptions");
                a.c(new Function() { // from class: azpr
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        azux azuxVar = (azux) obj2;
                        azuxVar.b();
                        return azuxVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                enqv it2 = a.b().y().iterator();
                it2.getClass();
                while (it2.hasNext()) {
                    aztp aztpVar = (aztp) it2.next();
                    if (V.contains(aztpVar.e())) {
                        azuv azuvVar = new azuv();
                        azuvVar.e(aztpVar.e());
                        int d = aztpVar.d();
                        azux azuxVar = new azux();
                        azuxVar.d(d);
                        azuvVar.aj(new azuw(azuxVar), "subscriptions-buildAndUpdateForSubId");
                    } else {
                        ensk j2 = azpw.a.j();
                        j2.Y(ente.a, "BugleCME");
                        ((enrr) j2.h("com/google/android/apps/messaging/shared/core/myidentity/MyIdentityForeignKeyUpgrader", "upgrade", 87, "MyIdentityForeignKeyUpgrader.kt")).D("Skip writing Subscription MyIdentityToken %s to fk column, foreign key does not exist in MyIdentitiesTable: %s", aztpVar.e(), V);
                    }
                }
                if (ffcu.a == ffhhVar) {
                    return ffhhVar;
                }
            } catch (Throwable th) {
                try {
                    aznqVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new azpv(this.b, this.c, ffguVar);
    }
}
