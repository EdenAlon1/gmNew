package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lwx implements lwn {
    private final Context a;
    private final List b = new ArrayList();
    private final lwn c;
    private lwn d;
    private lwn e;
    private lwn f;
    private lwn g;
    private lwn h;
    private lwn i;
    private lwn j;
    private lwn k;

    public lwx(Context context, lwn lwnVar) {
        this.a = context.getApplicationContext();
        this.c = lwnVar;
    }

    private final lwn g() {
        if (this.e == null) {
            lwg lwgVar = new lwg(this.a);
            this.e = lwgVar;
            h(lwgVar);
        }
        return this.e;
    }

    private final void h(lwn lwnVar) {
        for (int i = 0; i < this.b.size(); i++) {
            lwnVar.f((lxp) this.b.get(i));
        }
    }

    private static final void i(lwn lwnVar, lxp lxpVar) {
        if (lwnVar != null) {
            lwnVar.f(lxpVar);
        }
    }

    @Override // defpackage.lpp
    public final int a(byte[] bArr, int i, int i2) {
        lwn lwnVar = this.k;
        lti.f(lwnVar);
        return lwnVar.a(bArr, i, i2);
    }

    @Override // defpackage.lwn
    public final long b(lwv lwvVar) {
        lwn lwnVar;
        lti.c(this.k == null);
        String scheme = lwvVar.a.getScheme();
        Uri uri = lwvVar.a;
        int i = lvf.a;
        String scheme2 = uri.getScheme();
        if (TextUtils.isEmpty(scheme2) || "file".equals(scheme2)) {
            String path = lwvVar.a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.d == null) {
                    lxf lxfVar = new lxf();
                    this.d = lxfVar;
                    h(lxfVar);
                }
                this.k = this.d;
            } else {
                this.k = g();
            }
        } else if ("asset".equals(scheme)) {
            this.k = g();
        } else if ("content".equals(scheme)) {
            if (this.f == null) {
                lwk lwkVar = new lwk(this.a);
                this.f = lwkVar;
                h(lwkVar);
            }
            this.k = this.f;
        } else if ("rtmp".equals(scheme)) {
            if (this.g == null) {
                try {
                    lwn lwnVar2 = (lwn) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                    this.g = lwnVar2;
                    h(lwnVar2);
                } catch (ClassNotFoundException unused) {
                    luj.f("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating RTMP extension", e);
                }
                if (this.g == null) {
                    this.g = this.c;
                }
            }
            this.k = this.g;
        } else if ("udp".equals(scheme)) {
            if (this.h == null) {
                lxr lxrVar = new lxr();
                this.h = lxrVar;
                h(lxrVar);
            }
            this.k = this.h;
        } else if (GroupManagementRequest.DATA_TAG.equals(scheme)) {
            if (this.i == null) {
                lwl lwlVar = new lwl();
                this.i = lwlVar;
                h(lwlVar);
            }
            this.k = this.i;
        } else {
            if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.j == null) {
                    lxn lxnVar = new lxn(this.a);
                    this.j = lxnVar;
                    h(lxnVar);
                }
                lwnVar = this.j;
            } else {
                lwnVar = this.c;
            }
            this.k = lwnVar;
        }
        return this.k.b(lwvVar);
    }

    @Override // defpackage.lwn
    public final Uri c() {
        lwn lwnVar = this.k;
        if (lwnVar == null) {
            return null;
        }
        return lwnVar.c();
    }

    @Override // defpackage.lwn
    public final void d() {
        lwn lwnVar = this.k;
        if (lwnVar != null) {
            try {
                lwnVar.d();
            } finally {
                this.k = null;
            }
        }
    }

    @Override // defpackage.lwn
    public final Map e() {
        lwn lwnVar = this.k;
        return lwnVar == null ? Collections.EMPTY_MAP : lwnVar.e();
    }

    @Override // defpackage.lwn
    public final void f(lxp lxpVar) {
        lti.f(lxpVar);
        this.c.f(lxpVar);
        this.b.add(lxpVar);
        i(this.d, lxpVar);
        i(this.e, lxpVar);
        i(this.f, lxpVar);
        i(this.g, lxpVar);
        i(this.h, lxpVar);
        i(this.i, lxpVar);
        i(this.j, lxpVar);
    }
}
