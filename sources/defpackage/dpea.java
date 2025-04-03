package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpea {
    public static final enru a = enru.c("com/google/android/libraries/compose/audio/recorder/AudioRecorder");
    public final dpfp b;
    public final dpex c;
    public final dpeb d;
    public dpcj e;
    public dpev f;
    public dpfm g;

    public dpea(dpfp dpfpVar, dpex dpexVar, dpeb dpebVar) {
        this.b = dpfpVar;
        this.c = dpexVar;
        this.d = dpebVar;
    }

    public final Object a(ffgu ffguVar) {
        ensk h = a.h();
        h.Y(ente.a, "HugoAudio");
        ((enrr) h.h("com/google/android/libraries/compose/audio/recorder/AudioRecorder", "release", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "AudioRecorder.kt")).t("Releasing AudioRecorder for %s", this.d.a);
        dpcj dpcjVar = this.e;
        if (dpcjVar == null) {
            ffkj.c("audioGraph");
            dpcjVar = null;
        }
        Object b = dpcjVar.b(ffguVar);
        return b == ffhh.a ? b : ffcu.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0096 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ffgu r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.dpdz
            if (r0 == 0) goto L13
            r0 = r10
            dpdz r0 = (defpackage.dpdz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dpdz r0 = new dpdz
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.ffci.b(r10)
            return r10
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L33:
            dpea r2 = r0.d
            defpackage.ffci.b(r10)
            goto L7d
        L39:
            defpackage.ffci.b(r10)
            enru r10 = defpackage.dpea.a
            ensk r10 = r10.h()
            ensn r2 = defpackage.ente.a
            java.lang.String r6 = "HugoAudio"
            r10.Y(r2, r6)
            java.lang.String r2 = "stop"
            r6 = 94
            java.lang.String r7 = "com/google/android/libraries/compose/audio/recorder/AudioRecorder"
            java.lang.String r8 = "AudioRecorder.kt"
            ensk r10 = r10.h(r7, r2, r6, r8)
            enrr r10 = (defpackage.enrr) r10
            dpeb r2 = r9.d
            java.lang.String r6 = "Stopping AudioRecorder for %s"
            android.net.Uri r2 = r2.a
            r10.t(r6, r2)
            dpcj r10 = r9.e
            if (r10 != 0) goto L6a
            java.lang.String r10 = "audioGraph"
            defpackage.ffkj.c(r10)
            r10 = r5
        L6a:
            r0.d = r9
            r0.c = r4
            dpey r10 = r10.a
            java.lang.Object r10 = r10.a(r0)
            ffhh r2 = defpackage.ffhh.a
            if (r10 == r2) goto L7a
            ffcu r10 = defpackage.ffcu.a
        L7a:
            if (r10 == r1) goto L97
            r2 = r9
        L7d:
            dpev r10 = r2.f
            if (r10 != 0) goto L87
            java.lang.String r10 = "fileAudioSink"
            defpackage.ffkj.c(r10)
            r10 = r5
        L87:
            r0.d = r5
            r0.c = r3
            ffrp r10 = r10.g
            ffuq r10 = (defpackage.ffuq) r10
            java.lang.Object r10 = r10.B(r0)
            if (r10 != r1) goto L96
            goto L97
        L96:
            return r10
        L97:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpea.b(ffgu):java.lang.Object");
    }
}
