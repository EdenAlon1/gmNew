package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.ContextWrapper;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egvy extends egul {
    public final Account a;
    public final god b;
    public final fapp c;
    public dvyu d;
    public dvxi e;
    public egub f;
    public egsa g;
    public egse h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egvy(Context context, Account account, god godVar, fapp fappVar) {
        super(context);
        abe abeVar;
        context.getClass();
        fappVar.getClass();
        this.a = account;
        this.b = godVar;
        this.c = fappVar;
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                abeVar = null;
                break;
            } else {
                if (context instanceof abe) {
                    abeVar = (abe) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        abeVar.getClass();
        this.f = (egub) new lmw(abeVar).a(egub.class);
    }

    public final dvyu b() {
        dvyu dvyuVar = this.d;
        if (dvyuVar != null) {
            return dvyuVar;
        }
        ffkj.c("composeVisualElements");
        return null;
    }

    @Override // defpackage.iya
    public final void d(hfd hfdVar) {
        hfdVar.v(1332550515);
        hil[] hilVarArr = new hil[3];
        hilVarArr[0] = egsi.b.c(b());
        hik hikVar = egsi.c;
        dvxi dvxiVar = this.e;
        egsa egsaVar = null;
        if (dvxiVar == null) {
            ffkj.c("interactionLogger");
            dvxiVar = null;
        }
        hilVarArr[1] = hikVar.c(dvxiVar);
        hik hikVar2 = egsi.a;
        egsa egsaVar2 = this.g;
        if (egsaVar2 == null) {
            ffkj.c("flags");
        } else {
            egsaVar = egsaVar2;
        }
        hilVarArr[2] = hikVar2.c(egsaVar);
        hfz.b(hilVarArr, hpx.d(827600947, new egvx(this), hfdVar), hfdVar, 56);
        hfdVar.o();
    }
}
