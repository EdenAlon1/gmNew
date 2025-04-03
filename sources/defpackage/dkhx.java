package defpackage;

import com.google.android.ims.rcsservice.contacts.CapabilitiesUpdateEvent;
import com.google.android.ims.rcsservice.contacts.ContactsServiceResult;
import com.google.android.ims.rcsservice.contacts.ImsCapabilities;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkhx {
    public djjr a;
    public dkie b;
    public final dkib c;
    private final dkrx e;
    private final dips f;
    private final ExecutorService g;
    private final ctvb i;
    private final djkd j;
    private final Map h = DesugarCollections.synchronizedMap(new HashMap());
    public final AtomicBoolean d = new AtomicBoolean(false);

    public dkhx(dkrx dkrxVar, dips dipsVar, ctvb ctvbVar, dkib dkibVar, ExecutorService executorService, djkd djkdVar) {
        this.e = dkrxVar;
        this.f = dipsVar;
        this.i = ctvbVar;
        this.c = dkibVar;
        this.g = executorService;
        this.j = djkdVar;
    }

    private static ImsCapabilities g() {
        ImsCapabilities imsCapabilities = new ImsCapabilities(dkht.a);
        imsCapabilities.e(true);
        imsCapabilities.c = true;
        return imsCapabilities;
    }

    public final ContactsServiceResult a(String str) {
        return b(str, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.ims.rcsservice.contacts.ContactsServiceResult b(java.lang.String r13, int r14) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkhx.b(java.lang.String, int):com.google.android.ims.rcsservice.contacts.ContactsServiceResult");
    }

    public final ImsCapabilities c(String str) {
        return djak.s() ? g() : (ImsCapabilities) this.c.c(str).orElseGet(new Supplier() { // from class: dkhu
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ImsCapabilities(dkhx.this.c.a);
            }
        });
    }

    public final void d(long j, String str, ImsCapabilities imsCapabilities) {
        this.h.remove(str);
        this.c.e(str, imsCapabilities);
        e(j, str, imsCapabilities);
    }

    public final void e(long j, String str, ImsCapabilities imsCapabilities) {
        if (!imsCapabilities.c) {
            ImsCapabilities c = c(str);
            imsCapabilities.s(c.u());
            imsCapabilities.i(c.C());
        }
        this.f.c(new CapabilitiesUpdateEvent(j, str, dkhz.b(imsCapabilities)), dkuj.CAPABILITIES_DISCOVERY);
    }

    public final void f() {
        this.d.set(false);
        this.h.clear();
    }
}
