package defpackage;

import j$.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aekv implements aeko {
    public final ffsk a;
    public final Optional b;
    public final ffbr c;
    private final fazb d;

    public aekv(fazb fazbVar, ffsk ffskVar, Optional optional, ffbr ffbrVar) {
        fazbVar.getClass();
        ffskVar.getClass();
        ffbrVar.getClass();
        this.d = fazbVar;
        this.a = ffskVar;
        this.b = optional;
        this.c = ffbrVar;
    }

    @Override // defpackage.aeko
    public final aekj a() {
        return new aeku(this);
    }

    @Override // defpackage.aeko
    public final /* synthetic */ aekk b() {
        return new aekw(null);
    }

    @Override // defpackage.aeko
    public final ejwd c(final aeix aeixVar) {
        return new ejwd<aekw>() { // from class: aekv.1
            @Override // defpackage.ejwd
            public final void a(Throwable th) {
                throw new IllegalStateException("onError() aggregatorDataSource=GROUP_UPGRADE_KEY", th);
            }

            @Override // defpackage.ejwd
            public final /* synthetic */ void b(Object obj) {
                aekw aekwVar = (aekw) obj;
                aekwVar.getClass();
                if (((asql) aekv.this.c.b()).a()) {
                    aeix aeixVar2 = aeixVar;
                    aekq aekqVar = aeixVar2.d().a;
                    enhk enhkVar = aekqVar.a;
                    aqys aqysVar = aekqVar.c;
                    Integer num = aekwVar.a;
                    aeixVar2.d().a = aekl.a(enhkVar, num, aqysVar);
                    aeixVar.l("GROUP_UPGRADE_KEY");
                }
            }

            @Override // defpackage.ejwd
            public final /* synthetic */ void hB() {
            }
        };
    }

    @Override // defpackage.aeko
    public final fazb d() {
        return this.d;
    }

    @Override // defpackage.aeko
    public final String e() {
        return "GROUP_UPGRADE_KEY";
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
