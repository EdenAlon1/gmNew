package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.location.Location;
import android.location.LocationManager;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dckt implements dgyt, ahov {
    public static final enru a = enru.c("com/google/android/apps/messaging/ui/mediapicker/c2o/location/picker/LocationAttachmentPickerPresenter");
    public dgym b;
    public ahoz c;
    public WeakReference d;
    public Location e;
    public cazn f;
    public final akzt g;
    private LatLng h;
    private final Context i;
    private final LocationManager j;
    private final ctud k;

    public dckt(Context context, LocationManager locationManager, ctud ctudVar, akzt akztVar, ahoz ahozVar) {
        this.i = context;
        this.j = locationManager;
        this.k = ctudVar;
        this.g = akztVar;
        int i = dgyx.a;
        this.b = new dgzr(context);
        this.c = ahozVar;
        synchronized (ahoz.b) {
            ahozVar.c = new WeakReference(this);
        }
    }

    @Override // defpackage.ahov
    public final void a(final String str, final Bitmap bitmap, final int i) {
        cslq.a.post(new Runnable() { // from class: dckp
            @Override // java.lang.Runnable
            public final void run() {
                dcks dcksVar = (dcks) dckt.this.d.get();
                if (dcksVar != null) {
                    int i2 = i;
                    dcksVar.ao(str, bitmap, i2);
                }
            }
        });
    }

    @Override // defpackage.ahov
    public final void b(edqc edqcVar) {
        this.f = new cazn(edqcVar, this.h);
        cslq.a.post(new Runnable() { // from class: dckr
            @Override // java.lang.Runnable
            public final void run() {
                dckt dcktVar = dckt.this;
                Location location = dcktVar.e;
                if (location != null) {
                    new LatLng(location.getLatitude(), dcktVar.e.getLongitude()).equals(dcktVar.f.a);
                }
                dcks dcksVar = (dcks) dcktVar.d.get();
                if (dcksVar != null) {
                    dcksVar.ap(dcktVar.f, false);
                }
            }
        });
    }

    public final void c() {
        dcks dcksVar = (dcks) this.d.get();
        if (dcksVar != null) {
            dcksVar.ah();
        }
    }

    public final void d(cazn caznVar) {
        this.f = caznVar;
        this.h = caznVar.a;
        dcks dcksVar = (dcks) this.d.get();
        if (dcksVar != null) {
            dcksVar.ak();
            dcksVar.ap(caznVar, true);
            dcksVar.an(this.h);
            dcksVar.am(this.h);
        }
        this.c.a();
    }

    final void e() {
        Location location = this.e;
        if (location != null) {
            f(new LatLng(location.getLatitude(), location.getLongitude()));
            dcks dcksVar = (dcks) this.d.get();
            if (dcksVar != null) {
                dcksVar.am(this.h);
            }
        }
    }

    public final void f(LatLng latLng) {
        this.h = latLng;
        dcks dcksVar = (dcks) this.d.get();
        LatLng latLng2 = this.h;
        LatLngBounds latLngBounds = latLng2 == null ? null : new LatLngBounds(latLng2, latLng2);
        if (dcksVar != null) {
            dcksVar.an(this.h);
            dcksVar.ak();
        }
        this.c.a();
        if (latLngBounds == null) {
            cslq.a.post(new Runnable() { // from class: dckq
                @Override // java.lang.Runnable
                public final void run() {
                    dcks dcksVar2 = (dcks) dckt.this.d.get();
                    if (dcksVar2 != null) {
                        dcksVar2.ai();
                    }
                }
            });
            return;
        }
        ahoz ahozVar = this.c;
        ahoy ahoyVar = new ahoy(ahozVar, this.h);
        synchronized (ahozVar.d) {
            if (ahozVar.i != null) {
                ahozVar.i.a();
            }
            ahozVar.i = ahoyVar;
        }
        axos.a(ahoyVar, ahozVar.f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
    
        if (java.lang.Integer.parseInt(r2) != 1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0051, code lost:
    
        if (r3 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003c, code lost:
    
        if (r3 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0056, code lost:
    
        if (r2 != null) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            r9 = this;
            java.lang.ref.WeakReference r0 = r9.d
            java.lang.Object r0 = r0.get()
            r1 = r0
            dcks r1 = (defpackage.dcks) r1
            android.content.Context r0 = r9.i
            boolean r2 = defpackage.ahos.a(r0)
            if (r2 == 0) goto L6f
            android.content.ContentResolver r3 = r0.getContentResolver()
            r2 = 0
            android.net.Uri r4 = defpackage.ahos.b     // Catch: java.lang.Throwable -> L3f java.lang.RuntimeException -> L41
            java.lang.String r0 = "value"
            java.lang.String[] r5 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L3f java.lang.RuntimeException -> L41
            java.lang.String r6 = "name=?"
            java.lang.String r0 = "use_location_for_services"
            java.lang.String[] r7 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L3f java.lang.RuntimeException -> L41
            r8 = 0
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L3f java.lang.RuntimeException -> L41
            if (r3 == 0) goto L3c
            boolean r0 = r3.moveToNext()     // Catch: java.lang.RuntimeException -> L3a java.lang.Throwable -> L67
            if (r0 == 0) goto L3c
            r0 = 0
            java.lang.String r0 = r3.getString(r0)     // Catch: java.lang.RuntimeException -> L3a java.lang.Throwable -> L67
            r2 = r0
            goto L3c
        L3a:
            r0 = move-exception
            goto L43
        L3c:
            if (r3 == 0) goto L56
            goto L53
        L3f:
            r0 = move-exception
            goto L69
        L41:
            r0 = move-exception
            r3 = r2
        L43:
            cskc r4 = defpackage.ahos.a     // Catch: java.lang.Throwable -> L67
            csjb r4 = r4.e()     // Catch: java.lang.Throwable -> L67
            java.lang.String r5 = "Failed to get 'Use My Location' setting."
            r4.I(r5)     // Catch: java.lang.Throwable -> L67
            r4.s(r0)     // Catch: java.lang.Throwable -> L67
            if (r3 == 0) goto L56
        L53:
            r3.close()
        L56:
            if (r2 != 0) goto L59
            goto L61
        L59:
            int r0 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L61
            r2 = 1
            if (r0 != r2) goto L61
            goto L6f
        L61:
            if (r1 == 0) goto Ld1
            r1.aj()
            return
        L67:
            r0 = move-exception
            r2 = r3
        L69:
            if (r2 == 0) goto L6e
            r2.close()
        L6e:
            throw r0
        L6f:
            android.location.LocationManager r0 = r9.j
            if (r0 == 0) goto Lcc
            java.lang.String r2 = "gps"
            boolean r0 = r0.isProviderEnabled(r2)
            if (r0 != 0) goto L85
            android.location.LocationManager r0 = r9.j
            java.lang.String r2 = "network"
            boolean r0 = r0.isProviderEnabled(r2)
            if (r0 == 0) goto Lcc
        L85:
            ctud r0 = r9.k
            boolean r0 = r0.j()
            if (r0 != 0) goto L93
            if (r1 == 0) goto Ld1
            r1.ag()
            return
        L93:
            if (r1 == 0) goto L98
            r1.F()
        L98:
            enru r0 = defpackage.dckt.a
            ensk r0 = r0.h()
            enrr r0 = (defpackage.enrr) r0
            java.lang.String r1 = "startListeningForCurrentLocation"
            r2 = 170(0xaa, float:2.38E-43)
            java.lang.String r3 = "com/google/android/apps/messaging/ui/mediapicker/c2o/location/picker/LocationAttachmentPickerPresenter"
            java.lang.String r4 = "LocationAttachmentPickerPresenter.java"
            ensk r0 = r0.h(r3, r1, r2, r4)
            enrr r0 = (defpackage.enrr) r0
            java.lang.String r1 = "Requesting current location"
            r0.q(r1)
            dgym r0 = r9.b
            r1 = 100
            dhre r0 = r0.c(r1)
            dckn r1 = new dckn
            r1.<init>()
            r0.a(r1)
            dcko r1 = new dcko
            r1.<init>()
            r0.t(r1)
            return
        Lcc:
            if (r1 == 0) goto Ld1
            r1.al()
        Ld1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dckt.g():void");
    }

    @Override // defpackage.dgyt
    public final void h(Location location) {
        this.e = location;
        if (this.h == null) {
            e();
        } else {
            c();
        }
    }
}
