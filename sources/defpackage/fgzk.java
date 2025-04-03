package defpackage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fgzk extends fgut {
    private static final DateFormat c;
    private static final long serialVersionUID = 2523330383042085994L;
    private long[] d;
    private fgvb[] e;
    private fgux f;
    private fgux g;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd'T'HHmmss");
        c = simpleDateFormat;
        simpleDateFormat.setTimeZone(fhew.a);
        simpleDateFormat.setLenient(false);
    }

    protected fgzk(String str) {
        super(str);
        new TreeMap();
        this.f = null;
    }

    private final fgvb d(fgvb fgvbVar) {
        fgvb fgvbVar2 = new fgvb((byte[]) null);
        fgvbVar2.setTime(fgvbVar.getTime() - ((fhec) a("TZOFFSETFROM")).c.a);
        return fgvbVar2;
    }

    private static final fgvb e(fgux fguxVar) {
        long time;
        String fgvfVar = fguxVar.toString();
        DateFormat dateFormat = c;
        synchronized (dateFormat) {
            time = dateFormat.parse(fgvfVar).getTime();
        }
        fgvb fgvbVar = new fgvb((byte[]) null);
        fgvbVar.setTime(time);
        return fgvbVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x02f9, code lost:
    
        r2 = new java.lang.Object[1];
        r2[r17] = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0309, code lost:
    
        throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format("Invalid week number [{0}]", r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0150, code lost:
    
        r39 = r4;
        r21 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0154, code lost:
    
        r26 = r7;
        r31 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x08b4, code lost:
    
        java.util.Collections.sort(r14);
        r0 = r14.iterator();
        r4 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x08bd, code lost:
    
        r8 = r31 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x08c3, code lost:
    
        if (r0.hasNext() == false) goto L400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x08c5, code lost:
    
        r5 = d((defpackage.fgvb) r0.next());
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x08d3, code lost:
    
        if (r5.after(r41) != false) goto L402;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x08d9, code lost:
    
        if (r5.after(r4) == false) goto L403;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x08db, code lost:
    
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x08dc, code lost:
    
        r6 = r39;
        r6.b(r5);
        r39 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x08e4, code lost:
    
        r0 = r4;
        r6 = r16;
        r5 = r21;
        r7 = r26;
        r4 = r39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0625  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.fgux c(defpackage.fgux r41) {
        /*
            Method dump skipped, instructions count: 2392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgzk.c(fgux):fgux");
    }

    protected fgzk(String str, fgyw fgywVar) {
        super(str, fgywVar);
        new TreeMap();
        this.f = null;
    }
}
