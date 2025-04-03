package defpackage;

import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bblo implements dtqq {
    public static final bblo a = new bblo();
    public static final Map b = ffew.h(new ffcf(c("_id"), d("_id")), new ffcf(c("conversation_id"), d("conversation_id")), new ffcf(c("pin_status"), d("pin_status")));

    private bblo() {
    }

    private static final bbkx c(String str) {
        dtry[] a2 = bbli.a();
        for (int i = 0; i < 3; i++) {
            dtry dtryVar = a2[i];
            String d = dtryVar.d();
            if (ffkj.e(d != null ? ffpc.D(d, '.', d) : null, str)) {
                dtryVar.getClass();
                return (bbkx) dtryVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    private static final brxs d(String str) {
        dtry[] a2 = bryc.a();
        for (int i = 0; i < 3; i++) {
            dtry dtryVar = a2[i];
            String d = dtryVar.d();
            if (ffkj.e(d != null ? ffpc.D(d, '.', d) : null, str)) {
                dtryVar.getClass();
                return (brxs) dtryVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // defpackage.dtqq
    public final void a() {
        String[] strArr = bbln.a;
        bble bbleVar = new bble();
        bbleVar.f("clearBackupTable");
        bbleVar.e();
        bbleVar.b().b();
    }

    @Override // defpackage.dtqq
    public final void b() {
        String[] strArr = bbln.a;
        dtvx dtvxVar = new dtvx("conversation_pins_backup", "backup");
        dtvxVar.d = 5;
        Map map = b;
        bbkx[] bbkxVarArr = (bbkx[]) map.keySet().toArray(new bbkx[0]);
        dtvxVar.b((dtry[]) Arrays.copyOf(bbkxVarArr, bbkxVarArr.length));
        String[] strArr2 = bryh.a;
        brye bryeVar = new brye(bryh.a);
        bryeVar.r();
        brxs[] brxsVarArr = (brxs[]) map.values().toArray(new brxs[0]);
        bryeVar.c((brxs[]) Arrays.copyOf(brxsVarArr, brxsVarArr.length));
        dtvxVar.c = bryeVar.b();
        dtvxVar.a().a();
    }
}
