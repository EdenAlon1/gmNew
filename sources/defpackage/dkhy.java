package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkhy implements dkii {
    private static final diyy a = dizd.a(202254264);
    private final Context b;
    private final djtp c;
    private final dkib d;

    public dkhy(Context context, djtp djtpVar, dkib dkibVar) {
        this.b = context;
        this.c = djtpVar;
        this.d = dkibVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:8|(3:9|10|(1:23))|(3:25|26|(1:35))|(3:37|38|(1:49))|(2:51|52)|(4:58|59|105|106)|63|64|(2:66|(2:68|(4:70|71|(2:73|(1:75)(1:(1:80)))(1:81)|76)))|82|83|(2:92|76)|94|95|96|(2:102|76)|104|105|106) */
    /* JADX WARN: Can't wrap try/catch for region: R(23:8|9|10|(1:23)|(3:25|26|(1:35))|37|38|(1:49)|(2:51|52)|(4:58|59|105|106)|63|64|(2:66|(2:68|(4:70|71|(2:73|(1:75)(1:(1:80)))(1:81)|76)))|82|83|(2:92|76)|94|95|96|(2:102|76)|104|105|106) */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01de, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01df, code lost:
    
        defpackage.dkty.s(r0, "Failed due to missing permission.", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01b9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01ba, code lost:
    
        defpackage.dkty.s(r0, "Failed due to missing permission.", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0182, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0183, code lost:
    
        defpackage.dkty.s(r0, "Failed due to missing permission.", new java.lang.Object[0]);
        r5 = r5;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:59:0x010f. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x01d6 -> B:76:0x01ec). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x01ab -> B:76:0x01ec). Please report as a decompilation issue!!! */
    @Override // defpackage.dkii
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dkht a() {
        /*
            Method dump skipped, instructions count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkhy.a():dkht");
    }

    @Override // defpackage.dkii
    public final dkht b() {
        dkht dkhtVar = new dkht(this.d.a);
        boolean z = this.c.r().mChatAuth;
        dkhtVar.e(z);
        dkhtVar.q(z);
        dkhtVar.n(true);
        InstantMessageConfiguration o = this.c.o();
        dkhtVar.f(o.mFtThumbnailSupported);
        dkhtVar.k(this.c.r().mGeoLocPushAuth);
        dkhtVar.j(this.c.r().mGeoLocPullAuth != 0);
        dkhtVar.i(true ^ TextUtils.isEmpty(o.mFtHttpContentServerUri));
        dkhtVar.g(djaq.o());
        dkhtVar.l(djaq.p());
        dkhtVar.n(false);
        return dkhtVar;
    }
}
