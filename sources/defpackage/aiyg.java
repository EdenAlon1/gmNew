package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aiyg {
    public static final febj a;

    static {
        fagm fagmVar = fagm.a;
        eyfc eyfcVar = ffag.a;
        ffaf ffafVar = new ffaf(fagmVar);
        int i = febj.d;
        a = new febg("grpc-status-details-bin", ffafVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.aizl a(java.lang.Exception r5) {
        /*
            boolean r0 = r5 instanceof defpackage.fedn
            r1 = 0
            if (r0 != 0) goto Lb
            boolean r2 = r5 instanceof io.grpc.StatusException
            if (r2 == 0) goto La
            goto Lb
        La:
            return r1
        Lb:
            if (r0 == 0) goto L17
            r2 = r5
            fedn r2 = (defpackage.fedn) r2
            io.grpc.Status r2 = r2.a
            io.grpc.Status$Code r2 = r2.getCode()
            goto L20
        L17:
            r2 = r5
            io.grpc.StatusException r2 = (io.grpc.StatusException) r2
            io.grpc.Status r2 = r2.a
            io.grpc.Status$Code r2 = r2.getCode()
        L20:
            int r2 = r2.ordinal()
            r3 = 2
            if (r2 == r3) goto Lc3
            r3 = 4
            if (r2 == r3) goto Lbd
            r3 = 16
            if (r2 == r3) goto Lb7
            r3 = 7
            if (r2 == r3) goto Lb7
            r3 = 8
            if (r2 == r3) goto L49
            r0 = 13
            if (r2 == r0) goto Lc3
            r0 = 14
            if (r2 == r0) goto L43
            aizn r0 = new aizn
            r0.<init>(r5)
            return r0
        L43:
            aize r0 = new aize
            r0.<init>(r5)
            return r0
        L49:
            if (r0 == 0) goto L51
            r0 = r5
            fedn r0 = (defpackage.fedn) r0
            febo r0 = r0.b
            goto L56
        L51:
            r0 = r5
            io.grpc.StatusException r0 = (io.grpc.StatusException) r0
            febo r0 = r0.b
        L56:
            if (r0 == 0) goto L61
            febj r2 = defpackage.aiyg.a
            java.lang.Object r0 = r0.b(r2)
            fagm r0 = (defpackage.fagm) r0
            goto L62
        L61:
            r0 = r1
        L62:
            if (r0 == 0) goto L8c
            eygr r0 = r0.d
            r0.getClass()
            java.util.Iterator r0 = r0.iterator()
        L6d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L88
            java.lang.Object r2 = r0.next()
            r3 = r2
            eydq r3 = (defpackage.eydq) r3
            java.lang.String r3 = r3.b
            r3.getClass()
            java.lang.String r4 = "ErrorInfo"
            boolean r3 = defpackage.ffpc.M(r3, r4)
            if (r3 == 0) goto L6d
            goto L89
        L88:
            r2 = r1
        L89:
            eydq r2 = (defpackage.eydq) r2
            goto L8d
        L8c:
            r2 = r1
        L8d:
            if (r2 == 0) goto L9e
            eyee r0 = r2.c     // Catch: defpackage.eygu -> L9a
            fagk r2 = defpackage.fagk.a     // Catch: defpackage.eygu -> L9a
            eyfy r0 = defpackage.eyfy.parseFrom(r2, r0)     // Catch: defpackage.eygu -> L9a
            fagk r0 = (defpackage.fagk) r0     // Catch: defpackage.eygu -> L9a
            goto L9f
        L9a:
            r0 = move-exception
            defpackage.ffbt.a(r5, r0)
        L9e:
            r0 = r1
        L9f:
            if (r0 == 0) goto La3
            java.lang.String r1 = r0.b
        La3:
            java.lang.String r0 = "SERVER_THROTTLED"
            boolean r0 = defpackage.ffkj.e(r1, r0)
            if (r0 == 0) goto Lb1
            aizk r0 = new aizk
            r0.<init>(r5)
            goto Lb6
        Lb1:
            aizi r0 = new aizi
            r0.<init>(r5)
        Lb6:
            return r0
        Lb7:
            aizm r0 = new aizm
            r0.<init>(r5)
            return r0
        Lbd:
            aiyf r0 = new aiyf
            r0.<init>(r5)
            return r0
        Lc3:
            aizj r0 = new aizj
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiyg.a(java.lang.Exception):aizl");
    }

    public static final aizf b(int i) {
        Status.Code code = Status.Code.OK;
        int i2 = i - 2;
        return (i2 == 7 || i2 == 8 || i2 == 9) ? new aiyj(i) : new aiye(i);
    }
}
