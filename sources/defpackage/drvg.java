package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drvg {
    public final View a;
    private final ffbz c = ffca.a(new ffix() { // from class: drvb
        @Override // defpackage.ffix
        public final Object invoke() {
            return (RadioGroup) drvg.this.a.findViewById(R.id.gallery_google_photos_select_button_group);
        }
    });
    private final ffbz d = ffca.a(new ffix() { // from class: drvc
        @Override // defpackage.ffix
        public final Object invoke() {
            View childAt = drvg.this.d().getChildAt(0);
            childAt.getClass();
            return (RadioButton) childAt;
        }
    });
    public final ffbz b = ffca.a(new ffix() { // from class: drvd
        @Override // defpackage.ffix
        public final Object invoke() {
            View childAt = drvg.this.d().getChildAt(1);
            childAt.getClass();
            return (RadioButton) childAt;
        }
    });
    private final ffbz e = ffca.a(new ffix() { // from class: drve
        @Override // defpackage.ffix
        public final Object invoke() {
            return (Button) drvg.this.a.findViewById(R.id.gallery_google_photos_option_tray_neutral_button);
        }
    });
    private final ffbz f = ffca.a(new ffix() { // from class: drvf
        @Override // defpackage.ffix
        public final Object invoke() {
            return (Button) drvg.this.a.findViewById(R.id.gallery_google_photos_option_tray_positive_button);
        }
    });

    public drvg(View view) {
        this.a = view;
    }

    public final Button a() {
        Object a = this.e.a();
        a.getClass();
        return (Button) a;
    }

    public final Button b() {
        Object a = this.f.a();
        a.getClass();
        return (Button) a;
    }

    public final RadioButton c() {
        return (RadioButton) this.d.a();
    }

    public final RadioGroup d() {
        Object a = this.c.a();
        a.getClass();
        return (RadioGroup) a;
    }
}
