package defpackage;

import android.text.TextWatcher;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqmw implements dqnm, dqnn {
    public final dqkk a;
    public final EditText b;
    public final Set c = new LinkedHashSet();
    public final dqnf d;
    private final /* synthetic */ dqmq e;
    private final dqki f;
    private final dqnk g;
    private final dqng h;
    private final dqnj i;

    public dqmw(dqki dqkiVar, dqnk dqnkVar, dqng dqngVar, dqkk dqkkVar, EditText editText) {
        this.e = new dqmq(editText, false, dqkkVar);
        this.f = dqkiVar;
        this.g = dqnkVar;
        this.h = dqngVar;
        this.a = dqkkVar;
        this.b = editText;
        dqnj a = dqkiVar != null ? dqnkVar.a(dqkiVar, null) : null;
        this.i = a;
        dqmu dqmuVar = new dqmu(this);
        dqmv dqmvVar = new dqmv(this);
        ffsk ffskVar = (ffsk) dqngVar.a.b();
        ffskVar.getClass();
        dqok dqokVar = (dqok) dqngVar.b.b();
        dqokVar.getClass();
        this.d = new dqnf(ffskVar, dqokVar, dqmuVar, dqmvVar);
        if (a != null) {
            j(a);
        }
        lew b = lew.b();
        b.getClass();
        ffji ffjiVar = new ffji() { // from class: dqmt
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ((lew) obj).getClass();
                dqmw dqmwVar = dqmw.this;
                dqnf dqnfVar = dqmwVar.d;
                dqnfVar.getClass();
                dqmwVar.b.addTextChangedListener(dqmwVar.a.a("EmojiEditTextDraftTextController#textWatcher", dqnfVar));
                return ffcu.a;
            }
        };
        int a2 = b.a();
        if (a2 != 0) {
            if (a2 == 1) {
                ffjiVar.invoke(b);
                return;
            } else if (a2 != 3) {
                return;
            }
        }
        b.f(new dqrs(ffjiVar, b));
    }

    @Override // defpackage.dqmn
    public final CharSequence a() {
        return this.e.a();
    }

    @Override // defpackage.dqmn
    public final void b(CharSequence charSequence) {
        this.e.b(charSequence);
    }

    @Override // defpackage.dqmn
    public final void c(CharSequence charSequence) {
        this.e.c(charSequence);
    }

    @Override // defpackage.dqmn
    public final void d() {
        this.e.d();
    }

    @Override // defpackage.dqmn
    public final void e() {
        this.e.a.getText().clear();
    }

    @Override // defpackage.dqmn
    public final void f(dqrp dqrpVar) {
        this.e.f(dqrpVar);
    }

    @Override // defpackage.dqmn
    public final void g(CharSequence charSequence) {
        this.e.g(charSequence);
    }

    @Override // defpackage.dqmn
    public final void h() {
        List ak;
        dqnf dqnfVar = this.d;
        synchronized (dqnfVar.b) {
            ak = ffdx.ak(dqnfVar.b);
        }
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((dqlt) it.next()).d(ak);
        }
        dqnf dqnfVar2 = this.d;
        dqnfVar2.c = true;
        ffsl.e(dqnfVar2.d, null);
        dqnfVar2.d = dqnfVar2.a();
        dqnfVar2.b = new ArrayList();
    }

    @Override // defpackage.dqmn
    public final void i(CharSequence charSequence) {
        this.e.i(charSequence);
    }

    @Override // defpackage.dqms
    public final void j(dqlt dqltVar) {
        this.c.add(dqltVar);
    }

    @Override // defpackage.dqnm
    public final void k(dqnl dqnlVar) {
        dqmq dqmqVar = this.e;
        if (dqmqVar.e == null) {
            EditText editText = dqmqVar.a;
            TextWatcher dqmpVar = new dqmp(dqmqVar);
            editText.addTextChangedListener(dqmpVar);
            if (dqmqVar.b) {
                dqmpVar = dqmqVar.c.a("EditTextDraftTextController#textWatcher", dqmpVar);
            }
            dqmqVar.e = dqmpVar;
        }
        dqmqVar.d.add(dqnlVar);
    }

    @Override // defpackage.dqnm
    public final void l(dqnl dqnlVar) {
        dqmq dqmqVar = this.e;
        dqmqVar.d.remove(dqnlVar);
        if (dqmqVar.d.isEmpty()) {
            dqmqVar.a.removeTextChangedListener(dqmqVar.e);
            dqmqVar.e = null;
        }
    }

    @Override // defpackage.dqms
    public final void m(dqlt dqltVar) {
        this.c.remove(dqltVar);
    }
}
