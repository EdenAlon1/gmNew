package defpackage;

import com.google.android.gms.location.LocationRequest;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class apkj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ apkl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apkj(apkl apklVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = apklVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((apkj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            elfl b = this.b.e.b();
            this.a = 1;
            obj = fgfz.c(b, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        Boolean bool = (Boolean) obj;
        if (!bool.booleanValue() || !this.b.k.compareAndSet(false, true)) {
            if (bool.booleanValue() || !this.b.k.compareAndSet(true, false)) {
                return null;
            }
            apkl apklVar = this.b;
            apklVar.d.d(apklVar.l);
            return null;
        }
        apkl apklVar2 = this.b;
        long millis = Duration.ofSeconds(apklVar2.f.b).toMillis();
        long millis2 = Duration.ofSeconds(apklVar2.g.b).toMillis();
        dgyu dgyuVar = new dgyu(millis);
        dgyuVar.f(100);
        dgyuVar.a = false;
        dgyuVar.e(millis);
        dgyuVar.d(millis2);
        LocationRequest a = dgyuVar.a();
        apkl apklVar3 = this.b;
        apklVar2.d.b(a, apklVar3.b, apklVar3.l).t(new dhqv() { // from class: apki
            @Override // defpackage.dhqv
            public final void d(Exception exc) {
                ((enrr) ((enrr) apkl.a.j()).g(exc).h("com/google/android/apps/messaging/shared/api/messaging/message/compose/emergency/location/EmergencyLocationSupplier$onPermissionChanged$1", "invokeSuspend$lambda$0", 106, "EmergencyLocationSupplier.kt")).o();
            }
        });
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new apkj(this.b, ffguVar);
    }
}
