package defpackage;

import defpackage.fazu;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class fazt implements lms {
    final /* synthetic */ aklr a;

    public fazt(aklr aklrVar) {
        this.a = aklrVar;
    }

    @Override // defpackage.lms
    public final /* synthetic */ lml a(Class cls) {
        return lmr.b();
    }

    @Override // defpackage.lms
    public final lml b(Class cls, lnx lnxVar) {
        lml lmlVar;
        final fazv fazvVar = new fazv();
        aklr aklrVar = this.a;
        aklrVar.c = lmc.a(lnxVar);
        aklrVar.d = fazvVar;
        fbbe.a(aklrVar.c, llv.class);
        fbbe.a(aklrVar.d, fazj.class);
        aklw aklwVar = new aklw(aklrVar.a, aklrVar.b, aklrVar.c, aklrVar.d);
        ffbr ffbrVar = (ffbr) ((fazu.a) fazh.a(aklwVar, fazu.a.class)).d().get(cls);
        ffji ffjiVar = (ffji) lnxVar.a(fazu.a);
        Object obj = ((fazu.a) fazh.a(aklwVar, fazu.a.class)).c().get(cls);
        if (obj == null) {
            if (ffjiVar != null) {
                throw new IllegalStateException(a.N(cls, "Found creation callback but class ", " does not have an assisted factory specified in @HiltViewModel."));
            }
            if (ffbrVar == null) {
                throw new IllegalStateException(a.N(cls, "Expected the @HiltViewModel-annotated class ", " to be available in the multi-binding of @HiltViewModelMap but none was found."));
            }
            lmlVar = (lml) ffbrVar.b();
        } else {
            if (ffbrVar != null) {
                throw new AssertionError(a.N(cls, "Found the @HiltViewModel-annotated class ", " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap."));
            }
            if (ffjiVar == null) {
                throw new IllegalStateException(a.N(cls, "Found @HiltViewModel-annotated class ", " using @AssistedInject but no creation callback was provided in CreationExtras."));
            }
            lmlVar = (lml) ffjiVar.invoke(obj);
        }
        lmlVar.fA(new AutoCloseable() { // from class: fazs
            @Override // java.lang.AutoCloseable
            public final void close() {
                fazv.this.b();
            }
        });
        return lmlVar;
    }

    @Override // defpackage.lms
    public final /* synthetic */ lml c(ffmo ffmoVar, lnx lnxVar) {
        return lmr.a(this, ffmoVar, lnxVar);
    }
}
