package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brsa extends duak {
    public brsa() {
        super("conversation_labels");
    }

    @Override // defpackage.duak
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final brrz b() {
        ah();
        return new brrz(this.c, this.a, this.b, this.d.g(), this.e.g());
    }

    public final void c(String str) {
        int intValue = brsd.c().intValue();
        int intValue2 = brsd.c().intValue();
        if (intValue2 < 55040) {
            dtub.w("preview_content_type", intValue2);
        }
        if (intValue >= 55040) {
            dtub.u(this.a, "preview_content_type", str);
        }
    }

    public final void d(Uri uri) {
        int intValue = brsd.c().intValue();
        int intValue2 = brsd.c().intValue();
        if (intValue2 < 55040) {
            dtub.w("preview_uri", intValue2);
        }
        if (intValue >= 55040) {
            if (uri == null) {
                this.a.putNull("preview_uri");
            } else {
                this.a.put("preview_uri", uri.toString());
            }
        }
    }
}
