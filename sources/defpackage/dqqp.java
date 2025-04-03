package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqqp implements duqi {
    public final Context a;
    public final dqrc b;
    private final ffbz c;

    public dqqp(Context context, dqrc dqrcVar) {
        context.getClass();
        this.a = context;
        this.b = dqrcVar;
        this.c = ffca.a(new ffix() { // from class: dqqo
            @Override // defpackage.ffix
            public final Object invoke() {
                dqqp dqqpVar = dqqp.this;
                dqqpVar.b.a();
                return new duoq(dqqpVar.a);
            }
        });
    }

    private final duqi f() {
        Object a = this.c.a();
        a.getClass();
        return (duqi) a;
    }

    @Override // defpackage.duqi
    public final duqh a() {
        return f().a();
    }

    @Override // defpackage.duqj
    public final ListenableFuture b() {
        return f().b();
    }

    @Override // defpackage.duqj
    public final String c(String str) {
        str.getClass();
        return f().c(str);
    }

    @Override // defpackage.duqj
    public final boolean d(String str) {
        return f().d(str);
    }

    @Override // defpackage.duqj
    public final int e() {
        return f().e();
    }
}
