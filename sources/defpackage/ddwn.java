package defpackage;

import android.content.Context;
import android.os.Looper;
import android.widget.Toast;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddwn {
    private static final enru a = enru.c("com/google/android/apps/messaging/ui/toastpresenter/ToastPresenter");
    private final Context b;
    private final ffbr c;

    public ddwn(Context context, ffbr ffbrVar) {
        context.getClass();
        this.b = context;
        this.c = ffbrVar;
    }

    public final Toast a(int i, boolean z) {
        String string = this.b.getString(i);
        string.getClass();
        return b(string, z);
    }

    public final Toast b(CharSequence charSequence, boolean z) {
        charSequence.getClass();
        enru enruVar = a;
        ((enrr) enruVar.h().h("com/google/android/apps/messaging/ui/toastpresenter/ToastPresenter", "showToastAtBottom", 34, "ToastPresenter.kt")).t("Showing toast with message: %s", z ? cskt.b(charSequence) : charSequence);
        final Toast makeText = Toast.makeText(this.b, charSequence, 1);
        makeText.setGravity(81, 0, 0);
        makeText.getClass();
        Optional optional = (Optional) this.c.b();
        final ffji ffjiVar = new ffji() { // from class: ddwl
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                return Boolean.valueOf(((akes) obj).c());
            }
        };
        Object orElse = optional.map(new Function() { // from class: ddwm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ffji.this.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(false);
        orElse.getClass();
        if (((Boolean) orElse).booleanValue()) {
            ((enrr) enruVar.h().h("com/google/android/apps/messaging/ui/toastpresenter/ToastPresenter", "showToastInternal", 45, "ToastPresenter.kt")).q("Suppressing toast for Retail Mode device");
            return makeText;
        }
        Runnable runnable = new Runnable() { // from class: ddwk
            @Override // java.lang.Runnable
            public final void run() {
                makeText.show();
            }
        };
        if (ffkj.e(Looper.myLooper(), Looper.getMainLooper())) {
            runnable.run();
            return makeText;
        }
        efbd.e(runnable);
        return makeText;
    }
}
