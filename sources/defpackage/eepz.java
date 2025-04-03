package defpackage;

import android.view.MotionEvent;
import com.google.android.libraries.smartmessaging.expressivetext.impl.ExpressiveTextContext;

/* compiled from: PG */
/* loaded from: classes5.dex */
final /* synthetic */ class eepz extends ffkh implements ffjm {
    public eepz(Object obj) {
        super(2, obj, ExpressiveTextContext.class, "onTouchUpdate", "onTouchUpdate(Landroid/view/MotionEvent;I)Z", 0);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        MotionEvent motionEvent = (MotionEvent) obj;
        int intValue = ((Number) obj2).intValue();
        motionEvent.getClass();
        return Boolean.valueOf(((ExpressiveTextContext) this.g).s(motionEvent, intValue));
    }
}
