package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzfl implements dzgg {
    public final String a = UUID.randomUUID().toString();
    private final Context b;
    private final dzja c;
    private final dzpt d;
    private final eyee e;
    private final List f;
    private final boolean g;
    private final fbik h;

    public dzfl(Context context, dzja dzjaVar, dzpt dzptVar, eyee eyeeVar, List list, fbik fbikVar, boolean z) {
        this.b = context;
        this.c = dzjaVar;
        this.d = dzptVar;
        this.e = eyeeVar;
        this.f = list;
        this.h = fbikVar;
        this.g = z;
    }

    @Override // defpackage.dzgg
    public final ListenableFuture a(fcfo fcfoVar) {
        dzab dzabVar = new dzab();
        dzabVar.c(this.f);
        dzabVar.b(this.d);
        dzabVar.d(this.a);
        dzabVar.e(this.g ? 1 : 0);
        dzabVar.a = this.c.c().f();
        dzbb a = dzabVar.a();
        fbik b = dzec.b(this.c.c().f());
        ArrayList arrayList = new ArrayList();
        dzac dzacVar = (dzac) a;
        for (String str : dzacVar.c) {
            fblp fblpVar = (fblp) fblq.a.createBuilder();
            fblpVar.copyOnWrite();
            fblq fblqVar = (fblq) fblpVar.instance;
            str.getClass();
            fblqVar.b = str;
            arrayList.add((fblq) fblpVar.build());
        }
        int i = dzacVar.a;
        int i2 = i != 0 ? i != 1 ? 4 : 5 : 3;
        eydp eydpVar = (eydp) eydq.a.createBuilder();
        eydpVar.copyOnWrite();
        ((eydq) eydpVar.instance).b = "type.googleapis.com/google.internal.communications.instantmessaging.v1.ReceiptEvent";
        fblo fbloVar = (fblo) fblr.a.createBuilder();
        fbloVar.copyOnWrite();
        fblr fblrVar = (fblr) fbloVar.instance;
        eygr eygrVar = fblrVar.b;
        if (!eygrVar.c()) {
            fblrVar.b = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(arrayList, fblrVar.b);
        fbloVar.copyOnWrite();
        ((fblr) fbloVar.instance).c = i2 - 2;
        eyee byteString = ((fblr) fbloVar.build()).toByteString();
        eydpVar.copyOnWrite();
        ((eydq) eydpVar.instance).c = byteString;
        eydq eydqVar = (eydq) eydpVar.build();
        fblf fblfVar = (fblf) fblh.a.createBuilder();
        String str2 = dzacVar.b;
        fblfVar.copyOnWrite();
        ((fblh) fblfVar.instance).i = str2;
        fblfVar.copyOnWrite();
        fblh fblhVar = (fblh) fblfVar.instance;
        b.getClass();
        fblhVar.k = b;
        fblhVar.b |= 1;
        fbhy b2 = dzea.b(dzacVar.e);
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
        ((fble) fbldVar.instance).c = fbjx.a(6);
        fbldVar.copyOnWrite();
        fble fbleVar = (fble) fbldVar.instance;
        eydqVar.getClass();
        fbleVar.d = eydqVar;
        fbleVar.b |= 1;
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
        ezjk ezjkVar = (ezjk) ezjl.a.createBuilder();
        fbik fbikVar = this.h;
        ezjkVar.copyOnWrite();
        ezjl ezjlVar = (ezjl) ezjkVar.instance;
        fbikVar.getClass();
        ezjlVar.d = fbikVar;
        ezjlVar.b |= 2;
        ezjkVar.copyOnWrite();
        ezjl ezjlVar2 = (ezjl) ezjkVar.instance;
        fcfoVar.getClass();
        ezjlVar2.c = fcfoVar;
        ezjlVar2.b |= 1;
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
        return erny.g(listenableFuture, new eroh() { // from class: dzfk
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
        r.j(15);
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
        r.j(15);
        r.f(1);
        r.e(j);
        dyytVar.b(r.a());
    }
}
