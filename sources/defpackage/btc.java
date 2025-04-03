package defpackage;

import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class btc implements bth {
    private final bee b;
    private final Map c = new HashMap();
    private final Map d = new HashMap();

    public btc(bcq bcqVar, afd afdVar) {
        ksw.b(true, "Not a supported video capabilities source: 0");
        bee f = bcqVar.f();
        if (new bqw(f).c().isEmpty()) {
            avw.f("RecorderVideoCapabilities", "Camera EncoderProfilesProvider doesn't contain any supported Quality.");
            f = new car(bcqVar, Arrays.asList(brk.d, brk.c, brk.b), afdVar);
        }
        bfx bfxVar = bwq.a;
        bee catVar = new cat(new cas(f, bfxVar, bcqVar, afdVar), bfxVar);
        Iterator it = bcqVar.n().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            aua auaVar = (aua) it.next();
            Integer valueOf = Integer.valueOf(auaVar.h);
            int i = auaVar.i;
            if (valueOf.equals(3) && i == 10) {
                catVar = new buw(catVar, afdVar);
                break;
            }
        }
        this.b = new cau(catVar, bcqVar, bfxVar);
        for (aua auaVar2 : bcqVar.n()) {
            bqw bqwVar = new bqw(new bva(this.b, auaVar2));
            if (!bqwVar.c().isEmpty()) {
                this.c.put(auaVar2, bqwVar);
            }
        }
        bcqVar.r();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if (r0.contains(r8) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0072, code lost:
    
        r2 = new defpackage.bqw(new defpackage.bva(r7.b, r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x007e, code lost:
    
        r7.d.put(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0083, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006f, code lost:
    
        if (r1 == null) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.bqw a(defpackage.aua r8) {
        /*
            r7 = this;
            boolean r0 = r8.b()
            if (r0 == 0) goto Lf
            java.util.Map r0 = r7.c
            java.lang.Object r8 = r0.get(r8)
            bqw r8 = (defpackage.bqw) r8
            return r8
        Lf:
            java.util.Map r0 = r7.d
            boolean r0 = r0.containsKey(r8)
            if (r0 != 0) goto L84
            java.util.Map r0 = r7.c
            java.util.Set r0 = r0.keySet()
            r8.getClass()
            r0.getClass()
            boolean r1 = r8.b()
            r2 = 0
            if (r1 == 0) goto L31
            boolean r0 = r0.contains(r8)
            if (r0 != 0) goto L72
            goto L7e
        L31:
            java.util.Iterator r0 = r0.iterator()
        L35:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L6e
            java.lang.Object r1 = r0.next()
            r3 = r1
            aua r3 = (defpackage.aua) r3
            boolean r4 = r3.b()
            java.lang.String r5 = "Fully specified range is not actually fully specified."
            defpackage.ksw.d(r4, r5)
            int r4 = r8.i
            if (r4 != 0) goto L50
            goto L54
        L50:
            int r6 = r3.i
            if (r4 != r6) goto L35
        L54:
            boolean r4 = r3.b()
            defpackage.ksw.d(r4, r5)
            int r4 = r8.h
            if (r4 != 0) goto L60
            goto L6f
        L60:
            int r3 = r3.h
            r5 = 2
            if (r4 != r5) goto L6b
            r4 = 1
            if (r3 == r4) goto L69
            goto L6f
        L69:
            r3 = r4
            r4 = r5
        L6b:
            if (r4 != r3) goto L35
            goto L6f
        L6e:
            r1 = r2
        L6f:
            if (r1 != 0) goto L72
            goto L7e
        L72:
            bee r0 = r7.b
            bva r1 = new bva
            r1.<init>(r0, r8)
            bqw r2 = new bqw
            r2.<init>(r1)
        L7e:
            java.util.Map r0 = r7.d
            r0.put(r8, r2)
            return r2
        L84:
            java.util.Map r0 = r7.d
            java.lang.Object r8 = r0.get(r8)
            bqw r8 = (defpackage.bqw) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.btc.a(aua):bqw");
    }

    @Override // defpackage.bth
    public final bvc b(Size size, aua auaVar) {
        bqw a = a(auaVar);
        if (a == null) {
            return null;
        }
        brk a2 = a.a(size);
        avw.a("CapabilitiesByQuality", a.j(size, a2, "Using supported quality of ", " for size "));
        if (a2 == brk.h) {
            return null;
        }
        bvc b = a.b(a2);
        if (b != null) {
            return b;
        }
        throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles for advertised quality.");
    }

    @Override // defpackage.bth
    public final bvc c(brk brkVar, aua auaVar) {
        bqw a = a(auaVar);
        if (a == null) {
            return null;
        }
        return a.b(brkVar);
    }

    @Override // defpackage.bth
    public final List d(aua auaVar) {
        bqw a = a(auaVar);
        return a == null ? new ArrayList() : a.c();
    }
}
