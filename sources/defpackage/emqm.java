package defpackage;

import j$.time.DayOfWeek;
import j$.time.LocalDateTime;
import j$.time.temporal.TemporalAdjusters;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emqm {
    public static final Integer b(Integer num, Integer num2, ffjm ffjmVar) {
        return (num == null || num2 == null || ffkj.e(num, num2)) ? num2 : (Integer) ffjmVar.a(num, num2);
    }

    public static /* synthetic */ Integer c(emqm emqmVar, Integer num, Integer num2) {
        return b(num, num2, new emqb(emqmVar));
    }

    public static final int d(int i) {
        if (i > 24 || i < 0) {
            throw new empw("Number can not be interpreted as an hour");
        }
        return i < 10 ? i + 12 : i;
    }

    private static final Integer e(fbtf fbtfVar, LocalDateTime localDateTime, ffji ffjiVar, ffji ffjiVar2, ffji ffjiVar3) {
        Integer num = ((Boolean) ffjiVar.invoke(fbtfVar)).booleanValue() ? (Integer) ffjiVar2.invoke(fbtfVar) : null;
        if ((fbtfVar.b & 128) != 0) {
            fbst fbstVar = fbtfVar.k;
            if (fbstVar == null) {
                fbstVar = fbst.a;
            }
            Integer num2 = (Integer) ffjiVar3.invoke(localDateTime.plusDays(fbstVar.b));
            if (num != null && !ffkj.e(num, num2)) {
                throw new empw("Found multiple units");
            }
            num = num2;
        }
        if ((fbtfVar.b & 64) == 0) {
            return num;
        }
        fbst fbstVar2 = fbtfVar.j;
        if (fbstVar2 == null) {
            fbstVar2 = fbst.a;
        }
        DayOfWeek of = DayOfWeek.of(fbstVar2.b);
        of.getClass();
        LocalDateTime u = localDateTime.u(TemporalAdjusters.next(of));
        Integer num3 = (Integer) ffjiVar3.invoke(u != null ? u.minusDays(1L) : null);
        if (num == null || ffkj.e(num, num3)) {
            return num3;
        }
        throw new empw("Found multiple units");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e7 A[Catch: empw -> 0x0145, TryCatch #0 {empw -> 0x0145, blocks: (B:9:0x0042, B:11:0x004d, B:12:0x0079, B:14:0x0084, B:15:0x008d, B:17:0x0091, B:18:0x00b6, B:20:0x00bc, B:21:0x00c5, B:23:0x00c9, B:25:0x00d3, B:27:0x00d7, B:28:0x00d9, B:29:0x00e1, B:31:0x00e7, B:32:0x00f0, B:35:0x00f4, B:37:0x010b, B:38:0x0113, B:40:0x0123, B:41:0x012b, B:44:0x013b, B:51:0x009e, B:53:0x00a8, B:55:0x00ac, B:56:0x00ae, B:59:0x005e, B:61:0x006b, B:63:0x006f, B:64:0x0071), top: B:8:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0036 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.util.Optional a(defpackage.emra r17, j$.time.LocalDateTime r18) {
        /*
            Method dump skipped, instructions count: 631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.emqm.a(emra, j$.time.LocalDateTime):j$.util.Optional");
    }
}
