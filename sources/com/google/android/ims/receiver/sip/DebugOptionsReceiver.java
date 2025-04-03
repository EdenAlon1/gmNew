package com.google.android.ims.receiver.sip;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.ims.util.common.RcsIntents;
import defpackage.csix;
import defpackage.dilc;
import defpackage.dket;
import defpackage.dkpc;
import defpackage.dkqd;
import defpackage.dkrx;
import defpackage.dkty;
import defpackage.koa;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class DebugOptionsReceiver extends dkpc<Void> {
    private static boolean a = false;
    private static final DebugOptionsReceiver b = new DebugOptionsReceiver();
    private static dket c;
    private static dkrx d;

    public static synchronized void a(Context context, dket dketVar, dkrx dkrxVar) {
        synchronized (DebugOptionsReceiver.class) {
            if (a) {
                return;
            }
            koa.g(context, b, new IntentFilter(RcsIntents.ACTION_DEBUG_OPTION_INCREASE_SESSION_ID));
            c = dketVar;
            d = dkrxVar;
            a = true;
        }
    }

    public static synchronized void b(Context context) {
        synchronized (DebugOptionsReceiver.class) {
            if (a) {
                context.unregisterReceiver(b);
                c = null;
                d = null;
                a = false;
            }
        }
    }

    @Override // defpackage.dkpc
    protected final /* bridge */ /* synthetic */ void c(Context context, Intent intent) {
        char c2;
        csix.l(intent);
        String action = intent.getAction();
        if (action == null) {
            dkty.q("Null action. Ignoring debug option intent.", new Object[0]);
            return;
        }
        dkty.c("Processing debug action %s", action);
        int hashCode = action.hashCode();
        if (hashCode == -1534316517) {
            if (action.equals(RcsIntents.ACTION_DEBUG_OPTION_FORCE_CLIENT_TO_UNREGISTER)) {
                c2 = 2;
            }
            c2 = 65535;
        } else if (hashCode != -1263275559) {
            if (hashCode == 976675763 && action.equals(RcsIntents.ACTION_DEBUG_OPTION_SEND_ERROR_RESULT_FROM_ENGINE)) {
                c2 = 1;
            }
            c2 = 65535;
        } else {
            if (action.equals(RcsIntents.ACTION_DEBUG_OPTION_INCREASE_SESSION_ID)) {
                c2 = 0;
            }
            c2 = 65535;
        }
        if (c2 == 0) {
            long longExtra = intent.getLongExtra(RcsIntents.EXTRA_DELTA, 50000L);
            dkrx dkrxVar = d;
            if (dkrxVar != null) {
                dkty.c("Increasing session ID by %d", Long.valueOf(longExtra));
                dkrxVar.k(longExtra);
                return;
            }
            return;
        }
        if (c2 == 1) {
            boolean booleanExtra = intent.getBooleanExtra(RcsIntents.EXTRA_SEND_ERROR_RESULT_FROM_ENGINE, false);
            dkrx dkrxVar2 = d;
            if (dkrxVar2 != null) {
                dkrxVar2.p(booleanExtra);
                return;
            }
            return;
        }
        if (c2 != 2) {
            dkty.k("Unknown debug action: %s", action);
            return;
        }
        dket dketVar = c;
        if (dketVar != null) {
            dketVar.stop(dilc.DEBUG_OPTIONS_FORCED_UNREGISTER);
        }
    }

    @Override // defpackage.dkpc
    public final boolean e(Context context, Intent intent) {
        synchronized (DebugOptionsReceiver.class) {
            dkty.c("Received debug action %s", intent.getAction());
            if (dkqd.e(context, intent)) {
                return true;
            }
            dkty.q("Caller not trusted, dropping Debug Options intent: %s", intent);
            return false;
        }
    }
}
