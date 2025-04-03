package defpackage;

import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emll {
    public static final Pattern a = Pattern.compile("hello");
    public engy b;
    public engy c;
    public final boolean d;
    public int e;
    private final int f;
    private Random g;

    /* JADX WARN: Removed duplicated region for block: B:21:0x006c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0033 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public emll(defpackage.emhv r9, defpackage.emmt r10, java.lang.String r11, int r12) {
        /*
            r8 = this;
            r8.<init>()
            emhv r0 = defpackage.emhv.a
            boolean r0 = r9.equals(r0)
            r1 = 1
            r2 = 0
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            if (r0 == 0) goto L13
            goto La1
        L13:
            java.io.InputStream r9 = r10.f(r9)     // Catch: java.lang.Exception -> La1
            if (r9 != 0) goto L1b
            goto La1
        L1b:
            emkh r10 = defpackage.emkh.a     // Catch: java.lang.Throwable -> L95
            eyfy r10 = defpackage.eyfy.parseFrom(r10, r9)     // Catch: java.lang.Throwable -> L95
            emkh r10 = (defpackage.emkh) r10     // Catch: java.lang.Throwable -> L95
            engx r0 = new engx     // Catch: java.lang.Throwable -> L95
            r0.<init>()     // Catch: java.lang.Throwable -> L95
            engx r4 = new engx     // Catch: java.lang.Throwable -> L95
            r4.<init>()     // Catch: java.lang.Throwable -> L95
            eygr r10 = r10.b     // Catch: java.lang.Throwable -> L95
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> L95
        L33:
            boolean r5 = r10.hasNext()     // Catch: java.lang.Throwable -> L95
            if (r5 == 0) goto L80
            java.lang.Object r5 = r10.next()     // Catch: java.lang.Throwable -> L95
            emkl r5 = (defpackage.emkl) r5     // Catch: java.lang.Throwable -> L95
            eygr r6 = r5.h     // Catch: java.lang.Throwable -> L95
            boolean r6 = r6.isEmpty()     // Catch: java.lang.Throwable -> L95
            if (r6 != 0) goto L52
            eygr r6 = r5.h     // Catch: java.lang.Throwable -> L95
            boolean r6 = r6.contains(r11)     // Catch: java.lang.Throwable -> L95
            if (r6 == 0) goto L50
            goto L52
        L50:
            r6 = r2
            goto L63
        L52:
            eygr r6 = r5.i     // Catch: java.lang.Throwable -> L95
            boolean r6 = r6.isEmpty()     // Catch: java.lang.Throwable -> L95
            if (r6 != 0) goto L62
            eygr r6 = r5.i     // Catch: java.lang.Throwable -> L95
            boolean r6 = r6.contains(r11)     // Catch: java.lang.Throwable -> L95
            if (r6 != 0) goto L50
        L62:
            r6 = r1
        L63:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Throwable -> L95
            r7.getClass()     // Catch: java.lang.Throwable -> L95
            if (r6 == 0) goto L33
            boolean r6 = r5.g     // Catch: java.lang.Throwable -> L95
            if (r6 == 0) goto L7a
            java.lang.String r6 = r5.b     // Catch: java.lang.Throwable -> L95
            java.util.regex.Pattern r6 = java.util.regex.Pattern.compile(r6)     // Catch: java.lang.Throwable -> L95
            r0.b(r6, r5)     // Catch: java.lang.Throwable -> L95
            goto L33
        L7a:
            java.lang.String r6 = r5.b     // Catch: java.lang.Throwable -> L95
            r4.b(r6, r5)     // Catch: java.lang.Throwable -> L95
            goto L33
        L80:
            engy r10 = r0.a()     // Catch: java.lang.Throwable -> L95
            r8.c = r10     // Catch: java.lang.Throwable -> L95
            engy r10 = r4.a()     // Catch: java.lang.Throwable -> L95
            r8.b = r10     // Catch: java.lang.Throwable -> L95
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L95
            r9.close()     // Catch: java.lang.Exception -> La1
            r3 = r10
            goto La1
        L95:
            r10 = move-exception
            if (r9 == 0) goto La0
            r9.close()     // Catch: java.lang.Throwable -> L9c
            goto La0
        L9c:
            r9 = move-exception
            r10.addSuppressed(r9)     // Catch: java.lang.Exception -> La1
        La0:
            throw r10     // Catch: java.lang.Exception -> La1
        La1:
            boolean r9 = r3.booleanValue()
            r9 = r9 ^ r1
            r8.d = r9
            r8.f = r12
            java.util.Random r9 = new java.util.Random
            r9.<init>()
            r8.g = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.emll.<init>(emhv, emmt, java.lang.String, int):void");
    }

    public static final List b(fbxa fbxaVar, Pattern pattern, emkl emklVar) {
        int a2;
        String str;
        int i = emklVar.d;
        int a3 = emkk.a(i);
        if ((a3 == 0 || a3 != 5) && ((a2 = emkk.a(i)) == 0 || a2 != 2)) {
            return engw.r(fbxaVar);
        }
        fbwy fbwyVar = fbxaVar.e;
        if (fbwyVar == null) {
            fbwyVar = fbwy.b;
        }
        fbwx fbwxVar = (fbwx) fbwyVar.toBuilder();
        fbrg fbrgVar = fbrg.REWRITER;
        fbwxVar.copyOnWrite();
        ((fbwy) fbwxVar.instance).g = fbrgVar.a();
        fbri b = fbri.b(emklVar.f);
        if (b == null) {
            b = fbri.UNKNOWN_SUGGESTION_TYPE;
        }
        fbwxVar.copyOnWrite();
        ((fbwy) fbwxVar.instance).l = b.a();
        fbwy fbwyVar2 = (fbwy) fbwxVar.build();
        if (emklVar.g) {
            str = pattern.matcher((fbxaVar.c == 2 ? (fbxc) fbxaVar.d : fbxc.a).c).replaceAll(emklVar.c);
        } else {
            str = emklVar.c;
        }
        fbwz fbwzVar = (fbwz) fbxa.a.createBuilder(fbxaVar);
        fbwzVar.copyOnWrite();
        fbxa fbxaVar2 = (fbxa) fbwzVar.instance;
        fbwyVar2.getClass();
        fbxaVar2.e = fbwyVar2;
        fbxaVar2.b |= 1;
        fbwzVar.copyOnWrite();
        ((fbxa) fbwzVar.instance).f = fbra.a(3);
        int i2 = emklVar.f;
        fbri b2 = fbri.b(i2);
        if (b2 == null) {
            b2 = fbri.UNKNOWN_SUGGESTION_TYPE;
        }
        if (b2 == fbri.GIF) {
            fbtv fbtvVar = (fbtv) fbtw.a.createBuilder();
            fbtvVar.copyOnWrite();
            fbtw fbtwVar = (fbtw) fbtvVar.instance;
            str.getClass();
            fbtwVar.b = str;
            fbwzVar.copyOnWrite();
            fbxa fbxaVar3 = (fbxa) fbwzVar.instance;
            fbtw fbtwVar2 = (fbtw) fbtvVar.build();
            fbtwVar2.getClass();
            fbxaVar3.d = fbtwVar2;
            fbxaVar3.c = 5;
        } else {
            fbri b3 = fbri.b(i2);
            if (b3 == null) {
                b3 = fbri.UNKNOWN_SUGGESTION_TYPE;
            }
            if (b3 == fbri.FULL_MESSAGE) {
                fbxb fbxbVar = (fbxb) fbxc.a.createBuilder();
                fbxbVar.copyOnWrite();
                fbxc fbxcVar = (fbxc) fbxbVar.instance;
                str.getClass();
                fbxcVar.c = str;
                fbwzVar.copyOnWrite();
                fbxa fbxaVar4 = (fbxa) fbwzVar.instance;
                fbxc fbxcVar2 = (fbxc) fbxbVar.build();
                fbxcVar2.getClass();
                fbxaVar4.d = fbxcVar2;
                fbxaVar4.c = 2;
            }
        }
        int a4 = emkk.a(emklVar.d);
        if (a4 == 0 || a4 != 2) {
            return engw.r((fbxa) fbwzVar.build());
        }
        fbwz fbwzVar2 = (fbwz) fbxa.a.createBuilder(fbxaVar);
        fbwzVar2.copyOnWrite();
        ((fbxa) fbwzVar2.instance).f = fbra.a(4);
        return engw.s((fbxa) fbwzVar2.build(), (fbxa) fbwzVar.build());
    }

    public final boolean a(float f) {
        return this.e < this.f && this.g.nextFloat() <= f;
    }
}
