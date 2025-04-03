package defpackage;

import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbry implements dtqq {
    public static final bbry a = new bbry();
    public static final Map b = ffew.h(new ffcf(c("message_id"), d("message_id")), new ffcf(c("caption"), d("caption")));

    private bbry() {
    }

    private static final bbrj c(String str) {
        dtry[] a2 = bbrs.a();
        for (int i = 0; i < 2; i++) {
            dtry dtryVar = a2[i];
            String d = dtryVar.d();
            if (ffkj.e(d != null ? ffpc.D(d, '.', d) : null, str)) {
                dtryVar.getClass();
                return (bbrj) dtryVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    private static final bttx d(String str) {
        dtry[] a2 = btug.a();
        for (int i = 0; i < 2; i++) {
            dtry dtryVar = a2[i];
            String d = dtryVar.d();
            if (ffkj.e(d != null ? ffpc.D(d, '.', d) : null, str)) {
                dtryVar.getClass();
                return (bttx) dtryVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // defpackage.dtqq
    public final void a() {
        String[] strArr = bbrx.a;
        bbrp bbrpVar = new bbrp();
        bbrpVar.f("clearBackupTable");
        bbrpVar.e();
        bbrpVar.b().b();
    }

    @Override // defpackage.dtqq
    public final void b() {
        String[] strArr = bbrx.a;
        dtvx dtvxVar = new dtvx("message_captions_backup", "backup");
        dtvxVar.d = 5;
        Map map = b;
        bbrj[] bbrjVarArr = (bbrj[]) map.keySet().toArray(new bbrj[0]);
        dtvxVar.b((dtry[]) Arrays.copyOf(bbrjVarArr, bbrjVarArr.length));
        String[] strArr2 = btul.a;
        btui btuiVar = new btui(btul.a);
        btuiVar.r();
        bttx[] bttxVarArr = (bttx[]) map.values().toArray(new bttx[0]);
        btuiVar.c((bttx[]) Arrays.copyOf(bttxVarArr, bttxVarArr.length));
        dtvxVar.c = btuiVar.b();
        dtvxVar.a().a();
    }
}
