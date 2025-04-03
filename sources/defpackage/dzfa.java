package defpackage;

import android.content.Context;
import android.util.Base64;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzfa implements dzgg {
    public final String a = UUID.randomUUID().toString();
    private final Context b;
    private final dzja c;
    private final dzpt d;
    private final eyee e;
    private final boolean f;
    private final boolean g;
    private final fbik h;
    private final List i;
    private final String j;

    public dzfa(Context context, dzja dzjaVar, dzpt dzptVar, eyee eyeeVar, String str, boolean z, boolean z2, fbik fbikVar, List list) {
        this.b = context;
        this.c = dzjaVar;
        this.d = dzptVar;
        this.e = eyeeVar;
        this.j = str;
        this.f = z;
        this.g = z2;
        this.h = fbikVar;
        this.i = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dzgg
    public final ListenableFuture a(fcfo fcfoVar) {
        byte[] decode = Base64.decode(this.j, 8);
        int i = dzee.a;
        StringBuilder sb = new StringBuilder("isEmptyDeviceConversation: ");
        boolean z = this.f;
        sb.append(z);
        dyhr.a("MsgProtoConverter", sb.toString());
        dzpt dzptVar = this.d;
        fbik b = dzec.b(dzptVar.a());
        fblf fblfVar = (fblf) fblh.a.createBuilder();
        fblfVar.copyOnWrite();
        fblh fblhVar = (fblh) fblfVar.instance;
        String str = this.a;
        str.getClass();
        fblhVar.i = str;
        fblfVar.copyOnWrite();
        fblh fblhVar2 = (fblh) fblfVar.instance;
        b.getClass();
        fblhVar2.k = b;
        fblhVar2.b |= 1;
        fbhy b2 = dzea.b(dzptVar);
        fblfVar.copyOnWrite();
        fblh fblhVar3 = (fblh) fblfVar.instance;
        b2.getClass();
        fblhVar3.l = b2;
        fblhVar3.b |= 2;
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
        ((fble) fbldVar.instance).c = fbjx.a(7);
        eydp eydpVar = (eydp) eydq.a.createBuilder();
        eydpVar.copyOnWrite();
        ((eydq) eydpVar.instance).b = "type.googleapis.com/google.internal.communications.instantmessaging.v1.ConversationIntentOpenedEvent";
        fbkz fbkzVar = (fbkz) fbla.a.createBuilder();
        eyee x = eyee.x(decode);
        fbkzVar.copyOnWrite();
        ((fbla) fbkzVar.instance).b = x;
        fbkzVar.copyOnWrite();
        ((fbla) fbkzVar.instance).c = z;
        fbkzVar.copyOnWrite();
        ((fbla) fbkzVar.instance).d = this.g;
        List a = dyjf.c().a();
        fbkzVar.copyOnWrite();
        fbla fblaVar = (fbla) fbkzVar.instance;
        eygi eygiVar = fblaVar.e;
        if (!eygiVar.c()) {
            fblaVar.e = eyfy.mutableCopy(eygiVar);
        }
        enqv it = ((engw) a).iterator();
        while (it.hasNext()) {
            fblaVar.e.h(((Integer) it.next()).intValue());
        }
        eyee byteString = ((fbla) fbkzVar.build()).toByteString();
        eydpVar.copyOnWrite();
        ((eydq) eydpVar.instance).c = byteString;
        fbldVar.copyOnWrite();
        fble fbleVar = (fble) fbldVar.instance;
        eydq eydqVar = (eydq) eydpVar.build();
        eydqVar.getClass();
        fbleVar.d = eydqVar;
        fbleVar.b |= 1;
        fblfVar.copyOnWrite();
        fblh fblhVar5 = (fblh) fblfVar.instance;
        fble fbleVar2 = (fble) fbldVar.build();
        fbleVar2.getClass();
        fblhVar5.f = fbleVar2;
        fblhVar5.e = 105;
        fblf fblfVar2 = (fblf) ((fblh) fblfVar.build()).toBuilder();
        eyee eyeeVar = this.e;
        fblfVar2.copyOnWrite();
        fblh fblhVar6 = (fblh) fblfVar2.instance;
        eyeeVar.getClass();
        fblhVar6.v = eyeeVar;
        fblh fblhVar7 = (fblh) fblfVar2.build();
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
        fblhVar7.getClass();
        ezjlVar3.e = fblhVar7;
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
        return erny.g(listenableFuture, new eroh() { // from class: dzez
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
        r.j(16);
        r.m(Integer.valueOf(status.getCode().value()));
        r.f(i);
        r.h(engw.n(this.i));
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
        r.j(16);
        r.f(1);
        r.h(engw.n(this.i));
        r.e(j);
        dyytVar.b(r.a());
    }
}
