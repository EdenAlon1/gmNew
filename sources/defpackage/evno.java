package defpackage;

import defpackage.evkn;
import defpackage.evlf;
import defpackage.evno;
import defpackage.evpj;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evno extends evlf {
    public static final evlg a = c(2);
    private final int b;

    private evno(int i) {
        this.b = i;
    }

    public static evlg c(int i) {
        final evno evnoVar = new evno(i);
        return new evlg() { // from class: com.google.gson.internal.bind.NumberTypeAdapter$1
            @Override // defpackage.evlg
            public final evlf a(evkn evknVar, evpj evpjVar) {
                if (evpjVar.a == Number.class) {
                    return evno.this;
                }
                return null;
            }
        };
    }

    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ Object a(evpl evplVar) {
        int t = evplVar.t();
        int i = t - 1;
        if (i == 5 || i == 6) {
            return evld.a(this.b, evplVar);
        }
        if (i == 8) {
            evplVar.p();
            return null;
        }
        throw new evlb("Expecting number, got: " + evpm.a(t) + "; at path " + evplVar.e());
    }

    @Override // defpackage.evlf
    public final /* synthetic */ void b(evpn evpnVar, Object obj) {
        evpnVar.l((Number) obj);
    }
}
