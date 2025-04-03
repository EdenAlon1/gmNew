package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qpp {
    public static qoo a(Context context) {
        qoo qooVar = new qoo(new qpf(new qpo(context.getApplicationContext())), new qpa(new qpj()));
        qny qnyVar = qooVar.f;
        if (qnyVar != null) {
            qnyVar.a();
        }
        qof[] qofVarArr = qooVar.e;
        for (int i = 0; i < 4; i++) {
            qof qofVar = qofVarArr[i];
            if (qofVar != null) {
                qofVar.a = true;
                qofVar.interrupt();
            }
        }
        qooVar.f = new qny(qooVar.b, qooVar.c, qooVar.d, qooVar.h);
        qooVar.f.start();
        for (int i2 = 0; i2 < 4; i2++) {
            qof qofVar2 = new qof(qooVar.c, qooVar.i, qooVar.d, qooVar.h);
            qooVar.e[i2] = qofVar2;
            qofVar2.start();
        }
        return qooVar;
    }
}
