package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feuu extends fekk {
    final /* synthetic */ fdyg a;
    final /* synthetic */ String b;
    final /* synthetic */ fevc c;
    final /* synthetic */ feuo d;
    final /* synthetic */ SettableFuture e;
    final /* synthetic */ fevo f;
    final /* synthetic */ febo g;
    final /* synthetic */ feux h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public feuu(feux feuxVar, fdyg fdygVar, String str, fevc fevcVar, feuo feuoVar, SettableFuture settableFuture, fevo fevoVar, febo feboVar) {
        super(fdygVar);
        this.a = fdygVar;
        this.b = str;
        this.c = fevcVar;
        this.d = feuoVar;
        this.e = settableFuture;
        this.f = fevoVar;
        this.g = feboVar;
        this.h = feuxVar;
    }

    @Override // defpackage.fekk
    public final void a() {
        int i = ffbo.a;
        try {
            fecz a = this.h.c.e.a(this.b);
            if (a == null) {
                fdzj fdzjVar = this.h.c.f;
                String str = this.b;
                this.c.k();
                a = fdzjVar.a(str);
            }
            if (a == null) {
                Status withDescription = Status.n.withDescription("Method not found: " + this.b);
                this.d.g(feuy.c);
                this.c.e(withDescription, new febo());
                this.a.j(null);
                this.e.cancel(false);
                return;
            }
            feux feuxVar = this.h;
            fevc fevcVar = this.c;
            fevo fevoVar = this.f;
            fevcVar.k();
            fedo[] fedoVarArr = fevoVar.b;
            if (fedoVarArr.length > 0) {
                throw null;
            }
            fecv fecvVar = a.b;
            fecw[] fecwVarArr = feuxVar.c.h;
            int length = fecwVarArr.length;
            int i2 = 0;
            while (i2 < length) {
                fecx fecxVar = new fecx(fecwVarArr[i2], fecvVar);
                i2++;
                fecvVar = fecxVar;
            }
            fecz a2 = a.a(fecvVar);
            fevc fevcVar2 = this.c;
            febo feboVar = this.g;
            fdyg fdygVar = this.a;
            febs febsVar = a2.a;
            feuy feuyVar = this.h.c;
            this.e.set(new feuw(new feui(fevcVar2, febsVar, feboVar, fdygVar, feuyVar.p, feuyVar.r), a2.b));
        } catch (Throwable th) {
            this.d.g(feuy.c);
            this.c.e(Status.c(th), new febo());
            this.a.j(null);
            this.e.cancel(false);
            throw th;
        }
    }
}
