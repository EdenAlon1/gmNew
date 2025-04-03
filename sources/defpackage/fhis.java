package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhis {
    static {
        fhmx fhmxVar = fhmx.a;
        fhmw.b("\"\\");
        fhmw.b("\t ,=");
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x0245, code lost:
    
        throw new java.lang.IllegalArgumentException("Failed requirement.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x024c, code lost:
    
        throw new java.lang.IllegalArgumentException("Failed requirement.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x025a, code lost:
    
        throw new java.lang.IllegalArgumentException("Failed requirement.");
     */
    /* JADX WARN: Removed duplicated region for block: B:252:0x04e2  */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.fhft r45, defpackage.fhgk r46, defpackage.fhgh r47) {
        /*
            Method dump skipped, instructions count: 1383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhis.a(fhft, fhgk, fhgh):void");
    }

    public static final boolean b(fhhb fhhbVar) {
        if (ffkj.e(fhhbVar.a.b, "HEAD")) {
            return false;
        }
        int i = fhhbVar.d;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && fhhl.i(fhhbVar) == -1 && !ffpc.j("chunked", fhhb.b(fhhbVar, "Transfer-Encoding"), true)) ? false : true;
    }
}
