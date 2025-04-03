package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzfx implements dzgg {
    public final String a;
    private final Context b;
    private final dzja c;
    private final dzpt d;
    private final eyee e;
    private final fbik f;
    private final emxc g;
    private final String h;

    public dzfx(Context context, dzja dzjaVar, dzpt dzptVar, eyee eyeeVar, fbik fbikVar, emxc emxcVar, String str) {
        this.b = context;
        this.c = dzjaVar;
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        this.a = uuid;
        this.d = dzptVar;
        this.e = eyeeVar;
        this.f = fbikVar;
        this.g = emxcVar;
        this.h = str;
    }

    @Override // defpackage.dzgg
    public final ListenableFuture a(fcfo fcfoVar) {
        ezjk ezjkVar = (ezjk) ezjl.a.createBuilder();
        ezjkVar.copyOnWrite();
        ezjl ezjlVar = (ezjl) ezjkVar.instance;
        fbik fbikVar = this.f;
        fbikVar.getClass();
        ezjlVar.d = fbikVar;
        ezjlVar.b |= 2;
        ezjkVar.copyOnWrite();
        ezjl ezjlVar2 = (ezjl) ezjkVar.instance;
        fcfoVar.getClass();
        ezjlVar2.c = fcfoVar;
        ezjlVar2.b |= 1;
        int i = dzee.a;
        dzpt dzptVar = this.d;
        fbik b = dzec.b(dzptVar.a());
        fblf fblfVar = (fblf) fblh.a.createBuilder();
        fblfVar.copyOnWrite();
        ((fblh) fblfVar.instance).i = this.a;
        fblfVar.copyOnWrite();
        fblh fblhVar = (fblh) fblfVar.instance;
        b.getClass();
        fblhVar.k = b;
        fblhVar.b |= 1;
        fbhy b2 = dzea.b(dzptVar);
        fblfVar.copyOnWrite();
        fblh fblhVar2 = (fblh) fblfVar.instance;
        b2.getClass();
        fblhVar2.l = b2;
        fblhVar2.b |= 2;
        fblfVar.copyOnWrite();
        fblh fblhVar3 = (fblh) fblfVar.instance;
        eyee eyeeVar = this.e;
        eyeeVar.getClass();
        fblhVar3.v = eyeeVar;
        fblfVar.copyOnWrite();
        fblh fblhVar4 = (fblh) fblfVar.instance;
        b.getClass();
        fblhVar4.d = b;
        fblhVar4.c = 5;
        fbjt fbjtVar = fbjt.EVENT;
        fblfVar.copyOnWrite();
        ((fblh) fblfVar.instance).n = fbjtVar.a();
        fbld fbldVar = (fbld) fble.a.createBuilder();
        fbldVar.copyOnWrite();
        ((fble) fbldVar.instance).c = fbjx.a(8);
        eydp eydpVar = (eydp) eydq.a.createBuilder();
        eydpVar.copyOnWrite();
        ((eydq) eydpVar.instance).b = "type.googleapis.com/google.internal.communications.instantmessaging.v1.ActionEvent";
        fbkv fbkvVar = (fbkv) fbkw.a.createBuilder();
        String str = (String) this.g.e("");
        fbkvVar.copyOnWrite();
        fbkw fbkwVar = (fbkw) fbkvVar.instance;
        String str2 = this.h;
        fbkwVar.b = str;
        fbkvVar.copyOnWrite();
        ((fbkw) fbkvVar.instance).c = str2;
        eyee byteString = ((fbkw) fbkvVar.build()).toByteString();
        eydpVar.copyOnWrite();
        ((eydq) eydpVar.instance).c = byteString;
        eydq eydqVar = (eydq) eydpVar.build();
        fbldVar.copyOnWrite();
        fble fbleVar = (fble) fbldVar.instance;
        eydqVar.getClass();
        fbleVar.d = eydqVar;
        fbleVar.b |= 1;
        fblfVar.copyOnWrite();
        fblh fblhVar5 = (fblh) fblfVar.instance;
        fble fbleVar2 = (fble) fbldVar.build();
        fbleVar2.getClass();
        fblhVar5.f = fbleVar2;
        fblhVar5.e = 105;
        fblh fblhVar6 = (fblh) fblfVar.build();
        ezjkVar.copyOnWrite();
        ezjl ezjlVar3 = (ezjl) ezjkVar.instance;
        fblhVar6.getClass();
        ezjlVar3.e = fblhVar6;
        ezjlVar3.b |= 4;
        fbjd fbjdVar = (fbjd) fbje.a.createBuilder();
        String a = dyhq.a(this.b);
        fbjdVar.copyOnWrite();
        fbje fbjeVar = (fbje) fbjdVar.instance;
        a.getClass();
        fbjeVar.b = a;
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
        return erny.g(listenableFuture, new eroh() { // from class: dzfw
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj2) {
                return ((fbkf) obj2).b(ezjl.this);
            }
        }, erpp.a);
    }

    @Override // defpackage.dzgg
    public final /* bridge */ /* synthetic */ Object c(Object obj) {
        return null;
    }

    @Override // defpackage.dzgg
    public final void d(UUID uuid, int i, Status status, dyyt dyytVar, long j) {
        dzhl r = dzhm.r();
        r.g(10003);
        r.n(this.c.c().f());
        r.o(this.c.d().E());
        r.p(this.a);
        r.d(this.d);
        r.j(19);
        r.m(Integer.valueOf(status.getCode().value()));
        r.f(i);
        r.e(j);
        dyytVar.b(r.a());
    }

    @Override // defpackage.dzgg
    public final /* bridge */ /* synthetic */ void e(UUID uuid, Object obj, dyyt dyytVar, long j) {
        dzhl r = dzhm.r();
        r.g(10003);
        r.n(this.c.c().f());
        r.o(this.c.d().E());
        r.p(this.a);
        r.d(this.d);
        r.j(19);
        r.f(1);
        r.e(j);
        dyytVar.b(r.a());
    }
}
