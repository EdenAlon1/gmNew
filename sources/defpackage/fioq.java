package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fioq implements fior {
    private static final fioz a;
    private static final fioz b;
    private static final fioz c;
    private static final fioz d;
    private static final fioz e;
    private static final fioz f;

    static {
        fioy a2 = fioz.a();
        a2.b('A', 'Z');
        a2.b('a', 'z');
        fioz fiozVar = new fioz(a2);
        a = fiozVar;
        b = fiozVar;
        fioy b2 = fiozVar.b();
        b2.b('0', '9');
        b2.a('-');
        c = new fioz(b2);
        fioy b3 = fiozVar.b();
        b3.a('_');
        b3.a(':');
        fioz fiozVar2 = new fioz(b3);
        d = fiozVar2;
        fioy b4 = fiozVar2.b();
        b4.b('0', '9');
        b4.a('.');
        b4.a('-');
        e = new fioz(b4);
        fioy a3 = fioz.a();
        a3.a(' ');
        a3.a('\t');
        a3.a('\n');
        a3.a((char) 11);
        a3.a('\f');
        a3.a('\r');
        a3.a('\"');
        a3.a('\'');
        a3.a('=');
        a3.a('<');
        a3.a('>');
        a3.a('`');
        f = new fioz(a3);
    }

    private static fiot b(fiov fiovVar, fiow fiowVar) {
        fiowVar.g(fiovVar, fiowVar.e()).a();
        return new fiou(new fipr(), fiowVar.e());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        r9.m(defpackage.fioq.e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
    
        if (r9.d() <= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if (r9.k('=') == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        r9.d();
        r1 = r9.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        if (r1 != '\'') goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        r9.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
    
        if (r9.b('\'') >= 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        r9.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0090, code lost:
    
        if (r9.d() <= 0) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002d, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        if (r1 != '\"') goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006c, code lost:
    
        r9.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0073, code lost:
    
        if (r9.b('\"') < 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0075, code lost:
    
        r9.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0079, code lost:
    
        r1 = defpackage.fioq.f;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007c, code lost:
    
        r7 = r9.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0080, code lost:
    
        if (r7 == 0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0086, code lost:
    
        if (r1.c(r7) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0093, code lost:
    
        r9.h();
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0088, code lost:
    
        if (r6 > 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0029, code lost:
    
        if (r9.d() > 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0045, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0099, code lost:
    
        r9.k('/');
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a0, code lost:
    
        if (r9.k('>') == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a6, code lost:
    
        return b(r0, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x016a, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x002e, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002b, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002e, code lost:
    
        if (r1 == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        if (r9.m(defpackage.fioq.d) <= 0) goto L100;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0090 -> B:5:0x002b). Please report as a decompilation issue!!! */
    @Override // defpackage.fior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.fiot a(defpackage.fios r9) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fioq.a(fios):fiot");
    }
}
