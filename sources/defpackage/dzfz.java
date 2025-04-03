package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.Map;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzfz implements dzgg {
    private final Context a;
    private final dzja b;
    private final dzqs c;
    private final fbik d;
    private final Map e;

    public dzfz(Context context, dzja dzjaVar, dzqs dzqsVar, fbik fbikVar, Map map) {
        this.a = context;
        this.b = dzjaVar;
        this.c = dzqsVar;
        this.d = fbikVar;
        this.e = map;
    }

    @Override // defpackage.dzgg
    public final ListenableFuture a(fcfo fcfoVar) {
        ezjk ezjkVar = (ezjk) ezjl.a.createBuilder();
        ezjkVar.copyOnWrite();
        ezjl ezjlVar = (ezjl) ezjkVar.instance;
        fbik fbikVar = this.d;
        fbikVar.getClass();
        ezjlVar.d = fbikVar;
        ezjlVar.b |= 2;
        ezjkVar.copyOnWrite();
        ezjl ezjlVar2 = (ezjl) ezjkVar.instance;
        fcfoVar.getClass();
        ezjlVar2.c = fcfoVar;
        ezjlVar2.b |= 1;
        int i = dzee.a;
        fblf fblfVar = (fblf) fblh.a.createBuilder();
        dzqs dzqsVar = this.c;
        char c = 65535;
        int a = dzqsVar.h().a() - 1;
        if (a == 1) {
            fbjt fbjtVar = fbjt.TEXT;
            fblfVar.copyOnWrite();
            ((fblh) fblfVar.instance).n = fbjtVar.a();
            fbls fblsVar = (fbls) fblt.a.createBuilder();
            String d = dzqsVar.h().d();
            fblsVar.copyOnWrite();
            ((fblt) fblsVar.instance).b = d;
            fblfVar.copyOnWrite();
            fblh fblhVar = (fblh) fblfVar.instance;
            fblt fbltVar = (fblt) fblsVar.build();
            fbltVar.getClass();
            fblhVar.f = fbltVar;
            fblhVar.e = 102;
        } else if (a == 2) {
            Map map = this.e;
            if (map.containsKey(((dznp) dzqsVar.h().b()).a)) {
                String str = ((dznp) dzqsVar.h().b()).a;
                int hashCode = str.hashCode();
                if (hashCode != -989034367) {
                    if (hashCode == -843123565 && str.equals("rich_card")) {
                        c = 1;
                    }
                } else if (str.equals("photos")) {
                    c = 0;
                }
                if (c == 0) {
                    fblfVar = ((dzdv) map.get(((dznp) dzqsVar.h().b()).a)).a().b(dzqsVar);
                } else if (c != 1) {
                    fblfVar = (fblf) fblh.a.createBuilder();
                    fbjt fbjtVar2 = fbjt.UNKNOWN;
                    fblfVar.copyOnWrite();
                    ((fblh) fblfVar.instance).n = fbjtVar2.a();
                } else {
                    fblfVar = ((dzdv) map.get(((dznp) dzqsVar.h().b()).a)).a().b(dzqsVar);
                    fbjt fbjtVar3 = fbjt.RICH_CARD;
                    fblfVar.copyOnWrite();
                    ((fblh) fblfVar.instance).n = fbjtVar3.a();
                }
            } else {
                fblfVar = (fblf) fblh.a.createBuilder();
                fbjt fbjtVar4 = fbjt.UNKNOWN;
                fblfVar.copyOnWrite();
                ((fblh) fblfVar.instance).n = fbjtVar4.a();
            }
        } else if (a != 3) {
            fbjt fbjtVar5 = fbjt.UNKNOWN;
            fblfVar.copyOnWrite();
            ((fblh) fblfVar.instance).n = fbjtVar5.a();
        } else {
            fbjt fbjtVar6 = fbjt.RICH_TEXT;
            fblfVar.copyOnWrite();
            ((fblh) fblfVar.instance).n = fbjtVar6.a();
            fbnn b = dzeu.b(dzqsVar.h().c());
            fblfVar.copyOnWrite();
            fblh fblhVar2 = (fblh) fblfVar.instance;
            b.getClass();
            fblhVar2.f = b;
            fblhVar2.e = 106;
        }
        int a2 = dzqsVar.a();
        fblfVar.copyOnWrite();
        ((fblh) fblfVar.instance).s = a2;
        String r = dzqsVar.r();
        fblfVar.copyOnWrite();
        ((fblh) fblfVar.instance).i = r;
        fbik b2 = dzec.b(dzqsVar.e());
        fblfVar.copyOnWrite();
        fblh fblhVar3 = (fblh) fblfVar.instance;
        b2.getClass();
        fblhVar3.k = b2;
        fblhVar3.b = 1 | fblhVar3.b;
        fbhy b3 = dzea.b(dzqsVar.f());
        fblfVar.copyOnWrite();
        fblh fblhVar4 = (fblh) fblfVar.instance;
        b3.getClass();
        fblhVar4.l = b3;
        fblhVar4.b |= 2;
        if (dzqsVar.k().g()) {
            Object c2 = dzqsVar.k().c();
            fblfVar.copyOnWrite();
            ((fblh) fblfVar.instance).m = (String) c2;
        }
        if (dzqsVar.m().g()) {
            Object c3 = dzqsVar.m().c();
            fblfVar.copyOnWrite();
            ((fblh) fblfVar.instance).p = (String) c3;
        }
        if (!dzqsVar.o().isEmpty()) {
            enqu listIterator = dzqsVar.o().keySet().listIterator();
            while (listIterator.hasNext()) {
                String str2 = (String) listIterator.next();
                try {
                    eydq eydqVar = (eydq) eyfy.parseFrom(eydq.a, (eyee) dzqsVar.o().get(str2), eyfc.a());
                    str2.getClass();
                    eydqVar.getClass();
                    fblfVar.copyOnWrite();
                    fblh fblhVar5 = (fblh) fblfVar.instance;
                    eyhm eyhmVar = fblhVar5.o;
                    if (!eyhmVar.b) {
                        fblhVar5.o = eyhmVar.a();
                    }
                    fblhVar5.o.put(str2, eydqVar);
                } catch (eygu e) {
                    dyhr.d("MsgProtoConverter", "Error parsing metadata map", e);
                }
            }
        }
        dzqsVar.l();
        eyee q = dzqsVar.q();
        fblfVar.copyOnWrite();
        ((fblh) fblfVar.instance).v = q;
        fblh fblhVar6 = (fblh) fblfVar.build();
        ezjkVar.copyOnWrite();
        ezjl ezjlVar3 = (ezjl) ezjkVar.instance;
        fblhVar6.getClass();
        ezjlVar3.e = fblhVar6;
        ezjlVar3.b |= 4;
        fbjd fbjdVar = (fbjd) fbje.a.createBuilder();
        String a3 = dyhq.a(this.a);
        fbjdVar.copyOnWrite();
        fbje fbjeVar = (fbje) fbjdVar.instance;
        a3.getClass();
        fbjeVar.b = a3;
        fbje fbjeVar2 = (fbje) fbjdVar.build();
        ezjkVar.copyOnWrite();
        ezjl ezjlVar4 = (ezjl) ezjkVar.instance;
        fbjeVar2.getClass();
        ezjlVar4.f = fbjeVar2;
        ezjlVar4.b |= 8;
        return erqt.i((ezjl) ezjkVar.build());
    }

    @Override // defpackage.dzgg
    public final /* bridge */ /* synthetic */ ListenableFuture b(ListenableFuture listenableFuture, Object obj) {
        final ezjl ezjlVar = (ezjl) obj;
        return erny.g(listenableFuture, new eroh() { // from class: dzfy
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj2) {
                return ((fbkf) obj2).b(ezjl.this);
            }
        }, erpp.a);
    }

    @Override // defpackage.dzgg
    public final /* synthetic */ Object c(Object obj) {
        return new dyqi(emxc.j(Long.valueOf(((ezjn) obj).b)));
    }

    @Override // defpackage.dzgg
    public final void d(UUID uuid, int i, Status status, dyyt dyytVar, long j) {
        dzhl r = dzhm.r();
        r.g(10003);
        r.n(this.b.c().f());
        r.o(this.b.d().E());
        r.p(this.c.r());
        r.d(this.c.f());
        r.j(12);
        r.m(Integer.valueOf(status.getCode().value()));
        r.f(i);
        r.e(j);
        dyytVar.b(r.a());
    }

    @Override // defpackage.dzgg
    public final /* bridge */ /* synthetic */ void e(UUID uuid, Object obj, dyyt dyytVar, long j) {
        dzhl r = dzhm.r();
        r.g(10003);
        r.n(this.b.c().f());
        r.o(this.b.d().E());
        r.p(this.c.r());
        r.d(this.c.f());
        r.j(12);
        r.f(1);
        r.e(j);
        dyytVar.b(r.a());
    }
}
