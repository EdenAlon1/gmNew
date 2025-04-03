package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyvs extends dywc {
    public engw a;
    public String b;
    public engw c;
    public String d;
    public byte e;
    private Uri f;
    private int g;

    @Override // defpackage.dywc
    public final dywd a() {
        Uri uri;
        if (this.e == 3 && (uri = this.f) != null) {
            return new dyvt(uri, this.a, this.b, this.c, this.d, this.g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f == null) {
            sb.append(" tableUri");
        }
        if ((this.e & 1) == 0) {
            sb.append(" limit");
        }
        if ((this.e & 2) == 0) {
            sb.append(" offset");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dywc
    public final void b(int i) {
        this.g = i;
        this.e = (byte) (this.e | 1);
    }

    @Override // defpackage.dywc
    public final void c(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null tableUri");
        }
        this.f = uri;
    }
}
