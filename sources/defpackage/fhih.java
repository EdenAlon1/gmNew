package defpackage;

import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhih extends fhho {
    final /* synthetic */ fhii d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhih(fhii fhiiVar, String str) {
        super(str);
        this.d = fhiiVar;
    }

    @Override // defpackage.fhho
    public final long a() {
        long j;
        long nanoTime = System.nanoTime();
        fhii fhiiVar = this.d;
        Iterator it = fhiiVar.d.iterator();
        it.getClass();
        long j2 = Long.MIN_VALUE;
        fhig fhigVar = null;
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            fhig fhigVar2 = (fhig) it.next();
            fhigVar2.getClass();
            synchronized (fhigVar2) {
                byte[] bArr = fhhl.a;
                List list = fhigVar2.l;
                int i3 = 0;
                while (true) {
                    if (i3 < list.size()) {
                        Reference reference = (Reference) list.get(i3);
                        if (reference.get() != null) {
                            i3++;
                        } else {
                            reference.getClass();
                            fhgk fhgkVar = fhigVar2.a.a.i;
                            StringBuilder sb = new StringBuilder();
                            j = nanoTime;
                            sb.append("A connection to ");
                            sb.append(fhgkVar);
                            sb.append(" was leaked. Did you forget to close a response body?");
                            fhlc.b.h(sb.toString(), ((fhib) reference).a);
                            list.remove(i3);
                            fhigVar2.l();
                            if (list.isEmpty()) {
                                fhigVar2.m = j - fhiiVar.a;
                                break;
                            }
                            nanoTime = j;
                        }
                    } else {
                        j = nanoTime;
                        if (list.size() > 0) {
                            i2++;
                        }
                    }
                }
                i++;
                long j3 = j - fhigVar2.m;
                if (j3 > j2) {
                    j2 = j3;
                }
                if (j3 > j2) {
                    fhigVar = fhigVar2;
                }
            }
            nanoTime = j;
        }
        long j4 = nanoTime;
        long j5 = fhiiVar.a;
        if (j2 < j5 && i <= 5) {
            if (i > 0) {
                return j5 - j2;
            }
            if (i2 <= 0) {
                return -1L;
            }
            return j5;
        }
        fhigVar.getClass();
        synchronized (fhigVar) {
            if (!fhigVar.l.isEmpty()) {
                return 0L;
            }
            if (fhigVar.m + j2 != j4) {
                return 0L;
            }
            fhigVar.l();
            fhiiVar.d.remove(fhigVar);
            fhhl.r(fhigVar.a());
            if (!fhiiVar.d.isEmpty()) {
                return 0L;
            }
            fhiiVar.b.a();
            return 0L;
        }
    }
}
