package defpackage;

import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbtq implements dtqq {
    public static final bbtq a = new bbtq();
    public static final Map b = ffew.h(new ffcf(c("_id"), d("_id")), new ffcf(c("message_id"), d("message_id")), new ffcf(c("reactions_data"), d("reactions_data")), new ffcf(c("reacted_message_id"), d("reacted_message_id")), new ffcf(c("reaction"), d("reaction")), new ffcf(c("applied_reaction"), d("applied_reaction")));

    private bbtq() {
    }

    private static final bbsw c(String str) {
        dtry[] a2 = bbtk.a();
        for (int i = 0; i < 6; i++) {
            dtry dtryVar = a2[i];
            String d = dtryVar.d();
            if (ffkj.e(d != null ? ffpc.D(d, '.', d) : null, str)) {
                dtryVar.getClass();
                return (bbsw) dtryVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    private static final budl d(String str) {
        dtry[] a2 = budz.a();
        for (int i = 0; i < 7; i++) {
            dtry dtryVar = a2[i];
            String d = dtryVar.d();
            if (ffkj.e(d != null ? ffpc.D(d, '.', d) : null, str)) {
                dtryVar.getClass();
                return (budl) dtryVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // defpackage.dtqq
    public final void a() {
        String[] strArr = bbtp.a;
        bbtg bbtgVar = new bbtg();
        bbtgVar.f("clearBackupTable");
        bbtgVar.e();
        bbtgVar.b().b();
    }

    @Override // defpackage.dtqq
    public final void b() {
        String[] strArr = bbtp.a;
        dtvx dtvxVar = new dtvx("message_reactions_backup", "backup");
        dtvxVar.d = 5;
        Map map = b;
        bbsw[] bbswVarArr = (bbsw[]) map.keySet().toArray(new bbsw[0]);
        dtvxVar.b((dtry[]) Arrays.copyOf(bbswVarArr, bbswVarArr.length));
        bueb a2 = bueg.a();
        a2.r();
        budl[] budlVarArr = (budl[]) map.values().toArray(new budl[0]);
        a2.c((budl[]) Arrays.copyOf(budlVarArr, budlVarArr.length));
        dtvxVar.c = a2.b();
        dtvxVar.a().a();
    }
}
