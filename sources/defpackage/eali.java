package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eali extends ffhv implements ffjm {
    int a;
    Object b;
    int c;
    final /* synthetic */ ealb d;
    final /* synthetic */ ealj e;
    final /* synthetic */ eagt f;
    final /* synthetic */ Bundle g;
    final /* synthetic */ Long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eali(ealb ealbVar, ealj ealjVar, eagt eagtVar, Bundle bundle, Long l, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = ealbVar;
        this.e = ealjVar;
        this.f = eagtVar;
        this.g = bundle;
        this.h = l;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((eali) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        String a;
        byte[] marshall;
        pqb g;
        int i;
        Exception e;
        ffhh ffhhVar = ffhh.a;
        if (this.c != 0) {
            i = this.a;
            a = this.b;
            try {
                ffci.b(obj);
                a = a;
            } catch (Exception e2) {
                e = e2;
                ((ensz) ealj.a.j()).J("Failed to schedule a job for package [%s] with ID: %s, type: %s", this.e.b.getApplicationContext().getPackageName(), a, new Integer(i));
                return new eafi(e);
            }
        } else {
            ffci.b(obj);
            ealb ealbVar = this.d;
            eagt eagtVar = this.f;
            int a2 = ealbVar.a();
            a = ealk.a(eagtVar, a2);
            pon ponVar = new pon();
            ponVar.e("com.google.android.libraries.notifications.platform.JOB_KEY", this.d.e());
            ponVar.e("com.google.android.libraries.notifications.platform.JOB_ID", a);
            Bundle bundle = this.g;
            bundle.getClass();
            if (bundle.isEmpty()) {
                marshall = null;
            } else {
                Parcel obtain = Parcel.obtain();
                obtain.getClass();
                bundle.writeToParcel(obtain, 0);
                marshall = obtain.marshall();
                obtain.recycle();
            }
            if (marshall != null) {
                ponVar.d("com.google.android.libraries.notifications.platform.WORKER_PARAMS", marshall);
            }
            poh pohVar = new poh();
            pohVar.c(this.d.i() + (-1) != 1 ? 2 : 1);
            poj a3 = pohVar.a();
            try {
                pot a4 = ponVar.a();
                ealj ealjVar = this.e;
                ealjVar.d.a(ealjVar.b.getPackageName(), true);
                if (this.d.f()) {
                    ealj ealjVar2 = this.e;
                    ealb ealbVar2 = this.d;
                    Long l = this.h;
                    pqh pqhVar = new pqh(ealjVar2.c, ealbVar2.b(), TimeUnit.MILLISECONDS);
                    pqhVar.j(a4);
                    pqhVar.g(a3);
                    ealg.a(pqhVar, ealbVar2, l);
                    g = pqr.a(this.e.b).f(a, poz.UPDATE, (pqi) pqhVar.b());
                } else {
                    ealj ealjVar3 = this.e;
                    ealb ealbVar3 = this.d;
                    Long l2 = this.h;
                    ppv ppvVar = new ppv(ealjVar3.c);
                    ppvVar.j(a4);
                    ppvVar.g(a3);
                    ealg.a(ppvVar, ealbVar3, l2);
                    g = pqr.a(this.e.b).g(a, ppa.REPLACE, (ppw) ppvVar.b());
                }
                try {
                    ListenableFuture listenableFuture = ((pqc) g).c;
                    this.b = a;
                    this.a = a2;
                    this.c = 1;
                    if (fgfz.c(listenableFuture, this) == ffhhVar) {
                        return ffhhVar;
                    }
                    i = a2;
                    a = a;
                } catch (Exception e3) {
                    i = a2;
                    e = e3;
                    ((ensz) ealj.a.j()).J("Failed to schedule a job for package [%s] with ID: %s, type: %s", this.e.b.getApplicationContext().getPackageName(), a, new Integer(i));
                    return new eafi(e);
                }
            } catch (Exception e4) {
                ealj ealjVar4 = this.e;
                ealjVar4.d.a(ealjVar4.b.getPackageName(), false);
                return new eafi(e4);
            }
        }
        ealj.a.o().J("Successfully scheduled a job for package [%s], with ID: %s, type: %s", this.e.b.getApplicationContext().getPackageName(), a, new Integer(i));
        return new eafo(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new eali(this.d, this.e, this.f, this.g, this.h, ffguVar);
    }
}
