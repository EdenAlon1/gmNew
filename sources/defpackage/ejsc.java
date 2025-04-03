package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejsc implements ffxy {
    final /* synthetic */ ffsk a;
    final /* synthetic */ fgjb b;
    final /* synthetic */ fflb c;
    final /* synthetic */ ffjn d;
    final /* synthetic */ ffji e;
    final /* synthetic */ List f;
    final /* synthetic */ ffxe g;

    public ejsc(ffsk ffskVar, fgjb fgjbVar, fflb fflbVar, ffjn ffjnVar, ffji ffjiVar, List list, ffxe ffxeVar) {
        this.a = ffskVar;
        this.b = fgjbVar;
        this.c = fflbVar;
        this.d = ffjnVar;
        this.e = ffjiVar;
        this.f = list;
        this.g = ffxeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0080 A[Catch: all -> 0x00a5, TryCatch #0 {all -> 0x00a5, blocks: (B:11:0x0079, B:13:0x0080, B:15:0x0087, B:16:0x0090, B:20:0x009d, B:21:0x00a4), top: B:10:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009d A[Catch: all -> 0x00a5, TRY_ENTER, TryCatch #0 {all -> 0x00a5, blocks: (B:11:0x0079, B:13:0x0080, B:15:0x0087, B:16:0x0090, B:20:0x009d, B:21:0x00a4), top: B:10:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.ffxy
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fQ(defpackage.ffxx r17, defpackage.ffgu r18) {
        /*
            r16 = this;
            r1 = r16
            r0 = r18
            boolean r2 = r0 instanceof defpackage.ejrz
            if (r2 == 0) goto L17
            r2 = r0
            ejrz r2 = (defpackage.ejrz) r2
            int r3 = r2.e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.e = r3
            goto L1c
        L17:
            ejrz r2 = new ejrz
            r2.<init>(r1, r0)
        L1c:
            java.lang.Object r0 = r2.c
            ffhh r3 = defpackage.ffhh.a
            int r4 = r2.e
            r6 = 1
            if (r4 == 0) goto L39
            if (r4 != r6) goto L31
            java.lang.Object r3 = r2.b
            fgjf r4 = r2.f
            java.lang.Object r2 = r2.a
            defpackage.ffci.b(r0)
            goto L79
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L39:
            defpackage.ffci.b(r0)
            ffsk r0 = r1.a
            fgjb r10 = r1.b
            fflb r11 = r1.c
            ffjn r12 = r1.d
            ffji r13 = r1.e
            java.util.List r14 = r1.f
            ffxe r15 = r1.g
            ffsm r4 = defpackage.ffsm.b
            ffhe r7 = defpackage.ffhe.a
            ffhd r7 = defpackage.ekxi.a(r7)
            r8 = r7
            ejry r7 = new ejry
            r9 = r8
            r8 = 0
            r5 = r9
            r9 = r17
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            ffud r0 = defpackage.ffra.c(r0, r5, r4, r7)
            fgjb r4 = r1.b
            java.util.List r5 = r1.f
            r2.a = r0
            r7 = r4
            fgjf r7 = (defpackage.fgjf) r7
            r2.f = r7
            r2.b = r5
            r2.e = r6
            r7 = 0
            java.lang.Object r2 = r4.a(r7, r2)
            if (r2 == r3) goto Lab
            r2 = r0
            r3 = r5
        L79:
            int r0 = r3.size()     // Catch: java.lang.Throwable -> La5
            r5 = 2
            if (r0 > r5) goto L9d
            int r0 = r3.size()     // Catch: java.lang.Throwable -> La5
            int r0 = r0 + r6
            if (r0 <= r5) goto L90
            java.lang.Object r0 = r3.remove(r6)     // Catch: java.lang.Throwable -> La5
            ffud r0 = (defpackage.ffud) r0     // Catch: java.lang.Throwable -> La5
            defpackage.ffub.a(r0)     // Catch: java.lang.Throwable -> La5
        L90:
            r3.add(r2)     // Catch: java.lang.Throwable -> La5
            r7 = 0
            r4.b(r7)
            r2.z()
            ffcu r0 = defpackage.ffcu.a
            return r0
        L9d:
            java.lang.String r0 = "This Job queue has overflowed. Please report this as a bug at go/tiktok-bug"
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> La5
            r2.<init>(r0)     // Catch: java.lang.Throwable -> La5
            throw r2     // Catch: java.lang.Throwable -> La5
        La5:
            r0 = move-exception
            r7 = 0
            r4.b(r7)
            throw r0
        Lab:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ejsc.fQ(ffxx, ffgu):java.lang.Object");
    }
}
