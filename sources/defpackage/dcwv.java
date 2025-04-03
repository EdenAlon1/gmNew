package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.constraint.ConstraintLayout;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.smartmessaging.expressivetext.impl.ExpressiveTextContext;
import com.google.android.libraries.smartmessaging.expressivetext.impl.opengl.GLTextureView;
import com.google.research.ink.libs.buttons.ColorSelectionButton;
import com.google.research.ink.libs.buttons.PenSelectionButton;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import java.util.HashMap;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcwv implements dcvu, eepx {
    public final dcwf a;
    public final dcvw b;
    public final eept c;
    public final eepy d;
    public final AccessibilityManager e;
    public final dcvs f;
    public final dbxg g;
    public HashMap h;
    public HashMap i;
    public HashMap j;
    public ColorSelectionButton k;
    public EditText l;
    public GLTextureView m;
    public dbti n;
    public dcvr o;
    public Transition v;
    private final dede w;
    public final aw q = new aw();
    public final aw r = new aw();
    public final aw s = new aw();
    public final aw t = new aw();
    public final aw u = new aw();
    public boolean p = false;

    public dcwv(Context context, dcwf dcwfVar, dcvw dcvwVar, eept eeptVar, eepy eepyVar, dcvs dcvsVar, dbxg dbxgVar, dede dedeVar) {
        this.e = (AccessibilityManager) context.getSystemService("accessibility");
        this.a = dcwfVar;
        this.b = dcvwVar;
        this.c = eeptVar;
        this.d = eepyVar;
        this.f = dcvsVar;
        this.w = dedeVar;
        this.g = dbxgVar;
    }

    @Override // defpackage.dcvu
    public final void a(Rect rect) {
        eeqb b = this.c.b();
        b.b.l = rect;
        ExpressiveTextContext expressiveTextContext = b.a;
        if (expressiveTextContext.p()) {
            expressiveTextContext.k(rect.left, rect.top, rect.width(), rect.height());
        }
    }

    @Override // defpackage.dcvu
    public final boolean b() {
        return this.d.i > 0;
    }

    public final ColorSelectionButton c(int i) {
        ColorSelectionButton colorSelectionButton = (ColorSelectionButton) this.j.get(Integer.valueOf(i));
        if (colorSelectionButton == null) {
            return null;
        }
        if (colorSelectionButton.isActivated()) {
            return colorSelectionButton;
        }
        Collection.EL.stream(this.j.values()).forEach(new Consumer() { // from class: dcwl
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ColorSelectionButton colorSelectionButton2 = (ColorSelectionButton) obj;
                colorSelectionButton2.a(false);
                colorSelectionButton2.setActivated(false);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        colorSelectionButton.a(true);
        colorSelectionButton.setActivated(true);
        return colorSelectionButton;
    }

    @Override // defpackage.eepx
    public final void d(eepy eepyVar) {
        Collection.EL.stream(this.i.values()).forEach(new Consumer() { // from class: dcwg
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((PenSelectionButton) obj).setActivated(false);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        PenSelectionButton penSelectionButton = (PenSelectionButton) this.i.get(eepyVar.f);
        ColorSelectionButton c = c(eepyVar.g);
        String str = c == null ? "" : c.c;
        if (penSelectionButton != null) {
            penSelectionButton.setActivated(true);
            int i = eepyVar.g;
            if (penSelectionButton.f != 0) {
                Drawable drawable = penSelectionButton.c;
                if (drawable != null) {
                    if (i != penSelectionButton.d) {
                        drawable = penSelectionButton.e;
                    }
                    penSelectionButton.setImageDrawable(drawable);
                }
                int i2 = penSelectionButton.g;
                int i3 = penSelectionButton.f;
                if (i2 == i3) {
                    throw new IllegalArgumentException("constantColor cannot be changedColor.");
                }
                float red = Color.red(i);
                float green = Color.green(i);
                float blue = Color.blue(i);
                int red2 = Color.red(i2);
                float f = red2;
                int green2 = Color.green(i2);
                int blue2 = Color.blue(i2);
                int red3 = Color.red(i3) - red2;
                float f2 = green2;
                int green3 = Color.green(i3) - green2;
                float f3 = blue2;
                float f4 = (red - f) / red3;
                float f5 = (green - f2) / green3;
                float blue3 = (blue - f3) / (Color.blue(i3) - blue2);
                penSelectionButton.a = new ColorMatrixColorFilter(new ColorMatrix(new float[]{f4, 0.0f, 0.0f, 0.0f, f * (1.0f - f4), 0.0f, f5, 0.0f, 0.0f, f2 * (1.0f - f5), 0.0f, 0.0f, blue3, 0.0f, f3 * (1.0f - blue3), 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
                penSelectionButton.setColorFilter(penSelectionButton.isActivated() ? penSelectionButton.a : null);
                penSelectionButton.b = str;
                penSelectionButton.a();
            }
        }
    }

    @Override // defpackage.eepx
    public final void e(eepy eepyVar) {
        ColorSelectionButton colorSelectionButton;
        ellj.f(new dcww(), this.a);
        eepw eepwVar = eepyVar.e;
        if (c(eepwVar == eepw.b ? this.d.g : this.d.h) == null && (colorSelectionButton = this.k) != null) {
            colorSelectionButton.callOnClick();
        }
        f(eepwVar == eepw.c, this.d.m);
        i(eepyVar);
    }

    public final void f(boolean z, String str) {
        if (!z) {
            this.w.i(this.a.z(), this.l);
            return;
        }
        this.l.setText(str);
        this.l.requestFocus();
        this.l.setSelection(str.length());
        this.w.k(this.a.z(), this.l);
    }

    public final void g() {
        ehft ehftVar = new ehft(this.a.G());
        ehftVar.m(R.string.confirm_close_message);
        ehftVar.u(this.a.G().getString(R.string.discard), new DialogInterface.OnClickListener() { // from class: dcwj
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ellj.f(new dcvv(true), dcwv.this.a);
            }
        });
        ehftVar.p(this.a.G().getString(R.string.keep), new DialogInterface.OnClickListener() { // from class: dcwk
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                View view = dcwv.this.a.Q;
                view.getClass();
                view.setSystemUiVisibility(1);
            }
        });
        ehftVar.a();
    }

    public final void h() {
        int a;
        int i = 0;
        if (this.w.b && (a = this.w.a()) > 0) {
            i = a;
        }
        this.q.p(i);
        this.r.p(i);
        this.s.p(i);
        this.t.p(i);
        this.u.p(i);
        i(this.d);
    }

    public final void i(eepy eepyVar) {
        int i;
        boolean z;
        View view = this.a.Q;
        view.getClass();
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.media_editor_toolbars);
        eepw eepwVar = eepyVar.e;
        int i2 = eepyVar.q;
        if (eepwVar == eepw.a && i2 == 1) {
            z = false;
            i = 1;
        } else {
            i = i2;
            z = true;
        }
        ellj.f(new dcwe(z), this.a);
        aw awVar = new aw();
        int ordinal = eepwVar.ordinal();
        if (ordinal == 0) {
            awVar = i == 1 ? this.q : this.r;
        } else if (ordinal == 1) {
            awVar = i == 1 ? this.t : this.u;
        } else if (ordinal == 2) {
            awVar = this.s;
        }
        TransitionManager.beginDelayedTransition(constraintLayout, this.v);
        awVar.b(constraintLayout);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean j(View view, MotionEvent motionEvent) {
        dcvr dcvrVar;
        if (this.c.a().onTouch(view, motionEvent)) {
            if (this.d.e == eepw.a && (dcvrVar = this.o) != null) {
                switch (motionEvent.getActionMasked()) {
                    case 0:
                    case 9:
                        dcvrVar.d();
                        break;
                    case 1:
                    case 10:
                        dcvrVar.c(true, motionEvent.getX(), motionEvent.getY());
                        break;
                    case 2:
                    case 7:
                        if (motionEvent.getPointerCount() == 1) {
                            float x = motionEvent.getX();
                            float y = motionEvent.getY();
                            if (dcvrVar.b.f().toEpochMilli() >= dcvrVar.f) {
                                dcvrVar.h = dcvrVar.i;
                                if (dcvrVar.e(x, y)) {
                                    dcvrVar.i = R.fraction.large_progress;
                                } else {
                                    dcvrVar.i = R.fraction.regular_progress;
                                    dcvrVar.b();
                                }
                                dcvrVar.a();
                                break;
                            }
                        }
                        break;
                    case 3:
                        dcvrVar.c(false, motionEvent.getX(), motionEvent.getY());
                        break;
                    case 5:
                        if (motionEvent.getPointerCount() > 1 && dcvrVar.i != R.fraction.invisible_progress) {
                            dcvrVar.c(false, motionEvent.getX(), motionEvent.getY());
                            break;
                        }
                        break;
                    case 6:
                        if (motionEvent.getPointerCount() == 2 && dcvrVar.i == R.fraction.invisible_progress) {
                            dcvrVar.d();
                            break;
                        }
                        break;
                }
            }
        } else if (!b()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.cxra
    public final boolean q() {
        throw null;
    }
}
