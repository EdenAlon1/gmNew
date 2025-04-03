package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acxm implements acus {
    public static final cskc a = cskc.g("Bugle", "ShowSwitcherHandler");
    private final Optional b;

    public acxm(Optional optional) {
        this.b = optional;
    }

    @Override // defpackage.acus
    public final elfl a(esnk esnkVar, esnl esnlVar) {
        a.p("Received show switcher request from Ditto");
        this.b.ifPresent(new Consumer() { // from class: acxl
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                acxm.a.p("Showing switcher");
                ((acio) obj).g(acmd.REMOTE);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        String str = esnkVar.d;
        esnlVar.copyOnWrite();
        esnn esnnVar = (esnn) esnlVar.instance;
        esnn esnnVar2 = esnn.a;
        str.getClass();
        esnnVar.d = str;
        fagh faghVar = fagh.OK;
        esnlVar.copyOnWrite();
        ((esnn) esnlVar.instance).e = faghVar.a();
        eyex eyexVar = eyex.a;
        esnlVar.copyOnWrite();
        esnn esnnVar3 = (esnn) esnlVar.instance;
        eyexVar.getClass();
        esnnVar3.c = eyexVar;
        esnnVar3.b = 107;
        return elfo.e(esnlVar.build());
    }
}
