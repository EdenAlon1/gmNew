package defpackage;

import android.os.Message;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class djyw implements dixy, djyg {
    @Override // defpackage.dixy
    public String a() {
        throw null;
    }

    @Override // defpackage.dixy
    @Deprecated
    public final boolean e(Message message) {
        return k(message, djta.MSG_USE_ANDROID_OS_MESSAGE);
    }

    public abstract boolean k(Message message, djta djtaVar);

    @Override // defpackage.djyg
    public final /* bridge */ /* synthetic */ boolean w(Object obj, Object obj2) {
        djta djtaVar = (djta) obj;
        djyy djyyVar = (djyy) obj2;
        Message obtain = Message.obtain();
        if (((Boolean) djyt.a.a()).booleanValue()) {
            obtain.what = djtaVar.a();
            if (djyyVar != null) {
                obtain.arg1 = ((Integer) Optional.ofNullable(djyyVar.a).orElse(0)).intValue();
                obtain.arg2 = ((Integer) Optional.ofNullable(djyyVar.b).orElse(0)).intValue();
                Object obj3 = djyyVar.c;
                if (obj3 != null) {
                    obtain.obj = obj3;
                }
            }
        }
        return k(obtain, djtaVar);
    }

    @Override // defpackage.dixy
    public final void d() {
    }
}
