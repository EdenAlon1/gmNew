package defpackage;

import j$.time.Instant;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axzz implements axzy {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/contacts/sync/importer/ContactsImportResultTrackerImpl");
    private final ffbr b;
    private final AtomicReference c;
    private final AtomicReference d;
    private final Set e;

    public axzz(ffbr ffbrVar, ffbr ffbrVar2, ffsk ffskVar, ffbr ffbrVar3, ffbr ffbrVar4) {
        ffbrVar.getClass();
        ffskVar.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        this.b = ffbrVar2;
        this.c = new AtomicReference(Instant.MIN);
        this.d = new AtomicReference(Instant.MIN);
        this.e = DesugarCollections.synchronizedSet(new HashSet());
    }

    @Override // defpackage.axzy
    public final void a() {
        ensk e = a.e();
        e.Y(ente.a, "BugleContacts");
        ((enrr) e.h("com/google/android/apps/messaging/shared/contacts/sync/importer/ContactsImportResultTrackerImpl", "onContactsImportCompleted", 94, "ContactsImportResultTrackerImpl.kt")).q("Contacts import completed. Notifying pending future completers.");
        this.c.set(((cqoh) this.b.b()).f());
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((kfb) it.next()).b(true);
        }
        this.e.clear();
    }

    @Override // defpackage.axzy
    public final void b() {
        ensk e = a.e();
        e.Y(ente.a, "BugleContacts");
        ((enrr) e.h("com/google/android/apps/messaging/shared/contacts/sync/importer/ContactsImportResultTrackerImpl", "onContactsImportFailed", 104, "ContactsImportResultTrackerImpl.kt")).q("Contacts import failed. Notifying pending future completers.");
        this.d.set(((cqoh) this.b.b()).f());
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((kfb) it.next()).b(false);
        }
        this.e.clear();
    }
}
