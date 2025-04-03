package defpackage;

import android.app.Activity;
import com.google.android.apps.messaging.otp.deletion.save.SaveOtpCallbackInput;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aiva implements ejlr<SaveOtpCallbackInput, Void> {
    public vk a;
    public Activity b;
    public bcse c;
    public ute d;

    private final void d() {
        this.a.getClass();
        this.d.getClass();
        this.b.getClass();
        this.c.getClass();
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        SaveOtpCallbackInput saveOtpCallbackInput = (SaveOtpCallbackInput) obj;
        d();
        try {
            int F = this.d.a.aB.c.F(bdhb.b(saveOtpCallbackInput.a()));
            if (this.c.u().equals(bdhb.b(saveOtpCallbackInput.a()))) {
                this.c.bi();
            } else {
                csjy.f("Bugle", "SaveOtpCallback#onSuccess: race condition: our ConversationMessageData was for the wrong message");
            }
            this.a.r(F, new afah());
        } catch (RuntimeException e) {
            throw new IllegalArgumentException("Supplied callable should not throw", e);
        }
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
        d();
        csjy.p("Bugle", th, "Unable to save OTP message");
    }

    @Override // defpackage.ejlr
    public final /* synthetic */ void b(Object obj) {
    }
}
