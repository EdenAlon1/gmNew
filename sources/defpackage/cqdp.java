package defpackage;

import android.net.Uri;
import j$.time.Instant;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cqdp extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cqdr b;
    final /* synthetic */ Uri c;
    final /* synthetic */ Instant d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqdp(cqdr cqdrVar, Uri uri, Instant instant, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cqdrVar;
        this.c = uri;
        this.d = instant;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cqdp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object a;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cqdr cqdrVar = this.b;
            Uri uri = this.c;
            Instant instant = this.d;
            this.a = 1;
            List A = cqdrVar.A();
            if (A.isEmpty()) {
                cqge cqgeVar = (cqge) cqgj.a.createBuilder();
                cqgeVar.getClass();
                UUID randomUUID = UUID.randomUUID();
                randomUUID.getClass();
                cqgs.g(cqjf.a(randomUUID), cqgeVar);
                cqgc cqgcVar = (cqgc) cqgd.a.createBuilder();
                cqgcVar.getClass();
                String uri2 = uri.toString();
                uri2.getClass();
                cqgcVar.copyOnWrite();
                ((cqgd) cqgcVar.instance).c = uri2;
                eyja b = eykn.b(instant);
                cqgcVar.copyOnWrite();
                cqgd cqgdVar = (cqgd) cqgcVar.instance;
                cqgdVar.d = b;
                cqgdVar.b |= 1;
                cqgr.c(eykn.b(instant), cqgcVar);
                cqgr.d(eykn.b(instant), cqgcVar);
                cqgs.f(cqgr.a(cqgcVar), cqgeVar);
                a = ((cqfs) cqdrVar.c.b()).a(cqgs.c(cqgeVar), eqqh.SPOT_SYNC, this);
                if (a != ffhh.a) {
                    a = ffcu.a;
                }
            } else {
                a = cqdrVar.y(A, eqqh.SPOT_SYNC, false, this);
                if (a != ffhh.a) {
                    a = ffcu.a;
                }
            }
            if (a == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cqdp(this.b, this.c, this.d, ffguVar);
    }
}
