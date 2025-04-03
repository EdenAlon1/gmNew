package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpev implements dpeg {
    public static final enru a = enru.c("com/google/android/libraries/compose/audio/sink/FileAudioSink");
    public final ffsk b;
    public final dpbw c;
    public final dpbf d;
    public final Optional e;
    public final dpew f;
    public final ffrp g = new ffrq();
    public final fgcq h;
    public dpbk i;
    public volatile boolean j;
    public boolean k;
    public ffud l;
    private final ffhd m;
    private ffud n;
    private ffud o;

    public dpev(ffhd ffhdVar, ffsk ffskVar, dpbw dpbwVar, dpbf dpbfVar, Optional optional, dpew dpewVar) {
        this.m = ffhdVar;
        this.b = ffskVar;
        this.c = dpbwVar;
        this.d = dpbfVar;
        this.e = optional;
        this.f = dpewVar;
        this.h = dpewVar.c;
        Instant.EPOCH.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (defpackage.ffui.a(r6, r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004c, code lost:
    
        if (defpackage.ffui.a(r6, r0) != r1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.dpeh
            if (r0 == 0) goto L13
            r0 = r6
            dpeh r0 = (defpackage.dpeh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dpeh r0 = new dpeh
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            dpev r0 = r0.d
            defpackage.ffci.b(r6)
            goto L5f
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            dpev r2 = r0.d
            defpackage.ffci.b(r6)
            goto L4f
        L3a:
            defpackage.ffci.b(r6)
            r6 = 0
            r5.j = r6
            ffud r6 = r5.n
            if (r6 == 0) goto L4e
            r0.d = r5
            r0.c = r4
            java.lang.Object r6 = defpackage.ffui.a(r6, r0)
            if (r6 == r1) goto L5d
        L4e:
            r2 = r5
        L4f:
            ffud r6 = r2.o
            if (r6 == 0) goto L5e
            r0.d = r2
            r0.c = r3
            java.lang.Object r6 = defpackage.ffui.a(r6, r0)
            if (r6 != r1) goto L5e
        L5d:
            return r1
        L5e:
            r0 = r2
        L5f:
            r6 = 0
            r0.n = r6
            r0.o = r6
            ffcu r6 = defpackage.ffcu.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpev.a(ffgu):java.lang.Object");
    }

    @Override // defpackage.dpdc
    public final Object b(ffgu ffguVar) {
        Object a2 = ffra.a(this.m, new dpes(this, null), ffguVar);
        return a2 == ffhh.a ? a2 : ffcu.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.dpdc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ffgu r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.dpet
            if (r0 == 0) goto L13
            r0 = r8
            dpet r0 = (defpackage.dpet) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dpet r0 = new dpet
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            dpev r0 = r0.d
            defpackage.ffci.b(r8)
            goto L63
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L31:
            defpackage.ffci.b(r8)
            enru r8 = defpackage.dpev.a
            ensk r8 = r8.h()
            ensn r2 = defpackage.ente.a
            java.lang.String r4 = "HugoAudio"
            r8.Y(r2, r4)
            java.lang.String r2 = "release"
            r4 = 193(0xc1, float:2.7E-43)
            java.lang.String r5 = "com/google/android/libraries/compose/audio/sink/FileAudioSink"
            java.lang.String r6 = "FileAudioSink.kt"
            ensk r8 = r8.h(r5, r2, r4, r6)
            enrr r8 = (defpackage.enrr) r8
            dpew r2 = r7.f
            java.lang.String r4 = "Releasing FileAudioSink for %s"
            android.net.Uri r2 = r2.a
            r8.t(r4, r2)
            r0.d = r7
            r0.c = r3
            java.lang.Object r8 = r7.a(r0)
            if (r8 == r1) goto L6d
            r0 = r7
        L63:
            dpbk r8 = r0.i
            if (r8 == 0) goto L6a
            r8.h()
        L6a:
            ffcu r8 = defpackage.ffcu.a
            return r8
        L6d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpev.c(ffgu):java.lang.Object");
    }

    @Override // defpackage.dpdc
    public final Object d(ffgu ffguVar) {
        if (!h()) {
            throw new IllegalStateException("This instance needs to be prepared prior to starting");
        }
        ensk h = a.h();
        h.Y(ente.a, "HugoAudio");
        ((enrr) h.h("com/google/android/libraries/compose/audio/sink/FileAudioSink", ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME, 81, "FileAudioSink.kt")).t("Starting FileAudioSink for %s", this.f.a);
        Object g = g(ffguVar);
        return g == ffhh.a ? g : ffcu.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        if (r7.a(r6, r0) != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.Exception r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.dpei
            if (r0 == 0) goto L13
            r0 = r7
            dpei r0 = (defpackage.dpei) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dpei r0 = new dpei
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r7)
            goto L64
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.a
            dpev r2 = r0.e
            defpackage.ffci.b(r7)
            goto L4a
        L3a:
            defpackage.ffci.b(r7)
            r0.e = r5
            r0.a = r6
            r0.d = r4
            java.lang.Object r7 = r5.a(r0)
            if (r7 == r1) goto L67
            r2 = r5
        L4a:
            ffrp r7 = r2.g
            r4 = r6
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            r7.a(r4)
            dpew r7 = r2.f
            ffjm r7 = r7.j
            r2 = 0
            r0.e = r2
            r0.a = r2
            r0.d = r3
            java.lang.Object r6 = r7.a(r6, r0)
            if (r6 != r1) goto L64
            goto L67
        L64:
            ffcu r6 = defpackage.ffcu.a
            return r6
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpev.e(java.lang.Exception, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.ffgu r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.dpej
            if (r0 == 0) goto L13
            r0 = r8
            dpej r0 = (defpackage.dpej) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dpej r0 = new dpej
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r0 = r0.a
            defpackage.ffci.b(r8)
            return r0
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L31:
            defpackage.ffci.b(r8)
            ffrq r8 = new ffrq
            r8.<init>()
            ffsk r2 = r7.b
            dpeo r4 = new dpeo
            r5 = 0
            r4.<init>(r7, r8, r5)
            r6 = 3
            ffud r2 = defpackage.ffqy.d(r2, r5, r5, r4, r6)
            r0.a = r2
            r0.d = r3
            java.lang.Object r8 = r8.B(r0)
            if (r8 != r1) goto L51
            return r1
        L51:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpev.f(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.dpeu
            if (r0 == 0) goto L13
            r0 = r6
            dpeu r0 = (defpackage.dpeu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dpeu r0 = new dpeu
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            dpev r1 = r0.e
            dpev r0 = r0.d
            defpackage.ffci.b(r6)
            goto L5c
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            defpackage.ffci.b(r6)
            ffud r6 = r5.n
            if (r6 != 0) goto L72
            ffud r6 = r5.o
            if (r6 != 0) goto L72
            dpbk r6 = r5.i
            if (r6 != 0) goto L49
            java.lang.String r6 = "encoder"
            defpackage.ffkj.c(r6)
            r6 = r4
        L49:
            r6.i()
            r5.j = r3
            r0.d = r5
            r0.e = r5
            r0.c = r3
            java.lang.Object r6 = r5.f(r0)
            if (r6 == r1) goto L71
            r0 = r5
            r1 = r0
        L5c:
            ffud r6 = (defpackage.ffud) r6
            r1.n = r6
            dper r6 = new dper
            r6.<init>(r0, r4)
            ffsk r1 = r0.b
            r2 = 3
            ffud r6 = defpackage.ffqy.d(r1, r4, r4, r6, r2)
            r0.o = r6
            ffcu r6 = defpackage.ffcu.a
            return r6
        L71:
            return r1
        L72:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "FileAudioSink cannot start while previous jobs are active."
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpev.g(ffgu):java.lang.Object");
    }

    public final boolean h() {
        return this.i != null;
    }
}
