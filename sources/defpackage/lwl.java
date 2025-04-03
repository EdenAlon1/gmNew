package defpackage;

import android.net.Uri;
import android.util.Base64;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import j$.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lwl extends lwh {
    private lwv a;
    private byte[] b;
    private int c;
    private int d;

    public lwl() {
        super(false);
    }

    @Override // defpackage.lpp
    public final int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.d;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        byte[] bArr2 = this.b;
        int i4 = lvf.a;
        System.arraycopy(bArr2, this.c, bArr, i, min);
        this.c += min;
        this.d -= min;
        g(min);
        return min;
    }

    @Override // defpackage.lwn
    public final long b(lwv lwvVar) {
        j();
        this.a = lwvVar;
        Uri normalizeScheme = lwvVar.a.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        lti.b(GroupManagementRequest.DATA_TAG.equals(scheme), "Unsupported scheme: ".concat(String.valueOf(scheme)));
        String[] ag = lvf.ag(normalizeScheme.getSchemeSpecificPart(), ",");
        if (ag.length != 2) {
            throw new lrg("Unexpected URI format: ".concat(String.valueOf(String.valueOf(normalizeScheme))), null, true, 0);
        }
        String str = ag[1];
        if (ag[0].contains(";base64")) {
            try {
                this.b = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                throw new lrg("Error while parsing Base64 encoded string: ".concat(String.valueOf(str)), e, true, 0);
            }
        } else {
            this.b = lvf.ae(URLDecoder.decode(str, StandardCharsets.US_ASCII.name()));
        }
        long j = lwvVar.e;
        int length = this.b.length;
        if (j > length) {
            this.b = null;
            throw new lwr(2008);
        }
        int i = (int) j;
        this.c = i;
        this.d = length - i;
        long j2 = lwvVar.f;
        i(lwvVar);
        long j3 = lwvVar.f;
        return this.d;
    }

    @Override // defpackage.lwn
    public final Uri c() {
        lwv lwvVar = this.a;
        if (lwvVar != null) {
            return lwvVar.a;
        }
        return null;
    }

    @Override // defpackage.lwn
    public final void d() {
        if (this.b != null) {
            this.b = null;
            h();
        }
        this.a = null;
    }
}
