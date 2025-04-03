package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpfj extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ dpfm c;
    final /* synthetic */ ByteBuffer d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpfj(dpfm dpfmVar, ByteBuffer byteBuffer, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = dpfmVar;
        this.d = byteBuffer;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpfj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        if (r9.e(r8) == r0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0096  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) {
        /*
            r8 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r8.b
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 == r2) goto L10
            java.lang.Object r0 = r8.a
            defpackage.ffci.b(r9)
            goto L92
        L10:
            defpackage.ffci.b(r9)
            goto Lbc
        L15:
            defpackage.ffci.b(r9)
            dpfm r9 = r8.c
            j$.time.Instant r1 = j$.time.Instant.EPOCH
            long r3 = r9.g
            dpfo r9 = r9.c
            int r5 = r9.a
            int r9 = r9.b
            j$.time.Duration r9 = defpackage.dpfq.a(r3, r5, r9)
            j$.time.Instant r9 = r1.plus(r9)
            r9.getClass()
            dpfm r1 = r8.c
            java.nio.ByteBuffer r3 = r8.d
            long r4 = r1.g
            int r3 = r3.remaining()
            long r6 = (long) r3
            long r4 = r4 + r6
            r1.g = r4
            dpfm r1 = r8.c
            java.lang.Long r3 = r1.f
            if (r3 != 0) goto L44
            goto L59
        L44:
            long r4 = r1.g
            long r6 = r3.longValue()
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 <= 0) goto L59
            dpfm r9 = r8.c
            r8.b = r2
            java.lang.Object r9 = r9.e(r8)
            if (r9 != r0) goto Lbc
            goto Lbf
        L59:
            dpfm r1 = r8.c
            dpfo r1 = r1.c
            j$.time.Duration r1 = r1.c
            long r2 = r1.getSeconds()
            ffpz r4 = defpackage.ffpz.d
            long r2 = defpackage.ffpy.e(r2, r4)
            int r1 = r1.getNano()
            ffpz r4 = defpackage.ffpz.a
            long r4 = defpackage.ffpy.d(r1, r4)
            long r1 = defpackage.ffpw.j(r2, r4)
            dpfm r3 = r8.c
            java.nio.ByteBuffer r4 = r8.d
            dpfi r5 = new dpfi
            r6 = 0
            r5.<init>(r3, r9, r4, r6)
            r8.a = r9
            r3 = 2
            r8.b = r3
            long r1 = defpackage.ffsw.a(r1)
            java.lang.Object r1 = defpackage.ffvm.c(r1, r5, r8)
            if (r1 == r0) goto Lbf
            r0 = r9
            r9 = r1
        L92:
            ffcu r9 = (defpackage.ffcu) r9
            if (r9 != 0) goto Lbc
            enru r9 = defpackage.dpfm.a
            ensk r9 = r9.h()
            ensn r1 = defpackage.ente.a
            java.lang.String r2 = "HugoAudio"
            r9.Y(r1, r2)
            java.lang.String r1 = "invokeSuspend"
            r2 = 161(0xa1, float:2.26E-43)
            java.lang.String r3 = "com/google/android/libraries/compose/audio/source/MicrophoneAudioSource$consumeAudioDataBlocking$1"
            java.lang.String r4 = "MicrophoneAudioSource.kt"
            ensk r9 = r9.h(r3, r1, r2, r4)
            enrr r9 = (defpackage.enrr) r9
            j$.time.Instant r0 = (j$.time.Instant) r0
            long r0 = defpackage.ernd.a(r0)
            java.lang.String r2 = "Dropped buffer with timestamp %d microseconds."
            r9.s(r2, r0)
        Lbc:
            ffcu r9 = defpackage.ffcu.a
            return r9
        Lbf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpfj.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dpfj(this.c, this.d, ffguVar);
    }
}
