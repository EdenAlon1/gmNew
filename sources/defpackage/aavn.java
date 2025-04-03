package defpackage;

import androidx.car.app.model.Alert;
import j$.util.Map;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aavn {
    public final auuw b;
    public final fgcm c;
    public final fgcm d;
    private final ffbr g;
    private final ffsk h;
    private Map i;
    private final ffud j;
    private static final Map e = ffew.g(new ffcf("Screen_Effects_Olympics", "olympics_effect.binarypb"), new ffcf("Screen_Effects_Pride", "pride_effect.binarypb"), new ffcf("Screen_Effects_Fireworks", "fireworks_effect.binarypb"), new ffcf("Screen_Effects_Fall", "fall_effect.binarypb"), new ffcf("Screen_Effects_Winter", "winter_effect.binarypb"), new ffcf("Screen_Effects_Spring", "spring_effect.binarypb"), new ffcf("Screen_Effects_Summer", "summer_effect.binarypb"), new ffcf("Screen_Effects_Celebrate", "celebrate_effect.binarypb"), new ffcf("Screen_Effects_Goodmorning", "good_morning_effect.binarypb"), new ffcf("Screen_Effects_Poop", "poop_effect.binarypb"), new ffcf("Screen_Effects_Anger", "anger_effect.binarypb"), new ffcf("Screen_Effects_Laugh", "laugh_effect.binarypb"), new ffcf("Screen_Effects_Love", "love_effect.binarypb"), new ffcf("Screen_Effects_Surprise", "surprise_effect.binarypb"), new ffcf("Screen_Effects_Thumbsup", "thumbs_up_effect.binarypb"), new ffcf("Screen_Effects_Thumbsdown", "thumbs_down_effect.binarypb"), new ffcf("Screen_Effects_Sad", "sad_effect.binarypb"), new ffcf("Screen_Effects_Drumroll", "drumroll_effect.binarypb"), new ffcf("Screen_Effects_Applause", "applause_effect.binarypb"), new ffcf("Screen_Effects_Halloween", "halloween_effect.binarypb"), new ffcf("Screen_Effects_Diwali", "diwali_effect.binarypb"), new ffcf("Screen_Effects_Goodnight", "good_night_effect.binarypb"), new ffcf("Screen_Effects_Thanksgiving", "thanksgiving_effect.binarypb"), new ffcf("Screen_Effects_Hannukah", "hannukah_effect.binarypb"), new ffcf("Screen_Effects_Christmas", "christmas_effect.binarypb"), new ffcf("Screen_Effects_Easter", "easter_effect.binarypb"), new ffcf("Screen_Effects_Lunarnewyear", "lunar_new_year_effect.binarypb"), new ffcf("Screen_Effects_Placeholderone", "placeholder_one_effect.binarypb"), new ffcf("Screen_Effects_Placeholdertwo", "placeholder_two_effect.binarypb"), new ffcf("Screen_Effects_Placeholderthree", "placeholder_three_effect.binarypb"));
    public static final Map a = ffew.g(new ffcf("Screen_Effects_Olympics", 1), new ffcf("Screen_Effects_Pride", 2), new ffcf("Screen_Effects_Fireworks", 3), new ffcf("Screen_Effects_Fall", 4), new ffcf("Screen_Effects_Winter", 5), new ffcf("Screen_Effects_Spring", 6), new ffcf("Screen_Effects_Summer", 7), new ffcf("Screen_Effects_Celebrate", 8), new ffcf("Screen_Effects_Goodmorning", 9), new ffcf("Screen_Effects_Poop", 10), new ffcf("Screen_Effects_Anger", 11), new ffcf("Screen_Effects_Laugh", 12), new ffcf("Screen_Effects_Love", 13), new ffcf("Screen_Effects_Surprise", 14), new ffcf("Screen_Effects_Thumbsup", 15), new ffcf("Screen_Effects_Thumbsdown", 16), new ffcf("Screen_Effects_Sad", 17), new ffcf("Screen_Effects_Drumroll", 18), new ffcf("Screen_Effects_Applause", 19), new ffcf("Screen_Effects_Halloween", 20), new ffcf("Screen_Effects_Diwali", 21), new ffcf("Screen_Effects_Goodnight", 22), new ffcf("Screen_Effects_Thanksgiving", 23), new ffcf("Screen_Effects_Hannukah", 24), new ffcf("Screen_Effects_Christmas", 25), new ffcf("Screen_Effects_Easter", 26), new ffcf("Screen_Effects_Lunarnewyear", 27), new ffcf("Screen_Effects_Placeholderone", 97), new ffcf("Screen_Effects_Placeholdertwo", 98), new ffcf("Screen_Effects_Placeholderthree", 99));
    private static final enru f = enru.c("com/google/android/apps/messaging/conversation2/messagelist/screeneffects/ScreenEffectAnimationsRepository");

    public aavn(ffbr ffbrVar, ffsk ffskVar, auuw auuwVar) {
        ffbrVar.getClass();
        ffskVar.getClass();
        this.g = ffbrVar;
        this.h = ffskVar;
        this.b = auuwVar;
        this.c = fgdm.a(e);
        this.d = fgdm.a(a);
        this.j = axol.k(ffskVar, null, new aavk(this, null), 3);
    }

    public final int a(String str) {
        return ((Number) Map.EL.getOrDefault((java.util.Map) this.d.c(), str, Integer.valueOf(Alert.DURATION_SHOW_INDEFINITELY))).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.aavl
            if (r0 == 0) goto L13
            r0 = r7
            aavl r0 = (defpackage.aavl) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aavl r0 = new aavl
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.String r6 = r0.e
            aavn r0 = r0.d
            defpackage.ffci.b(r7)
            goto L5d
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            defpackage.ffci.b(r7)
            ffud r7 = r5.j
            java.lang.String r2 = "preloadJob"
            if (r7 != 0) goto L41
            defpackage.ffkj.c(r2)
            r7 = r4
        L41:
            boolean r7 = r7.y()
            if (r7 != 0) goto L5c
            ffud r7 = r5.j
            if (r7 != 0) goto L4f
            defpackage.ffkj.c(r2)
            r7 = r4
        L4f:
            r0.d = r5
            r0.e = r6
            r0.c = r3
            java.lang.Object r7 = r7.o(r0)
            if (r7 != r1) goto L5c
            return r1
        L5c:
            r0 = r5
        L5d:
            auuw r7 = r0.b
            boolean r7 = r7.a()
            if (r7 == 0) goto L6e
            fgcm r7 = r0.c
            java.lang.Object r7 = r7.c()
            java.util.Map r7 = (java.util.Map) r7
            goto L70
        L6e:
            java.util.Map r7 = defpackage.aavn.e
        L70:
            boolean r7 = r7.containsKey(r6)
            if (r7 == 0) goto L81
            java.util.Map r7 = r0.i
            if (r7 == 0) goto L81
            java.lang.Object r6 = r7.get(r6)
            eylg r6 = (defpackage.eylg) r6
            return r6
        L81:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aavn.b(java.lang.String, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.aavm
            if (r0 == 0) goto L13
            r0 = r8
            aavm r0 = (defpackage.aavm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aavm r0 = new aavm
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.String r7 = r0.d
            defpackage.ffci.b(r8)     // Catch: java.lang.Exception -> L29
            goto L81
        L29:
            r8 = move-exception
            goto L90
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            defpackage.ffci.b(r8)
            ffbr r8 = r6.g     // Catch: java.lang.Exception -> L29
            java.lang.Object r8 = r8.b()     // Catch: java.lang.Exception -> L29
            emmt r8 = (defpackage.emmt) r8     // Catch: java.lang.Exception -> L29
            r7.getClass()     // Catch: java.lang.Exception -> L29
            emhv r2 = defpackage.emhv.a     // Catch: java.lang.Exception -> L29
            eyfq r2 = r2.createBuilder()     // Catch: java.lang.Exception -> L29
            emhu r2 = (defpackage.emhu) r2     // Catch: java.lang.Exception -> L29
            r2.getClass()     // Catch: java.lang.Exception -> L29
            emhx r4 = defpackage.emhx.a     // Catch: java.lang.Exception -> L29
            eyfq r4 = r4.createBuilder()     // Catch: java.lang.Exception -> L29
            emhw r4 = (defpackage.emhw) r4     // Catch: java.lang.Exception -> L29
            r4.getClass()     // Catch: java.lang.Exception -> L29
            defpackage.emhy.c(r7, r4)     // Catch: java.lang.Exception -> L29
            java.lang.String r5 = "screen_effect_suggestions"
            defpackage.emhy.b(r5, r4)     // Catch: java.lang.Exception -> L29
            emhx r4 = defpackage.emhy.a(r4)     // Catch: java.lang.Exception -> L29
            defpackage.emht.b(r4, r2)     // Catch: java.lang.Exception -> L29
            emhv r2 = defpackage.emht.a(r2)     // Catch: java.lang.Exception -> L29
            erph r8 = r8.c(r2)     // Catch: java.lang.Exception -> L29
            ffsk r2 = r6.h     // Catch: java.lang.Exception -> L29
            ffss r8 = defpackage.axnh.b(r8, r2)     // Catch: java.lang.Exception -> L29
            r0.d = r7     // Catch: java.lang.Exception -> L29
            r0.c = r3     // Catch: java.lang.Exception -> L29
            ffuq r8 = (defpackage.ffuq) r8     // Catch: java.lang.Exception -> L29
            java.lang.Object r8 = r8.B(r0)     // Catch: java.lang.Exception -> L29
            if (r8 != r1) goto L81
            return r1
        L81:
            java.io.InputStream r8 = (java.io.InputStream) r8     // Catch: java.lang.Exception -> L29
            eyfc r0 = defpackage.eyfc.a()     // Catch: java.lang.Exception -> L29
            eylg r1 = defpackage.eylg.a     // Catch: java.lang.Exception -> L29
            eyfy r8 = defpackage.eyfy.parseFrom(r1, r8, r0)     // Catch: java.lang.Exception -> L29
            eylg r8 = (defpackage.eylg) r8     // Catch: java.lang.Exception -> L29
            return r8
        L90:
            enru r0 = defpackage.aavn.f
            java.util.logging.Level r1 = java.util.logging.Level.WARNING
            enrr r0 = r0.a(r1)
            ensn r1 = defpackage.ente.a
            java.lang.String r2 = "BugleScreenEffects"
            r0.Y(r1, r2)
            ensk r8 = r0.g(r8)
            java.lang.String r0 = "loadEffectAssetAsync"
            r1 = 124(0x7c, float:1.74E-43)
            java.lang.String r2 = "com/google/android/apps/messaging/conversation2/messagelist/screeneffects/ScreenEffectAnimationsRepository"
            java.lang.String r3 = "ScreenEffectAnimationsRepository.kt"
            ensk r8 = r8.h(r2, r0, r1, r3)
            enrr r8 = (defpackage.enrr) r8
            java.lang.String r0 = "Could not parse the screen effect %s from mdd"
            r8.t(r0, r7)
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aavn.c(java.lang.String, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r7, defpackage.ffgu r8) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aavn.d(java.lang.String, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00f2 -> B:11:0x00f3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00a5 -> B:25:0x00a6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.ffgu r10) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aavn.e(ffgu):java.lang.Object");
    }
}
