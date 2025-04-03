package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwcc implements dwac {
    private final dwac a = new dwac() { // from class: dwcb
        @Override // defpackage.dwac
        public final /* synthetic */ emxc a(dvwk dvwkVar) {
            return emux.a;
        }

        @Override // defpackage.dwac
        public final /* synthetic */ emxc b(dvwk dvwkVar) {
            return emux.a;
        }

        @Override // defpackage.dwac
        public final /* synthetic */ emxc c(dvwk dvwkVar) {
            return emux.a;
        }

        @Override // defpackage.dwac
        public final /* synthetic */ ListenableFuture d(dvwk dvwkVar, ListenableFuture listenableFuture) {
            return dwab.a();
        }

        @Override // defpackage.dwac
        public final /* synthetic */ ListenableFuture e(dvwk dvwkVar, ListenableFuture listenableFuture) {
            return dwab.b();
        }

        @Override // defpackage.dwac
        public final /* synthetic */ faxs f(dvwk dvwkVar) {
            return faxs.DEFAULT;
        }

        @Override // defpackage.dwac
        public final String g(dvwk dvwkVar) {
            return "";
        }

        @Override // defpackage.dwac
        public final /* synthetic */ ListenableFuture h() {
            throw null;
        }
    };
    private final dwac b;
    private final Map c;

    public dwcc(dwac dwacVar, Map map) {
        this.b = dwacVar;
        this.c = map;
    }

    private final dwac i(dvwk dvwkVar) {
        eyfw checkIsLite;
        eyfw checkIsLite2;
        if (!(dvwkVar instanceof dvzx)) {
            return this.a;
        }
        dvzx dvzxVar = (dvzx) dvwkVar;
        dvxr a = dvzxVar.a();
        checkIsLite = eyfy.checkIsLite(dwcf.a);
        a.b(checkIsLite);
        if (!a.r.o(checkIsLite.d)) {
            return this.b;
        }
        dvxr a2 = dvzxVar.a();
        checkIsLite2 = eyfy.checkIsLite(dwcf.a);
        a2.b(checkIsLite2);
        Object l = a2.r.l(checkIsLite2.d);
        dwac dwacVar = (dwac) this.c.get(((dwce) (l == null ? checkIsLite2.b : checkIsLite2.c(l))).c);
        dwacVar.getClass();
        return dwacVar;
    }

    @Override // defpackage.dwac
    public final emxc a(dvwk dvwkVar) {
        return i(dvwkVar).a(dvwkVar);
    }

    @Override // defpackage.dwac
    public final emxc b(dvwk dvwkVar) {
        return i(dvwkVar).b(dvwkVar);
    }

    @Override // defpackage.dwac
    public final emxc c(dvwk dvwkVar) {
        return i(dvwkVar).c(dvwkVar);
    }

    @Override // defpackage.dwac
    public final ListenableFuture d(dvwk dvwkVar, ListenableFuture listenableFuture) {
        return i(dvwkVar).d(dvwkVar, listenableFuture);
    }

    @Override // defpackage.dwac
    public final ListenableFuture e(dvwk dvwkVar, ListenableFuture listenableFuture) {
        return i(dvwkVar).e(dvwkVar, listenableFuture);
    }

    @Override // defpackage.dwac
    public final faxs f(dvwk dvwkVar) {
        return i(dvwkVar).f(dvwkVar);
    }

    @Override // defpackage.dwac
    public final String g(dvwk dvwkVar) {
        return i(dvwkVar).g(dvwkVar);
    }

    @Override // defpackage.dwac
    public final ListenableFuture h() {
        return erqt.i(null);
    }
}
