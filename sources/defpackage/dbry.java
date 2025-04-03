package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbry implements ejxi {
    final /* synthetic */ Context a;
    final /* synthetic */ dbrs b;
    final /* synthetic */ dbrz c;

    public dbry(dbrz dbrzVar, Context context, dbrs dbrsVar) {
        this.a = context;
        this.b = dbrsVar;
        this.c = dbrzVar;
    }

    @Override // defpackage.ejxi
    public final /* bridge */ /* synthetic */ ejuj a() {
        return new ejtz("CAMERA_SOURCE");
    }

    @Override // defpackage.ejxi
    public final ListenableFuture b() {
        final Context context = this.a;
        final dbrs dbrsVar = this.b;
        return elfo.g(new Callable() { // from class: dbrx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                dhvy dhvyVar = new dhvy();
                Context context2 = context;
                if (context2 == null) {
                    throw new IllegalArgumentException("No context supplied.");
                }
                dbrs dbrsVar2 = dbrsVar;
                dhvyVar.a = context2;
                dhvyVar.f = true;
                dhvyVar.i = new dhvw(dhvyVar, dbrsVar2);
                return dhvyVar;
            }
        }, this.c.a);
    }
}
