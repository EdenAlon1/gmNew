package defpackage;

import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dbzx extends cxpu {
    protected final dbzy d;
    private final int e;
    private final int f;

    public dbzx(dbzy dbzyVar, int i) {
        this(dbzyVar, i, R.layout.compose2o_item_placeholder);
    }

    protected abstract wr F(ViewGroup viewGroup, int i);

    protected void G(View view, int i) {
        view.setAccessibilityDelegate(new dbzw(this, i));
    }

    protected boolean H() {
        throw null;
    }

    @Override // defpackage.vk
    public int a() {
        return this.d.a() + 1 + (H() ? 1 : 0);
    }

    @Override // defpackage.vk
    public final int dE(int i) {
        if (i == 0) {
            return 0;
        }
        if (H() && i == a() - 1) {
            return 9;
        }
        return this.d.b(i - 1);
    }

    @Override // defpackage.vk
    public wr e(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new dcan(LayoutInflater.from(viewGroup.getContext()).inflate(this.f, viewGroup, false));
        }
        if (i != 9) {
            return F(viewGroup, i);
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.compose2o_overflow_item_m2, viewGroup, false);
        inflate.getLayoutParams().height = this.e != -2 ? viewGroup.getResources().getDimensionPixelSize(this.e) : -1;
        inflate.setOnClickListener(new View.OnClickListener() { // from class: dbzv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dcab dcabVar = dbzx.this.d.b;
                if (dcabVar != null) {
                    dcabVar.e(eptm.CATEGORY_OVERFLOW);
                }
            }
        });
        inflate.setContentDescription(viewGroup.getContext().getString(m()));
        inflate.setClipToOutline(true);
        return new dcan(inflate);
    }

    @Override // defpackage.cxpu, defpackage.vk
    public void g(wr wrVar, int i) {
        this.a.add(wrVar);
        G(wrVar.a, i);
        int i2 = wrVar.f;
        if (i2 == 0 || i2 == 9) {
            return;
        }
        KeyEvent.Callback callback = wrVar.a;
        if (callback instanceof dcal) {
            this.d.d((dcal) callback, i - 1);
        }
    }

    @Override // defpackage.vk
    public final long hb(int i) {
        int dE = dE(i);
        int dE2 = dE(i);
        if (dE2 == 0) {
            return -2L;
        }
        if (dE2 != 9) {
            return this.d.c(i - 1, dE);
        }
        return -3L;
    }

    protected int m() {
        throw null;
    }

    public dbzx(dbzy dbzyVar, int i, int i2) {
        this.d = dbzyVar;
        this.e = i;
        this.f = i2;
    }
}
