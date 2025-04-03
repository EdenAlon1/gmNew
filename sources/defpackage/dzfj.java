package defpackage;

import android.content.Context;
import android.util.Base64;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzfj implements dzgg {
    private final dzja a;
    private final int b;
    private final String c;
    private final Context d;
    private final Map e;
    private final dzhn f;

    public dzfj(dzja dzjaVar, int i, String str, Context context, Map map, dzhn dzhnVar) {
        this.a = dzjaVar;
        this.b = i;
        this.c = str;
        this.d = context;
        this.e = map;
        this.f = dzhnVar;
    }

    @Override // defpackage.dzgg
    public final ListenableFuture a(fcfo fcfoVar) {
        fbhb fbhbVar = (fbhb) fbhc.a.createBuilder();
        fbhbVar.copyOnWrite();
        fbhc fbhcVar = (fbhc) fbhbVar.instance;
        fcfoVar.getClass();
        fbhcVar.c = fcfoVar;
        fbhcVar.b |= 1;
        fbhbVar.copyOnWrite();
        ((fbhc) fbhbVar.instance).d = 0L;
        fbhbVar.copyOnWrite();
        ((fbhc) fbhbVar.instance).e = 0L;
        fbhbVar.copyOnWrite();
        ((fbhc) fbhbVar.instance).f = this.b;
        fbhbVar.copyOnWrite();
        ((fbhc) fbhbVar.instance).h = true;
        fbhbVar.copyOnWrite();
        ((fbhc) fbhbVar.instance).g = this.c;
        return erqt.i((fbhc) fbhbVar.build());
    }

    @Override // defpackage.dzgg
    public final /* bridge */ /* synthetic */ ListenableFuture b(ListenableFuture listenableFuture, Object obj) {
        final fbhc fbhcVar = (fbhc) obj;
        return erny.g(listenableFuture, new eroh() { // from class: dzfi
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj2) {
                fbgv fbgvVar = (fbgv) obj2;
                fdxk fdxkVar = fbgvVar.a;
                febs febsVar = fbgw.a;
                if (febsVar == null) {
                    synchronized (fbgw.class) {
                        febsVar = fbgw.a;
                        if (febsVar == null) {
                            febp a = febs.a();
                            a.c = febr.UNARY;
                            a.d = febs.c("google.internal.communications.instantmessaging.v1.LighterCloudMessageService", "ListConversations");
                            a.b();
                            fbhc fbhcVar2 = fbhc.a;
                            eyfc eyfcVar = ffag.a;
                            a.a = new ffae(fbhcVar2);
                            a.b = new ffae(fbhe.a);
                            febsVar = a.a();
                            fbgw.a = febsVar;
                        }
                    }
                }
                return ffat.a(fdxkVar.a(febsVar, fbgvVar.b), fbhc.this);
            }
        }, erpp.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dzgg
    public final /* synthetic */ Object c(Object obj) {
        Iterator it;
        Context context;
        Map map;
        dzhn dzhnVar;
        emxc emxcVar;
        boolean z;
        dzfj dzfjVar = this;
        fbhe fbheVar = (fbhe) obj;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = fbheVar.b.iterator();
        while (it2.hasNext()) {
            fbgg fbggVar = (fbgg) it2.next();
            Context context2 = dzfjVar.d;
            dzja dzjaVar = dzfjVar.a;
            Map map2 = dzfjVar.e;
            dzhn dzhnVar2 = dzfjVar.f;
            int i = engw.d;
            engr engrVar = new engr();
            Iterator<E> it3 = fbggVar.c.iterator();
            while (it3.hasNext()) {
                emxc a = dzdy.a((fbge) it3.next());
                if (a.g()) {
                    engrVar.h(a.c());
                }
            }
            engr engrVar2 = new engr();
            fbgi fbgiVar = fbggVar.d;
            if (fbgiVar == null) {
                fbgiVar = fbgi.a;
            }
            for (fbgm fbgmVar : fbgiVar.b) {
                fblh fblhVar = fbgmVar.c;
                if (fblhVar == null) {
                    fblhVar = fblh.a;
                }
                emxc c = dzee.c(emxc.j(fblhVar), dzjaVar, context2, map2, dzhnVar2);
                if (c.g()) {
                    dzqs j = ((dzbg) c.c()).j();
                    dznl dznlVar = new dznl(j);
                    dznm dznmVar = (dznm) j;
                    it = it2;
                    context = context2;
                    if (!dznmVar.k.a().equals(dzqr.OVERLAY)) {
                        dzqk dzqkVar = dznmVar.f;
                        if (dzqkVar.a() != 5) {
                            map = map2;
                            if (dznmVar.j != -1 && dzqkVar.a() == 1) {
                                dznlVar.b = dzky.b(eyee.x(Base64.encode(fbgmVar.toByteArray(), 8)));
                            }
                            engr engrVar3 = new engr();
                            Iterator it4 = fbgmVar.d.iterator();
                            while (it4.hasNext()) {
                                emxc a2 = dzdy.a((fbge) it4.next());
                                if (a2.g()) {
                                    engrVar3.h(a2.c());
                                    Object c2 = a2.c();
                                    dzqm dzqmVar = ((dznm) dznlVar.a()).g;
                                    engr engrVar4 = engrVar3;
                                    int i2 = dznmVar.r;
                                    Iterator it5 = it4;
                                    dzpt dzptVar = dznmVar.c;
                                    dzmn dzmnVar = (dzmn) c2;
                                    int i3 = dzmnVar.a;
                                    dzhn dzhnVar3 = dzhnVar2;
                                    if (i3 != 3) {
                                        if (i3 != 4) {
                                            if (i3 == 5 && i2 == 2 && dzqm.m.contains(dzqmVar)) {
                                                dznlVar.k(dzqm.OUTGOING_SENT);
                                            }
                                        } else if (i2 == 1) {
                                            if (dzqmVar.equals(dzqm.INCOMING_RECEIVED)) {
                                                dzou dzouVar = dzmnVar.b;
                                                if (((dzns) ((dzkk) dzouVar).a).a.contains(dzptVar.a())) {
                                                    dznlVar.k(dzqm.INCOMING_RECEIVED);
                                                }
                                            }
                                        } else if (!dzqmVar.equals(dzqm.OUTGOING_READ) && !dzqmVar.equals(dzqm.OUTGOING_FAILED_TO_DELIVER)) {
                                            dznlVar.k(dzqm.OUTGOING_DELIVERED);
                                        }
                                        engrVar3 = engrVar4;
                                        it4 = it5;
                                        dzhnVar2 = dzhnVar3;
                                    } else {
                                        if (i2 == 1) {
                                            dzou dzouVar2 = dzmnVar.b;
                                            if (((dzns) ((dzkk) dzouVar2).a).a.contains(dzptVar.a())) {
                                                dznlVar.k(dzqm.INCOMING_READ_RECEIPT_SENT);
                                            }
                                        } else {
                                            dznlVar.k(dzqm.OUTGOING_READ);
                                        }
                                        engrVar3 = engrVar4;
                                        it4 = it5;
                                        dzhnVar2 = dzhnVar3;
                                    }
                                }
                            }
                            dzhnVar = dzhnVar2;
                            engw g = engrVar3.g();
                            dzqs a3 = dznlVar.a();
                            if (g == null) {
                                throw new NullPointerException("Null annotations");
                            }
                            dzpt dzptVar2 = dznmVar.c;
                            if (((dznm) a3).r != 2) {
                                int i4 = ((enou) g).c;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    dzov dzovVar = (dzov) g.get(i5);
                                    if (dzovVar.a() == 4) {
                                        dzqy dzqyVar = ((dzkk) dzovVar.b()).a;
                                        if (((dzns) dzqyVar).a.contains(dzptVar2.a())) {
                                        }
                                    }
                                }
                                z = true;
                                emxcVar = emxc.j(new dzmq(a3, g, emxc.j(Boolean.valueOf(z)), emxc.i(((dzaf) c.c()).a)));
                            }
                            z = false;
                            emxcVar = emxc.j(new dzmq(a3, g, emxc.j(Boolean.valueOf(z)), emxc.i(((dzaf) c.c()).a)));
                        }
                    }
                    map = map2;
                    dzhnVar = dzhnVar2;
                    emxcVar = emux.a;
                } else {
                    emxcVar = emux.a;
                    it = it2;
                    context = context2;
                    map = map2;
                    dzhnVar = dzhnVar2;
                }
                if (emxcVar.g()) {
                    engrVar2.h(emxcVar.c());
                }
                it2 = it;
                context2 = context;
                map2 = map;
                dzhnVar2 = dzhnVar;
            }
            Iterator it6 = it2;
            fbhy fbhyVar = fbggVar.b;
            if (fbhyVar == null) {
                fbhyVar = fbhy.a;
            }
            dzpt a4 = dzea.a(dzjaVar, fbhyVar);
            engw g2 = engrVar2.g();
            if (g2 == null) {
                throw new NullPointerException("Null cloudMessages");
            }
            dzmp dzmpVar = new dzmp(g2);
            engw g3 = engrVar.g();
            if (g3 == null) {
                throw new NullPointerException("Null annotations");
            }
            arrayList.add(new dzmo(a4, dzmpVar, g3));
            dzfjVar = this;
            it2 = it6;
        }
        String str = fbheVar.c;
        if (str == null) {
            throw new NullPointerException("Null nextPageToken");
        }
        engw n = engw.n(arrayList);
        if (n != null) {
            return new dyqb(str, n);
        }
        throw new IllegalStateException("Missing required properties:".concat(" conversations"));
    }

    @Override // defpackage.dzgg
    public final void d(UUID uuid, int i, Status status, dyyt dyytVar, long j) {
        dzhl r = dzhm.r();
        r.g(10003);
        r.n(this.a.c().f());
        r.o(this.a.d().E());
        r.p(uuid.toString());
        r.j(24);
        r.m(Integer.valueOf(status.getCode().value()));
        r.f(i);
        r.e(j);
        dyytVar.b(r.a());
    }

    @Override // defpackage.dzgg
    public final /* bridge */ /* synthetic */ void e(UUID uuid, Object obj, dyyt dyytVar, long j) {
        dzhl r = dzhm.r();
        r.g(10003);
        r.n(this.a.c().f());
        r.o(this.a.d().E());
        r.p(uuid.toString());
        r.j(24);
        r.f(1);
        r.e(j);
        dyytVar.b(r.a());
    }
}
