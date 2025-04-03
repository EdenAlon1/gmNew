package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebip extends FrameLayout implements ebwc {
    public final TextView a;
    public final TextView b;
    public final eboz c;
    public final View d;
    private final Button e;
    private final boolean f;
    private boolean g;

    public ebip(Context context, boolean z) {
        super(context);
        inflate(context, R.layout.critical_alert_view, this);
        this.a = (TextView) findViewById(R.id.og_critical_alert_title);
        this.b = (TextView) findViewById(R.id.og_critical_alert_subtitle);
        Button button = (Button) findViewById(R.id.og_critical_alert_action_button);
        this.e = button;
        this.d = findViewById(R.id.og_critical_alert_card_view);
        this.c = new eboz(button);
        setFocusable(false);
        int[] iArr = kvo.a;
        setImportantForAccessibility(4);
        this.f = z;
    }

    public static int a(boolean z) {
        return z ? 109340 : 109736;
    }

    @Override // defpackage.ebwc
    public final void b(ebvw ebvwVar) {
        ebvwVar.c(this.d, a(this.f));
        ebvwVar.c(this.e, 109339);
        this.g = true;
    }

    @Override // defpackage.ebwc
    public final void ho(ebvw ebvwVar) {
        if (this.g) {
            ebvwVar.e(this.e);
            ebvwVar.e(this.d);
            this.g = false;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        this.c.b(View.MeasureSpec.getSize(i));
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.e.setOnClickListener(onClickListener);
        this.d.setOnClickListener(onClickListener);
        super.setOnClickListener(new View.OnClickListener() { // from class: ebio
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ebip.this.d.performClick();
            }
        });
    }
}
