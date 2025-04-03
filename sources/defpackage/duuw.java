package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duuw {
    private static volatile duuw b;
    static final engw a = engw.w("⚕️", "♀️", "♂️", "♟️", "♾️", "⚧️");
    private static final ThreadLocal c = new duuv();

    private duuw() {
    }

    public static duuw a() {
        duuw duuwVar;
        duuw duuwVar2 = b;
        if (duuwVar2 != null) {
            return duuwVar2;
        }
        synchronized (duuw.class) {
            duuwVar = b;
            if (duuwVar == null) {
                duuwVar = new duuw();
                b = duuwVar;
            }
        }
        return duuwVar;
    }

    public static final boolean b(String str) {
        return ((duuu) c.get()).a(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009e, code lost:
    
        if (b(r6) == false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean c(java.lang.String r6, defpackage.duur r7) {
        /*
            boolean r0 = r7.a()
            r1 = 0
            if (r0 == 0) goto L83
            boolean r0 = r7.a()
            if (r0 != 0) goto L12
            boolean r6 = b(r6)
            return r6
        L12:
            java.lang.ThreadLocal r0 = defpackage.duuw.c
            java.lang.Object r0 = r0.get()
            duuu r0 = (defpackage.duuu) r0
            duut r2 = defpackage.duut.instance
            lew r2 = r2.a()
            if (r2 != 0) goto L27
            boolean r6 = r0.a(r6)
            return r6
        L27:
            java.lang.Integer r7 = r7.c
            if (r7 != 0) goto L49
            enru r7 = defpackage.duut.a
            duwj r0 = defpackage.duwj.a
            enrr r7 = r7.a(r0)
            java.lang.String r0 = "getMetaVersion"
            r3 = 138(0x8a, float:1.93E-43)
            java.lang.String r4 = "com/google/android/libraries/inputmethod/emoji/renderer/EmojiCompatManager$CompatMetaData"
            java.lang.String r5 = "EmojiCompatManager.java"
            ensk r7 = r7.h(r4, r0, r3, r5)
            enrr r7 = (defpackage.enrr) r7
            java.lang.String r0 = "meta version is not set but getMetaVersion() is called."
            r7.q(r0)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L4f
        L49:
            r7.intValue()
            r7 = 2147483647(0x7fffffff, float:NaN)
        L4f:
            boolean r0 = r2.g()
            java.lang.String r3 = "Not initialized yet"
            defpackage.ksw.d(r0, r3)
            java.lang.String r0 = "sequence cannot be null"
            defpackage.ksw.i(r6, r0)
            lep r0 = r2.e
            lfa r0 = r0.a
            lex r6 = r0.a(r6)
            if (r6 == 0) goto L82
            ozb r6 = r6.d()
            r0 = 10
            int r0 = r6.b(r0)
            if (r0 == 0) goto L7d
            java.nio.ByteBuffer r2 = r6.b
            int r6 = r6.a
            int r0 = r0 + r6
            short r6 = r2.getShort(r0)
            goto L7e
        L7d:
            r6 = r1
        L7e:
            if (r6 > r7) goto L82
            r6 = 1
            return r6
        L82:
            return r1
        L83:
            boolean r7 = b(r6)
            if (r7 != 0) goto La1
            engw r7 = defpackage.duuw.a
            boolean r7 = r7.contains(r6)
            r0 = 0
            if (r7 == 0) goto La0
            java.lang.String r7 = "️"
            java.lang.String r2 = ""
            java.lang.String r6 = r6.replace(r7, r2)
            boolean r7 = b(r6)
            if (r7 != 0) goto La1
        La0:
            r6 = r0
        La1:
            if (r6 != 0) goto La4
            return r1
        La4:
            boolean r6 = b(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.duuw.c(java.lang.String, duur):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final engw d(engw engwVar, duur duurVar) {
        int i = engw.d;
        engr engrVar = new engr();
        int size = engwVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str = (String) engwVar.get(i2);
            if (c(str, duurVar)) {
                engrVar.h(str);
            }
        }
        return engrVar.g();
    }
}
