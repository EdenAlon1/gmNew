package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzao {
    private final Context a;
    private final bzan b;
    private final aqvh c;
    private final aqkp d;
    private boolean e = false;
    private final AtomicReference f = new AtomicReference();
    private final AtomicReference g = new AtomicReference();

    public bzao(Context context, bzan bzanVar, aqvh aqvhVar, aqkp aqkpVar) {
        this.a = context;
        this.b = bzanVar;
        this.c = aqvhVar;
        this.d = aqkpVar;
    }

    final synchronized void a(fcek fcekVar, String str) {
        if (this.e) {
            return;
        }
        b(fcekVar, str);
        Context context = this.a;
        context.getContentResolver().registerContentObserver(Uri.parse(bcqc.o(context)), true, this.b);
        emxf.m(((ctbx) this.f.getAndSet(this.c.c().a(new bzam()))) == null, "Already subscribed to self identity updates");
        AtomicReference atomicReference = this.g;
        aqkp aqkpVar = this.d;
        bzan bzanVar = this.b;
        bzanVar.getClass();
        emxf.m(((ctbx) atomicReference.getAndSet(aqkpVar.l(new bzal(bzanVar), "DittoContentObserver.RecipientUpdate"))) == null, "Already subscribed to recipient updates");
        this.e = true;
    }

    final void b(fcek fcekVar, String str) {
        this.b.a(fcekVar, str);
    }

    final synchronized void c() {
        if (this.e) {
            ctbx ctbxVar = (ctbx) this.f.getAndSet(null);
            ctbxVar.getClass();
            ctbxVar.a();
            ctbx ctbxVar2 = (ctbx) this.g.getAndSet(null);
            ctbxVar2.getClass();
            ctbxVar2.a();
            Context context = this.a;
            context.getContentResolver().unregisterContentObserver(this.b);
            b(null, null);
            this.e = false;
        }
    }
}
