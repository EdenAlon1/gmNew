package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xbill.DNS2.ResolverConfig;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fixj implements fizj {
    public List a;
    public int b = 3;

    public fixj() {
        d();
        String[] strArr = ResolverConfig.b().servers;
        if (strArr == null) {
            this.a.add(new fizt(null));
            return;
        }
        for (String str : strArr) {
            fizt fiztVar = new fizt(str);
            fiztVar.b(5);
            this.a.add(fiztVar);
        }
    }

    private final void d() {
        this.a = new ArrayList();
    }

    @Override // defpackage.fizj
    public final fiyh a(fiyh fiyhVar) {
        fixi fixiVar = new fixi(this, fiyhVar);
        try {
            int[] iArr = fixiVar.b;
            iArr[0] = iArr[0] + 1;
            fixiVar.e++;
            fixiVar.c[0] = new Object();
            return fixiVar.a[0].a(fixiVar.g);
        } catch (Exception e) {
            fixiVar.a(fixiVar.c[0], e);
            synchronized (fixiVar) {
                while (!fixiVar.f) {
                    try {
                        fixiVar.wait();
                    } catch (InterruptedException unused) {
                    }
                }
                fiyh fiyhVar2 = fixiVar.h;
                if (fiyhVar2 != null) {
                    return fiyhVar2;
                }
                Throwable th = fixiVar.i;
                if (th instanceof IOException) {
                    throw ((IOException) th);
                }
                if (th instanceof RuntimeException) {
                    throw ((RuntimeException) th);
                }
                if (th instanceof Error) {
                    throw ((Error) th);
                }
                throw new IllegalStateException("ExtendedResolver failure");
            }
        }
    }

    @Override // defpackage.fizj
    public final void b(int i) {
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            ((fizj) this.a.get(i2)).b(i);
        }
    }

    @Override // defpackage.fizj
    public final Object c(fiyh fiyhVar, fixi fixiVar) {
        fixi fixiVar2 = new fixi(this, fiyhVar);
        fixiVar2.j = fixiVar;
        fixiVar2.b(0);
        return fixiVar2;
    }

    public fixj(fizj[] fizjVarArr) {
        d();
        for (fizj fizjVar : fizjVarArr) {
            this.a.add(fizjVar);
        }
    }
}
