package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pau implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    final par a;
    final ViewGroup b;

    public pau(par parVar, ViewGroup viewGroup) {
        this.a = parVar;
        this.b = viewGroup;
    }

    private final void a() {
        this.b.getViewTreeObserver().removeOnPreDrawListener(this);
        this.b.removeOnAttachStateChangeListener(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x01d4 A[EDGE_INSN: B:119:0x01d4->B:120:0x01d4 BREAK  A[LOOP:1: B:17:0x008b->B:48:0x01cc], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02a5 A[EDGE_INSN: B:195:0x02a5->B:196:0x02a5 BREAK  A[LOOP:8: B:142:0x0227->B:176:0x0227], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02da  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onPreDraw() {
        /*
            Method dump skipped, instructions count: 791
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pau.onPreDraw():boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
        pav.a.remove(this.b);
        ArrayList arrayList = (ArrayList) pav.a().get(this.b);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((par) arrayList.get(i)).w(this.b);
            }
        }
        this.a.q(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
