package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzgf implements dzgg {
    public final String a = UUID.randomUUID().toString();
    private final Context b;
    private final dzja c;
    private final dzpt d;
    private final eyee e;
    private final boolean f;
    private final long g;
    private final fbik h;

    public dzgf(Context context, dzja dzjaVar, dzpt dzptVar, eyee eyeeVar, boolean z, long j, fbik fbikVar) {
        this.b = context;
        this.c = dzjaVar;
        this.d = dzptVar;
        this.e = eyeeVar;
        this.f = z;
        this.g = j;
        this.h = fbikVar;
    }

    @Override // defpackage.dzgg
    public final ListenableFuture a(fcfo fcfoVar) {
        ezjk ezjkVar = (ezjk) ezjl.a.createBuilder();
        ezjkVar.copyOnWrite();
        ezjl ezjlVar = (ezjl) ezjkVar.instance;
        fbik fbikVar = this.h;
        fbikVar.getClass();
        ezjlVar.d = fbikVar;
        ezjlVar.b |= 2;
        ezjkVar.copyOnWrite();
        ezjl ezjlVar2 = (ezjl) ezjkVar.instance;
        fcfoVar.getClass();
        ezjlVar2.c = fcfoVar;
        ezjlVar2.b |= 1;
        dzag dzagVar = new dzag();
        dzagVar.b(this.d);
        dzagVar.e(this.a);
        dzagVar.a = this.c.c().f();
        dzagVar.f(true != this.f ? 2 : 1);
        dzagVar.c(this.g);
        dzagVar.d(0L);
        dzbi a = dzagVar.a();
        fbik b = dzec.b(this.c.c().f());
        dzah dzahVar = (dzah) a;
        int i = dzahVar.d;
        int i2 = i != 1 ? i != 2 ? 2 : 4 : 3;
        eydp eydpVar = (eydp) eydq.a.createBuilder();
        eydpVar.copyOnWrite();
        ((eydq) eydpVar.instance).b = "type.googleapis.com/google.internal.communications.instantmessaging.v1.TypingIndicatorEvent";
        fblu fbluVar = (fblu) fblv.a.createBuilder();
        fbluVar.copyOnWrite();
        ((fblv) fbluVar.instance).b = i2 - 2;
        long j = dzahVar.e;
        fbluVar.copyOnWrite();
        ((fblv) fbluVar.instance).c = j;
        eyee byteString = ((fblv) fbluVar.build()).toByteString();
        eydpVar.copyOnWrite();
        ((eydq) eydpVar.instance).c = byteString;
        eydq eydqVar = (eydq) eydpVar.build();
        fblf fblfVar = (fblf) fblh.a.createBuilder();
        String str = dzahVar.a;
        fblfVar.copyOnWrite();
        ((fblh) fblfVar.instance).i = str;
        fblfVar.copyOnWrite();
        fblh fblhVar = (fblh) fblfVar.instance;
        b.getClass();
        fblhVar.k = b;
        fblhVar.b |= 1;
        fbhy b2 = dzea.b(dzahVar.b);
        fblfVar.copyOnWrite();
        fblh fblhVar2 = (fblh) fblfVar.instance;
        b2.getClass();
        fblhVar2.l = b2;
        fblhVar2.b |= 2;
        fbjt fbjtVar = fbjt.EVENT;
        fblfVar.copyOnWrite();
        ((fblh) fblfVar.instance).n = fbjtVar.a();
        fbld fbldVar = (fbld) fble.a.createBuilder();
        fbldVar.copyOnWrite();
        ((fble) fbldVar.instance).c = fbjx.a(4);
        fbldVar.copyOnWrite();
        fble fbleVar = (fble) fbldVar.instance;
        eydqVar.getClass();
        fbleVar.d = eydqVar;
        fbleVar.b = 1 | fbleVar.b;
        fble fbleVar2 = (fble) fbldVar.build();
        fblfVar.copyOnWrite();
        fblh fblhVar3 = (fblh) fblfVar.instance;
        fbleVar2.getClass();
        fblhVar3.f = fbleVar2;
        fblhVar3.e = 105;
        fblf fblfVar2 = (fblf) ((fblh) fblfVar.build()).toBuilder();
        eyee eyeeVar = this.e;
        fblfVar2.copyOnWrite();
        fblh fblhVar4 = (fblh) fblfVar2.instance;
        eyeeVar.getClass();
        fblhVar4.v = eyeeVar;
        fblh fblhVar5 = (fblh) fblfVar2.build();
        ezjkVar.copyOnWrite();
        ezjl ezjlVar3 = (ezjl) ezjkVar.instance;
        fblhVar5.getClass();
        ezjlVar3.e = fblhVar5;
        ezjlVar3.b |= 4;
        fbjd fbjdVar = (fbjd) fbje.a.createBuilder();
        String a2 = dyhq.a(this.b);
        fbjdVar.copyOnWrite();
        fbje fbjeVar = (fbje) fbjdVar.instance;
        a2.getClass();
        fbjeVar.b = a2;
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
        return erny.g(listenableFuture, new eroh() { // from class: dzge
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
        r.j(23);
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
        r.j(23);
        r.f(1);
        r.e(j);
        dyytVar.b(r.a());
    }
}
