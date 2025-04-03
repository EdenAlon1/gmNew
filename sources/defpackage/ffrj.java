package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffrj {
    /* JADX WARN: Code restructure failed: missing block: B:28:0x002e, code lost:
    
        if (r0 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0030, code lost:
    
        r5 = defpackage.ffso.a;
        r5 = r0.d.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0038, code lost:
    
        if ((r5 instanceof defpackage.ffrs) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003a, code lost:
    
        r5 = ((defpackage.ffrs) r5).d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x003e, code lost:
    
        r0.c.c = 536870911;
        r0.d.c(defpackage.ffqr.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
    
        return new defpackage.ffrh(r5, 2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.ffrh a(defpackage.ffgu r5) {
        /*
            boolean r0 = r5 instanceof defpackage.fggk
            if (r0 != 0) goto Lb
            ffrh r0 = new ffrh
            r1 = 1
            r0.<init>(r5, r1)
            return r0
        Lb:
            r0 = r5
            fggk r0 = (defpackage.fggk) r0
            ffqn r1 = r0.f
        L10:
            java.lang.Object r2 = r1.a
            if (r2 != 0) goto L1d
            ffqn r0 = r0.f
            fgho r1 = defpackage.fggl.b
            r0.c(r1)
            r0 = 0
            goto L2e
        L1d:
            boolean r3 = r2 instanceof defpackage.ffrh
            if (r3 == 0) goto L54
            ffqn r3 = r0.f
            fgho r4 = defpackage.fggl.b
            boolean r3 = r3.d(r2, r4)
            if (r3 == 0) goto L10
            r0 = r2
            ffrh r0 = (defpackage.ffrh) r0
        L2e:
            if (r0 == 0) goto L4d
            boolean r5 = defpackage.ffso.a
            ffqn r5 = r0.d
            java.lang.Object r5 = r5.a
            boolean r1 = r5 instanceof defpackage.ffrs
            if (r1 == 0) goto L3e
            ffrs r5 = (defpackage.ffrs) r5
            java.lang.Object r5 = r5.d
        L3e:
            ffql r5 = r0.c
            r1 = 536870911(0x1fffffff, float:1.0842021E-19)
            r5.c = r1
            ffqn r5 = r0.d
            ffqr r1 = defpackage.ffqr.a
            r5.c(r1)
            return r0
        L4d:
            ffrh r0 = new ffrh
            r1 = 2
            r0.<init>(r5, r1)
            return r0
        L54:
            fgho r3 = defpackage.fggl.b
            if (r2 == r3) goto L10
            boolean r3 = r2 instanceof java.lang.Throwable
            if (r3 == 0) goto L5d
            goto L10
        L5d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.util.Objects.toString(r2)
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = "Inconsistent state "
            java.lang.String r0 = r1.concat(r0)
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffrj.a(ffgu):ffrh");
    }

    public static final void b(ffrf ffrfVar, ffte ffteVar) {
        ((ffrh) ffrfVar).D(new fftf(ffteVar));
    }
}
