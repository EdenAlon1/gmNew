package defpackage;

import android.text.TextUtils;
import j$.time.Instant;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dllt {
    public static final enip a = enip.r(dexc.STARTUP, dexc.TELEDOCTOR);
    public final String b;
    public final dexf c;
    public final emxc d;
    public final dllp e;
    public boolean f;
    private final enip g;
    private final Random h;
    private String i;

    public dllt(String str, dexf dexfVar, deyi deyiVar, dllp dllpVar, enip enipVar) {
        this.f = true;
        emxf.m(!TextUtils.isEmpty(str), "Given String is empty or null");
        emxf.m(true, "Sampling rate should not exceed 1.0");
        this.b = str;
        dexfVar.getClass();
        this.c = dexfVar;
        this.d = emxc.i(deyiVar);
        this.e = dllpVar;
        enipVar.getClass();
        this.g = enipVar;
        this.f = false;
        this.h = new Random();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(dllv dllvVar) {
        dlmx dlmxVar;
        long j;
        dllu dlluVar = new dllu(dllvVar);
        dlluVar.g = this;
        dllv a2 = dlluVar.a();
        if (this.g.contains(a2.a)) {
            String str = this.b;
            int i = 0;
            while (true) {
                if (i >= a2.b().size()) {
                    dlmxVar = null;
                    break;
                }
                dlmxVar = (dlmx) a2.b().get(i);
                if (dlmxVar.d.equals(str)) {
                    break;
                }
                i++;
            }
            if (dlmxVar == null) {
                j = 0;
            } else {
                dlmz dlmzVar = dlmxVar.e;
                if (dlmzVar == null) {
                    dlmzVar = dlmz.a;
                }
                j = dlmzVar.d;
            }
            if (j <= Instant.now().toEpochMilli()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0165, code lost:
    
        if (r0 == 4) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0125 A[Catch: all -> 0x01aa, TryCatch #7 {all -> 0x01aa, blocks: (B:37:0x011e, B:39:0x0125, B:41:0x013b), top: B:36:0x011e }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dlls b(defpackage.dllv r19, defpackage.dlly r20, defpackage.dllp r21) {
        /*
            Method dump skipped, instructions count: 515
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dllt.b(dllv, dlly, dllp):dlls");
    }

    protected final dllv c(dllv dllvVar, dllp dllpVar, dlly dllyVar) {
        long j;
        long epochMilli = Instant.now().toEpochMilli();
        int i = dllvVar.a(dllpVar.a).b;
        if (i == 5) {
            j = TimeUnit.SECONDS.toMillis(dllpVar.b);
        } else {
            j = 3600000;
        }
        long j2 = j + epochMilli;
        dlmw dlmwVar = (dlmw) dlmx.a.createBuilder();
        String str = this.b;
        dlmwVar.copyOnWrite();
        dlmx dlmxVar = (dlmx) dlmwVar.instance;
        str.getClass();
        dlmxVar.d = str;
        dexf dexfVar = dllpVar.a;
        dlmwVar.copyOnWrite();
        ((dlmx) dlmwVar.instance).c = dexfVar.a();
        dlmy dlmyVar = (dlmy) dlmz.a.createBuilder();
        dlmyVar.copyOnWrite();
        dlmz dlmzVar = (dlmz) dlmyVar.instance;
        dlmzVar.e = dlna.a(i);
        dlmzVar.b |= 4;
        dlmyVar.copyOnWrite();
        dlmz dlmzVar2 = (dlmz) dlmyVar.instance;
        dlmzVar2.b |= 1;
        dlmzVar2.c = epochMilli;
        dlmyVar.copyOnWrite();
        dlmz dlmzVar3 = (dlmz) dlmyVar.instance;
        dlmzVar3.b |= 2;
        dlmzVar3.d = j2;
        dlmz dlmzVar4 = (dlmz) dlmyVar.build();
        dlmwVar.copyOnWrite();
        dlmx dlmxVar2 = (dlmx) dlmwVar.instance;
        dlmzVar4.getClass();
        dlmxVar2.e = dlmzVar4;
        dlmxVar2.b |= 1;
        final dlmx dlmxVar3 = (dlmx) dlmwVar.build();
        try {
            dllyVar.a.b(new emwl() { // from class: dllx
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    dlmv dlmvVar = (dlmv) ((dlnb) obj).toBuilder();
                    int i2 = 0;
                    while (true) {
                        dlmx dlmxVar4 = dlmx.this;
                        if (i2 >= ((dlnb) dlmvVar.instance).b.size()) {
                            dlmvVar.copyOnWrite();
                            dlnb dlnbVar = (dlnb) dlmvVar.instance;
                            dlmxVar4.getClass();
                            dlnbVar.a();
                            dlnbVar.b.add(dlmxVar4);
                            return (dlnb) dlmvVar.build();
                        }
                        if (((dlmx) ((dlnb) dlmvVar.instance).b.get(i2)).d.equals(dlmxVar4.d)) {
                            dlmvVar.copyOnWrite();
                            dlnb dlnbVar2 = (dlnb) dlmvVar.instance;
                            dlmxVar4.getClass();
                            dlnbVar2.a();
                            dlnbVar2.b.set(i2, dlmxVar4);
                            return (dlnb) dlmvVar.build();
                        }
                        i2++;
                    }
                }
            }, dllyVar.b).get();
            dllu dlluVar = new dllu(dllvVar);
            int i2 = engw.d;
            engr engrVar = new engr();
            engrVar.j(dlluVar.e);
            engrVar.h(dlmxVar3);
            dlluVar.e = engrVar.g();
            return dlluVar.a();
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalArgumentException("Update of recent fix data failed", e);
        }
    }
}
