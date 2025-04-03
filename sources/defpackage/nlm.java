package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nlm implements nkj {
    private static final Pattern a = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    private final boolean b;
    private final nll c;
    private final luv d;
    private Map e;
    private float f;
    private float g;

    public nlm() {
        this(null);
    }

    private static float d(int i) {
        if (i == 0) {
            return 0.05f;
        }
        if (i != 1) {
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static int e(long j, List list, List list2) {
        int i;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) list.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) list.get(size)).longValue() < j) {
                i = size + 1;
                break;
            }
        }
        list.add(i, Long.valueOf(j));
        list2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) list2.get(i - 1)));
        return i;
    }

    private static long f(String str) {
        Matcher matcher = a.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        int i = lvf.a;
        long parseLong = Long.parseLong(group) * 3600000000L;
        long parseLong2 = Long.parseLong(matcher.group(2)) * 60000000;
        return parseLong + parseLong2 + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void g(defpackage.luv r29, java.nio.charset.Charset r30) {
        /*
            Method dump skipped, instructions count: 804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nlm.g(luv, java.nio.charset.Charset):void");
    }

    @Override // defpackage.nkj
    public final /* synthetic */ njw a(byte[] bArr, int i, int i2) {
        return nkf.a(this, bArr, i2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:39|40|41|42|43|44|(2:(4:47|48|49|50)(1:71)|51)(2:72|(1:74)(10:75|(1:54)|55|56|(1:58)(1:66)|59|(3:61|62|63)|64|65|63))|52|(0)|55|56|(0)(0)|59|(0)|64|65|63) */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0177 A[Catch: RuntimeException -> 0x018c, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x018c, blocks: (B:56:0x016b, B:58:0x0177), top: B:55:0x016b }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0194 A[SYNTHETIC] */
    @Override // defpackage.nkj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(byte[] r27, int r28, int r29, defpackage.nki r30, defpackage.lts r31) {
        /*
            Method dump skipped, instructions count: 1040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nlm.b(byte[], int, int, nki, lts):void");
    }

    public nlm(List list) {
        this.f = -3.4028235E38f;
        this.g = -3.4028235E38f;
        this.d = new luv();
        if (list == null || list.isEmpty()) {
            this.b = false;
            this.c = null;
            return;
        }
        this.b = true;
        String H = lvf.H((byte[]) list.get(0));
        lti.a(H.startsWith("Format:"));
        nll a2 = nll.a(H);
        lti.f(a2);
        this.c = a2;
        g(new luv((byte[]) list.get(1)), StandardCharsets.UTF_8);
    }

    @Override // defpackage.nkj
    public final /* synthetic */ void c() {
    }
}
