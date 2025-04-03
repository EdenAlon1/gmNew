package defpackage;

import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ilm extends ffkk implements ffji {
    final /* synthetic */ kbs a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ilm(kbs kbsVar) {
        super(1);
        this.a = kbsVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean dispatchTouchEvent;
        MotionEvent motionEvent = (MotionEvent) obj;
        switch (motionEvent.getActionMasked()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                dispatchTouchEvent = this.a.dispatchTouchEvent(motionEvent);
                break;
            default:
                dispatchTouchEvent = this.a.dispatchGenericMotionEvent(motionEvent);
                break;
        }
        return Boolean.valueOf(dispatchTouchEvent);
    }
}
