package defpackage;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jxu extends CharacterStyle implements UpdateAppearance {
    public final ide a;
    public final hho b = new hic(new iar(9205357640488583168L), hla.a);
    private final float c;
    private final hkx d;

    public jxu(ide ideVar, float f) {
        this.a = ideVar;
        this.c = f;
        jxt jxtVar = new jxt(this);
        hqg hqgVar = hkg.a;
        this.d = new hgk(jxtVar, null);
    }

    public final long a() {
        return ((iar) this.b.a()).a;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        jxb.a(textPaint, this.c);
        textPaint.setShader((Shader) this.d.a());
    }
}
