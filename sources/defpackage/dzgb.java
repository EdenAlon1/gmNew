package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzgb implements dzgg {
    private final dzja a;
    private final fbik b;
    private final fbnz c;
    private final List d;

    /* JADX WARN: Multi-variable type inference failed */
    public dzgb(dzja dzjaVar, dzpg dzpgVar, dzsi dzsiVar, List list) {
        this.a = dzjaVar;
        this.b = dzec.b(dzpgVar);
        fbny fbnyVar = (fbny) fbnz.a.createBuilder();
        dzop dzopVar = (dzop) dzsiVar;
        if (dzopVar.a.g()) {
            boolean booleanValue = ((Boolean) dzopVar.a.c()).booleanValue();
            fbnyVar.copyOnWrite();
            ((fbnz) fbnyVar.instance).b = booleanValue;
        }
        if (dzopVar.b.g()) {
            int i = true != ((Boolean) dzopVar.b.c()).booleanValue() ? 4 : 3;
            fbnyVar.copyOnWrite();
            ((fbnz) fbnyVar.instance).c = i - 2;
        }
        this.c = (fbnz) fbnyVar.build();
        this.d = new ArrayList();
        enqv it = ((engw) list).iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            this.d.add(intValue == 1 ? fbkd.READ_RECEIPT_OPT_IN : intValue == 2 ? fbkd.REVIEW_PRIVATE_REPLY_OPT_IN : fbkd.UNKNOWN);
        }
    }

    @Override // defpackage.dzgg
    public final ListenableFuture a(fcfo fcfoVar) {
        fboh fbohVar = (fboh) fboi.a.createBuilder();
        fbohVar.copyOnWrite();
        fboi fboiVar = (fboi) fbohVar.instance;
        fcfoVar.getClass();
        fboiVar.c = fcfoVar;
        fboiVar.b |= 1;
        fbohVar.copyOnWrite();
        fboi fboiVar2 = (fboi) fbohVar.instance;
        fbik fbikVar = this.b;
        fbikVar.getClass();
        fboiVar2.d = fbikVar;
        fboiVar2.b |= 2;
        fbohVar.copyOnWrite();
        fboi fboiVar3 = (fboi) fbohVar.instance;
        fbnz fbnzVar = this.c;
        fbnzVar.getClass();
        fboiVar3.e = fbnzVar;
        fboiVar3.b |= 4;
        fbohVar.copyOnWrite();
        fboi fboiVar4 = (fboi) fbohVar.instance;
        eygi eygiVar = fboiVar4.f;
        if (!eygiVar.c()) {
            fboiVar4.f = eyfy.mutableCopy(eygiVar);
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            fboiVar4.f.h(((fbkd) it.next()).a());
        }
        return erqt.i((fboi) fbohVar.build());
    }

    @Override // defpackage.dzgg
    public final /* bridge */ /* synthetic */ ListenableFuture b(ListenableFuture listenableFuture, Object obj) {
        final fboi fboiVar = (fboi) obj;
        return erny.g(listenableFuture, new eroh() { // from class: dzga
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj2) {
                fbob fbobVar = (fbob) obj2;
                fdxk fdxkVar = fbobVar.a;
                febs febsVar = fboc.b;
                if (febsVar == null) {
                    synchronized (fboc.class) {
                        febsVar = fboc.b;
                        if (febsVar == null) {
                            febp a = febs.a();
                            a.c = febr.UNARY;
                            a.d = febs.c("google.internal.communications.instantmessaging.v1.LighterUserPropertiesService", "SetUserProperties");
                            a.b();
                            fboi fboiVar2 = fboi.a;
                            eyfc eyfcVar = ffag.a;
                            a.a = new ffae(fboiVar2);
                            a.b = new ffae(fbok.a);
                            febsVar = a.a();
                            fboc.b = febsVar;
                        }
                    }
                }
                return ffat.a(fdxkVar.a(febsVar, fbobVar.b), fboi.this);
            }
        }, erpp.a);
    }

    @Override // defpackage.dzgg
    public final /* bridge */ /* synthetic */ Object c(Object obj) {
        fbnz fbnzVar = ((fbok) obj).b;
        if (fbnzVar == null) {
            fbnzVar = fbnz.a;
        }
        return new dyqj(dzed.a(fbnzVar));
    }

    @Override // defpackage.dzgg
    public final void d(UUID uuid, int i, Status status, dyyt dyytVar, long j) {
        dzhl r = dzhm.r();
        r.g(10003);
        r.n(this.a.c().f());
        r.o(this.a.d().E());
        r.p(uuid.toString());
        r.j(48);
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
        r.j(48);
        r.f(1);
        r.e(j);
        dyytVar.b(r.a());
    }
}
