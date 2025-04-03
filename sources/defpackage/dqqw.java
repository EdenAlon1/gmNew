package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqqw implements duqi {
    public final Context a;
    public final dqok b;
    public final dqoy c;
    public final dqrc d;
    private final ffsk e;
    private final ffbz f = ffca.a(new ffix() { // from class: dqqq
        @Override // defpackage.ffix
        public final Object invoke() {
            dqqw dqqwVar = dqqw.this;
            dqqwVar.d.a();
            return new duoq(dqqwVar.a);
        }
    });

    public dqqw(Context context, ffsk ffskVar, dqok dqokVar, dqoy dqoyVar, dqrc dqrcVar) {
        this.a = context;
        this.e = ffskVar;
        this.b = dqokVar;
        this.c = dqoyVar;
        this.d = dqrcVar;
    }

    @Override // defpackage.duqi
    public final duqh a() {
        return f().a();
    }

    @Override // defpackage.duqj
    public final ListenableFuture b() {
        ListenableFuture b;
        b = fgfz.b(this.e, ffhe.a, ffsm.a, new dqqv(this, null));
        return b;
    }

    @Override // defpackage.duqj
    public final String c(String str) {
        Object a;
        str.getClass();
        a = ffqz.a(ffhe.a, new dqqr(this, str, null));
        String str2 = (String) a;
        return str2 == null ? f().c(str) : str2;
    }

    @Override // defpackage.duqj
    public final boolean d(String str) {
        return f().d(str);
    }

    @Override // defpackage.duqj
    public final int e() {
        return f().e();
    }

    public final duqi f() {
        Object a = this.f.a();
        a.getClass();
        return (duqi) a;
    }
}
