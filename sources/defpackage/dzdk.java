package defpackage;

import android.content.Context;
import android.util.Base64;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzdk implements dypw {
    public final dzci a;
    public final Context b;
    public final dyyt c;
    public final dzcz d;
    public final Map e;

    public dzdk(dzci dzciVar, Context context, Map map) {
        this.a = dzciVar;
        this.b = context;
        this.c = dyyt.a(context);
        dyjf.c();
        this.d = new dzcz();
        this.e = map;
    }

    public static fbik d(dzpt dzptVar) {
        if (dzptVar.e() == dzpq.ONE_TO_ONE) {
            return dzec.b(dzptVar.c());
        }
        fbij fbijVar = (fbij) fbik.a.createBuilder();
        fbijVar.copyOnWrite();
        ((fbik) fbijVar.instance).b = fbjw.a(6);
        String b = dzptVar.d().b();
        fbijVar.copyOnWrite();
        ((fbik) fbijVar.instance).c = b;
        String a = dzptVar.d().a();
        fbijVar.copyOnWrite();
        ((fbik) fbijVar.instance).e = a;
        return (fbik) fbijVar.build();
    }

    public static fbko e(String str) {
        return (fbko) eyfy.parseFrom(fbko.a, Base64.decode(str, 8), eyfc.a());
    }

    @Override // defpackage.dypw
    public final emxc a(dzja dzjaVar, String str) {
        boolean z;
        dzhl r = dzhm.r();
        r.g(10107);
        this.c.b(r.a());
        try {
            fbko e = e(str);
            dyhr.a("TyMsgClient", a.C(e, "LighterConversationIntent: "));
            fbik fbikVar = e.c;
            if (fbikVar == null) {
                fbikVar = fbik.a;
            }
            int b = fbjw.b(fbikVar.b);
            boolean z2 = true;
            if (b == 0) {
                b = 1;
            }
            dyhr.a("TyMsgClient", a.t(Integer.toString(fbjw.a(b)), "lighterId type: "));
            dzin dzinVar = new dzin();
            dzinVar.c(dzjaVar.c().f());
            int b2 = fbjw.b(fbikVar.b);
            if (b2 == 0) {
                b2 = 1;
            }
            int i = b2 - 2;
            if (i != 1 && i != 2) {
                z = false;
                if (i != 3) {
                    if (i != 4) {
                        dyhr.c("TyMsgClient", "LighterId type is default.");
                        return emux.a;
                    }
                    dzip dzipVar = new dzip();
                    dzipVar.c(fbikVar.c);
                    dzipVar.b(fbikVar.e);
                    dzinVar.d(dzipVar.a());
                    dzpj r2 = dzpk.r();
                    r2.e(e.j);
                    r2.f(dzinVar.a());
                    r2.h(-1L);
                    r2.b(ennc.l(DesugarCollections.unmodifiableMap(e.d), new emwl() { // from class: dzde
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            return ((eydq) obj).c.I();
                        }
                    }));
                    r2.c(z);
                    return emxc.j(r2.a());
                }
                z2 = false;
            }
            dzinVar.e(dzec.a(fbikVar));
            z = z2;
            dzpj r22 = dzpk.r();
            r22.e(e.j);
            r22.f(dzinVar.a());
            r22.h(-1L);
            r22.b(ennc.l(DesugarCollections.unmodifiableMap(e.d), new emwl() { // from class: dzde
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    return ((eydq) obj).c.I();
                }
            }));
            r22.c(z);
            return emxc.j(r22.a());
        } catch (eygu | IllegalArgumentException e2) {
            dyyt dyytVar = this.c;
            dzhl r3 = dzhm.r();
            r3.g(10108);
            dyytVar.b(r3.a());
            dyhr.d("TyMsgClient", "Unable to parse intent args", e2);
            return emux.a;
        }
    }

    @Override // defpackage.dypw
    public final ListenableFuture b(dzja dzjaVar, dzpt dzptVar, eyee eyeeVar, List list, dyxb dyxbVar) {
        return c(dzjaVar, dzptVar, eyeeVar, list, dyxbVar, false);
    }

    public final ListenableFuture c(dzja dzjaVar, dzpt dzptVar, eyee eyeeVar, List list, dyxb dyxbVar, boolean z) {
        if (list.size() <= 0) {
            return erre.a;
        }
        dzfl dzflVar = new dzfl(this.b, dzjaVar, dzptVar, eyeeVar, list, d(dzptVar), z);
        dyyt dyytVar = this.c;
        dzhl r = dzhm.r();
        r.g(18);
        r.n(dzjaVar.c().f());
        r.o(dzjaVar.d().E());
        r.p(dzflVar.a);
        r.d(dzptVar);
        dyytVar.b(r.a());
        dzci dzciVar = this.a;
        ListenableFuture b = dzciVar.b(UUID.randomUUID(), dzflVar, dzciVar.d.b(), dzjaVar, dyxbVar, true);
        erqt.r(b, new dzdg(this, dzjaVar, dzflVar, dzptVar), erpp.a);
        return b;
    }
}
