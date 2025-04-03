package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajlw implements ajlu {
    public static final enru a = enru.c("com/google/android/apps/messaging/profile/editprofile/EditProfileEntryImpl");
    public final eisx b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    private final ffbr f;
    private final ffsk g;

    public ajlw(Context context, eisx eisxVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffsk ffskVar, ffbr ffbrVar4, ffbr ffbrVar5) {
        context.getClass();
        eisxVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffskVar.getClass();
        ffbrVar4.getClass();
        this.b = eisxVar;
        this.f = ffbrVar;
        this.c = ffbrVar3;
        this.g = ffskVar;
        this.d = ffbrVar4;
        this.e = ffbrVar5;
    }

    @Override // defpackage.ajlu
    public final void a(ea eaVar) {
        axol.k(this.g, null, new ajlv(this, eaVar, null), 3);
    }

    @Override // defpackage.ajlu
    public final void b(ejwl ejwlVar) {
        ejwlVar.getClass();
        ejwlVar.b(((eixo) this.f.b()).a(this.b), new ejwd<eixz>() { // from class: ajlw.1
            @Override // defpackage.ejwd
            public final void a(Throwable th) {
                th.getClass();
                ensk j = ajlw.a.j();
                j.Y(ente.a, "BugleProfiles");
                ((enrr) j.h("com/google/android/apps/messaging/profile/editprofile/EditProfileEntryImpl$registerMixinCallbacks$1", "onError", 77, "EditProfileEntryImpl.kt")).q("Failed to pull account info, unable to show profile menu item");
            }

            @Override // defpackage.ejwd
            public final /* bridge */ /* synthetic */ void b(Object obj) {
                eixz eixzVar = (eixz) obj;
                eixzVar.getClass();
                if (!((Boolean) ajlw.this.d.b()).booleanValue()) {
                    ((ajlz) ajlw.this.c.b()).b(false);
                    ensk h = ajlw.a.h();
                    h.Y(ente.a, "BugleProfiles");
                    ((enrr) h.h("com/google/android/apps/messaging/profile/editprofile/EditProfileEntryImpl$registerMixinCallbacks$1", "onNewData", 61, "EditProfileEntryImpl.kt")).q("Edit profile is not enabled");
                    return;
                }
                boolean equals = eixzVar.k.equals("google");
                ((ajlz) ajlw.this.c.b()).b(equals);
                ensk h2 = ajlw.a.h();
                h2.Y(ente.a, "BugleProfiles");
                enrr enrrVar = (enrr) h2;
                enrrVar.Y(new ensn("should_show_profile_menu_item", Boolean.class, false, false), Boolean.valueOf(equals));
                ((enrr) enrrVar.h("com/google/android/apps/messaging/profile/editprofile/EditProfileEntryImpl$registerMixinCallbacks$1", "onNewData", 72, "EditProfileEntryImpl.kt")).q("Setting visibility of profile menu item");
            }

            @Override // defpackage.ejwd
            public final /* synthetic */ void hB() {
            }
        });
    }
}
