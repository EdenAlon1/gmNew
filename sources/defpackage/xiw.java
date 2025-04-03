package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xiw implements xjd {
    private final boolean a;
    private final boolean b;
    private final int c;
    private final alyx d;
    private final boolean e;
    private final String f;
    private final xlt g;

    public xiw(boolean z, boolean z2, int i, alyx alyxVar, boolean z3, String str) {
        str.getClass();
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = alyxVar;
        this.e = z3;
        this.f = str;
        this.g = new xlt(dmzz.dm, R.string.send_button_content_description_mms, Integer.valueOf(R.string.send_button_label_mms), (Integer) null, 24);
    }

    @Override // defpackage.xje
    public final int a() {
        return this.c;
    }

    @Override // defpackage.xje
    public final xlt b() {
        return this.g;
    }

    @Override // defpackage.xje
    public final /* bridge */ /* synthetic */ xlu c() {
        return null;
    }

    @Override // defpackage.xje
    public final alyx d() {
        return this.d;
    }

    @Override // defpackage.xje
    public final /* synthetic */ alyx e() {
        return alyx.SIMPLE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xiw)) {
            return false;
        }
        xiw xiwVar = (xiw) obj;
        return this.a == xiwVar.a && this.b == xiwVar.b && this.c == xiwVar.c && this.d == xiwVar.d && this.e == xiwVar.e && ffkj.e(this.f, xiwVar.f);
    }

    @Override // defpackage.xje
    public final String f() {
        return this.f;
    }

    @Override // defpackage.xje
    public final boolean g() {
        return this.b;
    }

    @Override // defpackage.xje
    public final boolean h() {
        return this.a;
    }

    public final int hashCode() {
        return (((((((((xiv.a(this.a) * 31) + xiv.a(this.b)) * 31) + this.c) * 31) + this.d.hashCode()) * 31) + xiv.a(this.e)) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "Mms(mediaAttachmentsSupported=" + this.a + ", locationSharingSupported=" + this.b + ", attachmentCountLimit=" + this.c + ", bestAvailableTransportFeatureSet=" + this.d + ", hasAttachments=" + this.e + ", draftHint=" + this.f + ")";
    }
}
