package defpackage;

import com.google.android.ims.rcsservice.contacts.ContactsServiceResult;
import com.google.android.ims.rcsservice.contacts.ImsCapabilities;
import com.google.android.rcs.client.contacts.ContactsService;
import j$.util.Optional;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class colc implements ckao, cnjy {
    public static final cskc a = cskc.g("Bugle", "RbmBotIdResolverServiceImpl");
    public final errl b;
    public final errl c;
    public final ScheduledExecutorService d;
    public final ContactsService e;
    public final ffbr f;
    public final avjf g;
    public final Object h = new Object();
    public final Map i = new HashMap();

    public colc(errl errlVar, errl errlVar2, errm errmVar, ContactsService contactsService, ffbr ffbrVar, avjf avjfVar) {
        this.b = errlVar;
        this.c = errlVar2;
        this.d = errmVar;
        this.e = contactsService;
        this.f = ffbrVar;
        this.g = avjfVar;
    }

    @Override // defpackage.ckao
    public final elfl a(aoku aokuVar) {
        cskc cskcVar = a;
        csjb a2 = cskcVar.a();
        a2.D("remoteMessagingIdentity", aokuVar.toString());
        a2.r();
        if (aokuVar == null || aokuVar.y(false)) {
            this.g.b(null);
            cskcVar.r("Shortcode does not exist!");
            return elfo.d(new avlo("[Dual Registration] Getting capabilities failed since remote user id is null"));
        }
        final String j = aokuVar.j();
        this.g.b(j);
        return elfl.g(kfg.a(new kfd() { // from class: cokz
            @Override // defpackage.kfd
            public final Object a(final kfb kfbVar) {
                final String str = j;
                if (str == null) {
                    colc.a.r("Shortcode does not exist!");
                    kfbVar.c(new avlo("Getting Capabilities failed due to remote user id being null"));
                    return "RbmBotIdResolverServiceImpl.getBotChatEndpoint";
                }
                final colc colcVar = colc.this;
                colc.a.p("Remove completer on time out for UserId: ".concat(str));
                kfbVar.a(new Runnable() { // from class: colb
                    @Override // java.lang.Runnable
                    public final void run() {
                        colc colcVar2 = colc.this;
                        avjf avjfVar = colcVar2.g;
                        String str2 = str;
                        avjfVar.l(str2, 2);
                        colcVar2.c(str2, kfbVar);
                    }
                }, colcVar.d);
                synchronized (colcVar.h) {
                    Set set = (Set) colcVar.i.get(str);
                    if (set == null) {
                        set = new HashSet();
                        colcVar.i.put(str, set);
                    }
                    set.add(kfbVar);
                }
                axnw.h(elfo.g(new Callable() { // from class: cokw
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return colc.this.e.refreshCapabilities(str);
                    }
                }, colcVar.b).h(new emwl() { // from class: cokx
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        ContactsServiceResult contactsServiceResult = (ContactsServiceResult) obj;
                        if (contactsServiceResult == null) {
                            contactsServiceResult = new ContactsServiceResult(1, "ContactsService returned null.");
                        }
                        String str2 = str;
                        if (contactsServiceResult.succeeded()) {
                            colc.a.p("Capabilities feched in bot id resolving for user: ".concat(str2));
                            return null;
                        }
                        colc.this.b(new avlh(contactsServiceResult), kfbVar, str2);
                        return null;
                    }
                }, colcVar.c).e(ehxg.class, new emwl() { // from class: coky
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        colc.this.b(new avlh("Jibe ContactsService had an error.", (ehxg) obj), kfbVar, str);
                        return null;
                    }
                }, colcVar.c));
                return "RbmBotIdResolverServiceImpl.getBotChatEndpoint";
            }
        })).j(12L, TimeUnit.SECONDS, this.d).h(new emwl() { // from class: cola
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ImsCapabilities imsCapabilities = (ImsCapabilities) obj;
                boolean isEmpty = imsCapabilities.j.isEmpty();
                colc colcVar = colc.this;
                String str = j;
                if (isEmpty) {
                    colcVar.g.l(str, 3);
                    return Optional.empty();
                }
                String str2 = (String) imsCapabilities.j.get();
                csjb c = colc.a.c();
                c.A("RBM bot id for shortcode", str2);
                c.r();
                colcVar.g.c(str, str2);
                return Optional.of(((avkc) colcVar.f.b()).b(str2));
            }
        }, erpp.a);
    }

    public final void b(Throwable th, kfb kfbVar, String str) {
        a.s("Error getting capabilities for bot id resolving.", th);
        this.g.l(str, 4);
        kfbVar.c(th);
        c(str, kfbVar);
    }

    public final void c(String str, kfb kfbVar) {
        synchronized (this.h) {
            Set set = (Set) this.i.get(str);
            if (set == null) {
                return;
            }
            set.remove(kfbVar);
            if (set.isEmpty()) {
                this.i.remove(str);
            }
        }
    }
}
