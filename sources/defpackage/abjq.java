package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abjq extends ffhu implements ffjm {
    int a;
    int b;
    final /* synthetic */ ffji c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abjq(ffji ffjiVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = ffjiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((abjq) c((iju) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0027 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0057 A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0025 -> B:4:0x0028). Please report as a decompilation issue!!! */
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
            r3 = 0
            if (r1 == 0) goto L12
            int r1 = r8.a
            java.lang.Object r4 = r8.d
            iju r4 = (defpackage.iju) r4
            defpackage.ffci.b(r9)
            goto L28
        L12:
            defpackage.ffci.b(r9)
            java.lang.Object r9 = r8.d
            iju r9 = (defpackage.iju) r9
            r4 = r9
            r1 = r3
        L1b:
            r8.d = r4
            r8.a = r1
            r8.b = r2
            java.lang.Object r9 = defpackage.ijt.a(r4, r8)
            if (r9 != r0) goto L28
            return r0
        L28:
            iki r9 = (defpackage.iki) r9
            java.util.List r5 = r9.a
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L34
        L32:
            r5 = r3
            goto L55
        L34:
            java.util.Iterator r5 = r5.iterator()
            r6 = r3
        L39:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L51
            java.lang.Object r7 = r5.next()
            iku r7 = (defpackage.iku) r7
            boolean r7 = r7.d
            if (r7 == 0) goto L39
            int r6 = r6 + 1
            if (r6 >= 0) goto L39
            defpackage.ffdx.k()
            goto L39
        L51:
            r5 = 2
            if (r6 != r5) goto L32
            r5 = r2
        L55:
            if (r1 != 0) goto L61
            if (r5 == 0) goto L61
            ffji r1 = r8.c
            abjn r6 = defpackage.abjn.a
            r1.invoke(r6)
            r1 = r2
        L61:
            if (r5 == 0) goto L71
            ffji r5 = r8.c
            abjl r6 = new abjl
            float r7 = defpackage.duc.c(r9)
            r6.<init>(r7)
            r5.invoke(r6)
        L71:
            java.util.List r9 = r9.a
            boolean r5 = r9.isEmpty()
            if (r5 == 0) goto L7a
            goto L8f
        L7a:
            java.util.Iterator r9 = r9.iterator()
        L7e:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L8f
            java.lang.Object r5 = r9.next()
            iku r5 = (defpackage.iku) r5
            boolean r5 = r5.d
            if (r5 == 0) goto L7e
            goto L1b
        L8f:
            if (r1 == 0) goto L98
            ffji r9 = r8.c
            abjm r0 = defpackage.abjm.a
            r9.invoke(r0)
        L98:
            ffcu r9 = defpackage.ffcu.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abjq.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        abjq abjqVar = new abjq(this.c, ffguVar);
        abjqVar.d = obj;
        return abjqVar;
    }
}
