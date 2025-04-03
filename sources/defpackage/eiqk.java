package defpackage;

import android.util.Log;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.R;
import com.google.android.setupcompat.internal.TemplateLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiqk implements eiph {
    public final TemplateLayout a;
    boolean b = false;
    public int c = 0;

    public eiqk(TemplateLayout templateLayout) {
        this.a = templateLayout;
    }

    private final Button c() {
        Button button = (Button) this.a.g(R.id.sud_floating_back_button);
        if (button == null) {
            Log.w("FloatingBackButtonMixin", "Can't find the back button.");
        }
        return button;
    }

    public final Button a() {
        Button c = c();
        if (c != null) {
            return c;
        }
        if (!this.b) {
            this.b = true;
            ViewStub viewStub = (ViewStub) this.a.g(R.id.sud_floating_back_button_stub);
            if (viewStub != null) {
                try {
                    viewStub.setLayoutInflater(LayoutInflater.from(this.a.getContext()));
                    viewStub.inflate();
                } catch (InflateException e) {
                    Log.w("FloatingBackButtonMixin", "Incorrect theme:".concat(String.valueOf(e.toString())));
                    return null;
                }
            }
        }
        return c();
    }

    public final FrameLayout b() {
        return (FrameLayout) this.a.g(R.id.sud_layout_floating_back_button_container);
    }
}
