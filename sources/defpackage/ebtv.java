package defpackage;

import android.content.Context;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebtv extends ebtw {
    public static final dfli a = dfli.c(78315553, faxv.LOGGER_OVERRIDE_PROVIDER);
    private final eave b;
    private final dfld c;
    private final dfld d;
    private final String e;

    public ebtv(eave eaveVar, Context context) {
        List list = dfld.m;
        dfla dflaVar = new dfla(context, "ONEGOOGLE_MOBILE");
        dflaVar.h = new dflg() { // from class: ebtu
            @Override // defpackage.dflg
            public final dfli a() {
                return ebtv.a;
            }
        };
        dfld c = dflaVar.c();
        dfld k = dfld.k(context, "ONEGOOGLE_MOBILE");
        this.c = c;
        this.d = k;
        this.b = eaveVar;
        this.e = context.getApplicationContext().getPackageName();
    }

    @Override // defpackage.ebtw, defpackage.ebtx
    public final void a(Object obj, ezoo ezooVar) {
        eixn eixnVar = (eixn) obj;
        int i = 2;
        int i2 = (eixnVar == null ? new dvvz(3, null) : "pseudonymous".equals(eixnVar.b().k) ? new dvvz(2, null) : "incognito".equals(eixnVar.b().k) ? new dvvz(3, null) : ((ejhi) this.b).g(eixnVar) ? dvvz.a(ejhi.i(eixnVar)) : new dvvz(2, null)).b;
        if (i2 == 4) {
            return;
        }
        if (i2 != 1 || (obj != null && this.b.g(obj))) {
            i = i2;
        }
        b(i, obj, ezooVar);
    }

    public final void b(int i, Object obj, ezoo ezooVar) {
        dflc i2;
        int a2 = ezox.a(ezooVar.c);
        boolean z = false;
        emxf.a((a2 == 0 || a2 == 1) ? false : true);
        int a3 = ezou.a(ezooVar.d);
        emxf.a((a3 == 0 || a3 == 1) ? false : true);
        int a4 = ezos.a(ezooVar.f);
        if (a4 != 0 && a4 != 1) {
            z = true;
        }
        emxf.a(z);
        ezop ezopVar = (ezop) ezoq.a.createBuilder();
        ezon ezonVar = (ezon) ezooVar.toBuilder();
        String str = this.e;
        ezonVar.copyOnWrite();
        ezoo ezooVar2 = (ezoo) ezonVar.instance;
        str.getClass();
        ezooVar2.b |= 64;
        ezooVar2.g = str;
        ezoo ezooVar3 = (ezoo) ezonVar.build();
        ezopVar.copyOnWrite();
        ezoq ezoqVar = (ezoq) ezopVar.instance;
        ezooVar3.getClass();
        ezoqVar.c = ezooVar3;
        ezoqVar.b |= 1;
        ezoq ezoqVar2 = (ezoq) ezopVar.build();
        int i3 = i - 1;
        if (i3 != 0) {
            i2 = i3 != 1 ? this.d.i(ezoqVar2) : this.c.i(ezoqVar2);
        } else {
            i2 = this.c.i(ezoqVar2);
            i2.h(String.valueOf(this.b.c(obj)));
        }
        i2.i((ezox.a(ezooVar.c) != 0 ? r8 : 1) - 1);
        i2.c();
    }
}
