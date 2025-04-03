package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cxg extends ffhv implements ffji {
    Object a;
    Object b;
    int c;
    final /* synthetic */ cxj d;
    final /* synthetic */ Object e;
    final /* synthetic */ cxq f;
    final /* synthetic */ long g;
    final /* synthetic */ ffji h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxg(cxj cxjVar, Object obj, cxq cxqVar, long j, ffji ffjiVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.d = cxjVar;
        this.e = obj;
        this.f = cxqVar;
        this.g = j;
        this.h = ffjiVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        Object obj3;
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.c != 0) {
                obj3 = this.b;
                obj2 = this.a;
                ffci.b(obj);
            } else {
                ffci.b(obj);
                cxj cxjVar = this.d;
                cxjVar.b.b = (cyb) cxjVar.a.b().invoke(this.e);
                this.d.i(((daq) this.f).a);
                this.d.h(true);
                cxv cxvVar = this.d.b;
                cxv cxvVar2 = new cxv(cxvVar.a, cxvVar.a(), cyc.a(cxvVar.b), cxvVar.c, Long.MIN_VALUE, cxvVar.e);
                ffkx ffkxVar = new ffkx();
                cxq cxqVar = this.f;
                long j = this.g;
                cxf cxfVar = new cxf(this.d, cxvVar2, this.h, ffkxVar);
                this.a = cxvVar2;
                this.b = ffkxVar;
                this.c = 1;
                if (dap.b(cxvVar2, cxqVar, j, cxfVar, this) == ffhhVar) {
                    return ffhhVar;
                }
                obj2 = cxvVar2;
                obj3 = ffkxVar;
            }
            int i = true != ((ffkx) obj3).a ? 2 : 1;
            this.d.g();
            return new cxr((cxv) obj2, i);
        } catch (CancellationException e) {
            this.d.g();
            throw e;
        }
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cxg(this.d, this.e, this.f, this.g, this.h, (ffgu) obj).b(ffcu.a);
    }
}
