package defpackage;

import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dzyn extends mj {
    public static final int d = new Random().nextInt();
    public Drawable e;
    private final boolean f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dzyn(defpackage.mr r3) {
        /*
            r2 = this;
            mb r0 = new mb
            dzyl r1 = new dzyl
            r1.<init>(r3)
            r0.<init>(r1)
            dyhp r3 = defpackage.dyhp.b()
            errl r3 = r3.a
            ersb r1 = new ersb
            r1.<init>(r3)
            r0.a = r1
            mc r3 = r0.a()
            r2.<init>(r3)
            r3 = 0
            r2.e = r3
            r3 = 1
            r2.f = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzyn.<init>(mr):void");
    }

    protected abstract wr F(ViewGroup viewGroup, int i);

    protected abstract void G(wr wrVar, int i);

    @Override // defpackage.mj
    public final void c(List list) {
        if (list == null || list.isEmpty()) {
            super.c(null);
            return;
        }
        synchronized (this) {
            if (this.f) {
                ArrayList arrayList = new ArrayList(list);
                arrayList.add(null);
                list = arrayList;
            }
        }
        super.c(list);
    }

    @Override // defpackage.vk
    public final int dE(int i) {
        return b(i) == null ? d : m(i);
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ wr e(ViewGroup viewGroup, int i) {
        if (i != d) {
            return new dzym(F(viewGroup, i));
        }
        ImageView imageView = new ImageView(viewGroup.getContext());
        Drawable drawable = this.e;
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        }
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        int[] iArr = kvo.a;
        imageView.setImportantForAccessibility(2);
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.addView(imageView);
        int a = dzyk.a(viewGroup.getContext(), 10.0f);
        linearLayout.setPadding(a, a, a, a);
        linearLayout.setLayoutParams(new vy(-1, -2));
        return new dzym(linearLayout);
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void g(wr wrVar, int i) {
        dzym dzymVar = (dzym) wrVar;
        if (dzymVar.s == null || b(i) == null) {
            return;
        }
        KeyEvent.Callback callback = dzymVar.s.a;
        if (callback instanceof dzys) {
            ((dzys) callback).c();
        }
        G(dzymVar.s, i);
    }

    protected int m(int i) {
        throw null;
    }
}
