package defpackage;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class our {
    public static final /* synthetic */ int f = 0;
    private static final String[] g = {"INSERT", "UPDATE", "DELETE"};
    public final otb a;
    public final boolean b;
    public final osl c;
    public final osn d;
    private final Map h;
    private final Map i;
    private final ffji j;
    private final String[] l;
    private final AtomicBoolean m = new AtomicBoolean(false);
    public ffix e = new ffix() { // from class: oub
        @Override // defpackage.ffix
        public final Object invoke() {
            int i = our.f;
            return true;
        }
    };
    private final Map k = new LinkedHashMap();

    public our(otb otbVar, Map map, Map map2, String[] strArr, boolean z, ffji ffjiVar) {
        String str;
        this.a = otbVar;
        this.h = map;
        this.i = map2;
        this.b = z;
        this.j = ffjiVar;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String lowerCase = strArr[i].toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            this.k.put(lowerCase, Integer.valueOf(i));
            String str2 = (String) this.h.get(strArr[i]);
            if (str2 != null) {
                str = str2.toLowerCase(Locale.ROOT);
                str.getClass();
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i] = lowerCase;
        }
        this.l = strArr2;
        for (Map.Entry entry : this.h.entrySet()) {
            String lowerCase2 = ((String) entry.getValue()).toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            if (this.k.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(Locale.ROOT);
                lowerCase3.getClass();
                Map map3 = this.k;
                map3.put(lowerCase3, ffew.e(map3, lowerCase2));
            }
        }
        this.c = new osl(this.l.length);
        this.d = new osn(this.l.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
    
        if (r7 != r1) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.osp r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.oud
            if (r0 == 0) goto L13
            r0 = r7
            oud r0 = (defpackage.oud) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            oud r0 = new oud
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r6 = r0.a
            java.util.Set r6 = (java.util.Set) r6
            defpackage.ffci.b(r7)
            return r6
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            java.lang.Object r6 = r0.a
            osp r6 = (defpackage.osp) r6
            defpackage.ffci.b(r7)
            goto L52
        L3e:
            defpackage.ffci.b(r7)
            oua r7 = new oua
            r7.<init>()
            r0.a = r6
            r0.d = r4
            java.lang.String r2 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1"
            java.lang.Object r7 = r6.a(r2, r7, r0)
            if (r7 == r1) goto L67
        L52:
            java.util.Set r7 = (java.util.Set) r7
            boolean r2 = r7.isEmpty()
            if (r2 != 0) goto L66
            r0.a = r7
            r0.d = r3
            java.lang.String r2 = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1"
            java.lang.Object r6 = defpackage.otz.a(r6, r2, r0)
            if (r6 == r1) goto L67
        L66:
            return r7
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.our.a(osp, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0085 A[Catch: all -> 0x002c, TryCatch #1 {all -> 0x002c, blocks: (B:11:0x0028, B:12:0x007d, B:14:0x0085, B:17:0x00bb, B:19:0x0091, B:20:0x0093, B:22:0x00a0, B:24:0x00aa, B:26:0x00b0, B:27:0x00ae, B:30:0x00b5), top: B:10:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ffgu r12) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.our.b(ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00dc, code lost:
    
        if (r3 == r5) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00dc -> B:11:0x00df). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.osp r18, int r19, defpackage.ffgu r20) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.our.c(osp, int, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0078 -> B:10:0x007a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.osp r10, int r11, defpackage.ffgu r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.oun
            if (r0 == 0) goto L13
            r0 = r12
            oun r0 = (defpackage.oun) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            oun r0 = new oun
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.d
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.f
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            int r10 = r0.c
            int r11 = r0.b
            java.lang.String[] r2 = r0.h
            java.lang.String r4 = r0.g
            java.lang.Object r5 = r0.a
            defpackage.ffci.b(r12)
            r12 = r4
            goto L7a
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3a:
            defpackage.ffci.b(r12)
            java.lang.String[] r12 = r9.l
            r11 = r12[r11]
            java.lang.String[] r12 = defpackage.our.g
            r2 = 3
            r4 = 0
            r8 = r11
            r11 = r10
            r10 = r2
            r2 = r12
            r12 = r8
        L4a:
            if (r4 >= r10) goto L7e
            r5 = r2[r4]
            java.lang.String r5 = defpackage.ouc.a(r12, r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "DROP TRIGGER IF EXISTS `"
            r6.<init>(r7)
            r6.append(r5)
            r5 = 96
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r0.a = r11
            r0.g = r12
            r0.h = r2
            r0.b = r4
            r0.c = r10
            r0.f = r3
            java.lang.Object r5 = defpackage.otz.a(r11, r5, r0)
            if (r5 != r1) goto L78
            return r1
        L78:
            r5 = r11
            r11 = r4
        L7a:
            int r4 = r11 + 1
            r11 = r5
            goto L4a
        L7e:
            ffcu r10 = defpackage.ffcu.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.our.d(osp, int, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.ffgu r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.ouo
            if (r0 == 0) goto L13
            r0 = r8
            ouo r0 = (defpackage.ouo) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ouo r0 = new ouo
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            out r0 = r0.d
            defpackage.ffci.b(r8)     // Catch: java.lang.Throwable -> L29
            goto L53
        L29:
            r8 = move-exception
            goto L5c
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L33:
            defpackage.ffci.b(r8)
            otb r8 = r7.a
            out r8 = r8.h
            boolean r2 = r8.b()
            if (r2 == 0) goto L60
            otb r2 = r7.a     // Catch: java.lang.Throwable -> L58
            ouq r4 = new ouq     // Catch: java.lang.Throwable -> L58
            r5 = 0
            r4.<init>(r7, r5)     // Catch: java.lang.Throwable -> L58
            r0.d = r8     // Catch: java.lang.Throwable -> L58
            r0.c = r3     // Catch: java.lang.Throwable -> L58
            java.lang.Object r0 = r2.w(r4, r0)     // Catch: java.lang.Throwable -> L58
            if (r0 == r1) goto L57
            r0 = r8
        L53:
            r0.a()
            goto L60
        L57:
            return r1
        L58:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L5c:
            r0.a()
            throw r8
        L60:
            ffcu r8 = defpackage.ffcu.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.our.e(ffgu):java.lang.Object");
    }

    public final ffcf f(String[] strArr) {
        ffgg ffggVar = new ffgg();
        for (String str : strArr) {
            Map map = this.i;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Set set = (Set) map.get(lowerCase);
            if (set != null) {
                ffggVar.addAll(set);
            } else {
                ffggVar.add(str);
            }
        }
        String[] strArr2 = (String[]) fffi.a(ffggVar).toArray(new String[0]);
        int length = strArr2.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr2[i];
            Map map2 = this.k;
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            Integer num = (Integer) map2.get(lowerCase2);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name ".concat(String.valueOf(str2)));
            }
            iArr[i] = num.intValue();
        }
        return new ffcf(strArr2, iArr);
    }

    public final void g(ffix ffixVar, ffix ffixVar2) {
        ffixVar.getClass();
        ffixVar2.getClass();
        if (this.m.compareAndSet(false, true)) {
            ffqy.d(this.a.k(), new ffsj("Room Invalidation Tracker Refresh"), null, new oul(this, ffixVar2, null), 2);
        }
    }
}
