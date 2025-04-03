package defpackage;

import java.lang.reflect.InvocationHandler;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fjdv implements InvocationHandler {
    final /* synthetic */ Class a;
    final /* synthetic */ fjdx b;
    private final fjdp c = fjdp.a;
    private final Object[] d = new Object[0];

    public fjdv(fjdx fjdxVar, Class cls) {
        this.a = cls;
        this.b = fjdxVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:178:0x030d, code lost:
    
        r5 = r13.responseType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0313, code lost:
    
        if (r5 == defpackage.fhhb.class) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0317, code lost:
    
        if (r5 == defpackage.fjdu.class) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0321, code lost:
    
        if (r1.c.equals("HEAD") == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0329, code lost:
    
        if (java.lang.Void.class.equals(r5) == false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0335, code lost:
    
        throw defpackage.fjee.b(r21, "HEAD method must use Void as response type.", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x033a, code lost:
    
        r5 = r3.b(r5, r21.getAnnotations());
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x033e, code lost:
    
        r6 = r3.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0340, code lost:
    
        if (r4 != false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0342, code lost:
    
        r4 = new defpackage.fjcc(r1, r6, r5, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0355, code lost:
    
        r3.a.put(r21, r4);
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0348, code lost:
    
        if (r7 == false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x034a, code lost:
    
        r4 = new defpackage.fjce(r1, r6, r5, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0350, code lost:
    
        r4 = new defpackage.fjcd(r1, r6, r5, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x035d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x036b, code lost:
    
        throw defpackage.fjee.c(r21, r0, "Unable to create converter for %s", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0375, code lost:
    
        throw defpackage.fjee.b(r21, "Response must include generic type (e.g., Response<String>)", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x039b, code lost:
    
        throw defpackage.fjee.b(r21, "'" + defpackage.fjee.a(r5).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x03a0, code lost:
    
        r0 = new java.lang.StringBuilder("Could not locate call adapter for ");
        r0.append(r10);
        r0.append(".\n  Tried:");
        r1 = r3.e.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x03b3, code lost:
    
        if (r6 >= r1) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x03b5, code lost:
    
        r0.append("\n   * ");
        r0.append(((defpackage.fjbk) r3.e.get(r6)).getClass().getName());
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x03d9, code lost:
    
        throw new java.lang.IllegalArgumentException(r0.toString());
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    @Override // java.lang.reflect.InvocationHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r20, java.lang.reflect.Method r21, java.lang.Object[] r22) {
        /*
            Method dump skipped, instructions count: 1059
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fjdv.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
    }
}
