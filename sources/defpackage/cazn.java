package defpackage;

import android.graphics.Bitmap;
import com.google.android.gms.maps.model.LatLng;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cazn {
    public final LatLng a;
    public final edqc b;
    public Bitmap c;
    public boolean d;
    public final int e;
    public final int f = 1;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
    
        if (r4.contains("premise") == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public cazn(defpackage.edqc r3, com.google.android.gms.maps.model.LatLng r4) {
        /*
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.f = r0
            r2.b = r3
            r2.a = r4
            if (r3 != 0) goto Ld
            goto L74
        Ld:
            java.util.List r4 = r3.aq()
            r1 = 3
            if (r4 != 0) goto L16
        L14:
            r0 = r1
            goto L74
        L16:
            java.util.HashSet r4 = new java.util.HashSet
            java.util.List r3 = r3.aq()
            r3.getClass()
            r4.<init>(r3)
            java.lang.String r3 = "postal_code"
            boolean r3 = r4.contains(r3)
            if (r3 != 0) goto L74
            java.lang.String r3 = "postal_code_prefix"
            boolean r3 = r4.contains(r3)
            if (r3 != 0) goto L74
            java.lang.String r3 = "postal_town"
            boolean r3 = r4.contains(r3)
            if (r3 != 0) goto L74
            java.lang.String r3 = "political"
            boolean r3 = r4.contains(r3)
            if (r3 != 0) goto L74
            java.lang.String r3 = "colloquial_area"
            boolean r3 = r4.contains(r3)
            if (r3 != 0) goto L74
            java.lang.String r3 = "administrative_area_level_1"
            boolean r3 = r4.contains(r3)
            if (r3 != 0) goto L74
            java.lang.String r3 = "administrative_area_level_2"
            boolean r3 = r4.contains(r3)
            if (r3 != 0) goto L74
            java.lang.String r3 = "administrative_area_level_3"
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L63
            goto L74
        L63:
            java.lang.String r3 = "street_address"
            boolean r3 = r4.contains(r3)
            r0 = 2
            if (r3 != 0) goto L74
            java.lang.String r3 = "premise"
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L14
        L74:
            r2.e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cazn.<init>(edqc, com.google.android.gms.maps.model.LatLng):void");
    }

    public final CharSequence a() {
        return this.b.Z();
    }

    public final CharSequence b() {
        return emxe.b(this.b.V());
    }

    public final CharSequence c() {
        int i = this.e - 1;
        if (i == 1 || i == 2) {
            return this.b.Z();
        }
        return String.format(Locale.US, "(%1$.5f, %2$.5f)", Double.valueOf(this.a.a), Double.valueOf(this.a.b));
    }

    public final CharSequence d() {
        if (this.e - 1 != 2) {
            return null;
        }
        return this.b.V();
    }
}
