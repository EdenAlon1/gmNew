package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.messaging.R;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaym extends ConstraintLayout implements ebwc {
    public final MaterialButton i;
    public final MaterialButton j;
    public final MaterialButton k;
    public final ImageView l;
    public final ImageView m;
    public final ArrayList n;
    public ebtw o;
    public ezoo p;
    public ksz q;
    public eayk r;
    public ebny s;
    public ebvw t;

    public eaym(Context context) {
        super(context, null);
        this.n = new ArrayList();
        LayoutInflater.from(context).inflate(R.layout.policy_footer, this);
        this.i = (MaterialButton) findViewById(R.id.og_privacy_policy_button);
        this.j = (MaterialButton) findViewById(R.id.og_tos_button);
        this.k = (MaterialButton) findViewById(R.id.og_custom_button);
        this.l = (ImageView) findViewById(R.id.og_separator1);
        this.m = (ImageView) findViewById(R.id.og_separator2);
        getResources().getDimensionPixelSize(R.dimen.og_footer_added_separator_margin);
    }

    public static void f(MaterialButton materialButton) {
        materialButton.setMaxLines(3);
        materialButton.setEllipsize(null);
    }

    @Override // defpackage.ebwc
    public final void b(ebvw ebvwVar) {
        ebvwVar.c(this.i, 90532);
        ebvwVar.c(this.j, 90533);
        ebvwVar.c(this.k, 90534);
    }

    public final View.OnClickListener g(final eavd eavdVar, final int i) {
        ebon ebonVar = new ebon(new View.OnClickListener() { // from class: eayj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                eaym eaymVar = eaym.this;
                ebtw ebtwVar = eaymVar.o;
                Object a = eaymVar.q.a();
                ezon ezonVar = (ezon) eaymVar.p.toBuilder();
                ezonVar.copyOnWrite();
                ezoo ezooVar = (ezoo) ezonVar.instance;
                ezooVar.c = i - 1;
                ezooVar.b |= 1;
                ebtwVar.a(a, (ezoo) ezonVar.build());
                eaymVar.t.f(new dvxf(5), view);
                eavdVar.a(view, eaymVar.q.a());
            }
        });
        ebonVar.d = this.s.b();
        ebonVar.e = this.s.a();
        return new ebol(ebonVar);
    }

    @Override // defpackage.ebwc
    public final void ho(ebvw ebvwVar) {
        ebvwVar.e(this.i);
        ebvwVar.e(this.j);
        ebvwVar.e(this.k);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        try {
            if (this.r != null) {
                while (!this.n.isEmpty()) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 0), i2);
                    if (getMeasuredWidth() <= View.MeasureSpec.getSize(i)) {
                        break;
                    }
                    eayk eaykVar = (eayk) this.n.remove(0);
                    this.r = eaykVar;
                    eaykVar.a(this);
                }
                eayk eaykVar2 = this.r;
                if (eaykVar2 != null) {
                    eaykVar2.a(this);
                }
            }
            super.onMeasure(i, i2);
        } catch (Throwable th) {
            eayk eaykVar3 = this.r;
            if (eaykVar3 != null) {
                eaykVar3.a(this);
            }
            super.onMeasure(i, i2);
            throw th;
        }
    }
}
