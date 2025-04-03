package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aelr implements aeko {
    private final fazb a;

    public aelr(fazb fazbVar) {
        fazbVar.getClass();
        this.a = fazbVar;
    }

    @Override // defpackage.aeko
    public final aekj a() {
        return new aelq();
    }

    @Override // defpackage.aeko
    public final /* synthetic */ aekk b() {
        return new aels(enoz.a);
    }

    @Override // defpackage.aeko
    public final ejwd c(final aeix aeixVar) {
        return new ejwd<aels>() { // from class: aelr.1
            @Override // defpackage.ejwd
            public final void a(Throwable th) {
                throw new IllegalStateException("onError() aggregatorDataSource=TYPING_INDICATOR_KEY", th);
            }

            @Override // defpackage.ejwd
            public final /* synthetic */ void b(Object obj) {
                aels aelsVar = (aels) obj;
                aelsVar.getClass();
                aeix aeixVar2 = aeix.this;
                aekq aekqVar = aeixVar2.d().a;
                Integer num = aekqVar.b;
                aqys aqysVar = aekqVar.c;
                enhk enhkVar = aelsVar.a;
                aeixVar2.d().a = aekl.a(enhkVar, num, aqysVar);
                aeix.this.l("TYPING_INDICATOR_KEY");
            }

            @Override // defpackage.ejwd
            public final /* synthetic */ void hB() {
            }
        };
    }

    @Override // defpackage.aeko
    public final fazb d() {
        return this.a;
    }

    @Override // defpackage.aeko
    public final String e() {
        return "TYPING_INDICATOR_KEY";
    }

    @Override // defpackage.aeko
    public final /* synthetic */ void f(lkk lkkVar, ejvp ejvpVar) {
        aekn.a(this, lkkVar, ejvpVar);
    }

    @Override // defpackage.aeko
    public final /* synthetic */ void g(ejwl ejwlVar, byzz byzzVar, aeix aeixVar, AtomicBoolean atomicBoolean) {
        aekn.b(this, ejwlVar, byzzVar, aeixVar, atomicBoolean);
    }
}
