package defpackage;

import android.content.Intent;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvhw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dvhx b;
    final /* synthetic */ dvdp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvhw(dvhx dvhxVar, dvdp dvdpVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dvhxVar;
        this.c = dvdpVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dvhw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                dvuy dvuyVar = (dvuy) this.b.d.b();
                if (dvuyVar == null) {
                    this.b.e.a(this.c, "GrowthKitCallbacks not found.", new Object[0]);
                    this.b.f.e(this.c, eycm.PROMO_NOT_SHOWN_CLIENT_CALLBACK_NOT_REGISTERED);
                    return false;
                }
                if (!fdnr.b() && dvdl.b(this.b.c)) {
                    this.b.e.a(this.c, "Accessibility is enabled, not displaying.", new Object[0]);
                    this.b.f.e(this.c, eycm.PROMO_NOT_SHOWN_ACCESSIBILITY_ENABLED);
                    return false;
                }
                eg a = dvuyVar.a();
                if (this.b.h.e()) {
                    this.b.e.a(this.c, "Not showing as a promotion is already presented or being shown.", new Object[0]);
                    this.b.f.e(this.c, eycm.PROMO_NOT_SHOWN_ALREADY_PRESENTING);
                    ((ensz) dvhx.a.h()).q("Not showing promotion, as a promotion is already presented or being shown.");
                    return false;
                }
                for (String str : dvhx.b) {
                    if (a.a().h(str) != null) {
                        this.b.e.a(this.c, "Not showing as a promotion is already presented.", new Object[0]);
                        this.b.f.e(this.c, eycm.PROMO_NOT_SHOWN_ALREADY_PRESENTING);
                        ((ensz) dvhx.a.h()).t("Not showing promotion, as %s promotion is already presented.", str);
                        return false;
                    }
                }
                evts c = this.c.c();
                evzd evzdVar = c.f;
                if (evzdVar == null) {
                    evzdVar = evzd.a;
                }
                evzdVar.getClass();
                int b = dvdr.b(evzdVar);
                evzd evzdVar2 = c.f;
                if (evzdVar2 == null) {
                    evzdVar2 = evzd.a;
                }
                evzdVar2.getClass();
                String str2 = "";
                if ((evzdVar2.c == 3 ? (evzr) evzdVar2.d : evzr.a).c == 1) {
                    evzr evzrVar = evzdVar2.c == 3 ? (evzr) evzdVar2.d : evzr.a;
                    if (evzrVar.c == 1) {
                        str2 = (String) evzrVar.d;
                    }
                } else {
                    int i = evzdVar2.c;
                    if (i == 3) {
                        evzr evzrVar2 = (evzr) evzdVar2.d;
                        if (evzrVar2.c == 10) {
                            str2 = (String) evzrVar2.d;
                        }
                    } else if ((i == 5 ? (ewab) evzdVar2.d : ewab.a).c == 1) {
                        ewab ewabVar = evzdVar2.c == 5 ? (ewab) evzdVar2.d : ewab.a;
                        if (ewabVar.c == 1) {
                            str2 = (String) ewabVar.d;
                        }
                    } else if (evzdVar2.c == 5) {
                        ewab ewabVar2 = (ewab) evzdVar2.d;
                        if (ewabVar2.c == 8) {
                            str2 = (String) ewabVar2.d;
                        }
                    } else {
                        str2 = null;
                    }
                }
                dvun dvunVar = new dvun();
                dvunVar.c = b;
                dvunVar.a = str2;
                if (dvunVar.b == null) {
                    dvunVar.b = new enhd();
                }
                enhd enhdVar = dvunVar.b;
                enhk b2 = this.c.b();
                b2.getClass();
                Iterator it = b2.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    key.getClass();
                    Object value = entry.getValue();
                    value.getClass();
                    enhdVar.k(dvdr.a((evxg) key), (Intent) value);
                }
                dvux b3 = dvuyVar.b(dvunVar.a());
                if (!b3.a) {
                    this.b.e.c(this.c, "Rejected by GrowthKitCallbacks [%s].", dvuyVar.getClass().getSimpleName());
                    this.b.f.o(this.c, b3.b);
                    return false;
                }
                evzm a2 = dvrn.a(this.b.c);
                dvqs dvqsVar = this.b.h;
                dvdp dvdpVar = this.c;
                a2.getClass();
                dvqsVar.c(dvdpVar, a2, a);
                dvdp dvdpVar2 = this.c;
                if (b == 6) {
                    evzd evzdVar3 = dvdpVar2.c().f;
                    if (evzdVar3 == null) {
                        evzdVar3 = evzd.a;
                    }
                    int a3 = evzt.a((evzdVar3.c == 5 ? (ewab) evzdVar3.d : ewab.a).l);
                    if (a3 == 0) {
                        a3 = 1;
                    }
                    if (a3 - 1 == 2) {
                        dvqw dvqwVar = this.b.i;
                        dvdp dvdpVar3 = this.c;
                        this.a = 1;
                        if (dvqwVar.a(dvdpVar3, this) == ffhhVar) {
                            return ffhhVar;
                        }
                    }
                }
                dvqn dvqnVar = this.b.g;
                evzd evzdVar4 = c.f;
                if (evzdVar4 == null) {
                    evzdVar4 = evzd.a;
                }
                this.b.g.b(a, dvqnVar.a(a, evzdVar4), this.c, a2);
            }
            return true;
        } catch (Exception e) {
            this.b.e.e(this.c, e, new Object[0]);
            this.b.f.e(this.c, eycm.PROMO_NOT_SHOWN_INTERNAL_ERROR);
            this.b.h.d(this.c);
            return false;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dvhw(this.b, this.c, ffguVar);
    }
}
