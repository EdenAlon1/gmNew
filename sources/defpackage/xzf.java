package defpackage;

import android.net.Uri;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xzf implements appt, xze {
    private final dqzc a;
    private final Uri b;
    private final String c = null;

    public xzf(dqzc dqzcVar, Uri uri) {
        this.a = dqzcVar;
        this.b = uri;
    }

    @Override // defpackage.appt
    public final String a() {
        return this.a.a;
    }

    @Override // defpackage.appj
    public final String b() {
        return drjy.a(this.a.e).a();
    }

    @Override // defpackage.apmq
    public final Uri c() {
        return null;
    }

    @Override // defpackage.apmq
    public final Uri e() {
        Uri uri = this.b;
        if (uri != null) {
            return uri;
        }
        Uri parse = Uri.parse(this.a.b);
        parse.getClass();
        return parse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xzf)) {
            return false;
        }
        xzf xzfVar = (xzf) obj;
        if (!ffkj.e(this.a, xzfVar.a) || !ffkj.e(this.b, xzfVar.b)) {
            return false;
        }
        String str = xzfVar.c;
        return ffkj.e(null, null);
    }

    @Override // defpackage.apqd
    public final Size f() {
        dqzc dqzcVar = this.a;
        return new Size(dqzcVar.g, dqzcVar.h);
    }

    @Override // defpackage.apmq
    public final /* bridge */ /* synthetic */ apra fk() {
        return null;
    }

    @Override // defpackage.apmq
    public final /* synthetic */ awap fl() {
        return null;
    }

    @Override // defpackage.apmq
    public final /* synthetic */ boolean fp() {
        return apmp.a(this);
    }

    @Override // defpackage.appt
    public final String g() {
        return "custom_sticker";
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        return (hashCode + (uri == null ? 0 : uri.hashCode())) * 31;
    }

    @Override // defpackage.apqd
    public final String k() {
        return null;
    }

    public final String toString() {
        Uri uri = this.b;
        String d = uri != null ? cskw.d(uri) : null;
        return "MapiCustomStickerContent(sticker=" + this.a + ", copy=" + d + ", caption=null)";
    }
}
