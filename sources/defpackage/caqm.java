package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caqm implements eerx {
    private final fazb a;
    private final ffbr b;
    private final fcek c;
    private final String d;

    public caqm(fazb fazbVar, ffbr ffbrVar, fcek fcekVar, String str) {
        this.a = fazbVar;
        this.b = ffbrVar;
        this.c = fcekVar;
        this.d = str;
    }

    @Override // defpackage.eerx
    public final void a(String str, boolean z) {
        fcek fcekVar = this.c;
        String str2 = this.d;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        ekzm b = ((elbx) this.b.b()).b("DittoStickerFavoriteListener#onStickerPackFavoriteChanged");
        try {
            axnw.e(((banb) this.a.b()).a(fcekVar, str2, str, z).s());
            ffig.a(b, null);
        } finally {
        }
    }

    @Override // defpackage.eerx
    public final void b() {
    }
}
