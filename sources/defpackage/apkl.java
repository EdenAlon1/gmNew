package defpackage;

import android.location.Location;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apkl implements aqge {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/api/messaging/message/compose/emergency/location/EmergencyLocationSupplier");
    public final errl b;
    public final ffsk c;
    public final dgym d;
    public final aqge e;
    public final eyev f;
    public final eyev g;
    public final long h;
    public final elbx i;
    public final AtomicReference j = new AtomicReference(null);
    public final AtomicBoolean k = new AtomicBoolean(false);
    public final dgyt l = new dgyt() { // from class: apkb
        @Override // defpackage.dgyt
        public final void h(Location location) {
            location.getClass();
            apkl apklVar = apkl.this;
            ekzm b = apklVar.i.b("EmergencyLocationSupplier#onLocationChanged");
            try {
                axol.m(apklVar.c, new apkh(location, apklVar, null));
                ffig.a(b, null);
            } finally {
            }
        }
    };
    public ctbx m;
    public final ctbl n;
    private final aqge o;

    public apkl(errl errlVar, ffsk ffskVar, ctbk ctbkVar, dgym dgymVar, aqge aqgeVar, eyev eyevVar, eyev eyevVar2, long j, elbx elbxVar, aqge aqgeVar2) {
        this.b = errlVar;
        this.c = ffskVar;
        this.d = dgymVar;
        this.e = aqgeVar;
        this.f = eyevVar;
        this.g = eyevVar2;
        this.h = j;
        this.i = elbxVar;
        this.o = aqgeVar2;
        this.n = ctbkVar.a(new apkf(this));
    }

    @Override // defpackage.aqge
    public final ctbx a(final aqgd aqgdVar) {
        return this.n.a(new ctbf() { // from class: apkc
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                return aqgd.this.a();
            }
        }, "EmergencyLocationSupplier:register", "EmergencyLocationSupplier:callback", "EmergencyLocationSupplier:unregister");
    }

    @Override // defpackage.aqge
    public final elfl b() {
        elfl c;
        c = axol.c(this.c, ffhe.a, ffsm.a, new apkd(this, null));
        return c;
    }

    @Override // defpackage.aqge
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.apkk
            if (r0 == 0) goto L13
            r0 = r5
            apkk r0 = (defpackage.apkk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            apkk r0 = new apkk
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r5)
            goto L44
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.ffci.b(r5)
            aqge r5 = r4.o
            elfl r5 = r5.b()
            r5.getClass()
            r0.c = r3
            java.lang.Object r5 = defpackage.fgfz.c(r5, r0)
            if (r5 != r1) goto L44
            return r1
        L44:
            java.util.Map r5 = (java.util.Map) r5
            boolean r5 = r5.isEmpty()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apkl.d(ffgu):java.lang.Object");
    }
}
