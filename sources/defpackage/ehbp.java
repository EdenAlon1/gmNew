package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehbp extends kwi {
    private final View a;
    private int d;
    private int e;
    private final int[] f;

    public ehbp(View view) {
        super(0);
        this.f = new int[2];
        this.a = view;
    }

    @Override // defpackage.kwi
    public final kxh b(kxh kxhVar, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((kwr) it.next()).a.h() & 8) != 0) {
                this.a.setTranslationY(egyv.b(this.e, 0, r0.a()));
                break;
            }
        }
        return kxhVar;
    }

    @Override // defpackage.kwi
    public final void c(kwr kwrVar) {
        this.a.setTranslationY(0.0f);
    }

    @Override // defpackage.kwi
    public final void d() {
        this.a.getLocationOnScreen(this.f);
        this.d = this.f[1];
    }

    @Override // defpackage.kwi
    public final kwh e(kwh kwhVar) {
        this.a.getLocationOnScreen(this.f);
        int i = this.d - this.f[1];
        this.e = i;
        this.a.setTranslationY(i);
        return kwhVar;
    }
}
