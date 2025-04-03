package defpackage;

import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqdf implements dtab {
    public static final ffbz a = ffca.a(new ffix() { // from class: dqde
        @Override // defpackage.ffix
        public final Object invoke() {
            ffbz ffbzVar = dqdf.a;
            drkw drkwVar = drld.b;
            List a2 = drki.a();
            ffbz ffbzVar2 = drnd.b;
            return ffdx.ad(a2, drmi.a());
        }
    });
    public final Integer b;
    public final int c;
    public final dqgf d;
    public final dpnj e;
    public final ffbz f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    public dqdf() {
        this((dqgf) null, (dpnj) null, (ffbz) null, false, false, false, false, 1023);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqdf)) {
            return false;
        }
        dqdf dqdfVar = (dqdf) obj;
        Integer num = dqdfVar.b;
        if (!ffkj.e(null, null) || this.c != dqdfVar.c || !ffkj.e(this.d, dqdfVar.d) || !ffkj.e(this.e, dqdfVar.e) || !ffkj.e(this.f, dqdfVar.f) || this.g != dqdfVar.g) {
            return false;
        }
        boolean z = dqdfVar.h;
        return this.i == dqdfVar.i && this.j == dqdfVar.j && this.k == dqdfVar.k;
    }

    public final int hashCode() {
        int hashCode = (this.c * 31) + this.d.hashCode();
        dpnj dpnjVar = this.e;
        return (((((((((((((hashCode * 31) + (dpnjVar == null ? 0 : dpnjVar.hashCode())) * 31) + this.f.hashCode()) * 31) + dqdd.a(this.g)) * 31) + dqdd.a(false)) * 31) + dqdd.a(this.i)) * 31) + dqdd.a(this.j)) * 31) + dqdd.a(this.k);
    }

    public final String toString() {
        return "CameraGalleryConfiguration(columnMaxCount=null, columnMinWidth=" + this.c + ", systemContentPicker=" + this.d + ", camera=" + this.e + ", supportedFormats=" + this.f + ", expandToMaxHeightUponHeaderAppearance=" + this.g + ", autoScrollToTopOnRefresh=false, observeDraftAttachmentsController=" + this.i + ", requireFullVisibleRowsInScrollCalculation=" + this.j + ", skipGalleryInvalidationDuringLayout=" + this.k + ")";
    }

    public dqdf(int i, dqgf dqgfVar, dpnj dpnjVar, ffbz ffbzVar, boolean z, boolean z2, boolean z3, boolean z4) {
        dqgfVar.getClass();
        ffbzVar.getClass();
        this.b = null;
        this.c = i;
        this.d = dqgfVar;
        this.e = dpnjVar;
        this.f = ffbzVar;
        this.g = z;
        this.h = false;
        this.i = z2;
        this.j = z3;
        this.k = z4;
    }

    public /* synthetic */ dqdf(dqgf dqgfVar, dpnj dpnjVar, ffbz ffbzVar, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        this((i & 2) != 0 ? R.dimen.gallery_item_min_width : 0, (i & 4) != 0 ? new dqgf(false, false, 15) : dqgfVar, (i & 8) != 0 ? null : dpnjVar, (i & 16) != 0 ? a : ffbzVar, ((i & 32) == 0) & z, (!((i & 128) == 0)) | z2, (!((i & 256) == 0)) | z3, ((i & 512) == 0) & z4);
    }
}
