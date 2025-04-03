package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbze {
    public static final cskc a = cskc.g("BugleDataModel", "WorkerDatabaseOperations");
    private static final String e;
    public final cqoh b;
    public final dtuu c;
    public final btke d;

    static {
        String[] strArr = btki.a;
        btjh btjhVar = btki.c;
        e = "NOT EXISTS (SELECT other._id FROM generic_worker_queue AS other WHERE other.in_flight = 1  AND " + btjhVar.b.toString() + " = other.worker_type AND " + btjhVar.c.toString() + " = other.item_table_type AND " + btjhVar.d.toString() + " = other.item_id)";
    }

    public cbze(cqoh cqohVar, dtuu dtuuVar) {
        String[] strArr = btki.a;
        btkf btkfVar = new btkf();
        btkfVar.ap("clearInflightUpdater");
        btkfVar.c(false);
        btkfVar.d(new Function() { // from class: cbzb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                btkh btkhVar = (btkh) obj;
                cskc cskcVar = cbze.a;
                btkhVar.d(true);
                return btkhVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        this.d = btkfVar.b();
        this.b = cqohVar;
        this.c = dtuuVar;
    }

    public final btkh a(int i) {
        dtzr dtzrVar = ((Boolean) cful.aa.e()).booleanValue() ? new dtzr(e) : new dtzr("1");
        String[] strArr = btki.a;
        btkh btkhVar = new btkh();
        btkhVar.d(false);
        btkhVar.i(i);
        btkhVar.as(dtzrVar);
        return btkhVar;
    }

    public final void b() {
        csix.h();
        if (((Boolean) cful.aa.e()).booleanValue()) {
            String[] strArr = btki.a;
            btjx btjxVar = new btjx();
            btjxVar.f("dedupeGenericWorkerQueue");
            btjxVar.a(new Function() { // from class: cbyy
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    btkh btkhVar = (btkh) obj;
                    cskc cskcVar = cbze.a;
                    String[] strArr2 = btki.a;
                    btkhVar.aq(new dtru("generic_worker_queue._id", 3, new dtzr("(SELECT one._id FROM generic_worker_queue AS one INNER JOIN generic_worker_queue AS other  ON one.worker_type = other.worker_type AND one.item_table_type = other.item_table_type AND one.item_id = other.item_id AND one.account_id = other.account_id AND one._id > other._id AND one.in_flight = other.in_flight AND one.flags = other.flags AND other.retry_count < " + bbex.a() + ")")));
                    btkhVar.d(false);
                    return btkhVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int d = btjxVar.d();
            if (d > 0) {
                a.m(a.h(d, "Deduped work items "));
            }
        }
    }
}
