package defpackage;

import com.google.android.ims.rcsservice.contacts.ContactsServiceResult;
import com.google.android.ims.rcsservice.contacts.ImsCapabilities;
import com.google.android.rcs.client.contacts.ContactsService;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avqv implements cnjy, avrk, avtc {
    public static final cskc a = cskc.g("BugleRcsCapabilities", "DualRegistrationNetworkCapabilitiesProvider");
    public static final entd b = entd.c("BugleRcsCapabilities");
    public final ContactsService c;
    public final ffbr d;
    public final cqoh e;
    public final Map f = new HashMap();
    public final Object g = new Object();
    private final errl h;
    private final errl i;
    private final azei j;

    public avqv(errl errlVar, errl errlVar2, ContactsService contactsService, azei azeiVar, ffbr ffbrVar, cqoh cqohVar) {
        this.c = contactsService;
        this.j = azeiVar;
        this.d = ffbrVar;
        this.h = errlVar2;
        this.i = errlVar;
        this.e = cqohVar;
    }

    @Override // defpackage.avrk
    public final elfl a(Iterable iterable) {
        return elfo.d(new IllegalStateException("getBatchCapabilities not supported for DualReg."));
    }

    @Override // defpackage.avrk
    public final elfl b(awui awuiVar) {
        ((ensz) b.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/DualRegistrationNetworkCapabilitiesProvider", "getCapabilities", 96, "DualRegistrationNetworkCapabilitiesProvider.java")).t("DualRegistrationNetworkCapabilitiesProvider: start getCapabilities with chatEndpoint %s", cskt.b(awuiVar.d));
        if ((awuiVar.b & 2) == 0) {
            return elfo.d(new avlo("[Dual Registration] Getting capabilities failed since remote user id is null"));
        }
        final String str = awuiVar.d;
        return elfl.g(kfg.a(new kfd() { // from class: avqn
            @Override // defpackage.kfd
            public final Object a(kfb kfbVar) {
                ensz enszVar = (ensz) avqv.b.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/DualRegistrationNetworkCapabilitiesProvider", "getCapabilities", 110, "DualRegistrationNetworkCapabilitiesProvider.java");
                String str2 = str;
                enszVar.t("DualRegistrationNetworkCapabilitiesProvider: start forceRefresh for remoteUserId %s", cskt.b(str2));
                avqv.this.e(str2, kfbVar, true);
                return "DualRegistrationNetworkCapabilitiesProvider.getCapabilities";
            }
        })).h(new emwl() { // from class: avqo
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ImsCapabilities imsCapabilities = (ImsCapabilities) obj;
                ((ensz) avqv.b.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/DualRegistrationNetworkCapabilitiesProvider", "getCapabilities", 121, "DualRegistrationNetworkCapabilitiesProvider.java")).t("DualRegistrationNetworkCapabilitiesProvider: forceRefresh return imsCapabilities.getSupportedServiceIdList %s", imsCapabilities.i);
                int i = avmz.b;
                avml avmlVar = new avml();
                avmlVar.c(avor.a(imsCapabilities.i));
                avmlVar.b(avqv.this.e.f());
                return avmlVar.a();
            }
        }, this.h);
    }

    @Override // defpackage.avtc
    public final elfl c(final awui awuiVar) {
        if ((awuiVar.b & 2) == 0) {
            return elfo.d(new avta());
        }
        final String str = awuiVar.d;
        return elfl.g(kfg.a(new kfd() { // from class: avql
            @Override // defpackage.kfd
            public final Object a(kfb kfbVar) {
                avqv.this.e(str, kfbVar, false);
                return "DualRegistrationNetworkCapabilitiesProvider.getOnlineStatus";
            }
        })).i(new eroh() { // from class: avqm
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                ImsCapabilities imsCapabilities = (ImsCapabilities) obj;
                boolean z = imsCapabilities.c;
                avqv avqvVar = avqv.this;
                awui awuiVar2 = awuiVar;
                if (z) {
                    return avqvVar.d(awuiVar2, imsCapabilities).h(new emwl() { // from class: avqp
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            cskc cskcVar = avqv.a;
                            return avtb.ONLINE;
                        }
                    }, erpp.a);
                }
                int i = imsCapabilities.g;
                if (i != 404) {
                    if (i == 408 || i == 480) {
                        return elfo.e(avtb.OFFLINE);
                    }
                    if (i != 604) {
                        avqv.a.m(a.f(i, "[Dual Registraion] Received response code: ", " when trying to retrieve online status."));
                        return elfo.e(avtb.NOT_RCS);
                    }
                }
                return avqvVar.d(awuiVar2, imsCapabilities).h(new emwl() { // from class: avqq
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        cskc cskcVar = avqv.a;
                        return avtb.NOT_RCS;
                    }
                }, erpp.a);
            }
        }, this.h);
    }

    public final elfl d(final awui awuiVar, ImsCapabilities imsCapabilities) {
        int i = avmz.b;
        avml avmlVar = new avml();
        avmlVar.c(avor.a(imsCapabilities.i));
        avmlVar.b(this.e.f());
        final avmz a2 = avmlVar.a();
        return this.j.a(new Function() { // from class: avqr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cskc cskcVar = avqv.a;
                return ((avpe) obj).b(awui.this, a2);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public final void e(final String str, final kfb kfbVar, final boolean z) {
        entd entdVar = b;
        ((ensz) entdVar.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/DualRegistrationNetworkCapabilitiesProvider", "putPendingCompleter", 262, "DualRegistrationNetworkCapabilitiesProvider.java")).t("DualRegistrationNetworkCapabilitiesProvider: start putPendingCompleter for remoteUserId %s and completer", cskt.b(str));
        synchronized (this.g) {
            List list = (List) this.f.get(str);
            ((ensz) entdVar.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/DualRegistrationNetworkCapabilitiesProvider", "putPendingCompleter", 268, "DualRegistrationNetworkCapabilitiesProvider.java")).t("DualRegistrationNetworkCapabilitiesProvider: userPendingEvents %s", list);
            if (list == null) {
                list = new ArrayList();
                this.f.put(str, list);
            }
            list.add(kfbVar);
            ((ensz) entdVar.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/DualRegistrationNetworkCapabilitiesProvider", "putPendingCompleter", 275, "DualRegistrationNetworkCapabilitiesProvider.java")).t("DualRegistrationNetworkCapabilitiesProvider: completer added to userPendingEvents %s", list);
        }
        axnw.h(elfo.g(new Callable() { // from class: avqs
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return avqv.this.c.forceRefreshCapabilities(str);
            }
        }, this.i).h(new emwl() { // from class: avqt
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                avqv avqvVar = avqv.this;
                String str2 = str;
                kfb kfbVar2 = kfbVar;
                ContactsServiceResult contactsServiceResult = (ContactsServiceResult) obj;
                if (contactsServiceResult == null) {
                    avqvVar.f(str2, kfbVar2, new avlo("[Dual Registration] ContactServiceResult is null"));
                    return null;
                }
                if (contactsServiceResult.succeeded()) {
                    return null;
                }
                avqvVar.f(str2, kfbVar2, new avlo("[Dual Registration] ContactServiceResult failed: " + dvvu.codeToString(contactsServiceResult.getCode()) + "," + contactsServiceResult.getDescription()));
                return null;
            }
        }, this.h).e(ehxg.class, new emwl() { // from class: avqu
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ehxg ehxgVar = (ehxg) obj;
                Throwable avloVar = z ? new avlo("[Dual Registration] RCS Engine failed with an exception", ehxgVar) : new avta("[Dual Registration] RCS Engine failed with an exception", ehxgVar);
                avqv.this.f(str, kfbVar, avloVar);
                return null;
            }
        }, this.h));
    }

    public final void f(String str, kfb kfbVar, Throwable th) {
        entd entdVar = b;
        ((ensz) entdVar.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/DualRegistrationNetworkCapabilitiesProvider", "removePendingCompleter", 282, "DualRegistrationNetworkCapabilitiesProvider.java")).t("DualRegistrationNetworkCapabilitiesProvider: start removePendingCompleter for remoteUserId %s and completer", cskt.b(str));
        synchronized (this.g) {
            List list = (List) this.f.get(str);
            if (list != null) {
                list.remove(kfbVar);
                ((ensz) entdVar.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/DualRegistrationNetworkCapabilitiesProvider", "removePendingCompleter", 292, "DualRegistrationNetworkCapabilitiesProvider.java")).t("DualRegistrationNetworkCapabilitiesProvider: completer removed from userPendingEvents %s", list);
                if (list.isEmpty()) {
                    this.f.remove(str);
                    ((ensz) entdVar.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/DualRegistrationNetworkCapabilitiesProvider", "removePendingCompleter", 298, "DualRegistrationNetworkCapabilitiesProvider.java")).D("DualRegistrationNetworkCapabilitiesProvider: remoteUserId %s removed from pendingEvents %s", cskt.b(str), this.f);
                }
            }
        }
        kfbVar.c(th);
    }
}
