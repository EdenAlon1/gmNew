package defpackage;

import android.graphics.Color;
import android.graphics.Rect;
import android.view.View;
import android.widget.Button;
import com.google.android.apps.common.proguard.UsedByNative;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.smartmessaging.expressivetext.impl.ExpressiveTextCallbackReceiver;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eepy implements ExpressiveTextCallbackReceiver {
    public static final eepw a = eepw.a;
    public static final eepv b = eepv.a;
    public static final int c = -1;
    public static final int d = -1;
    public static final int p = 1;
    public int i;
    public int j;
    public Float k;
    public Rect l;
    public long n;
    public eepx o;
    public eepw e = a;
    public eepv f = b;
    public int g = -1;
    public int q = 1;
    public int h = -1;
    public String m = "";

    private static final int h(float f) {
        return Math.min(Math.max((int) (f * 255.0f), 0), PrivateKeyType.INVALID);
    }

    public final void a(int i) {
        if (this.g == i) {
            return;
        }
        this.g = i;
        eepx eepxVar = this.o;
        if (eepxVar != null) {
            eepxVar.d(this);
        }
    }

    public final void b(eepv eepvVar) {
        eepvVar.getClass();
        if (this.f == eepvVar) {
            return;
        }
        this.f = eepvVar;
        eepx eepxVar = this.o;
        if (eepxVar != null) {
            eepxVar.d(this);
        }
    }

    public final void c(int i) {
        dcwv dcwvVar;
        boolean b2;
        if (this.i != i && i >= 0) {
            this.i = i;
            eepx eepxVar = this.o;
            if (eepxVar == null || dcwvVar.p == (b2 = (dcwvVar = (dcwv) eepxVar).b())) {
                return;
            }
            dcwvVar.p = b2;
            ellj.f(new dcwd(), dcwvVar.a);
        }
    }

    public final void d(eepw eepwVar) {
        eepwVar.getClass();
        if (this.e == eepwVar) {
            return;
        }
        this.e = eepwVar;
        eepx eepxVar = this.o;
        if (eepxVar != null) {
            eepxVar.e(this);
        }
    }

    public final void e(int i) {
        if (this.j != i && i >= 0) {
            this.j = i;
            eepx eepxVar = this.o;
            if (eepxVar != null) {
                dcwv dcwvVar = (dcwv) eepxVar;
                View view = dcwvVar.a.Q;
                view.getClass();
                Button button = (Button) view.findViewById(R.id.cancel_or_undo_button);
                eepy eepyVar = dcwvVar.d;
                if (eepyVar.e != eepw.b || eepyVar.j <= 0) {
                    button.setText(android.R.string.cancel);
                } else {
                    button.setText(R.string.undo);
                }
            }
        }
    }

    public final void f(int i) {
        if (this.h == i) {
            return;
        }
        this.h = i;
        eepx eepxVar = this.o;
        if (eepxVar != null) {
            dcwv dcwvVar = (dcwv) eepxVar;
            dcwvVar.l.setTextColor(i);
            dcwvVar.c(i);
        }
    }

    public final void g(int i) {
        if (this.q == i) {
            return;
        }
        this.q = i;
        eepx eepxVar = this.o;
        if (eepxVar != null) {
            ((dcwv) eepxVar).i(this);
        }
    }

    @Override // com.google.android.libraries.smartmessaging.expressivetext.impl.ExpressiveTextCallbackReceiver
    @UsedByNative
    public void onElementCountChanged(int i) {
        c(i);
    }

    @Override // com.google.android.libraries.smartmessaging.expressivetext.impl.ExpressiveTextCallbackReceiver
    @UsedByNative
    public void onStrokeElementCountChanged(int i) {
        e(i);
    }

    @Override // com.google.android.libraries.smartmessaging.expressivetext.impl.ExpressiveTextCallbackReceiver
    @UsedByNative
    public void onStrokeEnd() {
        g(1);
    }

    @Override // com.google.android.libraries.smartmessaging.expressivetext.impl.ExpressiveTextCallbackReceiver
    @UsedByNative
    public void onStrokeStart() {
        g(3);
    }

    @Override // com.google.android.libraries.smartmessaging.expressivetext.impl.ExpressiveTextCallbackReceiver
    @UsedByNative
    public void onTextElementTapped() {
        eepx eepxVar = this.o;
        if (eepxVar != null) {
            ((dcwv) eepxVar).c.b().b(eepw.c);
        }
    }

    @Override // com.google.android.libraries.smartmessaging.expressivetext.impl.ExpressiveTextCallbackReceiver
    @UsedByNative
    public void onTransformEnd(float f, float f2) {
        g(1);
    }

    @Override // com.google.android.libraries.smartmessaging.expressivetext.impl.ExpressiveTextCallbackReceiver
    @UsedByNative
    public void onTransformStart(float f, float f2) {
        g(2);
    }

    @Override // com.google.android.libraries.smartmessaging.expressivetext.impl.ExpressiveTextCallbackReceiver
    @UsedByNative
    public void onTransformUpdate(float f, float f2) {
        g(2);
    }

    @Override // com.google.android.libraries.smartmessaging.expressivetext.impl.ExpressiveTextCallbackReceiver
    @UsedByNative
    public void showTextEditingInterface(long j, String str, float f, float f2, float f3, float f4) {
        str.getClass();
        this.n = j;
        this.m = str;
        f(Color.argb(h(f4), h(f), h(f2), h(f3)));
        d(eepw.c);
    }
}
