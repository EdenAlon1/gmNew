package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crng implements ctuy {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;

    public crng(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.d = ffbrVar4;
    }

    @Override // defpackage.ctuy
    public final int a() {
        return ((csxu) this.b.b()).b("bugle_min_phone_number_length_to_format", 7);
    }

    @Override // defpackage.ctuy
    public final String b() {
        return ((ctxt) this.a.b()).a();
    }

    @Override // defpackage.ctuy
    public final String c(int i) {
        String str = (String) ((cxao) this.d.b()).a(i).h().orElse("");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    @Override // defpackage.ctuy
    public final boolean d() {
        return ((csrv) this.c.b()).t;
    }
}
