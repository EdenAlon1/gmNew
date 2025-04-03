package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpxj implements cfzm {
    private static final cskc a = cskc.g("Bugle", "LastWipeoutService");
    private final comc b;
    private final errl c;
    private final cqoh d;

    public cpxj(comc comcVar, errl errlVar, cqoh cqohVar) {
        this.b = comcVar;
        this.c = errlVar;
        this.d = cqohVar;
    }

    public final cpxe a() {
        try {
            return (cpxe) this.b.l();
        } catch (eygu e) {
            csjb b = a.b();
            b.I("Couldn't load LastWipeout from store");
            b.s(e);
            return cpxe.a;
        }
    }

    @Override // defpackage.cfzm
    public final /* synthetic */ elfl b() {
        return cfzj.b();
    }

    @Override // defpackage.cfzm
    public final /* synthetic */ elfl c() {
        return cfzj.c();
    }

    @Override // defpackage.cfzm
    public final elfl d() {
        return this.b.h().i(new eroh() { // from class: cpxh
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                cpxe cpxeVar = (cpxe) obj;
                enhd enhdVar = new enhd();
                eyja eyjaVar = cpxeVar.c;
                if (eyjaVar == null) {
                    eyjaVar = eyja.a;
                }
                cpxj cpxjVar = cpxj.this;
                enhdVar.k("TelephonyRecreatedIntentTimestamp", cpxjVar.e(eyjaVar));
                eyja eyjaVar2 = cpxeVar.c;
                if (eyjaVar2 == null) {
                    eyjaVar2 = eyja.a;
                }
                enhdVar.k("TelephonyRecreatedReverseSyncTimestamp", cpxjVar.e(eyjaVar2));
                return elfo.e(enhdVar.c());
            }
        }, this.c).h(new emwl() { // from class: cpxg
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return cfzj.a((Map) obj);
            }
        }, this.c);
    }

    public final String e(eyja eyjaVar) {
        if (eyjaVar == null || eyjaVar.b == 0) {
            return "NEVER";
        }
        long days = TimeUnit.SECONDS.toDays(this.d.f().getEpochSecond() - eyjaVar.b);
        return (days < 0 || days >= 3) ? (days < 3 || days >= 8) ? days >= 7 ? "MORE_THAN_SEVEN" : "NEVER" : "3_TO_7" : Long.toString(days);
    }

    public final void f(eyja eyjaVar) {
        g(Optional.empty(), Optional.of(eyjaVar));
    }

    public final void g(Optional optional, Optional optional2) {
        Object obj;
        Object obj2;
        final cpxd cpxdVar = (cpxd) cpxe.a.createBuilder();
        cpxe a2 = a();
        if (optional.isPresent()) {
            obj = optional.get();
        } else {
            obj = a2.c;
            if (obj == null) {
                obj = eyja.a;
            }
        }
        cpxdVar.copyOnWrite();
        cpxe cpxeVar = (cpxe) cpxdVar.instance;
        obj.getClass();
        cpxeVar.c = (eyja) obj;
        cpxeVar.b |= 1;
        if (optional2.isPresent()) {
            obj2 = optional2.get();
        } else {
            obj2 = a2.d;
            if (obj2 == null) {
                obj2 = eyja.a;
            }
        }
        cpxdVar.copyOnWrite();
        cpxe cpxeVar2 = (cpxe) cpxdVar.instance;
        obj2.getClass();
        cpxeVar2.d = (eyja) obj2;
        cpxeVar2.b |= 2;
    }
}
