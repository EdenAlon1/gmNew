package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecum {
    private static final emye d = emye.b('/').a();
    public static final ecul a = new ecui();
    public static final ecul b = new ecuj();
    public static final ecul c = new ecuk();

    public static List a(String str) {
        return enkr.g(d.i(str), new emwl() { // from class: ecuh
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return eukl.a((String) obj);
            }
        });
    }

    public static void b(ecul eculVar, eyhr eyhrVar) {
        String a2 = eculVar.a(eyhrVar);
        String b2 = eculVar.b(eyhrVar);
        if (!a2.isEmpty() || b2.isEmpty()) {
            eculVar.c(eyhrVar, null);
        } else {
            eculVar.c(eyhrVar, eukl.a(b2));
        }
        eculVar.d(eyhrVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0158, code lost:
    
        if (r1 != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00da, code lost:
    
        if (r0.equals("Attempt to do a synchronize operation on a null object") == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0102, code lost:
    
        if (java.util.regex.Pattern.matches("Conflicting default method implementations .+", r0) == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0134, code lost:
    
        if (java.util.regex.Pattern.matches("Method '.+' implementing interface method '.+' is not public", r0) == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01d2, code lost:
    
        if (java.util.regex.Pattern.matches(".*unmatched serializable field(s) declared", r0) == false) goto L124;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.erhu c(defpackage.erhu r5) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ecum.c(erhu):erhu");
    }
}
