package defpackage;

import com.google.android.gms.common.Feature;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbic extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ hho c;
    final /* synthetic */ dbip d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbic(hho hhoVar, dbip dbipVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = hhoVar;
        this.d = dbipVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dbic) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [hho] */
    /* JADX WARN: Type inference failed for: r0v5 */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        ?? r0;
        ffhh ffhhVar = ffhh.a;
        int i = this.b;
        if (i == 0) {
            ffci.b(obj);
            hho hhoVar = this.c;
            dbip dbipVar = this.d;
            this.a = hhoVar;
            this.b = 1;
            dbfy dbfyVar = dbipVar.b;
            String str = dbfyVar.e;
            str.getClass();
            dfun dfunVar = new dfun();
            dfunVar.a = new dfgz(str);
            dfunVar.b = new Feature[]{dfiu.a};
            dfunVar.c = 1578;
            dhre i2 = ((crpn) dbfyVar.f).d.i(dfunVar.a());
            final ffji ffjiVar = new ffji() { // from class: crpa
                @Override // defpackage.ffji
                public final Object invoke(Object obj3) {
                    boolean booleanValue = ((Boolean) obj3).booleanValue();
                    csjb c = crpn.a.c();
                    c.I("getConsent Succeeded.");
                    c.B("consent", booleanValue);
                    c.r();
                    return ffcu.a;
                }
            };
            i2.a(new dhqy() { // from class: crpb
                @Override // defpackage.dhqy
                public final void e(Object obj3) {
                    ffji.this.invoke(obj3);
                }
            });
            i2.t(new dhqv() { // from class: crpc
                @Override // defpackage.dhqv
                public final void d(Exception exc) {
                    csjb e = crpn.a.e();
                    e.I("getConsent Failed.");
                    e.s(exc);
                }
            });
            elfl g = elfl.g(duin.a(i2));
            g.getClass();
            if (g != ffhhVar) {
                obj2 = hhoVar;
                obj = g;
            }
            return ffhhVar;
        }
        if (i != 1) {
            Object obj3 = this.a;
            ffci.b(obj);
            r0 = obj3;
            r0.b(((Boolean) obj).toString());
            hho hhoVar2 = this.c;
            cskc cskcVar = dbip.a;
            Object a = hhoVar2.a();
            Objects.toString(a);
            cskcVar.p("getConsent result ".concat(String.valueOf(a)));
            return ffcu.a;
        }
        obj2 = this.a;
        ffci.b(obj);
        this.a = obj2;
        this.b = 2;
        obj = fgfz.c((ListenableFuture) obj, this);
        if (obj != ffhhVar) {
            r0 = obj2;
            r0.b(((Boolean) obj).toString());
            hho hhoVar22 = this.c;
            cskc cskcVar2 = dbip.a;
            Object a2 = hhoVar22.a();
            Objects.toString(a2);
            cskcVar2.p("getConsent result ".concat(String.valueOf(a2)));
            return ffcu.a;
        }
        return ffhhVar;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dbic(this.c, this.d, ffguVar);
    }
}
