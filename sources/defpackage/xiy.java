package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xiy implements xje {
    public final alyx a;
    public final alxi b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    private final boolean f;
    private final boolean g;
    private final int h;
    private final boolean i;
    private final boolean j;
    private final String k;
    private final alyx l;
    private final xlt m;

    public xiy(boolean z, boolean z2, int i, alyx alyxVar, boolean z3, alxi alxiVar, boolean z4, String str, boolean z5, boolean z6, boolean z7) {
        alxiVar.getClass();
        this.f = z;
        this.g = z2;
        this.h = i;
        this.a = alyxVar;
        this.i = z3;
        this.b = alxiVar;
        this.j = z4;
        this.k = str;
        this.c = z5;
        this.d = z6;
        this.e = z7;
        this.l = alyxVar;
        this.m = z4 ? new xlt(dmzz.dp, R.string.send_button_content_description_rcs, (Integer) null, (Integer) null, 28) : alyxVar.h ? new xlt(dmzz.dn, R.string.send_button_content_description_rcs_encrypted, (Integer) null, Integer.valueOf(R.string.send_button_content_description_rcs_encrypted_with_profile), 12) : new xlt(dmzz.dm, R.string.send_button_content_description_rcs, (Integer) null, Integer.valueOf(R.string.send_button_content_description_rcs_with_profile), 12);
    }

    @Override // defpackage.xje
    public final int a() {
        return this.h;
    }

    @Override // defpackage.xje
    public final xlt b() {
        return this.m;
    }

    @Override // defpackage.xje
    public final /* bridge */ /* synthetic */ xlu c() {
        return null;
    }

    @Override // defpackage.xje
    public final alyx d() {
        return this.a;
    }

    @Override // defpackage.xje
    public final alyx e() {
        return this.l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xiy)) {
            return false;
        }
        xiy xiyVar = (xiy) obj;
        return this.f == xiyVar.f && this.g == xiyVar.g && this.h == xiyVar.h && this.a == xiyVar.a && this.i == xiyVar.i && this.b == xiyVar.b && this.j == xiyVar.j && ffkj.e(this.k, xiyVar.k) && this.c == xiyVar.c && this.d == xiyVar.d && this.e == xiyVar.e;
    }

    @Override // defpackage.xje
    public final String f() {
        return this.k;
    }

    @Override // defpackage.xje
    public final boolean g() {
        return this.g;
    }

    @Override // defpackage.xje
    public final boolean h() {
        return this.f;
    }

    public final int hashCode() {
        int a = (((((((((((((xix.a(this.f) * 31) + xix.a(this.g)) * 31) + this.h) * 31) + this.a.hashCode()) * 31) + xix.a(this.i)) * 31) + this.b.hashCode()) * 31) + xix.a(this.j)) * 31) + this.k.hashCode();
        boolean z = this.e;
        return (((((a * 31) + xix.a(this.c)) * 31) + xix.a(this.d)) * 31) + xix.a(z);
    }

    public final String toString() {
        return "Rcs(mediaAttachmentsSupported=" + this.f + ", locationSharingSupported=" + this.g + ", attachmentCountLimit=" + this.h + ", bestAvailableTransportFeatureSet=" + this.a + ", hasAttachments=" + this.i + ", kind=" + this.b + ", isGeminiConversation=" + this.j + ", draftHint=" + this.k + ", editSupported=" + this.c + ", remoteDeleteSupported=" + this.d + ", h265DecodingSupported=" + this.e + ")";
    }
}
