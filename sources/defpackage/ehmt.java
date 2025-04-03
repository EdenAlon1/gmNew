package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehmt extends ehmv {
    final /* synthetic */ Context a;
    final /* synthetic */ TextPaint b;
    final /* synthetic */ ehmv c;
    final /* synthetic */ ehmu d;

    public ehmt(ehmu ehmuVar, Context context, TextPaint textPaint, ehmv ehmvVar) {
        this.a = context;
        this.b = textPaint;
        this.c = ehmvVar;
        this.d = ehmuVar;
    }

    @Override // defpackage.ehmv
    public final void a(int i) {
        this.c.a(i);
    }

    @Override // defpackage.ehmv
    public final void b(Typeface typeface, boolean z) {
        this.d.e(this.a, this.b, typeface);
        this.c.b(typeface, z);
    }
}
