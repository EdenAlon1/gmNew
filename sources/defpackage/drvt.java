package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drvt extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ drwc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drvt(drwc drwcVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = drwcVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((drvt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        ffhh ffhhVar = ffhh.a;
        final String str = null;
        if (this.b != 0) {
            obj2 = this.a;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            drwc drwcVar = this.c;
            aesp bj = drwcVar.bj();
            aepl aeplVar = drwcVar.an;
            if (aeplVar == null) {
                ffkj.c("accountSignIn");
                aeplVar = null;
            }
            this.a = bj;
            this.b = 1;
            obj = aeplVar.a(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
            obj2 = bj;
        }
        final boolean booleanValue = ((Boolean) obj).booleanValue();
        String str2 = this.c.al;
        if (str2 == null) {
            ffkj.c("mimeType");
        } else {
            str = str2;
        }
        str.getClass();
        ((alhh) obj2).o(new Supplier() { // from class: aesk
            @Override // java.util.function.Supplier
            public final Object get() {
                eqcl eqclVar = (eqcl) eqcm.a.createBuilder();
                eqclVar.getClass();
                eqcj eqcjVar = (eqcj) eqck.a.createBuilder();
                eqcjVar.getClass();
                eqco a = aesf.a(booleanValue, str);
                eqcjVar.copyOnWrite();
                eqck eqckVar = (eqck) eqcjVar.instance;
                eqckVar.c = a;
                eqckVar.b |= 1;
                eyfy build = eqcjVar.build();
                build.getClass();
                eqclVar.copyOnWrite();
                eqcm eqcmVar = (eqcm) eqclVar.instance;
                eqcmVar.c = (eqck) build;
                eqcmVar.b = 1;
                return eqrj.a(eqclVar);
            }
        });
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new drvt(this.c, ffguVar);
    }
}
