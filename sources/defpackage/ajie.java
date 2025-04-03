package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.ims.util.common.RcsIntents;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajie extends cniz {
    private static final cskc b = cskc.g("Bugle", "PopupListener");
    boolean a = false;
    private final elbx c;
    private final ajid d;

    public ajie(elbx elbxVar, ajid ajidVar) {
        this.c = elbxVar;
        this.d = ajidVar;
    }

    @Override // defpackage.cniz
    public final ekzm a() {
        return this.c.b("PopupListener Receive broadcast");
    }

    @Override // defpackage.cniz
    public final String b() {
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.cniz
    public final void c(Context context, Intent intent) {
        char c;
        csjb c2 = b.c();
        c2.I("Received request");
        c2.I(intent.getAction());
        c2.r();
        String action = intent.getAction();
        switch (action.hashCode()) {
            case -1567985380:
                if (action.equals(RcsIntents.ACTION_NOTIFY_RECEIVED_CARRIER_TOS_REQUEST)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -482560605:
                if (action.equals(RcsIntents.ACTION_NOTIFY_RECEIVED_GOOGLE_TOS_REQUEST)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -61934465:
                if (action.equals(RcsIntents.ACTION_NOTIFY_RECEIVED_LEGAL_FYI_REQUEST)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 250542075:
                if (action.equals(RcsIntents.ACTION_NOTIFY_RECEIVED_RCS_SUCCESS_REQUEST)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 406935855:
                if (action.equals(RcsIntents.ACTION_NOTIFY_RECEIVED_RCS_PROMO_REQUEST)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 615574789:
                if (action.equals(RcsIntents.ACTION_NOTIFY_RECEIVED_PROVISIONING_WELCOME_MESSAGE)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            this.d.e(2);
            return;
        }
        if (c == 1) {
            this.d.e(7);
            return;
        }
        if (c == 2) {
            this.d.e(15);
            return;
        }
        if (c == 3) {
            this.d.e(3);
        } else if (c == 4) {
            this.d.e(4);
        } else {
            if (c != 5) {
                throw new AssertionError("unexpected intent: ".concat(String.valueOf(String.valueOf(intent))));
            }
            this.d.e(5);
        }
    }

    @Override // defpackage.cniz
    protected final int e() {
        return 18;
    }

    public final synchronized void f(Context context) {
        if (this.a) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter(RcsIntents.ACTION_NOTIFY_RECEIVED_PROVISIONING_WELCOME_MESSAGE);
        intentFilter.addAction(RcsIntents.ACTION_NOTIFY_RECEIVED_RCS_PROMO_REQUEST);
        intentFilter.addAction(RcsIntents.ACTION_NOTIFY_RECEIVED_RCS_SUCCESS_REQUEST);
        intentFilter.addAction(RcsIntents.ACTION_NOTIFY_RECEIVED_GOOGLE_TOS_REQUEST);
        intentFilter.addAction(RcsIntents.ACTION_NOTIFY_RECEIVED_LEGAL_FYI_REQUEST);
        intentFilter.addAction(RcsIntents.ACTION_NOTIFY_RECEIVED_CARRIER_TOS_REQUEST);
        intentFilter.countActions();
        koa.g(context, this, intentFilter);
        this.a = true;
    }

    public final synchronized void g(Context context) {
        if (this.a) {
            context.unregisterReceiver(this);
            this.a = false;
        }
    }
}
