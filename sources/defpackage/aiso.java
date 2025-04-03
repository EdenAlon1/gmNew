package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aiso implements aema {
    private final Context a;
    private final cjdi b;
    private final cjdj c;
    private final ctjh d;
    private TextView e;
    private crly f;

    public aiso(Context context, cjdi cjdiVar, cjdj cjdjVar, ctjh ctjhVar) {
        context.getClass();
        cjdiVar.getClass();
        cjdjVar.getClass();
        ctjhVar.getClass();
        this.a = context;
        this.b = cjdiVar;
        this.c = cjdjVar;
        this.d = ctjhVar;
    }

    private final void f(aelx aelxVar, aeki aekiVar) {
        boolean z = false;
        if (!ctjd.f()) {
            aelxVar.g(false);
            return;
        }
        long o = aekiVar.o();
        boolean aA = bcse.aA(aekiVar.i());
        if (aekiVar.B() != null && this.b.a(o)) {
            z = true;
        }
        aelxVar.g(z);
        if (z) {
            ((aelu) aelxVar).r = this.c.a(o, aA);
        }
    }

    @Override // defpackage.aema
    public final aely a(aely aelyVar) {
        aelyVar.getClass();
        aelx l = aelyVar.l();
        f(l, aelyVar.k());
        return l.a();
    }

    @Override // defpackage.aema
    public final void b(aely aelyVar, boolean z) {
        aelyVar.getClass();
        if (aelyVar.Y()) {
            return;
        }
        String I = aelyVar.I();
        if (I == null || I.length() == 0) {
            if (stl.a() && aelyVar.U()) {
                return;
            }
            crly crlyVar = null;
            if (!aelyVar.W()) {
                crly crlyVar2 = this.f;
                if (crlyVar2 == null) {
                    ffkj.c("nudgeTextViewStubber");
                } else {
                    crlyVar = crlyVar2;
                }
                crlyVar.g(8);
                return;
            }
            crly crlyVar3 = this.f;
            if (crlyVar3 == null) {
                ffkj.c("nudgeTextViewStubber");
                crlyVar3 = null;
            }
            crlyVar3.g(0);
            crly crlyVar4 = this.f;
            if (crlyVar4 == null) {
                ffkj.c("nudgeTextViewStubber");
            } else {
                crlyVar = crlyVar4;
            }
            TextView textView = (TextView) crlyVar.b();
            this.e = textView;
            if (textView != null) {
                String G = aelyVar.G();
                if (G == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                textView.setText(G);
            }
            int d = ehdr.d(this.a, R.attr.colorPrimaryBrandNonIcon, "NudgeViewPart");
            TextView textView2 = this.e;
            if (textView2 != null) {
                textView2.setTextColor(d);
            }
            MessageIdType x = aelyVar.k().x();
            ConversationIdType w = aelyVar.k().w();
            fbwv B = aelyVar.k().B();
            if (x.c() || w.b() || B == null) {
                return;
            }
            this.d.l(x, w, B, eopx.SHOWN);
        }
    }

    @Override // defpackage.aema
    public final void c(View view) {
        this.f = new crly(view, R.id.additional_text, R.id.additional_text, R.layout.additional_text_view);
    }

    @Override // defpackage.aema
    public final boolean d(aely aelyVar, aely aelyVar2) {
        aelyVar.getClass();
        aelyVar2.getClass();
        return (aelyVar.W() == aelyVar2.W() && ffkj.e(aelyVar.G(), aelyVar2.G())) ? false : true;
    }

    @Override // defpackage.aema
    public final void e(aelx aelxVar, aeki aekiVar) {
        aekiVar.getClass();
        f(aelxVar, aekiVar);
    }
}
