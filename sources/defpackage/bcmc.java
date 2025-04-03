package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Function$CC;
import java.io.File;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcmc implements bbhx {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/backup/restore/impl/DatabaseRestorerImpl");
    public static final fgjb b = new fgjf();
    public final bbii c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final bbhg g;
    public final atjx h;
    private final bcpp i;
    private final bckx j;
    private final bcml k;
    private final ffsk l;

    public bcmc(bcpp bcppVar, bckx bckxVar, bcml bcmlVar, bbii bbiiVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffsk ffskVar, bbhg bbhgVar, atjx atjxVar) {
        bbiiVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffskVar.getClass();
        bbhgVar.getClass();
        this.i = bcppVar;
        this.j = bckxVar;
        this.k = bcmlVar;
        this.c = bbiiVar;
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.f = ffbrVar3;
        this.l = ffskVar;
        this.g = bbhgVar;
        this.h = atjxVar;
    }

    @Override // defpackage.bbhx
    public final Object a(File file, bckh bckhVar, ffgu ffguVar) {
        ensk h = a.h();
        h.Y(ente.a, "BugleBackup");
        ((enrr) h.h("com/google/android/apps/messaging/shared/datamodel/backup/restore/impl/DatabaseRestorerImpl", "restoreFromBackupDatabase", 59, "DatabaseRestorerImpl.kt")).q("Starting restoreFromBackupDatabase");
        Object a2 = ffra.a(ekxi.a(this.l.hT()), new bclz(null, this, file, bckhVar), ffguVar);
        return a2 == ffhh.a ? a2 : ffcu.a;
    }

    public final void b(bckh bckhVar) {
        final bcpo bcpoVar = new bcpo(this.i.a);
        bckx bckxVar = this.j;
        ffsk ffskVar = (ffsk) bckxVar.c.b();
        ffskVar.getClass();
        final bckw bckwVar = new bckw(bckxVar.a, bckxVar.b, ffskVar);
        bcml bcmlVar = this.k;
        bcnb bcnbVar = (bcnb) bcmlVar.b.b();
        bcnbVar.getClass();
        final bcmk bcmkVar = new bcmk(bcmlVar.a, bcnbVar, bckhVar);
        enru enruVar = a;
        ensk h = enruVar.h();
        h.Y(ente.a, "BugleBackup");
        ((enrr) h.h("com/google/android/apps/messaging/shared/datamodel/backup/restore/impl/DatabaseRestorerImpl", "restoreFromBackupDatabaseInternal", 108, "DatabaseRestorerImpl.kt")).q("Restoring participants table");
        long c = bbhj.c("DatabaseRestorerImpl::restoreFromBackupDatabase#participantsTable", new ffix() { // from class: bclw
            @Override // defpackage.ffix
            public final Object invoke() {
                bcpo bcpoVar2 = bcpo.this;
                bcpoVar2.a.b();
                bcpoVar2.a.c((int) ((Number) this.e.b()).longValue());
                return ffcu.a;
            }
        });
        ensk h2 = enruVar.h();
        h2.Y(ente.a, "BugleBackup");
        ((enrr) h2.h("com/google/android/apps/messaging/shared/datamodel/backup/restore/impl/DatabaseRestorerImpl", "restoreFromBackupDatabaseInternal", 114, "DatabaseRestorerImpl.kt")).s("Participants restore time: [%s]ms", ffpw.g(c));
        ensk h3 = enruVar.h();
        h3.Y(ente.a, "BugleBackup");
        ((enrr) h3.h("com/google/android/apps/messaging/shared/datamodel/backup/restore/impl/DatabaseRestorerImpl", "restoreFromBackupDatabaseInternal", 116, "DatabaseRestorerImpl.kt")).q("Restoring conversations table");
        long c2 = bbhj.c("DatabaseRestorerImpl::restoreFromBackupDatabase#conversationsTable", new ffix() { // from class: bclx
            @Override // defpackage.ffix
            public final Object invoke() {
                bckw bckwVar2 = bckw.this;
                bckwVar2.a.b();
                bckwVar2.a.c((int) ((Number) this.d.b()).longValue());
                ((enrr) bckwVar2.d.h().h("com/google/android/apps/messaging/shared/datamodel/backup/restore/conversations/BatchedConversationsRestoreTableWriter", "postRestore", 51, "BatchedConversationsRestoreTableWriter.kt")).q("Starting participant full refresh");
                axol.k(bckwVar2.c, null, new bckv(bckwVar2, null), 3);
                return ffcu.a;
            }
        });
        ensk h4 = enruVar.h();
        h4.Y(ente.a, "BugleBackup");
        ((enrr) h4.h("com/google/android/apps/messaging/shared/datamodel/backup/restore/impl/DatabaseRestorerImpl", "restoreFromBackupDatabaseInternal", 122, "DatabaseRestorerImpl.kt")).s("Conversations restore time: [%s]ms", ffpw.g(c2));
        ensk h5 = enruVar.h();
        h5.Y(ente.a, "BugleBackup");
        ((enrr) h5.h("com/google/android/apps/messaging/shared/datamodel/backup/restore/impl/DatabaseRestorerImpl", "restoreFromBackupDatabaseInternal", 124, "DatabaseRestorerImpl.kt")).q("Restoring messages table");
        long c3 = bbhj.c("DatabaseRestorerImpl::restoreFromBackupDatabase#messagesTable", new ffix() { // from class: bcly
            @Override // defpackage.ffix
            public final Object invoke() {
                bcmk bcmkVar2 = bcmk.this;
                bcmkVar2.b.b();
                if (bcmkVar2.a.a) {
                    int i = ffqe.a;
                    long b2 = ffqe.b();
                    bcoy.a();
                    String[] strArr = bxqg.a;
                    dtvx dtvxVar = new dtvx("restore_workflow_scratch_timestamps", "$primary");
                    bxpq bxpqVar = bxqg.b;
                    dtvxVar.b(bxpqVar.b, bxpqVar.a, bxpqVar.c, bxpqVar.d);
                    bcax a2 = bcba.a();
                    a2.c(bcba.c.a);
                    a2.n(new dtzq("$V", new Object[]{Integer.valueOf(byyn.b.ordinal())}), "which_database");
                    a2.n(new dtzq("$V/1000", new Object[]{bcba.c.m}), "timestamp_in_seconds");
                    a2.n(new dtzq("$V % 1000", new Object[]{bcba.c.m}), "timestamp_mod_1000");
                    dtvxVar.c = a2.b();
                    dtvxVar.a().a();
                    dtvx dtvxVar2 = new dtvx("restore_workflow_scratch_timestamps", "$primary");
                    dtvxVar2.d = 5;
                    bxpq bxpqVar2 = bxqg.b;
                    dtvxVar2.b(bxpqVar2.b, bxpqVar2.a, bxpqVar2.c, bxpqVar2.d);
                    buxo d = MessagesTable.d();
                    d.c(MessagesTable.c.a);
                    d.n(new dtzq("$V", new Object[]{Integer.valueOf(byyn.a.ordinal())}), "which_database");
                    d.n(new dtzq("$V/1000", new Object[]{MessagesTable.c.i}), "timestamp_in_seconds");
                    d.n(new dtzq("$V % 1000", new Object[]{MessagesTable.c.i}), "timestamp_mod_1000");
                    dtvxVar2.c = d.b();
                    dtvxVar2.a().a();
                    String[] strArr2 = bxpb.a;
                    dtvx dtvxVar3 = new dtvx("restore_workflow_scratch_suffix", "$primary");
                    dtvxVar3.d = 5;
                    bxom bxomVar = bxpb.b;
                    dtvxVar3.b(bxomVar.b, bxomVar.a, bxomVar.c);
                    bcje a3 = bcjh.a();
                    a3.c(bcjh.c.a);
                    a3.n(new dtzq("$V", new Object[]{Integer.valueOf(byyn.b.ordinal())}), "which_database");
                    bcib bcibVar = bcjh.c;
                    bcic bcicVar = bcibVar.h;
                    bcic bcicVar2 = bcibVar.c;
                    a3.n(new dtzq("CASE WHEN $V <> 0 THEN 'self' WHEN $V LIKE '%@%' THEN $V ELSE substr($V, -7) END", new Object[]{bcicVar, bcicVar2, bcicVar2, bcicVar2}), "destination_suffix");
                    dtvxVar3.c = a3.b();
                    dtvxVar3.a().a();
                    dtvx dtvxVar4 = new dtvx("restore_workflow_scratch_suffix", "$primary");
                    bxom bxomVar2 = bxpb.b;
                    dtvxVar4.b(bxomVar2.b, bxomVar2.a, bxomVar2.c);
                    bvvn e = ParticipantsTable.e();
                    e.c(ParticipantsTable.c.a);
                    e.n(new dtzq("$V", new Object[]{Integer.valueOf(byyn.a.ordinal())}), "which_database");
                    bvth bvthVar = ParticipantsTable.c.d;
                    bvth bvthVar2 = ParticipantsTable.c.f;
                    e.n(new dtzq("CASE WHEN $V <> $V THEN 'self'  WHEN $V LIKE '%@%' THEN $V ELSE substr($V, -7) END", new Object[]{bvthVar, -2, bvthVar2, bvthVar2, bvthVar2}), "destination_suffix");
                    dtvxVar4.c = e.b();
                    dtvxVar4.a().a();
                    String[] strArr3 = bxny.a;
                    dtvx dtvxVar5 = new dtvx("restore_workflow_scratch_duplicates", "$primary");
                    bxnj bxnjVar = bxny.b;
                    dtvxVar5.b(bxnjVar.a, bxnjVar.b, bxnjVar.c);
                    bxqd bxqdVar = new bxqd(bxqg.a);
                    bxqdVar.z("truncatedTimestampMatchesQuery");
                    bxqdVar.u();
                    bxqdVar.n(new dtzq("$V", new Object[]{Integer.valueOf(bxnz.a.ordinal())}), "key");
                    bxqdVar.n(new dtzq("$V", new Object[]{bxqg.b.b}), "backup_id");
                    bxqdVar.n(new dtzq("$V{bugle_scratch}", new Object[]{bxqg.b.b}), "bugle_id");
                    bxqdVar.c(new Function() { // from class: bcos
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            Object apply;
                            bxqf bxqfVar = (bxqf) obj;
                            bxqfVar.c(byyn.b);
                            bxqfVar.b();
                            bxqfVar.as(new dtzq("$V + $V{J:bugle_scratch} <> 0", new Object[]{bxqg.b.d, bxqg.b.d}));
                            Function[] functionArr = {new Function() { // from class: bcon
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    bxqf bxqfVar2 = (bxqf) obj2;
                                    bxqfVar2.as(new dtzq("$V = 0", new Object[]{bxqg.b.d}));
                                    return bxqfVar2;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }, new Function() { // from class: bcoo
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    bxqf bxqfVar2 = (bxqf) obj2;
                                    bxqfVar2.as(new dtzq("$V{J:bugle_scratch} = 0", new Object[]{bxqg.b.d}));
                                    return bxqfVar2;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }};
                            bxqf[] bxqfVarArr = new bxqf[2];
                            for (int i2 = 0; i2 < 2; i2++) {
                                apply = functionArr[i2].apply(new bxqf());
                                bxqfVarArr[i2] = (bxqf) apply;
                            }
                            bxqfVar.ar(bxqfVarArr);
                            return bxqfVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bxqd bxqdVar2 = new bxqd(bxqg.a);
                    bxqdVar2.u();
                    bxqdVar2.c(new Function() { // from class: bcot
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bxqf bxqfVar = (bxqf) obj;
                            bxqfVar.b();
                            bxqfVar.c(byyn.a);
                            return bxqfVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bxqc b3 = bxqdVar2.b();
                    bxpr bxprVar = bxqg.b.c;
                    dtvy i2 = dtvz.i(b3, bxprVar, bxprVar);
                    ((dtrd) i2).e = "bugle_scratch";
                    dtvxVar5.c = ((bxqd) bxqdVar.j(i2)).b();
                    dtvxVar5.a().a();
                    dtvx dtvxVar6 = new dtvx("restore_workflow_scratch_duplicates", "$primary");
                    bxnj bxnjVar2 = bxny.b;
                    dtvxVar6.b(bxnjVar2.a, bxnjVar2.b, bxnjVar2.c);
                    bxnv bxnvVar = new bxnv(bxny.a);
                    bxnvVar.c(new Function() { // from class: bcom
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bxnx bxnxVar = (bxnx) obj;
                            bxnxVar.b(bxnz.a);
                            return bxnxVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bxnvVar.u();
                    bxnvVar.n(new dtzq("$V", new Object[]{Integer.valueOf(bxnz.b.ordinal())}), "key");
                    bxnvVar.n(new dtzq("$V", new Object[]{bxny.b.b}), "backup_id");
                    bxnvVar.n(new dtzq("$V", new Object[]{bxny.b.c}), "bugle_id");
                    bwdf c4 = PartsTable.c();
                    c4.u();
                    c4.h(new Function() { // from class: bcop
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bwdm bwdmVar = (bwdm) obj;
                            bwdmVar.u();
                            return bwdmVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    dtvy i3 = dtvz.i(c4.b(), PartsTable.d.b, bxny.b.c);
                    ((dtrd) i3).e = "bugle_parts";
                    bxnv bxnvVar2 = (bxnv) bxnvVar.j(i3);
                    bcdp a4 = bcds.a();
                    a4.u();
                    a4.c(new Function() { // from class: bcoq
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
                    dtvy i4 = dtvz.i(a4.b(), bcds.c.b, bxny.b.b);
                    ((dtrd) i4).e = "backup_parts";
                    bxnv bxnvVar3 = (bxnv) bxnvVar2.j(i4);
                    bxnvVar3.c(new Function() { // from class: bcor
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bxnx bxnxVar = (bxnx) obj;
                            bxnxVar.as(new dtzq("$V{J:bugle_parts} = $V{J:backup_parts}", new Object[]{PartsTable.d.c, bcds.c.e}));
                            return bxnxVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    dtvxVar6.c = bxnvVar3.b();
                    dtvxVar6.a().a();
                    dtvx dtvxVar7 = new dtvx("restore_workflow_scratch_duplicates", "$primary");
                    bxnj bxnjVar3 = bxny.b;
                    dtvxVar7.b(bxnjVar3.a, bxnjVar3.b, bxnjVar3.c);
                    bxnv bxnvVar4 = new bxnv(bxny.a);
                    bxnvVar4.c(new Function() { // from class: bcou
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bxnx bxnxVar = (bxnx) obj;
                            bxnxVar.b(bxnz.a);
                            return bxnxVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bxnvVar4.u();
                    bxnvVar4.n(new dtzq("$V", new Object[]{Integer.valueOf(bxnz.c.ordinal())}), "key");
                    bxnvVar4.n(new dtzq("$V", new Object[]{bxny.b.b}), "backup_id");
                    bxnvVar4.n(new dtzq("$V", new Object[]{bxny.b.c}), "bugle_id");
                    buxo d2 = MessagesTable.d();
                    d2.u();
                    bxoy bxoyVar = new bxoy(bxpb.a);
                    bxoyVar.u();
                    bxoyVar.c(new Function() { // from class: bcov
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bxpa bxpaVar = (bxpa) obj;
                            bxpaVar.b(byyn.a);
                            return bxpaVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    dtvy i5 = dtvz.i(bxoyVar.b(), bxpb.b.b, MessagesTable.c.c);
                    ((dtrd) i5).e = "bugle_destination_suffix";
                    dtvy i6 = dtvz.i(((buxo) d2.j(i5)).b(), MessagesTable.c.a, bxny.b.c);
                    ((dtrd) i6).e = "bugle_messages";
                    bxnv bxnvVar5 = (bxnv) bxnvVar4.j(i6);
                    bcax a5 = bcba.a();
                    a5.u();
                    bxoy bxoyVar2 = new bxoy(bxpb.a);
                    bxoyVar2.u();
                    bxoyVar2.c(new Function() { // from class: bcow
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
                    dtvy i7 = dtvz.i(bxoyVar2.b(), bxpb.b.b, bcba.c.h);
                    ((dtrd) i7).e = "backup_destination_suffix";
                    dtvy i8 = dtvz.i(((bcax) a5.j(i7)).b(), bcba.c.a, bxny.b.b);
                    ((dtrd) i8).e = "backup_messages";
                    bxnv bxnvVar6 = (bxnv) bxnvVar5.j(i8);
                    bxnvVar6.c(new Function() { // from class: bcox
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bxnx bxnxVar = (bxnx) obj;
                            bxnxVar.as(new dtzq("$V{J:bugle_destination_suffix} = $V{J:backup_destination_suffix}", new Object[]{bxpb.b.c, bxpb.b.c}));
                            return bxnxVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    dtvxVar7.c = bxnvVar6.b();
                    dtvxVar7.a().a();
                    long b4 = ffqf.b(b2);
                    ensk f = bcmkVar2.c.f();
                    f.Y(ente.a, "BugleBackup");
                    ((enrr) f.h("com/google/android/apps/messaging/shared/datamodel/backup/restore/messages/BatchedMessageRestoreTableWriter", "preRestore", 73, "BatchedMessageRestoreTableWriter.kt")).C("[%s] precompute work [%s]ms", bckf.b.a, ffpw.g(b4));
                }
                bcmkVar2.b.c((int) ((Number) this.f.b()).longValue());
                if (bcmkVar2.a.a) {
                    ensk h6 = bcmkVar2.c.h();
                    h6.Y(ente.a, "BugleBackup");
                    ((enrr) h6.h("com/google/android/apps/messaging/shared/datamodel/backup/restore/messages/BatchedMessageRestoreTableWriter", "postRestore", 89, "BatchedMessageRestoreTableWriter.kt")).q("Clearing Messages restore scratch data");
                    bcoy.a();
                }
                return ffcu.a;
            }
        });
        ensk h6 = enruVar.h();
        h6.Y(ente.a, "BugleBackup");
        ((enrr) h6.h("com/google/android/apps/messaging/shared/datamodel/backup/restore/impl/DatabaseRestorerImpl", "restoreFromBackupDatabaseInternal", 130, "DatabaseRestorerImpl.kt")).s("Messages restore time: [%s]ms", ffpw.g(c3));
    }
}
