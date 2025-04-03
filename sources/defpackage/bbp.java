package defpackage;

import android.util.Range;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbp extends bgq {
    public aua a;
    public bdp b;
    private Size c;
    private Size d;
    private Range e;
    private Boolean f;

    public bbp() {
    }

    @Override // defpackage.bgq
    public final bgr a() {
        Size size = this.c;
        Size size2 = this.d;
        String str = size == null ? " resolution" : "";
        if (size2 == null) {
            str = str.concat(" originalConfiguredResolution");
        }
        if (this.a == null) {
            str = str.concat(" dynamicRange");
        }
        if (this.e == null) {
            str = str.concat(" expectedFrameRateRange");
        }
        if (this.f == null) {
            str = str.concat(" zslDisabled");
        }
        if (str.isEmpty()) {
            return new bbq(this.c, this.d, this.a, this.e, this.b, this.f.booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override // defpackage.bgq
    public final void b(Range range) {
        if (range == null) {
            throw new NullPointerException("Null expectedFrameRateRange");
        }
        this.e = range;
    }

    @Override // defpackage.bgq
    public final void c(Size size) {
        if (size == null) {
            throw new NullPointerException("Null originalConfiguredResolution");
        }
        this.d = size;
    }

    @Override // defpackage.bgq
    public final void d(Size size) {
        if (size == null) {
            throw new NullPointerException("Null resolution");
        }
        this.c = size;
    }

    @Override // defpackage.bgq
    public final void e(boolean z) {
        this.f = Boolean.valueOf(z);
    }

    public bbp(bgr bgrVar) {
        bbq bbqVar = (bbq) bgrVar;
        this.c = bbqVar.a;
        this.d = bbqVar.b;
        this.a = bbqVar.c;
        this.e = bbqVar.d;
        this.b = bbqVar.e;
        this.f = Boolean.valueOf(bbqVar.f);
    }
}
