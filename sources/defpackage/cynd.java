package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cynd implements cync {
    private final Context d;
    private final ffbr e;
    private final ffbr f;
    private final HashSet c = new HashSet();
    private float g = ((Float) cync.b.e()).floatValue();
    private boolean h = false;
    private boolean i = false;
    private boolean j = false;

    public cynd(Context context, ffbr ffbrVar, ffbr ffbrVar2) {
        this.d = context;
        this.e = ffbrVar;
        this.f = ffbrVar2;
    }

    @Override // defpackage.ljv
    public final void c(lkr lkrVar) {
        if (((Optional) this.e.b()).isPresent() && this.i) {
            ((cymq) ((Optional) this.e.b()).get()).b(this.g);
            float f = this.g;
            if (f == 1.0f) {
                ((akzt) this.f.b()).e("Bugle.ConversationScale.ConversationScaleSaved.Count", 1);
                return;
            }
            if (f > 1.0f && f <= 1.1f) {
                ((akzt) this.f.b()).e("Bugle.ConversationScale.ConversationScaleSaved.Count", 2);
                return;
            }
            if (f > 1.1f && f <= 1.2f) {
                ((akzt) this.f.b()).e("Bugle.ConversationScale.ConversationScaleSaved.Count", 3);
                return;
            }
            if (f > 1.2f && f <= 1.3f) {
                ((akzt) this.f.b()).e("Bugle.ConversationScale.ConversationScaleSaved.Count", 4);
                return;
            }
            if (f > 1.3f && f <= 1.4f) {
                ((akzt) this.f.b()).e("Bugle.ConversationScale.ConversationScaleSaved.Count", 5);
                return;
            }
            if (f > 1.4f && f <= 1.5f) {
                ((akzt) this.f.b()).e("Bugle.ConversationScale.ConversationScaleSaved.Count", 6);
                return;
            }
            if (f > 1.5f && f <= 1.6f) {
                ((akzt) this.f.b()).e("Bugle.ConversationScale.ConversationScaleSaved.Count", 7);
            } else if (f > 1.6f) {
                ((akzt) this.f.b()).e("Bugle.ConversationScale.ConversationScaleSaved.Count", 8);
            }
        }
    }

    @Override // defpackage.cync
    public final float g() {
        return this.g;
    }

    @Override // defpackage.cync
    public final void h(cynb cynbVar) {
        efbd.g();
        this.c.add(cynbVar);
    }

    @Override // defpackage.cync
    public final void i(float f) {
        efbd.g();
        this.h = true;
        if (f == this.g) {
            return;
        }
        this.g = f;
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((cynb) it.next()).gl();
        }
    }

    @Override // defpackage.cync
    public final void j(float f) {
        efbd.g();
        if (!this.h || f == 0.0f) {
            return;
        }
        float a = cskf.a(this.g + f, ((Float) cync.b.e()).floatValue(), ((Float) cync.a.e()).floatValue());
        if (this.g != a) {
            this.i = true;
            this.g = a;
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((cynb) it.next()).gl();
            }
            if (this.j) {
                return;
            }
            Toast.makeText(this.d, R.string.conversation_scale_toast_text, 0).show();
            this.j = true;
        }
    }

    @Override // defpackage.cync
    public final void k(cynb cynbVar) {
        efbd.g();
        this.c.remove(cynbVar);
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void d(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void f(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void ff(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void gZ(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void ha(lkr lkrVar) {
    }
}
