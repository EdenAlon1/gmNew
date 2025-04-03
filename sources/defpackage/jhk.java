package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jhk implements hfq, lkp {
    public final AndroidComposeView a;
    public final hfq b;
    public boolean c;
    public lkk d;
    public ffjm e = jcs.a;

    public jhk(AndroidComposeView androidComposeView, hfq hfqVar) {
        this.a = androidComposeView;
        this.b = hfqVar;
    }

    public final void b(ffjm ffjmVar) {
        jhj jhjVar = new jhj(this, ffjmVar);
        AndroidComposeView androidComposeView = this.a;
        iyq E = androidComposeView.E();
        if (E != null) {
            jhjVar.invoke(E);
        }
        if (androidComposeView.isAttachedToWindow()) {
            return;
        }
        androidComposeView.D = jhjVar;
    }

    @Override // defpackage.hfq
    public final void d() {
        if (!this.c) {
            this.c = true;
            this.a.setTag(R.id.wrapped_composition_tag, null);
            lkk lkkVar = this.d;
            if (lkkVar != null) {
                lkkVar.d(this);
            }
        }
        this.b.d();
    }

    @Override // defpackage.hfq
    public final boolean e() {
        throw null;
    }

    @Override // defpackage.lkp
    public final void hg(lkr lkrVar, lki lkiVar) {
        if (lkiVar == lki.ON_DESTROY) {
            d();
        } else {
            if (lkiVar != lki.ON_CREATE || this.c) {
                return;
            }
            b(this.e);
        }
    }
}
