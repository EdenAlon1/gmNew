package defpackage;

import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcgi implements dtqq {
    public static final bcgi a = new bcgi();
    private static final Map b = ffew.h(new ffcf(c("token"), d("token")), new ffcf(c("address_type"), d("address_type")), new ffcf(c("phone_number"), d("phone_number")), new ffcf(c("display_name"), d("display_name")));

    private bcgi() {
    }

    private static final bcfr c(String str) {
        dtry[] a2 = bcgc.a();
        for (int i = 0; i < 4; i++) {
            dtry dtryVar = a2[i];
            String d = dtryVar.d();
            if (ffkj.e(d != null ? ffpc.D(d, '.', d) : null, str)) {
                dtryVar.getClass();
                return (bcfr) dtryVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    private static final aznp d(String str) {
        dtry[] a2 = azob.a();
        for (int i = 0; i < 7; i++) {
            dtry dtryVar = a2[i];
            String d = dtryVar.d();
            if (ffkj.e(d != null ? ffpc.D(d, '.', d) : null, str)) {
                dtryVar.getClass();
                return (aznp) dtryVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // defpackage.dtqq
    public final void a() {
        String[] strArr = bcgh.a;
        bcfz bcfzVar = new bcfz();
        bcfzVar.f("clearBackupTable");
        bcfzVar.e();
        bcfzVar.b().b();
    }

    @Override // defpackage.dtqq
    public final void b() {
        String[] strArr = bcgh.a;
        dtvx dtvxVar = new dtvx("my_identities_backup", "backup");
        dtvxVar.d = 5;
        Map map = b;
        bcfr[] bcfrVarArr = (bcfr[]) map.keySet().toArray(new bcfr[0]);
        dtvxVar.b((dtry[]) Arrays.copyOf(bcfrVarArr, bcfrVarArr.length));
        azod a2 = azoi.a();
        a2.r();
        aznp[] aznpVarArr = (aznp[]) map.values().toArray(new aznp[0]);
        aznp[] aznpVarArr2 = (aznp[]) Arrays.copyOf(aznpVarArr, aznpVarArr.length);
        int intValue = azoi.c().intValue();
        for (aznp aznpVar : aznpVarArr2) {
            if (((Integer) azoi.b.getOrDefault(aznpVar.toString(), -1)).intValue() > intValue) {
                dtub.w("columnReference.toString()", intValue);
            }
        }
        a2.m(aznpVarArr2);
        dtvxVar.c = a2.b();
        dtvxVar.a().a();
    }
}
