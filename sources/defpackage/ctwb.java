package defpackage;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class ctwb {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/util/phone/SubscriptionMetadataUtils");
    public final Lock b = new ReentrantLock();
    public final SparseArray c = new SparseArray();
    protected final Context d;
    protected final ffbr e;
    protected final emyl f;
    protected final ffbr g;
    protected final ffbr h;
    protected volatile ffbr i;

    public ctwb(final Context context, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        this.d = context;
        this.e = ffbrVar;
        this.g = ffbrVar3;
        this.h = ffbrVar4;
        this.f = emys.a(new emyl() { // from class: ctvy
            @Override // defpackage.emyl
            public final Object get() {
                Object systemService = context.getSystemService("phone");
                systemService.getClass();
                return (TelephonyManager) systemService;
            }
        });
        this.i = ffbrVar2;
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public final ctvb g() {
        return (ctvb) this.h.b();
    }

    public ctwi h(int i) {
        throw null;
    }

    public final ctwi i() {
        return h(b());
    }

    public final ctwi j() {
        return h(c());
    }

    public final ctwi k() {
        return h(f());
    }

    public abstract Optional l(azop azopVar);

    public abstract List m();

    public abstract void n();

    public final void o(ctwa ctwaVar) {
        Iterator it = m().iterator();
        while (it.hasNext() && ctwaVar.a(((ctwi) it.next()).a())) {
        }
    }

    public final boolean p(int i) {
        if (((ctvz) this.e.b()).a() && e() >= 2) {
            int b = b();
            if (i != -1 && i != b) {
                ensk h = a.h();
                h.Y(ente.a, "Bugle");
                ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/util/phone/SubscriptionMetadataUtils", "canSendOrReceiveMms", 304, "SubscriptionMetadataUtils.java")).q("SubscriptionMetadataUtils canSendOrReceiveMms: returning false");
                return false;
            }
        }
        ensk h2 = a.h();
        h2.Y(ente.a, "Bugle");
        ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/util/phone/SubscriptionMetadataUtils", "canSendOrReceiveMms", 309, "SubscriptionMetadataUtils.java")).q("SubscriptionMetadataUtils canSendOrReceiveMms: returning true by default");
        return true;
    }

    public abstract boolean q();

    public abstract boolean r();

    public abstract boolean s(azop azopVar);

    public abstract boolean t();

    public abstract void u(int i, String str, int i2, String str2, String str3, aoku aokuVar, int i3, Optional optional);
}
