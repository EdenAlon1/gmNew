package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.internal.BasePendingResult;
import defpackage.dfqp;
import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dfra<O extends dfqp> {
    private final dfuj a;
    public final Context c;
    public final String d;
    public final dfzg e;
    public final dfqt f;
    public final dfqp g;
    public final dfrz h;
    public final Looper i;
    public final int j;
    public final dfre k;
    public final dftd l;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0097, code lost:
    
        if (r11 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a7, code lost:
    
        if (r12 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e1, code lost:
    
        if (r11 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f3, code lost:
    
        if (r12 != false) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dfra(android.content.Context r8, android.app.Activity r9, defpackage.dfqt r10, defpackage.dfqp r11, defpackage.dfqz r12) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dfra.<init>(android.content.Context, android.app.Activity, dfqt, dfqp, dfqz):void");
    }

    private final dhre a(int i, dfuo dfuoVar) {
        dhri dhriVar = new dhri();
        int i2 = dfuoVar.d;
        dftd dftdVar = this.l;
        dftdVar.d(dhriVar, i2, this);
        dfrv dfrvVar = new dfrv(i, dfuoVar, dhriVar, this.a);
        Handler handler = dftdVar.o;
        handler.sendMessage(handler.obtainMessage(4, new dftx(dfrvVar, dftdVar.k.get(), this)));
        return dhriVar.a;
    }

    public final dftp f(Object obj, String str) {
        return dftq.b(obj, this.i, str);
    }

    public final dfvq g() {
        Set set;
        GoogleSignInAccount a;
        dfvq dfvqVar = new dfvq();
        dfqp dfqpVar = this.g;
        Account account = null;
        if (!(dfqpVar instanceof dfqn) || (a = ((dfqn) dfqpVar).a()) == null) {
            dfqp dfqpVar2 = this.g;
            if (dfqpVar2 instanceof dfqm) {
                account = ((dfqm) dfqpVar2).a();
            }
        } else {
            String str = a.c;
            if (str != null) {
                account = new Account(str, "com.google");
            }
        }
        dfvqVar.a = account;
        dfqp dfqpVar3 = this.g;
        if (dfqpVar3 instanceof dfqn) {
            GoogleSignInAccount a2 = ((dfqn) dfqpVar3).a();
            set = a2 == null ? Collections.EMPTY_SET : a2.a();
        } else {
            set = Collections.EMPTY_SET;
        }
        if (dfvqVar.b == null) {
            dfvqVar.b = new cmj();
        }
        dfvqVar.b.addAll(set);
        dfvqVar.d = this.c.getClass().getName();
        dfvqVar.c = this.c.getPackageName();
        return dfvqVar;
    }

    public final dhre h(dfuo dfuoVar) {
        return a(2, dfuoVar);
    }

    public final dhre i(dfuo dfuoVar) {
        return a(0, dfuoVar);
    }

    public final dhre j(dfue dfueVar) {
        dfwv.o(dfueVar.a.a(), "Listener has already been released.");
        dhri dhriVar = new dhri();
        dfty dftyVar = dfueVar.a;
        int i = dftyVar.d;
        dftd dftdVar = this.l;
        dftdVar.d(dhriVar, i, this);
        dfru dfruVar = new dfru(new dftz(dftyVar, dfueVar.b, dfueVar.c), dhriVar);
        Handler handler = dftdVar.o;
        handler.sendMessage(handler.obtainMessage(8, new dftx(dfruVar, dftdVar.k.get(), this)));
        return dhriVar.a;
    }

    public final dhre k(dftn dftnVar, int i) {
        dhri dhriVar = new dhri();
        dftd dftdVar = this.l;
        dftdVar.d(dhriVar, i, this);
        dfrw dfrwVar = new dfrw(dftnVar, dhriVar);
        Handler handler = dftdVar.o;
        handler.sendMessage(handler.obtainMessage(13, new dftx(dfrwVar, dftdVar.k.get(), this)));
        return dhriVar.a;
    }

    public final dhre l(dfuo dfuoVar) {
        return a(1, dfuoVar);
    }

    public final void m(int i, dfsd dfsdVar) {
        boolean z = true;
        if (!dfsdVar.g && !((Boolean) BasePendingResult.b.get()).booleanValue()) {
            z = false;
        }
        dfsdVar.g = z;
        dftd dftdVar = this.l;
        dftdVar.o.sendMessage(dftdVar.o.obtainMessage(4, new dftx(new dfrt(i, dfsdVar), dftdVar.k.get(), this)));
    }

    public dfra(Context context, dfqt dfqtVar, dfqp dfqpVar, dfqz dfqzVar) {
        this(context, null, dfqtVar, dfqpVar, dfqzVar);
    }
}
