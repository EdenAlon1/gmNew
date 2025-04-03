package com.google.android.libraries.compose.emoji.ui.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import defpackage.dqnr;
import defpackage.dqqh;
import defpackage.dqyg;
import defpackage.dqyk;
import defpackage.dqym;
import defpackage.ffdo;
import defpackage.lfb;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class SingleEmojiViewWithVariantIndicator extends dqym<dqyg> {
    public static final dqyg j;

    static {
        dqnr dqnrVar = new dqnr("");
        j = new dqyg(dqnrVar, new dqqh(dqnrVar));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleEmojiViewWithVariantIndicator(Context context) {
        super(context);
        context.getClass();
    }

    @Override // defpackage.dqyk
    public final /* bridge */ /* synthetic */ CharSequence a(Object obj) {
        ((dqyg) obj).getClass();
        return ((dqyg) c()).a.a();
    }

    @Override // defpackage.dqyk
    public final /* synthetic */ Object b() {
        return j;
    }

    @Override // defpackage.dqyk
    public final void d(Canvas canvas, lfb[] lfbVarArr) {
        dqyk.g(this, canvas, (lfb) ffdo.G(lfbVarArr), ((dqyg) c()).a.a());
        if (((dqyg) c()).b.i().isEmpty()) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        canvas.drawPath((Path) dqyk.d.a(Integer.valueOf(((Number) this.i.a()).intValue()), Integer.valueOf(width), Integer.valueOf(height)), (Paint) this.h.a());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleEmojiViewWithVariantIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }
}
