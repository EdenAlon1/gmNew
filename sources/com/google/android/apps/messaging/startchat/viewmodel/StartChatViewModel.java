package com.google.android.apps.messaging.startchat.viewmodel;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.startchat.viewmodel.StartChatViewModel;
import defpackage.cskc;
import defpackage.cvrr;
import defpackage.cwiw;
import defpackage.cwjc;
import defpackage.ffbr;
import defpackage.ffsk;
import defpackage.lml;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class StartChatViewModel extends lml {
    private static final cskc d = cskc.g("BugleContacts", "StartChatViewModel");
    public final ffbr a;
    public final ffbr b;
    public final ffbr c;
    private final ffbr e;
    private final ffbr f;

    public StartChatViewModel(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffsk ffskVar, ffbr ffbrVar6) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        ffskVar.getClass();
        ffbrVar6.getClass();
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.e = ffbrVar4;
        this.f = ffbrVar5;
        fA(new AutoCloseable() { // from class: cwjd
            @Override // java.lang.AutoCloseable
            public final void close() {
                ((amav) StartChatViewModel.this.c.b()).g();
            }
        });
        Object b = ffbrVar6.b();
        b.getClass();
        Iterator it = ((Iterable) b).iterator();
        while (it.hasNext()) {
            ((cvrr) it.next()).a();
        }
    }

    public final void a(boolean z) {
        d.p("onCreate with splitview: " + z + "}");
        ((cwjc) this.e.b()).a = z;
        ((cwiw) this.f.b()).b();
    }

    public final void b(boolean z, SelfIdentityId selfIdentityId) {
        d.i().H("onCreate with splitview: %s and selfIdentityId: %s", z, selfIdentityId.b());
        ((cwjc) this.e.b()).a = z;
        ((cwiw) this.f.b()).c(selfIdentityId);
    }
}
