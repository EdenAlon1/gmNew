package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aelc implements aeko {
    public final Context a;
    private final fazb b;

    public aelc(Context context, fazb fazbVar) {
        context.getClass();
        fazbVar.getClass();
        this.a = context;
        this.b = fazbVar;
    }

    @Override // defpackage.aeko
    public final aekj a() {
        return new aelb(this);
    }

    @Override // defpackage.aeko
    public final /* synthetic */ aekk b() {
        return new aeld(null);
    }

    @Override // defpackage.aeko
    public final ejwd c(final aeix aeixVar) {
        return new ejwd<aeld>() { // from class: aelc.1
            @Override // defpackage.ejwd
            public final void a(Throwable th) {
                throw new IllegalStateException("onError() aggregatorDataSource=RCS_AVAILABILITY_DATA_SOURCE_KEY", th);
            }

            @Override // defpackage.ejwd
            public final /* synthetic */ void b(Object obj) {
                aeld aeldVar = (aeld) obj;
                aeldVar.getClass();
                aeix aeixVar2 = aeix.this;
                aekq aekqVar = aeixVar2.d().a;
                enhk enhkVar = aekqVar.a;
                Integer num = aekqVar.b;
                aqys aqysVar = aeldVar.a;
                aeixVar2.d().a = aekl.a(enhkVar, num, aqysVar);
                aeix.this.l("RCS_AVAILABILITY_DATA_SOURCE_KEY");
            }

            @Override // defpackage.ejwd
            public final /* synthetic */ void hB() {
            }
        };
    }

    @Override // defpackage.aeko
    public final fazb d() {
        return this.b;
    }

    @Override // defpackage.aeko
    public final String e() {
        return "RCS_AVAILABILITY_DATA_SOURCE_KEY";
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
