package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xja implements xje {
    private final xlu a;
    private final boolean b;
    private final boolean c;
    private final int d;
    private final alyx e;
    private final String f;
    private final alyx g;
    private final xlt h = new xlt(dmzz.dm, R.string.send_button_content_description_satellite, (Integer) null, (Integer) null, 28);

    public xja(xlu xluVar, boolean z, boolean z2, int i, alyx alyxVar, String str) {
        this.a = xluVar;
        this.b = z;
        this.c = z2;
        this.d = i;
        this.e = alyxVar;
        this.f = str;
        this.g = alyxVar;
    }

    @Override // defpackage.xje
    public final int a() {
        return this.d;
    }

    @Override // defpackage.xje
    public final xlt b() {
        return this.h;
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
    public final alyx e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xja)) {
            return false;
        }
        xja xjaVar = (xja) obj;
        return ffkj.e(this.a, xjaVar.a) && this.b == xjaVar.b && this.c == xjaVar.c && this.d == xjaVar.d && this.e == xjaVar.e && ffkj.e(this.f, xjaVar.f);
    }

    @Override // defpackage.xje
    public final String f() {
        return this.f;
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
        return ((((((((((xluVar == null ? 0 : xluVar.hashCode()) * 31) + xiz.a(this.b)) * 31) + xiz.a(this.c)) * 31) + this.d) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "Satellite(textCounter=" + this.a + ", mediaAttachmentsSupported=" + this.b + ", locationSharingSupported=" + this.c + ", attachmentCountLimit=" + this.d + ", bestAvailableTransportFeatureSet=" + this.e + ", draftHint=" + this.f + ")";
    }
}
