package defpackage;

import android.graphics.Canvas;
import android.graphics.RenderNode;
import android.widget.EdgeEffect;

/* compiled from: PG */
/* loaded from: classes.dex */
final class djo extends isz implements itg {
    private final deb a;
    private final dfx b;
    private RenderNode c;

    public djo(isw iswVar, deb debVar, dfx dfxVar) {
        this.a = debVar;
        this.b = dfxVar;
        M(iswVar);
    }

    private final RenderNode a() {
        RenderNode renderNode = this.c;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNode2 = new RenderNode("AndroidEdgeEffectOverscrollEffect");
        this.c = renderNode2;
        return renderNode2;
    }

    private static final boolean b(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int save = canvas.save();
        canvas.rotate(f);
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private static final boolean f(EdgeEffect edgeEffect, Canvas canvas) {
        return b(180.0f, edgeEffect, canvas);
    }

    private static final boolean g(EdgeEffect edgeEffect, Canvas canvas) {
        return b(270.0f, edgeEffect, canvas);
    }

    private static final boolean h(EdgeEffect edgeEffect, Canvas canvas) {
        return b(90.0f, edgeEffect, canvas);
    }

    private static final boolean i(EdgeEffect edgeEffect, Canvas canvas) {
        return b(0.0f, edgeEffect, canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f8  */
    @Override // defpackage.itg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(defpackage.ifo r21) {
        /*
            Method dump skipped, instructions count: 751
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djo.s(ifo):void");
    }

    @Override // defpackage.itg
    public final /* synthetic */ void u() {
    }
}
