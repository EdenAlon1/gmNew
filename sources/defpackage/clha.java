package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.shared.rcs.messaging.MessagingServiceResponseReceiver;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import j$.util.Optional;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clha {
    public static final cskc a = cskc.g("BugleRcs", "MessagingServiceGenericMethod");
    public final clgz b;
    private final Context c;
    private final errl d;
    private final clmf e;

    public clha(Context context, errl errlVar, clgz clgzVar, clmf clmfVar) {
        this.c = context;
        this.d = errlVar;
        this.b = clgzVar;
        this.e = clmfVar;
    }

    public final elfl a(final Object obj) {
        Intent a2 = this.b.a(obj);
        a2.setClass(this.c, MessagingServiceResponseReceiver.class);
        PendingIntent e = eepf.e(this.c, Objects.hashCode(obj), a2, ctie.a | 1073741824, 1);
        e.getClass();
        clgz clgzVar = this.b;
        Object k = clgzVar.k(obj, e);
        final eyee f = clgzVar.f(obj);
        return clgzVar.d(k).h(new emwl() { // from class: clgt
            @Override // defpackage.emwl
            public final Object apply(Object obj2) {
                return clha.this.b.i(obj2, f);
            }
        }, this.d).e(eiby.class, new emwl() { // from class: clgu
            @Override // defpackage.emwl
            public final Object apply(Object obj2) {
                awud awudVar;
                eiby eibyVar = (eiby) obj2;
                csjb e2 = clha.a.e();
                e2.I("Call to Messaging service failed");
                clha clhaVar = clha.this;
                e2.A("methodName", clhaVar.b.m());
                e2.I(clhaVar.b.l(obj));
                e2.s(eibyVar);
                if (eibyVar.getCause() instanceof ehxj) {
                    awty awtyVar = (awty) awud.a.createBuilder();
                    awuc awucVar = awuc.FAILED_TRANSIENTLY;
                    awtyVar.copyOnWrite();
                    awud awudVar2 = (awud) awtyVar.instance;
                    awudVar2.c = awucVar.f;
                    awudVar2.b |= 1;
                    awua awuaVar = awua.NOT_CONNECTED;
                    awtyVar.copyOnWrite();
                    awud awudVar3 = (awud) awtyVar.instance;
                    awudVar3.d = awuaVar.v;
                    awudVar3.b |= 2;
                    awudVar = (awud) awtyVar.build();
                } else {
                    awty awtyVar2 = (awty) awud.a.createBuilder();
                    awuc awucVar2 = awuc.FAILED_PERMANENTLY;
                    awtyVar2.copyOnWrite();
                    awud awudVar4 = (awud) awtyVar2.instance;
                    awudVar4.c = awucVar2.f;
                    awudVar4.b |= 1;
                    awudVar = (awud) awtyVar2.build();
                }
                return clhaVar.b.h(awudVar, f);
            }
        }, this.d).e(TimeoutException.class, new emwl() { // from class: clgv
            @Override // defpackage.emwl
            public final Object apply(Object obj2) {
                csjb e2 = clha.a.e();
                e2.I("Time out connecting to Messaging service");
                clha clhaVar = clha.this;
                e2.A("methodName", clhaVar.b.m());
                e2.I(clhaVar.b.l(obj));
                e2.s((TimeoutException) obj2);
                awty awtyVar = (awty) awud.a.createBuilder();
                awuc awucVar = awuc.FAILED_TRANSIENTLY;
                awtyVar.copyOnWrite();
                awud awudVar = (awud) awtyVar.instance;
                awudVar.c = awucVar.f;
                awudVar.b |= 1;
                awua awuaVar = awua.NOT_CONNECTED;
                awtyVar.copyOnWrite();
                awud awudVar2 = (awud) awtyVar.instance;
                awudVar2.d = awuaVar.v;
                awudVar2.b |= 2;
                return clhaVar.b.h((awud) awtyVar.build(), f);
            }
        }, this.d);
    }

    public final elfl b(Intent intent) {
        clgz clgzVar = this.b;
        awud b = clgzVar.b(intent);
        final Object j = clgzVar.j(b, intent, clgzVar.e(intent));
        Optional g = this.b.g(intent);
        return (g.isEmpty() ? this.b.c(j) : this.e.a(b, (String) g.get()).h(new emwl() { // from class: clgx
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                awud awudVar = (awud) obj;
                awuc awucVar = awuc.OK;
                awuc b2 = awuc.b(awudVar.c);
                if (b2 == null) {
                    b2 = awuc.UNKNOWN_STATUS;
                }
                clha clhaVar = clha.this;
                if (awucVar.equals(b2)) {
                    csjb a2 = clha.a.a();
                    a2.I("Emitted GroupEvent processing succeeded");
                    a2.A("method", clhaVar.b.m());
                    a2.r();
                    return awudVar;
                }
                csjb b3 = clha.a.b();
                b3.I("Emitted GroupEvent processing failed");
                b3.A("method", clhaVar.b.m());
                b3.r();
                return awudVar;
            }
        }, this.d).i(new eroh() { // from class: clgy
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return clha.this.b.c(j);
            }
        }, this.d)).h(new emwl() { // from class: clgw
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                awuc awucVar = awuc.OK;
                awuc b2 = awuc.b(((awud) obj).c);
                if (b2 == null) {
                    b2 = awuc.UNKNOWN_STATUS;
                }
                clha clhaVar = clha.this;
                if (awucVar.equals(b2)) {
                    csjb c = clha.a.c();
                    c.I("Intent delivered to Incoming Chat API");
                    c.A("method", clhaVar.b.m());
                    c.r();
                    return null;
                }
                csjb b3 = clha.a.b();
                b3.I("Failed to process intent");
                b3.A("method", clhaVar.b.m());
                b3.r();
                return null;
            }
        }, this.d);
    }
}
