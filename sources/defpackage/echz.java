package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class echz {
    private static final emye b = emye.b('/');
    private static final Pattern c = Pattern.compile("^(\\*[a-z]+\\*).*");
    final ConcurrentHashMap a = new ConcurrentHashMap();

    static String a(String str) {
        List i = b.i(str);
        if (i.size() == 3) {
            return (String) i.get(0);
        }
        ((enrr) ((enrr) ecdj.a.e()).h("com/google/android/libraries/performance/primes/metrics/battery/HashingNameSanitizer", "sanitizeSyncName", 56, "HashingNameSanitizer.java")).t("malformed sync name: %s", str);
        return "MALFORMED";
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final defpackage.fglo b(defpackage.echy r14, defpackage.fglo r15) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.echz.b(echy, fglo):fglo");
    }

    final fglo c(fglo fgloVar) {
        fgle fgleVar = fgloVar.e;
        if (fgleVar == null) {
            fgleVar = fgle.a;
        }
        if ((fgleVar.b & 1) == 0) {
            return fgloVar;
        }
        fgle fgleVar2 = fgloVar.e;
        if (fgleVar2 == null) {
            fgleVar2 = fgle.a;
        }
        fgld fgldVar = (fgld) fgleVar2.toBuilder();
        Long l = (Long) this.a.get(Long.valueOf(((fgle) fgldVar.instance).c));
        l.getClass();
        fgln fglnVar = (fgln) fgloVar.toBuilder();
        long longValue = l.longValue();
        fgldVar.copyOnWrite();
        fgle fgleVar3 = (fgle) fgldVar.instance;
        fgleVar3.b |= 1;
        fgleVar3.c = longValue;
        fglnVar.copyOnWrite();
        fglo fgloVar2 = (fglo) fglnVar.instance;
        fgle fgleVar4 = (fgle) fgldVar.build();
        fgleVar4.getClass();
        fgloVar2.e = fgleVar4;
        fgloVar2.b |= 4;
        return (fglo) fglnVar.build();
    }
}
