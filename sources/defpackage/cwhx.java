package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwhx extends ffhv implements ffjn {
    boolean a;
    int b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    final /* synthetic */ cwhz e;
    final /* synthetic */ aigz f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwhx(cwhz cwhzVar, aigz aigzVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.e = cwhzVar;
        this.f = aigzVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cwhx cwhxVar = new cwhx(this.e, this.f, (ffgu) obj3);
        cwhxVar.c = (aqux) obj;
        cwhxVar.d = (cwir) obj2;
        return cwhxVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        boolean z;
        dlsr dlsrVar;
        Context context;
        ffhh ffhhVar = ffhh.a;
        if (this.b != 0) {
            z = this.a;
            context = (Context) this.d;
            dlsr dlsrVar2 = (dlsr) this.c;
            ffci.b(obj);
            dlsrVar = dlsrVar2;
        } else {
            ffci.b(obj);
            aqux aquxVar = (aqux) this.c;
            cwir cwirVar = (cwir) this.d;
            boolean z2 = false;
            final boolean z3 = cwirVar.d == cwjb.b && cwirVar.a.size() <= cwirVar.e.size();
            if (!((auvv) this.e.e.b()).a() ? !this.e.f.a || this.e.b != null : this.e.b != null || z3 || this.f.i(aijc.a)) {
                z2 = true;
            }
            final cwhz cwhzVar = this.e;
            final aigz aigzVar = this.f;
            dlsr b = cwhzVar.b(z2, new ffix() { // from class: cwhw
                @Override // defpackage.ffix
                public final Object invoke() {
                    cwhz cwhzVar2 = cwhz.this;
                    cwhzVar2.d.a();
                    if (z3) {
                        cwhzVar2.c.d(cwjb.a);
                    } else {
                        aigz aigzVar2 = aigzVar;
                        cwhzVar2.d.e();
                        aigzVar2.j(aijc.a);
                    }
                    return ffcu.a;
                }
            });
            cwhz cwhzVar2 = this.e;
            this.c = b;
            Context context2 = cwhzVar2.a;
            this.d = context2;
            this.a = z3;
            this.b = 1;
            obj = cwhzVar2.d(aquxVar, cwirVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
            z = z3;
            dlsrVar = b;
            context = context2;
        }
        String string = context.getString(((Number) obj).intValue());
        string.getClass();
        return new cwhf(new dotb(new dosk(string, null, null, false, null, null, null, 254), dlsrVar, null, false, false, null, null, 116), z);
    }
}
