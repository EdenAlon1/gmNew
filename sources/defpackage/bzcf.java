package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzcf {
    private final Context a;
    private final bzce b;
    private final aqvh c;
    private final aqkp d;
    private final ejtr e;
    private boolean f = false;
    private final AtomicReference g = new AtomicReference();
    private final AtomicReference h = new AtomicReference();

    public bzcf(Context context, bzce bzceVar, aqvh aqvhVar, aqkp aqkpVar, ejtr ejtrVar) {
        this.a = context;
        this.b = bzceVar;
        this.c = aqvhVar;
        this.d = aqkpVar;
        this.e = ejtrVar;
    }

    final synchronized void a(fcek fcekVar, String str) {
        if (this.f) {
            return;
        }
        b(fcekVar, str);
        this.e.d(Uri.parse(bcqc.o(this.a)), true, this.b);
        emxf.m(((ctbx) this.g.getAndSet(this.c.c().a(new bzcd()))) == null, "Already subscribed to self identity updates");
        emxf.m(((ctbx) this.h.getAndSet(this.d.l(new bzcc(this.b), "NewDittoContentObserver.RecipientUpdate"))) == null, "Already subscribed to recipient updates");
        this.f = true;
    }

    final void b(fcek fcekVar, String str) {
        this.b.b(fcekVar, str);
    }

    final synchronized void c() {
        if (this.f) {
            ctbx ctbxVar = (ctbx) this.g.getAndSet(null);
            ctbxVar.getClass();
            ctbxVar.a();
            ctbx ctbxVar2 = (ctbx) this.h.getAndSet(null);
            ctbxVar2.getClass();
            ctbxVar2.a();
            this.e.e(this.b);
            b(null, null);
            this.f = false;
        }
    }
}
