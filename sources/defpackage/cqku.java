package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqku implements cpws {
    static final cfup a;
    static final cfup b;
    static final cfup c;
    private final ffbr d;

    static {
        ecwh ecwhVar = cfvl.a;
        cfvk cfvkVar = new cfvk(cfvl.a, "bugle_phenotype__");
        a = cfvl.c(cfvkVar.a, cfvkVar.b.concat("message_count_mismatch_detection_threshold"), 0.05d);
        b = new cfvk(cfvl.a, "bugle_phenotype__").a("bugle_db_is_not_empty_threshold", 5);
        c = new cfvk(cfvl.a, "bugle_phenotype__").a("telephony_db_considered_empty_threshold", 1);
    }

    public cqku(ffbr ffbrVar) {
        this.d = ffbrVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005d, code lost:
    
        if (r1 < (r0 * ((java.lang.Double) defpackage.cqku.a.e()).doubleValue())) goto L16;
     */
    @Override // defpackage.cpws
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.util.Optional a() {
        /*
            r8 = this;
            buxo r0 = com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable.d()
            java.lang.String r1 = "detectWipeout"
            r0.z(r1)
            r0.r()
            buxm r0 = r0.b()
            int r0 = r0.i()
            ffbr r1 = r8.d
            java.lang.Object r1 = r1.b()
            coyq r1 = (defpackage.coyq) r1
            int r1 = r1.am()
            cfup r2 = defpackage.cqku.b
            java.lang.Object r2 = r2.e()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = 1
            if (r0 < r2) goto L49
            cfup r2 = defpackage.cqku.c
            java.lang.Object r2 = r2.e()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r1 >= r2) goto L49
            if (r0 > r1) goto L40
            goto L49
        L40:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            j$.util.Optional r0 = j$.util.Optional.of(r0)
            return r0
        L49:
            r2 = 0
            if (r1 <= 0) goto L60
            double r4 = (double) r0
            cfup r0 = defpackage.cqku.a
            java.lang.Object r0 = r0.e()
            java.lang.Double r0 = (java.lang.Double) r0
            double r6 = r0.doubleValue()
            double r4 = r4 * r6
            double r0 = (double) r1
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L60
            goto L61
        L60:
            r3 = r2
        L61:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            j$.util.Optional r0 = j$.util.Optional.of(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqku.a():j$.util.Optional");
    }
}
