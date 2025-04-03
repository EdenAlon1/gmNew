package defpackage;

import android.app.Activity;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.label.ui.recategorize.ChangeCategoryCallbackInput;
import com.google.android.material.snackbar.Snackbar;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahju implements ejlr<ChangeCategoryCallbackInput, Void> {
    public vk a;
    public Activity b;
    public bcse c;
    public uts d;

    private final void d() {
        this.a.getClass();
        this.d.getClass();
        this.b.getClass();
        this.c.getClass();
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        ChangeCategoryCallbackInput changeCategoryCallbackInput = (ChangeCategoryCallbackInput) obj;
        d();
        try {
            int F = this.d.a.aB.c.F(bdhb.b(changeCategoryCallbackInput.b()));
            if (this.c.u().equals(bdhb.b(changeCategoryCallbackInput.b()))) {
                this.c.t = changeCategoryCallbackInput.a();
            } else {
                csjy.f("Bugle", "ChangeCategoryCallback#onSuccess: race condition: our ConversationMessageData was for the wrong message");
            }
            if (F == -1) {
                csjy.o("Bugle", "Trying to update category for messageId %s with fragment not in view.", changeCategoryCallbackInput.b());
            } else {
                this.a.r(F, changeCategoryCallbackInput.a());
            }
            Activity activity = this.b;
            Snackbar.r(this.b.getWindow().getDecorView().getRootView(), activity.getString(R.string.change_category_snackbar_message, new Object[]{activity.getString(ahkt.a(changeCategoryCallbackInput.a()))}), 0).i();
        } catch (RuntimeException e) {
            throw new IllegalArgumentException("Supplied callable should not throw", e);
        }
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
        d();
        csjy.p("Bugle", th, "Unable to recategorize message");
    }

    @Override // defpackage.ejlr
    public final /* synthetic */ void b(Object obj) {
    }
}
