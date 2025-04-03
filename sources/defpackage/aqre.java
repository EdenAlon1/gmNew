package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqre implements aqqx {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/api/messaging/recipient/sync/RecipientContactSyncListenerImpl");
    public final Optional b;
    public final Optional c;
    public final ffbr d;
    public final ffbr e;
    public final aswk f;
    private final ffsk g;

    public aqre(ffsk ffskVar, Optional optional, Optional optional2, ffbr ffbrVar, ffbr ffbrVar2, aswk aswkVar) {
        ffskVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        this.g = ffskVar;
        this.b = optional;
        this.c = optional2;
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.f = aswkVar;
    }

    @Override // defpackage.aqqx
    public final elfl a(engw engwVar) {
        return axol.i(this.g, new aqrc(this, engwVar, null));
    }

    @Override // defpackage.aqqx
    public final elfl b(engw engwVar) {
        return axol.i(this.g, new aqrd(this, engwVar, null));
    }

    @Override // defpackage.aqqx
    public final /* synthetic */ elfl c() {
        elfl e = elfo.e(null);
        e.getClass();
        return e;
    }
}
