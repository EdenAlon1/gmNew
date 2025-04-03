package defpackage;

import com.google.android.libraries.compose.ui.keyboard.detector.KeyboardDetectorViewInsetsListener;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsnp extends fflr {
    final /* synthetic */ KeyboardDetectorViewInsetsListener a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsnp(Object obj, KeyboardDetectorViewInsetsListener keyboardDetectorViewInsetsListener) {
        super(obj);
        this.a = keyboardDetectorViewInsetsListener;
    }

    @Override // defpackage.fflr
    protected final void a(ffmx ffmxVar, Object obj, Object obj2) {
        dsnn dsnnVar = (dsnn) obj2;
        dsnn dsnnVar2 = (dsnn) obj;
        if (dsnnVar2 instanceof dsnl) {
            ((dsnl) dsnnVar2).a.P().d(this.a);
        }
        if (!(dsnnVar instanceof dsnl)) {
            this.a.b.setOnApplyWindowInsetsListener(null);
            this.a.b.setWindowInsetsAnimationCallback(null);
            KeyboardDetectorViewInsetsListener keyboardDetectorViewInsetsListener = this.a;
            keyboardDetectorViewInsetsListener.b.a.remove(keyboardDetectorViewInsetsListener);
            return;
        }
        ((dsnl) dsnnVar).a.P().c(this.a);
        KeyboardDetectorViewInsetsListener keyboardDetectorViewInsetsListener2 = this.a;
        keyboardDetectorViewInsetsListener2.b.setOnApplyWindowInsetsListener(keyboardDetectorViewInsetsListener2);
        KeyboardDetectorViewInsetsListener keyboardDetectorViewInsetsListener3 = this.a;
        keyboardDetectorViewInsetsListener3.b.setWindowInsetsAnimationCallback(keyboardDetectorViewInsetsListener3);
        KeyboardDetectorViewInsetsListener keyboardDetectorViewInsetsListener4 = this.a;
        keyboardDetectorViewInsetsListener4.b.a.add(keyboardDetectorViewInsetsListener4);
        this.a.b.requestApplyInsets();
    }

    @Override // defpackage.fflr
    protected final boolean b(Object obj, Object obj2) {
        return !ffkj.e(obj, obj2);
    }
}
