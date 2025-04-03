package defpackage;

import android.content.ContentResolver;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dchs extends dchw {
    public dchs(Context context, ctud ctudVar, ContentResolver contentResolver, errl errlVar, bdjd bdjdVar, dchi dchiVar) {
        super(context, ctudVar, contentResolver, errlVar, bdjdVar, dchiVar);
    }

    @Override // defpackage.dchw, defpackage.dchz
    public final int b(int i) {
        if (this.b.s()) {
            return i == 0 ? 8 : 1;
        }
        return 2;
    }

    @Override // defpackage.dchw, defpackage.dchz
    public final int c() {
        return 1;
    }

    @Override // defpackage.dchz
    public final epts e() {
        return epts.CAMERA_GALLERY;
    }

    @Override // defpackage.dchz
    public final eptu f() {
        return eptu.COLLAPSED;
    }

    @Override // defpackage.dchw
    public final int k() {
        return 23;
    }

    @Override // defpackage.dchw
    public final int l() {
        return 2;
    }
}
