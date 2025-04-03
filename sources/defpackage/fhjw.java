package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhjw extends fhho {
    final /* synthetic */ fhjx d;
    final /* synthetic */ fhkt e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhjw(String str, fhjx fhjxVar, fhkt fhktVar) {
        super(str);
        this.d = fhjxVar;
        this.e = fhktVar;
    }

    @Override // defpackage.fhho
    public final long a() {
        long c;
        int i;
        fhkn[] fhknVarArr;
        fflb fflbVar = new fflb();
        fhkt fhktVar = this.e;
        fhkf fhkfVar = this.d.a;
        synchronized (fhkfVar.u) {
            synchronized (fhkfVar) {
                fhkt fhktVar2 = fhkfVar.r;
                fhkt fhktVar3 = new fhkt();
                fhktVar3.e(fhktVar2);
                fhktVar3.e(fhktVar);
                fflbVar.a = fhktVar3;
                c = ((fhkt) fflbVar.a).c() - fhktVar2.c();
                fhknVarArr = null;
                if (c == 0) {
                    c = 0;
                } else if (!fhkfVar.c.isEmpty()) {
                    fhknVarArr = (fhkn[]) fhkfVar.c.values().toArray(new fhkn[0]);
                }
                fhkt fhktVar4 = (fhkt) fflbVar.a;
                fhktVar4.getClass();
                fhkfVar.r = fhktVar4;
                fhkfVar.k.f(new fhjt(a.v(fhkfVar.d, " onSettings"), fhkfVar, fflbVar));
            }
            try {
                fhkfVar.u.a((fhkt) fflbVar.a);
            } catch (IOException e) {
                fhkfVar.c(e);
            }
        }
        if (fhknVarArr == null) {
            return -1L;
        }
        for (fhkn fhknVar : fhknVarArr) {
            synchronized (fhknVar) {
                fhknVar.c(c);
            }
        }
        return -1L;
    }
}
