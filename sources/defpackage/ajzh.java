package defpackage;

import android.util.Base64;
import j$.time.Instant;
import j$.time.temporal.ChronoUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajzh implements cfzm {
    private final ffbr a;
    private final ffsk b;

    public ajzh(ffbr ffbrVar, ffsk ffskVar) {
        ffbrVar.getClass();
        ffskVar.getClass();
        this.a = ffbrVar;
        this.b = ffskVar;
    }

    private static final String f(ajwc ajwcVar) {
        Instant instant;
        String encodeToString = Base64.encodeToString(cqjf.c(ajwcVar.a), 2);
        String name = ajwcVar.b.name();
        String name2 = ajwcVar.c.name();
        Instant truncatedTo = ajwcVar.d.truncatedTo(ChronoUnit.SECONDS);
        Instant instant2 = ajwcVar.e;
        String str = null;
        Instant truncatedTo2 = instant2 != null ? instant2.truncatedTo(ChronoUnit.SECONDS) : null;
        akcd akcdVar = ajwcVar.f;
        if (akcdVar != null) {
            String str2 = akcdVar.d;
            eyja eyjaVar = akcdVar.e;
            if (eyjaVar == null) {
                eyjaVar = eyja.a;
            }
            eyiz eyizVar = (eyiz) eyjaVar.toBuilder();
            eyizVar.copyOnWrite();
            ((eyja) eyizVar.instance).c = 0;
            eyfy build = eyizVar.build();
            build.getClass();
            instant = truncatedTo2;
            str = "backupId: [" + str2 + "], backupTimestamp: [" + eykn.d((eyja) build) + ", schemaVersion: [" + akcdVar.c + "], minBackupSchemaVersion: [" + akcdVar.f + "], restoreWorkflowVersion: [" + akcdVar.g + "]";
        } else {
            instant = truncatedTo2;
        }
        return "{sessionId = [" + ajwcVar.a + "], sessionId64 = [" + encodeToString + "], feature = [" + name + "], status = [" + name2 + "], startTime = [" + truncatedTo + "], finishTime = [" + instant + "], dbMetaData = [" + str + "]";
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0057 A[LOOP:0: B:11:0x0051->B:13:0x0057, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.ajzb
            if (r0 == 0) goto L13
            r0 = r6
            ajzb r0 = (defpackage.ajzb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ajzb r0 = new ajzb
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.StringBuilder r0 = r0.d
            defpackage.ffci.b(r6)
            goto L4b
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            defpackage.ffci.b(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r2 = "Section: RestoreWorkflow\n"
            r6.append(r2)
            r0.d = r6
            r0.c = r3
            java.lang.Object r0 = r5.e(r0)
            if (r0 == r1) goto L8a
            r4 = r0
            r0 = r6
            r6 = r4
        L4b:
            java.util.List r6 = (java.util.List) r6
            java.util.Iterator r6 = r6.iterator()
        L51:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L82
            java.lang.Object r1 = r6.next()
            cfzl r1 = (defpackage.cfzl) r1
            java.lang.String r2 = r1.a()
            java.lang.String r1 = r1.b()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = ": "
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = "\n"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.append(r1)
            goto L51
        L82:
            java.lang.String r6 = r0.toString()
            r6.getClass()
            return r6
        L8a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajzh.a(ffgu):java.lang.Object");
    }

    @Override // defpackage.cfzm
    public final elfl b() {
        elfl c;
        c = axol.c(this.b, ffhe.a, ffsm.a, new ajzf(this, null));
        return c;
    }

    @Override // defpackage.cfzm
    public final /* synthetic */ elfl c() {
        return cfzj.c();
    }

    @Override // defpackage.cfzm
    public final elfl d() {
        elfl c;
        c = axol.c(this.b, ffhe.a, ffsm.a, new ajzg(this, null));
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x012f A[LOOP:0: B:12:0x0129->B:14:0x012f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b1 A[LOOP:1: B:23:0x00ab->B:25:0x00b1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.ffgu r15) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajzh.e(ffgu):java.lang.Object");
    }
}
