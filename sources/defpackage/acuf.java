package defpackage;

import android.util.Base64;
import java.io.UnsupportedEncodingException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acuf extends actz {
    final /* synthetic */ acuq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acuf(acuq acuqVar, acua acuaVar) {
        super(acuqVar, acuaVar);
        this.c = acuqVar;
    }

    @Override // defpackage.actz
    public final void a(String str, final acum acumVar) {
        cskc cskcVar = acuq.a;
        try {
            if (str == null) {
                throw new IllegalStateException("Cannot decode empty data.");
            }
            final esnk esnkVar = (esnk) eyfy.parseFrom(esnk.a, Base64.decode(str.getBytes("UTF-8"), 0), eyfc.a());
            final esnl createBuilder = esnn.a.createBuilder();
            String str2 = esnkVar.d;
            createBuilder.copyOnWrite();
            esnn esnnVar = (esnn) createBuilder.instance;
            str2.getClass();
            esnnVar.d = str2;
            ((acip) this.c.g.b()).d(esnkVar.d, esnj.b(esnj.c(esnkVar.b)));
            acumVar.a().a(esnkVar, createBuilder).h(new emwl() { // from class: acud
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    esnn esnnVar2 = (esnn) obj;
                    if (esnnVar2 == null) {
                        throw new acur(fagh.UNAVAILABLE, "Received a null response from the handler");
                    }
                    acum acumVar2 = acumVar;
                    acuf acufVar = acuf.this;
                    String a = acuq.a(esnnVar2);
                    csjb c = acuq.a.c();
                    c.I("Sending JsBridge response to Ditto");
                    c.A("payloadCase", esnm.a(esnnVar2.b));
                    c.y("length", a.length());
                    c.r();
                    acumVar2.b().a(a);
                    ((acip) acufVar.c.g.b()).j(esnnVar2.d, esnm.a(esnnVar2.b).B);
                    return true;
                }
            }, this.c.e).e(Exception.class, new emwl() { // from class: acue
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    Exception exc = (Exception) obj;
                    boolean z = exc instanceof acur;
                    esnl esnlVar = createBuilder;
                    acuf acufVar = acuf.this;
                    acum acumVar2 = acumVar;
                    if (z) {
                        acufVar.c.c((acur) exc, esnlVar, acumVar2);
                    } else if (exc == null || !(exc.getCause() instanceof acur)) {
                        esnk esnkVar2 = esnkVar;
                        acuq.a.s("Unknown exception when handling JsBridge request", exc);
                        ((acip) acufVar.c.g.b()).i(esnkVar2.d, esnj.b(esnj.c(esnkVar2.b)), fagh.UNKNOWN);
                        try {
                            acvo b = acumVar2.b();
                            fagh faghVar = fagh.UNKNOWN;
                            esnlVar.copyOnWrite();
                            esnn esnnVar2 = (esnn) esnlVar.instance;
                            esnn esnnVar3 = esnn.a;
                            esnnVar2.e = faghVar.a();
                            esnlVar.copyOnWrite();
                            ((esnn) esnlVar.instance).f = "Unknown Error";
                            b.a(acuq.a(esnlVar.build()));
                        } catch (acvb e) {
                            acuq.a.s("Could not send reply to Ditto. Channel has closed", e);
                        }
                    } else {
                        acufVar.c.c((acur) exc.getCause(), esnlVar, acumVar2);
                    }
                    return false;
                }
            }, this.c.e).k(axnw.b(), this.c.e);
        } catch (eygu e) {
            throw new IllegalStateException("Could not parse SatelliteBridgeRequest proto", e);
        } catch (UnsupportedEncodingException e2) {
            throw new IllegalStateException("Could not decode Satellite Bridge Request", e2);
        }
    }
}
