package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcol {
    public static final bcax a(boolean z) {
        Object apply;
        Object apply2;
        if (z) {
            return f(bxnz.c);
        }
        bcax a = bcba.a();
        a.u();
        a.n(new dtzq("$V", new Object[]{bcba.c.a}), "backup_id");
        a.n(new dtzq("$V{J:bugle_messages}", new Object[]{MessagesTable.c.a}), "bugle_id");
        bcax c = c(a, new ffji() { // from class: bcnz
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                buxo buxoVar = (buxo) obj;
                buxoVar.getClass();
                bvvn e = ParticipantsTable.e();
                e.u();
                dtvy i = dtvz.i(e.b(), ParticipantsTable.c.a, MessagesTable.c.c);
                ((dtrd) i).e = "bugle_participant";
                return (buxo) buxoVar.j(i);
            }
        }, new ffji() { // from class: bcoa
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                buxo buxoVar = (buxo) obj;
                buxoVar.getClass();
                String[] strArr = bxpb.a;
                bxoy bxoyVar = new bxoy(bxpb.a);
                bxoyVar.z("joinWithRestoreScratchForDestinationSuffix");
                bxoyVar.c(new Function() { // from class: bcog
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bxpa bxpaVar = (bxpa) obj2;
                        bxpaVar.b(byyn.a);
                        return bxpaVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                dtvy i = dtvz.i(bxoyVar.b(), bxpb.b.b, MessagesTable.c.c);
                ((dtrd) i).e = "bugle_suffix_scratch";
                return (buxo) buxoVar.j(i);
            }
        });
        bcje a2 = bcjh.a();
        a2.u();
        dtvy i = dtvz.i(a2.b(), bcjh.c.a, bcba.c.h);
        ((dtrd) i).e = "backup_participant";
        bcax bcaxVar = (bcax) c.j(i);
        String[] strArr = bxpb.a;
        bxoy bxoyVar = new bxoy(bxpb.a);
        bxoyVar.z("joinWithRestoreScratchForDestinationSuffix");
        bxoyVar.c(new Function() { // from class: bcny
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bxpa bxpaVar = (bxpa) obj;
                bxpaVar.b(byyn.b);
                return bxpaVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        dtvy i2 = dtvz.i(bxoyVar.b(), bxpb.b.b, bcba.c.h);
        ((dtrd) i2).e = "backup_suffix_scratch";
        bcax bcaxVar2 = (bcax) bcaxVar.j(i2);
        bcaz bcazVar = new bcaz();
        Function[] functionArr = {new Function() { // from class: bcoe
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bcaz bcazVar2 = (bcaz) obj;
                bcazVar2.as(new dtzq("$V{J:backup_suffix_scratch} = $V{J:bugle_suffix_scratch}", new Object[]{bxpb.b.c, bxpb.b.c}));
                return bcazVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: bcof
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bcaz bcazVar2 = (bcaz) obj;
                bcazVar2.as(new dtzq("$V{J:backup_participant} = 1 AND  $V{J:bugle_participant} <> -2", new Object[]{bcjh.c.h, ParticipantsTable.c.d}));
                return bcazVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }};
        bcaz[] bcazVarArr = new bcaz[2];
        for (int i3 = 0; i3 < 2; i3++) {
            apply2 = functionArr[i3].apply(new bcaz());
            bcazVarArr[i3] = (bcaz) apply2;
        }
        bcazVar.ar(bcazVarArr);
        bcaxVar2.d(bcazVar);
        apply = new Function() { // from class: bcob
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bcaz bcazVar2 = (bcaz) obj;
                int intValue = bcba.c().intValue();
                if (intValue < 0) {
                    dtub.w("received_timestamp", intValue);
                }
                bcazVar2.aq(new dtwe("messages_backup.received_timestamp", 7, 0L));
                return bcazVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(new bcaz());
        bcaxVar2.k(new bcay((bcaz) apply));
        return bcaxVar2;
    }

    public static final bcax b(boolean z) {
        if (z) {
            return f(bxnz.b);
        }
        bcax a = bcba.a();
        a.u();
        a.n(new dtzq("$V", new Object[]{bcba.c.a}), "backup_id");
        a.n(new dtzq("$V{J:bugle_messages}", new Object[]{MessagesTable.c.a}), "bugle_id");
        bcax c = c(a, new ffji() { // from class: bcod
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                buxo buxoVar = (buxo) obj;
                buxoVar.getClass();
                bwdf c2 = PartsTable.c();
                c2.u();
                dtvy i = dtvz.i(c2.b(), PartsTable.d.b, MessagesTable.c.a);
                ((dtrd) i).e = "bugle_parts";
                return (buxo) buxoVar.j(i);
            }
        });
        bcdp a2 = bcds.a();
        a2.u();
        a2.c(new Function() { // from class: bcoj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bcdr bcdrVar = (bcdr) obj;
                bcdrVar.b();
                return bcdrVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        dtvy i = dtvz.i(a2.b(), bcds.c.b, bcba.c.a);
        ((dtrd) i).e = "backup_parts";
        bcax bcaxVar = (bcax) c.j(i);
        bcaz bcazVar = new bcaz();
        bcazVar.as(new dtzq("$V{J:backup_parts} = $V{J:bugle_parts}", new Object[]{bcds.c.e, PartsTable.d.c}));
        bcaxVar.d(bcazVar);
        return bcaxVar;
    }

    public static final bcax c(bcax bcaxVar, ffji... ffjiVarArr) {
        buxo e = e();
        for (ffji ffjiVar : ffjiVarArr) {
            ffjiVar.invoke(e);
        }
        dtvy i = dtvz.i(e.b(), MessagesTable.c.i, bcba.c.m);
        ((dtrd) i).e = "bugle_messages";
        return (bcax) bcaxVar.j(i);
    }

    public static final bcax d(bcax bcaxVar, buun buunVar, bbzh bbzhVar) {
        dtvy i = dtvz.i(e().b(), buunVar, bbzhVar);
        ((dtrd) i).e = "bugle_messages";
        return (bcax) bcaxVar.j(i);
    }

    public static final buxo e() {
        buxo d = MessagesTable.d();
        d.z("messagesTableQueryBuilder");
        d.u();
        String[] strArr = bqea.a;
        bqdv bqdvVar = new bqdv(bqea.a);
        bqdvVar.u();
        bqdvVar.d(new Function() { // from class: bcoc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqdz bqdzVar = (bqdz) obj;
                bqdzVar.b(new Function() { // from class: bcoh
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bqdz bqdzVar2 = (bqdz) obj2;
                        bqdzVar2.aq(new dtwe("backup_id_map.status", 2, 2L));
                        return bqdzVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: bcoi
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bqdz bqdzVar2 = (bqdz) obj2;
                        bqdzVar2.aq(new dtrx("backup_id_map.status", 5));
                        return bqdzVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                return bqdzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bqdu b = bqdvVar.b();
        bqdi bqdiVar = bqea.c.d;
        buun buunVar = MessagesTable.c.a;
        bqdz bqdzVar = new bqdz();
        bqdzVar.f(bckf.b.a);
        d.F(b.s(bqdiVar, buunVar, new bqdy(bqdzVar)));
        return d;
    }

    private static final bcax f(final bxnz bxnzVar) {
        bcax a = bcba.a();
        a.z("queryScratchTableForPrecomputedDuplicates");
        a.u();
        a.n(new dtzq("$V", new Object[]{bcba.c.a}), "backup_id");
        a.n(new dtzq("$V{J:scratch_duplicates}", new Object[]{bxny.b.c}), "bugle_id");
        bxnv bxnvVar = new bxnv(bxny.a);
        bxnvVar.u();
        bxnvVar.c(new Function() { // from class: bcok
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bxnx bxnxVar = (bxnx) obj;
                bxnxVar.b(bxnz.this);
                return bxnxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        dtvy i = dtvz.i(bxnvVar.b(), bxny.b.b, bcba.c.a);
        ((dtrd) i).e = "scratch_duplicates";
        return (bcax) a.j(i);
    }
}
