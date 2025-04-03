package defpackage;

import android.text.TextUtils;
import android.widget.EditText;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uhp implements dbzn {
    final /* synthetic */ uhs a;

    public uhp(uhs uhsVar) {
        this.a = uhsVar;
    }

    private final void l() {
        if (!this.a.j.n()) {
            uhs uhsVar = this.a;
            eg G = uhsVar.h.G();
            if (G == null || !ctid.e(G, uhsVar.c.a)) {
                return;
            }
        }
        this.a.o.h(false);
    }

    @Override // defpackage.dbzn
    public final /* synthetic */ void a(ufd ufdVar, dcle dcleVar, boolean z) {
        dbzm.a(this, ufdVar, dcleVar, z);
    }

    @Override // defpackage.dbzn
    public final /* synthetic */ void b(MediaContentItem mediaContentItem, dcle dcleVar, boolean z) {
        dbzm.b(this, mediaContentItem, dcleVar, z);
    }

    @Override // defpackage.dbzn
    public final void c(ufd ufdVar, dcle dcleVar, boolean z, int i) {
        int c;
        if (z) {
            uhs uhsVar = this.a;
            uhsVar.p.f(uhsVar.a.a(ufdVar, dcleVar));
            c = 0;
        } else {
            uhs uhsVar2 = this.a;
            c = uhsVar2.p.c(uhsVar2.a.a(ufdVar, dcleVar));
        }
        uhs uhsVar3 = this.a;
        uhsVar3.b.c(dclb.a(ufdVar, dcleVar), c, i);
        l();
    }

    @Override // defpackage.dbzn
    public final void d(MediaContentItem mediaContentItem, dcle dcleVar, boolean z, int i) {
        int c;
        if (z) {
            uhs uhsVar = this.a;
            uhsVar.p.f(uhsVar.i.a(mediaContentItem, dcleVar));
            c = -1;
            this.a.k(mediaContentItem, dcleVar, -1, i);
        } else {
            uhs uhsVar2 = this.a;
            c = uhsVar2.p.c(uhsVar2.i.a(mediaContentItem, dcleVar));
        }
        this.a.k(mediaContentItem, dcleVar, c, i);
        l();
    }

    @Override // defpackage.dbzn
    public final /* synthetic */ void e(ufd ufdVar, dcle dcleVar) {
        dbzm.c(this, ufdVar, dcleVar);
    }

    @Override // defpackage.dbzn
    public final /* synthetic */ void f(MediaContentItem mediaContentItem, dcle dcleVar) {
        dbzm.d(this, mediaContentItem, dcleVar);
    }

    @Override // defpackage.dbzn
    public final void g(ufd ufdVar, dcle dcleVar, int i) {
        uhs uhsVar = this.a;
        if (uhsVar.p.h(uhsVar.a.a(ufdVar, dcleVar))) {
            uhs uhsVar2 = this.a;
            uhsVar2.b.d(dclb.a(ufdVar, dcleVar), i);
        }
    }

    @Override // defpackage.dbzn
    public final void h(MediaContentItem mediaContentItem, dcle dcleVar, int i) {
        uhs uhsVar = this.a;
        if (uhsVar.p.h(uhsVar.i.a(mediaContentItem, dcleVar))) {
            uhs uhsVar2 = this.a;
            uhsVar2.b.d(dcll.a(mediaContentItem, dcleVar), i);
        }
    }

    @Override // defpackage.dbzn
    public final void i(dcas dcasVar, boolean z) {
        CharSequence a = dcasVar.a();
        if (TextUtils.isEmpty(a)) {
            return;
        }
        if (z) {
            this.a.p.g(a.toString());
            l();
            return;
        }
        EditText d = this.a.p.d();
        if (d != null) {
            int selectionStart = d.getSelectionStart();
            int selectionEnd = d.getSelectionEnd();
            d.getText().replace(Math.min(selectionStart, selectionEnd), Math.max(selectionStart, selectionEnd), a);
        }
    }

    @Override // defpackage.dbzn
    public final /* synthetic */ void j(appw appwVar, dcle dcleVar, boolean z) {
        dbzm.e(this, appwVar, dcleVar, z);
    }

    @Override // defpackage.dbzn
    public final void k(appw appwVar, dcle dcleVar, boolean z, int i) {
        String c = appwVar.c();
        if (TextUtils.isEmpty(c)) {
            return;
        }
        if (z) {
            this.a.p.g(c);
            l();
        } else {
            EditText d = this.a.p.d();
            if (d != null) {
                int selectionStart = d.getSelectionStart();
                int selectionEnd = d.getSelectionEnd();
                d.getText().replace(Math.min(selectionStart, selectionEnd), Math.max(selectionStart, selectionEnd), c);
            }
        }
        uhs uhsVar = this.a;
        uhsVar.b.c(dclo.a(appwVar, dcleVar), -1, i);
    }
}
