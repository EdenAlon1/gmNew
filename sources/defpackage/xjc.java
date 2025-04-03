package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xjc implements xjd {
    private final xlu a;
    private final boolean b;
    private final boolean c;
    private final int d;
    private final alyx e;
    private final boolean f;
    private final xls g;
    private final String h;
    private final xlt i;

    public xjc(xlu xluVar, boolean z, boolean z2, int i, alyx alyxVar, boolean z3, String str) {
        str.getClass();
        this.a = xluVar;
        this.b = z;
        this.c = z2;
        this.d = i;
        this.e = alyxVar;
        this.f = z3;
        this.g = null;
        this.h = str;
        this.i = new xlt(dmzz.dm, R.string.send_button_content_description_sms, Integer.valueOf(R.string.send_button_label_sms), (Integer) null, 16);
    }

    public static final xjc i(xjc xjcVar, xlu xluVar) {
        if (xjcVar.a == null) {
            xluVar = null;
        }
        return new xjc(xluVar, xjcVar.b, xjcVar.c, xjcVar.d, xjcVar.e, xjcVar.f, xjcVar.h);
    }

    @Override // defpackage.xje
    public final int a() {
        return this.d;
    }

    @Override // defpackage.xje
    public final xlt b() {
        return this.i;
    }

    @Override // defpackage.xje
    public final xlu c() {
        return this.a;
    }

    @Override // defpackage.xje
    public final alyx d() {
        return this.e;
    }

    @Override // defpackage.xje
    public final /* synthetic */ alyx e() {
        return alyx.SIMPLE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xjc)) {
            return false;
        }
        xjc xjcVar = (xjc) obj;
        if (!ffkj.e(this.a, xjcVar.a) || this.b != xjcVar.b || this.c != xjcVar.c || this.d != xjcVar.d || this.e != xjcVar.e || this.f != xjcVar.f) {
            return false;
        }
        xls xlsVar = xjcVar.g;
        return ffkj.e(this.h, xjcVar.h);
    }

    @Override // defpackage.xje
    public final String f() {
        return this.h;
    }

    @Override // defpackage.xje
    public final boolean g() {
        return this.c;
    }

    @Override // defpackage.xje
    public final boolean h() {
        return this.b;
    }

    public final int hashCode() {
        xlu xluVar = this.a;
        return ((((((((((((xluVar == null ? 0 : xluVar.hashCode()) * 31) + xjb.a(this.b)) * 31) + xjb.a(this.c)) * 31) + this.d) * 31) + this.e.hashCode()) * 31) + xjb.a(this.f)) * 961) + this.h.hashCode();
    }

    public final String toString() {
        return "Sms(textCounter=" + this.a + ", mediaAttachmentsSupported=" + this.b + ", locationSharingSupported=" + this.c + ", attachmentCountLimit=" + this.d + ", bestAvailableTransportFeatureSet=" + this.e + ", isMassSms=" + this.f + ", disabled=null, draftHint=" + this.h + ")";
    }
}
