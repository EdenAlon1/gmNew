package defpackage;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.apps.messaging.ui.conversation.LaunchConversationShimActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class cxwm extends Activity implements fbat {
    private volatile fazw a;
    private final Object b = new Object();
    private boolean c = false;

    @Override // defpackage.fbat
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fazw aW() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = new fazw(this);
                }
            }
        }
        return this.a;
    }

    @Override // defpackage.fbas
    public final Object aX() {
        return aW().aX();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        if (!this.c) {
            this.c = true;
            LaunchConversationShimActivity launchConversationShimActivity = (LaunchConversationShimActivity) this;
            akgb akgbVar = (akgb) aX();
            launchConversationShimActivity.a = (ayfg) akgbVar.b.a.nW.b();
            launchConversationShimActivity.b = akgbVar.c.aw;
        }
        super.onCreate(bundle);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        return aW().b.aX();
    }
}
