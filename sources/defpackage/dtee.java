package defpackage;

import android.content.Context;
import android.media.AudioAttributes;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtee implements dtef {
    public static final enru a = enru.c("com/google/android/libraries/compose/voice/audioplayer/DefaultSoundEffectPlayer");
    public static final AudioAttributes b = new AudioAttributes.Builder().setUsage(13).setContentType(4).build();
    public final Context c;
    private final ffsk d;
    private final ffsd e;

    public dtee(Context context, ffsk ffskVar, ffsd ffsdVar) {
        context.getClass();
        ffskVar.getClass();
        ffsdVar.getClass();
        this.c = context;
        this.d = ffskVar;
        this.e = ffsdVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        if (defpackage.ffra.a(r4, r6, r0) != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.dtef
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r8, defpackage.ffgu r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.dtdz
            if (r0 == 0) goto L13
            r0 = r9
            dtdz r0 = (defpackage.dtdz) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dtdz r0 = new dtdz
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.ffci.b(r9)
            goto L6a
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            int r8 = r0.a
            dtee r2 = r0.e
            defpackage.ffci.b(r9)
            goto L52
        L3b:
            defpackage.ffci.b(r9)
            ffsd r9 = r7.e
            dted r2 = new dted
            r2.<init>(r5)
            r0.e = r7
            r0.a = r8
            r0.d = r4
            java.lang.Object r9 = defpackage.ffra.a(r9, r2, r0)
            if (r9 == r1) goto L6d
            r2 = r7
        L52:
            android.media.MediaPlayer r9 = (android.media.MediaPlayer) r9
            ffsk r4 = r2.d
            ffhd r4 = r4.hT()
            dtec r6 = new dtec
            r6.<init>(r9, r2, r8, r5)
            r0.e = r5
            r0.d = r3
            java.lang.Object r8 = defpackage.ffra.a(r4, r6, r0)
            if (r8 != r1) goto L6a
            goto L6d
        L6a:
            ffcu r8 = defpackage.ffcu.a
            return r8
        L6d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtee.a(int, ffgu):java.lang.Object");
    }
}
