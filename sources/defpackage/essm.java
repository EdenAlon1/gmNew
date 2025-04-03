package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class essm {
    public static final espw a(fedn fednVar, cpgj cpgjVar) {
        fednVar.getClass();
        Status status = fednVar.a;
        status.getClass();
        return b(status, fednVar.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r5 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.espw b(io.grpc.Status r4, defpackage.febo r5) {
        /*
            r0 = 0
            if (r5 == 0) goto L18
            essl r1 = new essl
            r1.<init>()
            int r2 = defpackage.febj.d
            febg r2 = new febg
            java.lang.String r3 = "google.internal.communications.instantmessaging.v1.tachyonerror-bin"
            r2.<init>(r3, r1)
            java.lang.Object r5 = r5.b(r2)
            fcge r5 = (defpackage.fcge) r5
            goto L19
        L18:
            r5 = r0
        L19:
            if (r5 == 0) goto L27
            int r5 = r5.b
            fgtr r5 = defpackage.fgtr.b(r5)
            if (r5 != 0) goto L25
            fgtr r5 = defpackage.fgtr.UNRECOGNIZED
        L25:
            if (r5 != 0) goto L29
        L27:
            fgtr r5 = defpackage.fgtr.UNKNOWN
        L29:
            espw r1 = new espw
            io.grpc.Status$Code r2 = r4.getCode()
            int r3 = r2.ordinal()
            switch(r3) {
                case 1: goto L73;
                case 2: goto L70;
                case 3: goto L6d;
                case 4: goto L6a;
                case 5: goto L67;
                case 6: goto L64;
                case 7: goto L61;
                case 8: goto L5e;
                case 9: goto L5b;
                case 10: goto L58;
                case 11: goto L55;
                case 12: goto L52;
                case 13: goto L4f;
                case 14: goto L4c;
                case 15: goto L49;
                case 16: goto L46;
                default: goto L36;
            }
        L36:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r2.toString()
            java.lang.String r0 = "unknown enum value: "
            java.lang.String r5 = r0.concat(r5)
            r4.<init>(r5)
            throw r4
        L46:
            espt r2 = defpackage.espt.p
            goto L75
        L49:
            espt r2 = defpackage.espt.o
            goto L75
        L4c:
            espt r2 = defpackage.espt.n
            goto L75
        L4f:
            espt r2 = defpackage.espt.m
            goto L75
        L52:
            espt r2 = defpackage.espt.l
            goto L75
        L55:
            espt r2 = defpackage.espt.k
            goto L75
        L58:
            espt r2 = defpackage.espt.j
            goto L75
        L5b:
            espt r2 = defpackage.espt.i
            goto L75
        L5e:
            espt r2 = defpackage.espt.h
            goto L75
        L61:
            espt r2 = defpackage.espt.g
            goto L75
        L64:
            espt r2 = defpackage.espt.f
            goto L75
        L67:
            espt r2 = defpackage.espt.e
            goto L75
        L6a:
            espt r2 = defpackage.espt.d
            goto L75
        L6d:
            espt r2 = defpackage.espt.c
            goto L75
        L70:
            espt r2 = defpackage.espt.b
            goto L75
        L73:
            espt r2 = defpackage.espt.a
        L75:
            r2.getClass()
            io.grpc.Status$Code r4 = r4.getCode()
            int r5 = r5.ordinal()
            switch(r5) {
                case 0: goto L9b;
                case 1: goto L9b;
                case 2: goto L9b;
                case 3: goto L9b;
                case 4: goto L98;
                case 5: goto L98;
                case 6: goto L9b;
                case 7: goto L9b;
                case 8: goto L9b;
                case 9: goto L9b;
                case 10: goto L98;
                case 11: goto L9b;
                case 12: goto L9b;
                case 13: goto L9b;
                case 14: goto L9b;
                case 15: goto L9b;
                case 16: goto L9b;
                case 17: goto L9b;
                case 18: goto L9b;
                case 19: goto L9b;
                case 20: goto L9b;
                case 21: goto L9b;
                case 22: goto L9b;
                case 23: goto L9b;
                case 24: goto L9b;
                case 25: goto L9b;
                case 26: goto L9b;
                case 27: goto L9b;
                case 28: goto L9b;
                case 29: goto L9b;
                case 30: goto L9b;
                case 31: goto L95;
                case 32: goto L9b;
                case 33: goto L95;
                case 34: goto L92;
                case 35: goto L8f;
                case 36: goto L8c;
                case 37: goto L9b;
                case 38: goto L98;
                case 39: goto L89;
                case 40: goto L9b;
                case 41: goto L9b;
                case 42: goto L9b;
                case 43: goto L9b;
                default: goto L83;
            }
        L83:
            ffcd r4 = new ffcd
            r4.<init>()
            throw r4
        L89:
            espv r5 = defpackage.espv.g
            goto L9c
        L8c:
            espv r5 = defpackage.espv.a
            goto L9c
        L8f:
            espv r5 = defpackage.espv.f
            goto L9c
        L92:
            espv r5 = defpackage.espv.e
            goto L9c
        L95:
            espv r5 = defpackage.espv.d
            goto L9c
        L98:
            espv r5 = defpackage.espv.c
            goto L9c
        L9b:
            r5 = r0
        L9c:
            if (r5 != 0) goto Lb3
            int r4 = r4.ordinal()
            switch(r4) {
                case 0: goto Lad;
                case 1: goto Lab;
                case 2: goto Lab;
                case 3: goto Lad;
                case 4: goto Lab;
                case 5: goto Lad;
                case 6: goto Lad;
                case 7: goto Lad;
                case 8: goto Lab;
                case 9: goto Lad;
                case 10: goto Lab;
                case 11: goto Lad;
                case 12: goto Lad;
                case 13: goto Lab;
                case 14: goto Lab;
                case 15: goto Lad;
                case 16: goto Lad;
                default: goto La5;
            }
        La5:
            ffcd r4 = new ffcd
            r4.<init>()
            throw r4
        Lab:
            espv r0 = defpackage.espv.b
        Lad:
            if (r0 != 0) goto Lb2
            espv r5 = defpackage.espv.a
            goto Lb3
        Lb2:
            r5 = r0
        Lb3:
            r1.<init>(r2, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.essm.b(io.grpc.Status, febo):espw");
    }
}
