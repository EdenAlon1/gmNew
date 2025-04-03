package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwlr extends ffhv implements ffjm {
    int a;
    final /* synthetic */ Context b;
    final /* synthetic */ jrk c;
    final /* synthetic */ boolean d;
    final /* synthetic */ String e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dwlr(Context context, jrk jrkVar, boolean z, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = context;
        this.c = jrkVar;
        this.d = z;
        this.e = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dwlr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        ffsk ffskVar = (ffsk) this.f;
        ffuf ffufVar = new ffuf(null);
        dwls dwlsVar = dwls.a;
        final CancellationSignal cancellationSignal = new CancellationSignal();
        ffqy.d(ffskVar, ffufVar, null, new dwlo(null), 2).hZ(new ffji() { // from class: dwln
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                dwls dwlsVar2 = dwls.a;
                if (((Throwable) obj2) instanceof CancellationException) {
                    cancellationSignal.cancel();
                }
                return ffcu.a;
            }
        });
        ContentResolver contentResolver = this.b.getContentResolver();
        if (contentResolver == null) {
            throw new IllegalStateException("No content resolver");
        }
        ffhd hT = ffskVar.hT();
        dwlq dwlqVar = new dwlq(this.d, this.b, contentResolver, this.e, cancellationSignal, this.c, ffufVar, null);
        this.a = 1;
        Object a = ffra.a(hT, dwlqVar, this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dwlr dwlrVar = new dwlr(this.b, this.c, this.d, this.e, ffguVar);
        dwlrVar.f = obj;
        return dwlrVar;
    }
}
