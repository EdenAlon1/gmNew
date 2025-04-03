package defpackage;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.smartmessaging.expressivetext.impl.ExpressiveTextContext;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeqa implements View.OnTouchListener {
    private final ExpressiveTextContext a;

    public eeqa(ExpressiveTextContext expressiveTextContext) {
        this.a = expressiveTextContext;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        view.getClass();
        motionEvent.getClass();
        if (this.a.p()) {
            switch (motionEvent.getActionMasked()) {
                case 0:
                case 9:
                    this.a.n();
                    return this.a.r(motionEvent, motionEvent.getPointerCount() - 1);
                case 1:
                case 10:
                    return this.a.q(motionEvent, motionEvent.getPointerCount() - 1);
                case 2:
                case 7:
                    int historySize = motionEvent.getHistorySize();
                    boolean z = false;
                    for (int i = 0; i < historySize; i++) {
                        int pointerCount = motionEvent.getPointerCount();
                        for (int i2 = 0; i2 < pointerCount; i2++) {
                            z |= this.a.t(motionEvent, i2, i);
                        }
                    }
                    eepz eepzVar = new eepz(this.a);
                    int pointerCount2 = motionEvent.getPointerCount();
                    boolean z2 = false;
                    for (int i3 = 0; i3 < pointerCount2; i3++) {
                        z2 |= ((Boolean) eepzVar.a(motionEvent, Integer.valueOf(i3))).booleanValue();
                    }
                    return z | z2;
                case 3:
                    return this.a.n();
                case 5:
                    return this.a.r(motionEvent, motionEvent.getActionIndex());
                case 6:
                    return this.a.q(motionEvent, motionEvent.getActionIndex());
            }
        }
        return false;
    }
}
