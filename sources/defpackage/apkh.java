package defpackage;

import android.location.Location;
import j$.time.Duration;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class apkh extends ffhv implements ffjm {
    int a;
    final /* synthetic */ Location b;
    final /* synthetic */ apkl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apkh(Location location, apkl apklVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = location;
        this.c = apklVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((apkh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        boolean hasVerticalAccuracy;
        float verticalAccuracyMeters;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            apjr apjrVar = (apjr) apjs.a.createBuilder();
            eyiz eyizVar = (eyiz) eyja.a.createBuilder();
            long seconds = Duration.ofMillis(this.b.getTime()).toSeconds();
            eyizVar.copyOnWrite();
            ((eyja) eyizVar.instance).b = seconds;
            apjrVar.copyOnWrite();
            apjs apjsVar = (apjs) apjrVar.instance;
            eyja eyjaVar = (eyja) eyizVar.build();
            eyjaVar.getClass();
            apjsVar.h = eyjaVar;
            apjsVar.b |= 4;
            double latitude = this.b.getLatitude();
            apjrVar.copyOnWrite();
            ((apjs) apjrVar.instance).c = latitude;
            double longitude = this.b.getLongitude();
            apjrVar.copyOnWrite();
            ((apjs) apjrVar.instance).d = longitude;
            if (this.b.hasAccuracy()) {
                if (this.b.getAccuracy() > this.c.h) {
                    ((enrr) apkl.a.h().h("com/google/android/apps/messaging/shared/api/messaging/message/compose/emergency/location/EmergencyLocationSupplier$onLocationChanged$1$1", "invokeSuspend", 125, "EmergencyLocationSupplier.kt")).t("Location has lower accuracy than needed", new Float(this.b.getAccuracy()));
                    return ffcu.a;
                }
                float accuracy = this.b.getAccuracy();
                apjrVar.copyOnWrite();
                ((apjs) apjrVar.instance).e = accuracy;
            }
            if (this.b.hasAltitude()) {
                hasVerticalAccuracy = this.b.hasVerticalAccuracy();
                if (hasVerticalAccuracy) {
                    double altitude = this.b.getAltitude();
                    apjrVar.copyOnWrite();
                    apjs apjsVar2 = (apjs) apjrVar.instance;
                    apjsVar2.b |= 1;
                    apjsVar2.f = altitude;
                    verticalAccuracyMeters = this.b.getVerticalAccuracyMeters();
                    apjrVar.copyOnWrite();
                    apjs apjsVar3 = (apjs) apjrVar.instance;
                    apjsVar3.b |= 2;
                    apjsVar3.g = verticalAccuracyMeters;
                }
            }
            this.c.j.set(apjrVar.build());
            apkl apklVar = this.c;
            this.a = 1;
            obj = apklVar.d(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            this.c.n.c(new Supplier() { // from class: apkg
                @Override // java.util.function.Supplier
                public final Object get() {
                    return null;
                }
            }, "EmergencyLocationSupplier:Notify");
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new apkh(this.b, this.c, ffguVar);
    }
}
