package defpackage;

import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bckl implements bcjz {
    private static final enru b = enru.c("com/google/android/apps/messaging/shared/datamodel/backup/restore/DefaultBatchedRestoreTableWriterWorkflowSteps");
    public final bckb a;
    private final bcjn c;
    private final ffbr d;
    private final Map e;
    private final Map f;
    private final Set g;
    private final int h;

    public /* synthetic */ bckl(bcjn bcjnVar, bckb bckbVar, ffbr ffbrVar, Map map, Map map2, Set set, int i, int i2) {
        map2 = (i2 & 16) != 0 ? ffem.a : map2;
        set = (i2 & 32) != 0 ? ffen.a : set;
        i = (i2 & 64) != 0 ? 2 : i;
        ffbrVar.getClass();
        map.getClass();
        map2.getClass();
        set.getClass();
        if (i == 0) {
            throw null;
        }
        this.c = bcjnVar;
        this.a = bckbVar;
        this.d = ffbrVar;
        this.e = map;
        this.f = map2;
        this.g = set;
        this.h = i;
    }

    private final dtyx h(dtyx dtyxVar, bqdi... bqdiVarArr) {
        String[] strArr = bqea.a;
        bqdv bqdvVar = new bqdv(bqea.a);
        if (bqdiVarArr.length == 0 || this.h == 1) {
            bqdvVar.u();
        } else {
            bqdvVar.c((bqdi[]) Arrays.copyOf(bqdiVarArr, 1));
        }
        bqdvVar.d(new Function() { // from class: bcki
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqdz bqdzVar = (bqdz) obj;
                bqdzVar.c(1L);
                bqdzVar.f(bckl.this.a.d());
                return bqdzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        dtvy i = dtvz.i(bqdvVar.b(), bqea.c.c, this.c.a());
        ((dtrd) i).e = "batch_limiter";
        return dtyxVar.j(i);
    }

    @Override // defpackage.bcjz
    public final int a() {
        String[] strArr = bqea.a;
        bqdv bqdvVar = new bqdv(bqea.a);
        bqdvVar.z("totalRowsToProcess");
        bqdvVar.d(new Function() { // from class: bckj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqdz bqdzVar = (bqdz) obj;
                bqdzVar.c(0L);
                bqdzVar.f(bckl.this.a.d());
                return bqdzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return bqdvVar.b().i();
    }

    @Override // defpackage.bcjz
    public final void b(dtyx dtyxVar) {
        if (dtyxVar == null) {
            bcjn bcjnVar = this.c;
            dtyx b2 = bcjnVar.b();
            b2.u();
            b2.n(new dtzq("$V", new Object[]{bcjnVar.a()}), "backup_id");
            dtyxVar = b2;
        }
        dtyxVar.n(new dtzq("-1", new Object[0]), "bugle_id");
        bcjs.a(dtyxVar, this.a.b(), 0L, 4);
    }

    @Override // defpackage.bcjz
    public final void c() {
        int a;
        int i = 0;
        for (dtyx dtyxVar : (Iterable) this.d.b()) {
            int i2 = ffqe.a;
            long b2 = ffqe.b();
            a = bcjs.a(h(dtyxVar, new bqdi[0]), this.a.b(), -1L, 5);
            long b3 = ffqf.b(b2);
            ensk e = b.e();
            e.Y(ente.a, "BugleBackup");
            ((enrr) e.h("com/google/android/apps/messaging/shared/datamodel/backup/restore/DefaultBatchedRestoreTableWriterWorkflowSteps", "findAndMarkDuplicates", 134, "DefaultBatchedRestoreTableWriterWorkflowSteps.kt")).K("[%s] Duplicate query [%s] found [%s] dupes in [%d] ms", this.a.d(), Integer.valueOf(i), Integer.valueOf(a), Long.valueOf(ffpw.g(b3)));
            i++;
        }
    }

    @Override // defpackage.bcjz
    public final void d() {
        bcjn bcjnVar = this.c;
        dtyx b2 = bcjnVar.b();
        if (this.e.isEmpty()) {
            b2.u();
        } else {
            b2 = bcjnVar.c(b2, ffdx.ak(this.e.keySet()));
        }
        dtyx h = h(b2, bqea.c.d);
        for (ffes ffesVar : ffdx.I(this.g)) {
            bckm bckmVar = (bckm) ffesVar.b;
            if (bckmVar.d) {
                h.F(bcjs.c(bckmVar.a, bckmVar.c, "fk_map_" + ffesVar.a, true, 8));
            } else {
                h.j(bcjs.c(bckmVar.a, bckmVar.c, "fk_map_" + ffesVar.a, false, 24));
            }
        }
        for (Map.Entry entry : this.f.entrySet()) {
            h.n((dtzj) entry.getValue(), String.valueOf(((dtry) entry.getKey()).d()).concat("_expression"));
        }
        dtyq b3 = h.b();
        dtvx c = this.a.c();
        fffs fffsVar = new fffs((byte[]) null);
        fffsVar.addAll(this.e.values());
        if (this.h == 2) {
            fffsVar.add(this.c.a());
        }
        Set set = this.g;
        ArrayList arrayList = new ArrayList(ffdx.n(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((bckm) it.next()).b);
        }
        fffsVar.addAll(arrayList);
        fffsVar.addAll(this.f.keySet());
        dtry[] dtryVarArr = (dtry[]) ffdx.a(fffsVar).toArray(new dtry[0]);
        c.b((dtry[]) Arrays.copyOf(dtryVarArr, dtryVarArr.length));
        c.c = b3;
        int a = c.a().a();
        ensk e = b.e();
        e.Y(ente.a, "BugleBackup");
        ((enrr) e.h("com/google/android/apps/messaging/shared/datamodel/backup/restore/DefaultBatchedRestoreTableWriterWorkflowSteps", "performBugleInsert", 206, "DefaultBatchedRestoreTableWriterWorkflowSteps.kt")).B("[%s] Inserted [%d] rows.", this.a.d(), a);
    }

    @Override // defpackage.bcjz
    public final void f() {
        Object apply;
        String[] strArr = bqea.a;
        bqdx bqdxVar = new bqdx();
        bqdxVar.ap("updateBatchStatusToWritten");
        apply = new Function() { // from class: bckk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqdz bqdzVar = (bqdz) obj;
                bqdzVar.c(1L);
                bqdzVar.f(bckl.this.a.d());
                return bqdzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(new bqdz());
        bqdxVar.af(new bqdy((bqdz) apply));
        bqdxVar.a.put("status", (Long) 2L);
        bqdxVar.b().e();
    }

    @Override // defpackage.bcjz
    public final void g(int i, dtzj dtzjVar) {
        long a = this.a.a();
        if (dtzjVar == null) {
            final String d = this.a.d();
            bckn bcknVar = bckf.a;
            String[] strArr = bqea.a;
            bqdv bqdvVar = new bqdv(bqea.a);
            bqdh bqdhVar = bqea.c;
            bqdvVar.c(bqdhVar.c, bqdhVar.a);
            bqdvVar.B(bqea.c.a);
            bqdvVar.d(new Function() { // from class: bckc
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bqdz bqdzVar = (bqdz) obj;
                    bckn bcknVar2 = bckf.a;
                    bqdzVar.f(d);
                    bqdzVar.c(0L);
                    return bqdzVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bqdvVar.x(i);
            dtzjVar = bqdvVar.b();
        }
        bcjs.b(new dtzq("WITH batch AS $V SELECT batch.backup_id AS backup_id, $V + $R AS bugle_id, $V AS table_name, $V AS status FROM batch", new Object[]{dtzjVar, Long.valueOf(a), this.h + (-1) != 1 ? "ROW_NUMBER() OVER ()" : "ROW_NUMBER() OVER (ORDER BY _id)", this.a.d(), 1L}), 5);
    }

    @Override // defpackage.bcjz
    public final /* synthetic */ void e() {
    }
}
