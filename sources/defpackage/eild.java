package defpackage;

import com.google.android.rcs.client.messaging.data.RcsDestinationId;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class eild extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        eifn eifnVar = (eifn) obj;
        cloi cloiVar = (cloi) cloj.b.createBuilder();
        d(eifnVar, cloiVar);
        clqv clqvVar = (clqv) eimh.b.m().fP(eifnVar.b());
        cloiVar.copyOnWrite();
        cloj clojVar = (cloj) cloiVar.instance;
        clqvVar.getClass();
        clojVar.e = clqvVar;
        clojVar.c |= 2;
        if (eifnVar.d().isPresent() && eifnVar.d().isPresent()) {
            clqv clqvVar2 = (clqv) eimh.b.m().fP(eifnVar.d().get());
            cloiVar.copyOnWrite();
            cloj clojVar2 = (cloj) cloiVar.instance;
            clqvVar2.getClass();
            clojVar2.f = clqvVar2;
            clojVar2.c |= 4;
        }
        clon clonVar = (clon) eimh.a.m().fP(eifnVar.a());
        cloiVar.copyOnWrite();
        cloj clojVar3 = (cloj) cloiVar.instance;
        clonVar.getClass();
        clojVar3.g = clonVar;
        clojVar3.c |= 8;
        if (eifnVar.e().isPresent()) {
            e(eifnVar, cloiVar);
        }
        if (eifnVar.c().isPresent()) {
            c(eifnVar, cloiVar);
        }
        return (cloj) cloiVar.build();
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        RcsDestinationId rcsDestinationId;
        eifm eifmVar;
        cloj clojVar = (cloj) obj;
        eiec eiecVar = new eiec();
        if ((clojVar.c & 1) != 0) {
            g(clojVar, eiecVar);
        }
        if ((clojVar.c & 2) != 0) {
            emwd emwdVar = eimh.b;
            clqv clqvVar = clojVar.e;
            if (clqvVar == null) {
                clqvVar = clqv.a;
            }
            RcsDestinationId rcsDestinationId2 = (RcsDestinationId) emwdVar.fP(clqvVar);
            if (rcsDestinationId2 == null) {
                throw new NullPointerException("Null sender");
            }
            eiecVar.b = rcsDestinationId2;
        }
        if ((clojVar.c & 4) != 0) {
            emwd emwdVar2 = eimh.b;
            clqv clqvVar2 = clojVar.f;
            if (clqvVar2 == null) {
                clqvVar2 = clqv.a;
            }
            eiecVar.c = Optional.of((RcsDestinationId) emwdVar2.fP(clqvVar2));
        }
        if ((clojVar.c & 8) != 0) {
            emwd emwdVar3 = eimh.a;
            clon clonVar = clojVar.g;
            if (clonVar == null) {
                clonVar = clon.a;
            }
            eifm eifmVar2 = (eifm) emwdVar3.fP(clonVar);
            if (eifmVar2 == null) {
                throw new NullPointerException("Null content");
            }
            eiecVar.d = eifmVar2;
        }
        if ((clojVar.c & 16) != 0) {
            h(clojVar, eiecVar);
        }
        f(clojVar, eiecVar);
        String str = eiecVar.a;
        if (str != null && (rcsDestinationId = eiecVar.b) != null && (eifmVar = eiecVar.d) != null) {
            return new eied(str, rcsDestinationId, eiecVar.c, eifmVar, eiecVar.e, eiecVar.f);
        }
        StringBuilder sb = new StringBuilder();
        if (eiecVar.a == null) {
            sb.append(" id");
        }
        if (eiecVar.b == null) {
            sb.append(" sender");
        }
        if (eiecVar.d == null) {
            sb.append(" content");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public void c(eifn eifnVar, cloi cloiVar) {
        throw null;
    }

    public abstract void d(eifn eifnVar, cloi cloiVar);

    public abstract void e(eifn eifnVar, cloi cloiVar);

    public void f(cloj clojVar, eifk eifkVar) {
        throw null;
    }

    public abstract void g(cloj clojVar, eifk eifkVar);

    public abstract void h(cloj clojVar, eifk eifkVar);
}
