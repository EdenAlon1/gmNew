package defpackage;

import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbvd implements dtqq {
    public static final bbvd a = new bbvd();
    public static final Map b = ffew.h(new ffcf(c("message_id"), d("message_id")), new ffcf(c("replied_to_message_id"), d("replied_to_message_id")), new ffcf(c("replied_to_message_id_null_reason"), d("replied_to_message_id_null_reason")), new ffcf(c("replied_to_rcs_message_id"), d("replied_to_rcs_message_id")));

    private bbvd() {
    }

    private static final bbul c(String str) {
        dtry[] a2 = bbux.a();
        for (int i = 0; i < 4; i++) {
            dtry dtryVar = a2[i];
            String d = dtryVar.d();
            if (ffkj.e(d != null ? ffpc.D(d, '.', d) : null, str)) {
                dtryVar.getClass();
                return (bbul) dtryVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    private static final buff d(String str) {
        dtry[] a2 = bufq.a();
        for (int i = 0; i < 4; i++) {
            dtry dtryVar = a2[i];
            String d = dtryVar.d();
            if (ffkj.e(d != null ? ffpc.D(d, '.', d) : null, str)) {
                dtryVar.getClass();
                return (buff) dtryVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // defpackage.dtqq
    public final void a() {
        String[] strArr = bbvc.a;
        bbut bbutVar = new bbut();
        bbutVar.f("clearBackupTable");
        bbutVar.e();
        bbutVar.b().b();
    }

    @Override // defpackage.dtqq
    public final void b() {
        String[] strArr = bbvc.a;
        dtvx dtvxVar = new dtvx("message_replies_backup", "backup");
        dtvxVar.d = 5;
        Map map = b;
        bbul[] bbulVarArr = (bbul[]) map.keySet().toArray(new bbul[0]);
        dtvxVar.b((dtry[]) Arrays.copyOf(bbulVarArr, bbulVarArr.length));
        String[] strArr2 = bufy.a;
        bufs bufsVar = new bufs(bufy.a);
        bufsVar.r();
        buff[] buffVarArr = (buff[]) map.values().toArray(new buff[0]);
        bufsVar.c((buff[]) Arrays.copyOf(buffVarArr, buffVarArr.length));
        dtvxVar.c = bufsVar.b();
        dtvxVar.a().a();
    }
}
