package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkru {
    public final Map a = new HashMap();
    final /* synthetic */ dkrw b;

    public dkru(dkrw dkrwVar) {
        this.b = dkrwVar;
    }

    public final void a() {
        int i;
        Object obj;
        final dkrv dkrvVar = new dkrv();
        synchronized (this.b) {
            dkrw dkrwVar = this.b;
            if (dkrwVar.e > 0) {
                dkrwVar.d = new HashMap(dkrwVar.d);
            }
            dkrw dkrwVar2 = this.b;
            dkrvVar.a = dkrwVar2.d;
            dkrwVar2.e++;
            synchronized (this) {
                for (Map.Entry entry : this.a.entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value == this) {
                        if (this.b.d.containsKey(str)) {
                            this.b.d.remove(str);
                        }
                    } else if (!this.b.d.containsKey(str) || (obj = this.b.d.get(str)) == null || !obj.equals(value)) {
                        this.b.d.put(str, value);
                    }
                }
                this.a.clear();
            }
        }
        final dkrw dkrwVar3 = this.b;
        Runnable runnable = new Runnable() { // from class: dkrr
            /* JADX WARN: Can't wrap try/catch for region: R(11:3|4|5|(2:7|(2:9|(2:11|12))(1:23))|24|25|26|27|28|(1:30)(7:31|32|33|34|35|36|37)|12) */
            /* JADX WARN: Can't wrap try/catch for region: R(8:3|4|5|(4:(2:7|(2:9|(2:11|12))(1:23))|28|(1:30)(7:31|32|33|34|35|36|37)|12)|24|25|26|27) */
            /* JADX WARN: Code restructure failed: missing block: B:57:0x005b, code lost:
            
                r3 = r0.getParentFile();
             */
            /* JADX WARN: Code restructure failed: missing block: B:58:0x0060, code lost:
            
                if (r3 == null) goto L25;
             */
            /* JADX WARN: Code restructure failed: missing block: B:62:0x0069, code lost:
            
                r3 = new java.io.FileOutputStream(r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:64:0x006f, code lost:
            
                r3 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:65:0x0070, code lost:
            
                defpackage.csjy.h("RcsClientLib", r3, "Couldn't create file ".concat(java.lang.String.valueOf(java.lang.String.valueOf(r0))));
             */
            /* JADX WARN: Code restructure failed: missing block: B:66:0x0097, code lost:
            
                r3 = null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:67:0x0084, code lost:
            
                defpackage.csjy.f("RcsClientLib", "Couldn't create directory for file ".concat(java.lang.String.valueOf(java.lang.String.valueOf(r0))));
             */
            /* JADX WARN: Code restructure failed: missing block: B:68:0x00d8, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:69:0x00d9, code lost:
            
                defpackage.csjy.p("RcsClientLib", r0, "writeToFile: Got exception:");
             */
            /* JADX WARN: Code restructure failed: missing block: B:70:0x00e6, code lost:
            
                if (r1.b.exists() != false) goto L51;
             */
            /* JADX WARN: Code restructure failed: missing block: B:73:0x00f0, code lost:
            
                defpackage.csjy.f("RcsClientLib", "Couldn't clean up partially-written file ".concat(java.lang.String.valueOf(java.lang.String.valueOf(r1.b))));
             */
            /* JADX WARN: Code restructure failed: missing block: B:74:0x0105, code lost:
            
                r4.a(false);
             */
            /* JADX WARN: Removed duplicated region for block: B:14:0x010a A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:30:0x009a A[Catch: all -> 0x00cc, TRY_ENTER, TryCatch #8 {all -> 0x00cc, blocks: (B:30:0x009a, B:31:0x009e, B:34:0x00ab, B:36:0x00ae, B:44:0x00cb, B:47:0x00c8, B:33:0x00a5, B:43:0x00c3), top: B:28:0x0098, inners: #0, #6 }] */
            /* JADX WARN: Removed duplicated region for block: B:31:0x009e A[Catch: all -> 0x00cc, TRY_LEAVE, TryCatch #8 {all -> 0x00cc, blocks: (B:30:0x009a, B:31:0x009e, B:34:0x00ab, B:36:0x00ae, B:44:0x00cb, B:47:0x00c8, B:33:0x00a5, B:43:0x00c3), top: B:28:0x0098, inners: #0, #6 }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 280
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dkrr.run():void");
            }
        };
        synchronized (dkrwVar3) {
            i = dkrwVar3.e;
        }
        if (i == 1) {
            runnable.run();
        } else {
            dkrw.a.execute(runnable);
        }
        try {
            dkrvVar.b.await();
            boolean z = dkrvVar.c;
        } catch (InterruptedException unused) {
        }
    }
}
