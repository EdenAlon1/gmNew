package com.google.android.apps.messaging.samsung;

import defpackage.akmh;
import defpackage.ekhw;
import defpackage.ekkb;
import defpackage.ekyf;
import defpackage.ekzm;
import defpackage.ekzz;
import defpackage.elav;
import defpackage.elds;
import defpackage.eleg;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class BugleSamsung_Application extends akmh {
    @Override // defpackage.akmh, defpackage.akfb, defpackage.ser, defpackage.arbh, defpackage.ekka, android.app.Application
    public final void onCreate() {
        ekzz f;
        if (!e()) {
            super.onCreate();
            return;
        }
        elds c = elds.c();
        if (c.f()) {
            long b = ekkb.b();
            ekzm e = ((ekkb.a) ekhw.a(this, ekkb.a.class)).b().e(ekkb.a(b), b * 1000000);
            try {
                ekyf.r();
                f = eleg.f("Application.onCreate");
                try {
                    super.onCreate();
                    f.close();
                    e.close();
                    return;
                } finally {
                }
            } catch (Throwable th) {
                try {
                    e.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        elav a = c.a();
        try {
            f = eleg.f("Application creation");
            try {
                ekzz f2 = eleg.f("Application.onCreate");
                try {
                    super.onCreate();
                    f2.close();
                    f.close();
                    a.close();
                } finally {
                }
            } finally {
                try {
                    f.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
            }
        } catch (Throwable th4) {
            try {
                a.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }
}
