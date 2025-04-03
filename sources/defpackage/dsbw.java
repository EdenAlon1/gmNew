package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsbw extends vk {
    public static final /* synthetic */ ffmx[] a;
    public final Context d;
    public final ffsk e;
    public final dqkk f;
    public final boolean g;
    public int h;
    public final int k;
    public dsat l;
    private final dqli p;
    public final ffls i = new dsbu(0, this);
    public final ffls j = new dsbv(0, this);
    private final ffbz q = ffca.a(new ffix() { // from class: dsbj
        @Override // defpackage.ffix
        public final Object invoke() {
            return Integer.valueOf(dsbw.this.d.getResources().getDimensionPixelSize(R.dimen.shortcut_spacing));
        }
    });
    public final ffbz m = ffca.a(new ffix() { // from class: dsbk
        @Override // defpackage.ffix
        public final Object invoke() {
            return Integer.valueOf(dsbw.this.d.getResources().getDimensionPixelSize(R.dimen.shortcut_icon_size));
        }
    });
    private final ffbz r = ffca.a(new ffix() { // from class: dsbl
        @Override // defpackage.ffix
        public final Object invoke() {
            dsbw dsbwVar = dsbw.this;
            return Integer.valueOf(dsbwVar.F() + ((Number) dsbwVar.m.a()).intValue() + dsbwVar.F());
        }
    });
    public final ffbz n = ffca.a(new ffix() { // from class: dsbm
        @Override // defpackage.ffix
        public final Object invoke() {
            return Integer.valueOf(dsbw.this.d.getResources().getDimensionPixelSize(R.dimen.shortcut_cell_height));
        }
    });
    public final ffbz o = ffca.a(new ffix() { // from class: dsbn
        @Override // defpackage.ffix
        public final Object invoke() {
            dsbw dsbwVar = dsbw.this;
            return Integer.valueOf(dsbwVar.F() + ((Number) dsbwVar.n.a()).intValue() + dsbwVar.F());
        }
    });

    static {
        ffko ffkoVar = new ffko(dsbw.class, "cellWidthPx", "getCellWidthPx()I", 0);
        int i = fflc.a;
        a = new ffmx[]{ffkoVar, new ffko(dsbw.class, "cellHeightPx", "getCellHeightPx()I", 0)};
    }

    public dsbw(Context context, ffsk ffskVar, dqli dqliVar, dqkk dqkkVar, dsat dsatVar, boolean z) {
        this.d = context;
        this.e = ffskVar;
        this.p = dqliVar;
        this.f = dqkkVar;
        this.g = z;
        this.k = ffmk.g(dsatVar.a.size(), 7);
        this.l = dsatVar;
    }

    public final int F() {
        return ((Number) this.q.a()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G(defpackage.dsar r5, android.view.View r6, defpackage.ffgu r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.dsbt
            if (r0 == 0) goto L13
            r0 = r7
            dsbt r0 = (defpackage.dsbt) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dsbt r0 = new dsbt
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r6 = r0.a
            dsar r5 = r0.e
            defpackage.ffci.b(r7)
            goto L46
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.ffci.b(r7)
            dqli r7 = r4.p
            java.util.List r2 = r5.c
            r0.e = r5
            r0.a = r6
            r0.d = r3
            java.lang.Object r7 = r7.b(r2, r0)
            if (r7 == r1) goto L56
        L46:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L53
            ffji r5 = r5.d
            r5.invoke(r6)
        L53:
            ffcu r5 = defpackage.ffcu.a
            return r5
        L56:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsbw.G(dsar, android.view.View, ffgu):java.lang.Object");
    }

    @Override // defpackage.vk
    public final int a() {
        return this.l.a.size();
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ wr e(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.shortcut_item, viewGroup, false);
        AppCompatImageView appCompatImageView = (AppCompatImageView) inflate.findViewById(R.id.shortcut_icon);
        appCompatImageView.setBackgroundResource(R.drawable.shortcut_icon_shape);
        TextView textView = (TextView) inflate.findViewById(R.id.shortcut_title);
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) inflate.findViewById(R.id.shortcut_badge_icon);
        inflate.getClass();
        appCompatImageView.getClass();
        textView.getClass();
        appCompatImageView2.getClass();
        return new dsbs(this, inflate, appCompatImageView, textView, appCompatImageView2);
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void g(wr wrVar, int i) {
        View.OnClickListener onClickListener;
        final dsbs dsbsVar = (dsbs) wrVar;
        dsbsVar.getClass();
        final dsar dsarVar = (dsar) this.l.a.get(i);
        dsarVar.getClass();
        int i2 = dsarVar.a;
        View view = dsbsVar.s;
        view.setContentDescription(view.getResources().getString(i2));
        kvo.p(view, new dsku(new ffji() { // from class: dsbo
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                kxu kxuVar = (kxu) obj;
                int i3 = dsbs.x;
                kxuVar.getClass();
                kxuVar.L("button");
                return ffcu.a;
            }
        }));
        List list = dsarVar.c;
        final dsbw dsbwVar = dsbsVar.w;
        if (list.isEmpty()) {
            final ffji ffjiVar = dsarVar.d;
            onClickListener = new View.OnClickListener() { // from class: dsbp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i3 = dsbs.x;
                    ffji.this.invoke(view2);
                }
            };
        } else {
            onClickListener = new View.OnClickListener() { // from class: dsbq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    dsbw dsbwVar2 = dsbw.this;
                    ffqy.d(dsbwVar2.e, null, null, new dsbr(dsbwVar2, dsarVar, dsbsVar, null), 3);
                }
            };
        }
        view.setOnClickListener(dsbwVar.f.b("ShortcutsAdapter.ViewHolder#onClick", onClickListener));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = ((Number) dsbwVar.j.c(a[1])).intValue();
        view.setLayoutParams(layoutParams);
        AppCompatImageView appCompatImageView = dsbsVar.t;
        dsaq dsaqVar = dsarVar.b;
        appCompatImageView.setImageResource(dsaqVar.a);
        Context context = appCompatImageView.getContext();
        context.getClass();
        Drawable drawable = appCompatImageView.getDrawable();
        drawable.getClass();
        dsaqVar.b.b.b(context, drawable);
        appCompatImageView.setBackgroundResource(R.drawable.shortcut_icon_shape);
        Context context2 = appCompatImageView.getContext();
        context2.getClass();
        Drawable background = appCompatImageView.getBackground();
        background.getClass();
        dsaqVar.b.a.b(context2, background);
        dsbsVar.v.setVisibility(8);
        dsbsVar.u.setText(dsarVar.a);
    }

    public final int m() {
        return ((Number) this.r.a()).intValue();
    }
}
