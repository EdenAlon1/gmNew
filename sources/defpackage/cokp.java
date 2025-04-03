package defpackage;

import com.google.android.ims.rcsservice.contacts.ImsCapabilities;
import com.google.android.rcs.client.contacts.ContactsService;
import j$.util.Optional;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cokp implements avlp, cnjy {
    private static final cskc a = cskc.g("Bugle", "BugleRcsContactsServiceImpl");
    private final ContactsService b;
    private final albq c;

    static {
        entd.c("BugleRcsCapabilities");
    }

    public cokp(ContactsService contactsService, albq albqVar) {
        new HashMap();
        this.b = contactsService;
        this.c = albqVar;
    }

    private final Optional b(aoku aokuVar) {
        String h = aokuVar.h();
        if (h == null) {
            return Optional.empty();
        }
        try {
            ImsCapabilities cachedCapabilities = this.b.getCachedCapabilities(h);
            return (cachedCapabilities == null || cachedCapabilities.z()) ? Optional.empty() : Optional.of(cachedCapabilities);
        } catch (ehxg e) {
            this.c.f("Bugle.Rcs.Capability.CacheRetrieval.RcsEngine.Duration", h);
            throw new avlh("Failed to get capabilities from ContactsService.", e);
        }
    }

    @Override // defpackage.avlp
    public final ephj a(aoku aokuVar) {
        Optional empty = Optional.empty();
        try {
            empty = b(aokuVar);
        } catch (avlh e) {
            csjb e2 = a.e();
            e2.I("Error getting cached capabilities from ContactsService for getLastKnownState(). Logging error and recovering by returning a default response code for the last known state.");
            e2.y("httpResponseCode", 0);
            e2.s(e);
        }
        int i = empty.isPresent() ? ((dkht) empty.get()).g : 0;
        ephh ephhVar = (ephh) ephj.a.createBuilder();
        ephhVar.copyOnWrite();
        ephj ephjVar = (ephj) ephhVar.instance;
        ephjVar.c = 1;
        ephjVar.d = Integer.valueOf(i);
        return (ephj) ephhVar.build();
    }

    @Override // defpackage.avlp
    public final Optional c(aoku aokuVar) {
        Optional b = b(aokuVar);
        return b.isEmpty() ? Optional.empty() : Optional.of(avlk.c(((dkht) b.get()).i));
    }
}
