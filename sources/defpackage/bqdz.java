package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqdz extends duav {
    @Override // defpackage.duav
    public final /* synthetic */ duap a() {
        return new bqdy(this);
    }

    public final void b(Function... functionArr) {
        Object apply;
        bqdz[] bqdzVarArr = new bqdz[2];
        for (int i = 0; i < 2; i++) {
            Function function = functionArr[i];
            String[] strArr = bqea.a;
            apply = function.apply(new bqdz());
            bqdzVarArr[i] = (bqdz) apply;
        }
        ar(bqdzVarArr);
    }

    public final void c(long j) {
        aq(new dtwe("backup_id_map.status", 1, Long.valueOf(j)));
    }

    public final void d(long... jArr) {
        aq(new dtrw("backup_id_map.status", 3, enkr.g(dtub.p(jArr, Long.class), new emwl() { // from class: duau
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return String.valueOf((Long) obj);
            }
        }), true));
    }

    public final void e(dtzj dtzjVar) {
        aq(new dtru("backup_id_map.table_name", 1, dtzjVar));
    }

    public final void f(String str) {
        aq(new dtrt("backup_id_map.table_name", 1, str));
    }

    public final void g() {
        aq(new dtrx("backup_id_map.table_name", 5));
    }
}
