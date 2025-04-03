package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahmf implements ejxi {
    final /* synthetic */ dzja a;
    final /* synthetic */ dzpt b;
    final /* synthetic */ ahmc c;

    public ahmf(ahmc ahmcVar, dzja dzjaVar, dzpt dzptVar) {
        this.a = dzjaVar;
        this.b = dzptVar;
        this.c = ahmcVar;
    }

    @Override // defpackage.ejxi
    public final ejuj a() {
        return new ejtz("INITIALIZE_READ_RECEIPT_SETTING_VALUE_KEY");
    }

    @Override // defpackage.ejxi
    public final ListenableFuture b() {
        final dzja dzjaVar = this.a;
        final dzpt dzptVar = this.b;
        return elfo.h(new erog() { // from class: ahme
            @Override // defpackage.erog
            public final ListenableFuture a() {
                dzpt dzptVar2 = dzptVar;
                dypu dypuVar = ahmf.this.c.l;
                dzpg a = dzptVar2.a();
                dyxa c = dyxb.c();
                c.b(dyxf.g);
                ((dyww) c).a = "get user properties";
                dyxb a2 = c.a();
                dzdp dzdpVar = dypuVar.a;
                dzci dzciVar = dzdpVar.a;
                UUID randomUUID = UUID.randomUUID();
                dzja dzjaVar2 = dzjaVar;
                return erny.f(dzciVar.b(randomUUID, new dzfh(dzjaVar2, a), dzdpVar.a.d.c(), dzjaVar2, a2, true), new emwl() { // from class: dyps
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        return ((dzop) ((dyqm) obj).a()).a.c();
                    }
                }, erpp.a);
            }
        }, this.c.c);
    }
}
