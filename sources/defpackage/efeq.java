package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efeq extends effz {
    public efhs a;
    private Uri b;
    private eyhs c;
    private emxc d = emux.a;
    private engr e;
    private engw f;
    private boolean g;
    private byte h;

    @Override // defpackage.effz
    public final efga a() {
        Uri uri;
        eyhs eyhsVar;
        efhs efhsVar;
        engr engrVar = this.e;
        if (engrVar != null) {
            this.f = engrVar.g();
        } else if (this.f == null) {
            int i = engw.d;
            this.f = enou.a;
        }
        if (this.h == 3 && (uri = this.b) != null && (eyhsVar = this.c) != null && (efhsVar = this.a) != null) {
            return new efer(uri, eyhsVar, this.d, this.f, efhsVar, this.g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" uri");
        }
        if (this.c == null) {
            sb.append(" schema");
        }
        if (this.a == null) {
            sb.append(" variantConfig");
        }
        if ((this.h & 1) == 0) {
            sb.append(" useGeneratedExtensionRegistry");
        }
        if ((this.h & 2) == 0) {
            sb.append(" enableTracing");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.effz
    public final engr b() {
        if (this.e == null) {
            if (this.f == null) {
                int i = engw.d;
                this.e = new engr();
            } else {
                int i2 = engw.d;
                engr engrVar = new engr();
                this.e = engrVar;
                engrVar.j(this.f);
                this.f = null;
            }
        }
        return this.e;
    }

    @Override // defpackage.effz
    public final void c() {
        this.h = (byte) (this.h | 2);
    }

    @Override // defpackage.effz
    public final void d(efet efetVar) {
        this.d = emxc.j(efetVar);
    }

    @Override // defpackage.effz
    public final void e(eyhs eyhsVar) {
        if (eyhsVar == null) {
            throw new NullPointerException("Null schema");
        }
        this.c = eyhsVar;
    }

    @Override // defpackage.effz
    public final void f(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null uri");
        }
        this.b = uri;
    }

    @Override // defpackage.effz
    public final void g(boolean z) {
        this.g = z;
        this.h = (byte) (this.h | 1);
    }
}
