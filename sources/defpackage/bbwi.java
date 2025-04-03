package defpackage;

import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbwi implements dtqq {
    public static final bbwi a = new bbwi();
    public static final Map b = ffew.h(new ffcf(c("_id"), d("_id")), new ffcf(c("message_id"), d("message_id")));

    private bbwi() {
    }

    private static final bbvs c(String str) {
        dtry[] a2 = bbwc.a();
        for (int i = 0; i < 2; i++) {
            dtry dtryVar = a2[i];
            String d = dtryVar.d();
            if (ffkj.e(d != null ? ffpc.D(d, '.', d) : null, str)) {
                dtryVar.getClass();
                return (bbvs) dtryVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    private static final bulw d(String str) {
        dtry[] a2 = bumf.a();
        for (int i = 0; i < 2; i++) {
            dtry dtryVar = a2[i];
            String d = dtryVar.d();
            if (ffkj.e(d != null ? ffpc.D(d, '.', d) : null, str)) {
                dtryVar.getClass();
                return (bulw) dtryVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // defpackage.dtqq
    public final void a() {
        String[] strArr = bbwh.a;
        bbvy bbvyVar = new bbvy();
        bbvyVar.f("clearBackupTable");
        bbvyVar.e();
        bbvyVar.b().b();
    }

    @Override // defpackage.dtqq
    public final void b() {
        String[] strArr = bbwh.a;
        dtvx dtvxVar = new dtvx("message_star_backup", "backup");
        dtvxVar.d = 5;
        Map map = b;
        bbvs[] bbvsVarArr = (bbvs[]) map.keySet().toArray(new bbvs[0]);
        dtvxVar.b((dtry[]) Arrays.copyOf(bbvsVarArr, bbvsVarArr.length));
        String[] strArr2 = bumm.a;
        bumh bumhVar = new bumh(bumm.a);
        bumhVar.r();
        bulw[] bulwVarArr = (bulw[]) map.values().toArray(new bulw[0]);
        bumhVar.c((bulw[]) Arrays.copyOf(bulwVarArr, bulwVarArr.length));
        dtvxVar.c = bumhVar.b();
        dtvxVar.a().a();
    }
}
