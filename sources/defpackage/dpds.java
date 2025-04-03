package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpds implements dpdc {
    public static final enru a = enru.c("com/google/android/libraries/compose/audio/processor/XenoAudioProcessor");
    public final ffsk b;
    public final dpdv c;
    public final dpdt d;
    public final fgcl e;
    public final fgcq f;
    public final fgcq g;
    public faem h;
    public ffud i;
    public int j;
    public int k;
    private final ffsk l;
    private final dtll m;

    public dpds(ffsk ffskVar, ffsk ffskVar2, dtll dtllVar, dpdv dpdvVar, dpdt dpdtVar) {
        this.l = ffskVar;
        this.b = ffskVar2;
        this.m = dtllVar;
        this.c = dpdvVar;
        this.d = dpdtVar;
        fgcl e = fgcu.e(0, 100, 0, 5);
        this.e = e;
        this.f = dpdtVar.b;
        this.g = new fgcn(e);
    }

    private final boolean a() {
        return this.h != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008e, code lost:
    
        if (r8.e(r5, r6, r0) != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.dpdc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ffgu r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.dpdj
            if (r0 == 0) goto L13
            r0 = r8
            dpdj r0 = (defpackage.dpdj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dpdj r0 = new dpdj
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r8)
            goto L91
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L32:
            dpds r2 = r0.e
            dpds r4 = r0.d
            defpackage.ffci.b(r8)
            goto L5b
        L3a:
            defpackage.ffci.b(r8)
            boolean r8 = r7.a()
            if (r8 != 0) goto L95
            dtll r8 = r7.m
            r0.d = r7
            r0.e = r7
            r0.c = r4
            fadp r2 = defpackage.fadq.e()
            fadq r2 = r2.a()
            java.lang.Object r8 = r8.g(r2, r0)
            if (r8 == r1) goto L94
            r2 = r7
            r4 = r2
        L5b:
            faem r8 = (defpackage.faem) r8
            r2.h = r8
            faem r8 = r4.h
            r2 = 0
            if (r8 != 0) goto L6a
            java.lang.String r8 = "processor"
            defpackage.ffkj.c(r8)
            r8 = r2
        L6a:
            dpdh r5 = new dpdh
            r5.<init>()
            java.util.concurrent.CopyOnWriteArraySet r6 = r8.i
            r6.clear()
            java.util.concurrent.CopyOnWriteArraySet r8 = r8.i
            r8.add(r5)
            dtll r8 = r4.m
            dpdt r5 = r4.d
            java.lang.String r5 = r5.a
            dpdi r6 = new dpdi
            r6.<init>()
            r0.d = r2
            r0.e = r2
            r0.c = r3
            java.lang.Object r8 = r8.e(r5, r6, r0)
            if (r8 != r1) goto L91
            goto L94
        L91:
            ffcu r8 = defpackage.ffcu.a
            return r8
        L94:
            return r1
        L95:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "This instance has already been prepared."
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpds.b(ffgu):java.lang.Object");
    }

    @Override // defpackage.dpdc
    public final Object c(ffgu ffguVar) {
        if (a()) {
            faem faemVar = this.h;
            if (faemVar == null) {
                ffkj.c("processor");
                faemVar = null;
            }
            faemVar.d();
            ffud ffudVar = this.i;
            if (ffudVar != null) {
                ffudVar.t(null);
            }
        }
        return ffcu.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0092, code lost:
    
        if (r10.B(r0) != r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.dpdc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ffgu r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.dpdl
            if (r0 == 0) goto L13
            r0 = r10
            dpdl r0 = (defpackage.dpdl) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dpdl r0 = new dpdl
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
            goto L95
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L33:
            dpds r2 = r0.d
            defpackage.ffci.b(r10)
            goto L7a
        L39:
            defpackage.ffci.b(r10)
            boolean r10 = r9.a()
            if (r10 == 0) goto Lb8
            r0.d = r9
            r0.c = r4
            ffrh r10 = new ffrh
            ffgu r2 = defpackage.ffhi.c(r0)
            r10.<init>(r2, r4)
            r10.B()
            faem r2 = r9.h
            if (r2 != 0) goto L5c
            java.lang.String r2 = "processor"
            defpackage.ffkj.c(r2)
            r2 = r5
        L5c:
            dpdt r4 = r9.d
            com.google.research.xeno.effect.InputFrameSource r6 = com.google.research.xeno.effect.InputFrameSource.VIDEO
            android.util.Size r7 = defpackage.faem.c
            dpdq r8 = new dpdq
            r8.<init>(r10)
            android.media.AudioFormat r4 = r4.c
            r2.c(r6, r7, r4, r8)
            java.lang.Object r10 = r10.m()
            ffhh r2 = defpackage.ffhh.a
            if (r10 == r2) goto L76
            ffcu r10 = defpackage.ffcu.a
        L76:
            if (r10 != r1) goto L79
            goto L94
        L79:
            r2 = r9
        L7a:
            ffrq r10 = new ffrq
            r10.<init>()
            ffsk r4 = r2.l
            dpdp r6 = new dpdp
            r6.<init>(r2, r10, r5)
            r2 = 3
            defpackage.ffqy.d(r4, r5, r5, r6, r2)
            r0.d = r5
            r0.c = r3
            java.lang.Object r10 = r10.B(r0)
            if (r10 != r1) goto L95
        L94:
            return r1
        L95:
            enru r10 = defpackage.dpds.a
            ensk r10 = r10.h()
            ensn r0 = defpackage.ente.a
            java.lang.String r1 = "HugoAudio"
            r10.Y(r0, r1)
            java.lang.String r0 = "start"
            r1 = 123(0x7b, float:1.72E-43)
            java.lang.String r2 = "com/google/android/libraries/compose/audio/processor/XenoAudioProcessor"
            java.lang.String r3 = "XenoAudioProcessor.kt"
            ensk r10 = r10.h(r2, r0, r1, r3)
            enrr r10 = (defpackage.enrr) r10
            java.lang.String r0 = "Successfully started audio processing."
            r10.q(r0)
            ffcu r10 = defpackage.ffcu.a
            return r10
        Lb8:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "This instance needs to be prepared prior to starting."
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpds.d(ffgu):java.lang.Object");
    }
}
