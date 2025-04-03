package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecib extends ecid {
    public static final ecib a = new ecib();

    private ecib() {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005b A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0039  */
    @Override // defpackage.ecid
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ defpackage.eyhs a(java.lang.String r5, java.lang.Object r6) {
        /*
            r4 = this;
            android.os.health.HealthStats r6 = defpackage.afg$$ExternalSyntheticApiModelOutline0.m93m(r6)
            fglg r0 = defpackage.fglg.a
            eyfq r0 = r0.createBuilder()
            fglf r0 = (defpackage.fglf) r0
            ecie r1 = defpackage.ecie.a
            r2 = 40001(0x9c41, float:5.6053E-41)
            java.util.Map r2 = defpackage.ecig.c(r6, r2)
            java.util.List r1 = r1.d(r2)
            r0.a(r1)
            ecia r1 = defpackage.ecia.a
            if (r6 == 0) goto L2e
            r2 = 40002(0x9c42, float:5.6055E-41)
            boolean r3 = defpackage.afg$$ExternalSyntheticApiModelOutline0.m111m(r6, r2)
            if (r3 == 0) goto L2e
            java.util.Map r6 = defpackage.afg$$ExternalSyntheticApiModelOutline0.m103m(r6, r2)
            goto L30
        L2e:
            java.util.Map r6 = java.util.Collections.EMPTY_MAP
        L30:
            java.util.List r6 = r1.d(r6)
            r0.b(r6)
            if (r5 == 0) goto L4f
            fgle r5 = defpackage.ecig.d(r5)
            r0.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r6 = r0.instance
            fglg r6 = (defpackage.fglg) r6
            r5.getClass()
            r6.e = r5
            int r5 = r6.b
            r5 = r5 | 1
            r6.b = r5
        L4f:
            eyfy r5 = r0.build()
            fglg r5 = (defpackage.fglg) r5
            boolean r6 = defpackage.ecig.i(r5)
            if (r6 == 0) goto L5c
            r5 = 0
        L5c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ecib.a(java.lang.String, java.lang.Object):eyhs");
    }

    @Override // defpackage.ecid
    public final /* synthetic */ eyhs b(eyhs eyhsVar, eyhs eyhsVar2) {
        fglg fglgVar = (fglg) eyhsVar;
        fglg fglgVar2 = (fglg) eyhsVar2;
        if (fglgVar == null || fglgVar2 == null) {
            return fglgVar;
        }
        fglf fglfVar = (fglf) fglg.a.createBuilder();
        fglfVar.a(ecie.a.e(fglgVar.c, fglgVar2.c));
        fglfVar.b(ecia.a.e(fglgVar.d, fglgVar2.d));
        fgle fgleVar = fglgVar.e;
        if (fgleVar == null) {
            fgleVar = fgle.a;
        }
        fglfVar.copyOnWrite();
        fglg fglgVar3 = (fglg) fglfVar.instance;
        fgleVar.getClass();
        fglgVar3.e = fgleVar;
        fglgVar3.b |= 1;
        fglg fglgVar4 = (fglg) fglfVar.build();
        if (ecig.i(fglgVar4)) {
            return null;
        }
        return fglgVar4;
    }

    @Override // defpackage.ecid
    public final /* bridge */ /* synthetic */ String c(eyhs eyhsVar) {
        fgle fgleVar = ((fglg) eyhsVar).e;
        if (fgleVar == null) {
            fgleVar = fgle.a;
        }
        return fgleVar.d;
    }
}
