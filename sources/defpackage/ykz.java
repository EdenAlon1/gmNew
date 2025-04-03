package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ykz extends ffhv implements ffjm {
    final /* synthetic */ Uri a;
    final /* synthetic */ yla b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ykz(ffgu ffguVar, Uri uri, yla ylaVar) {
        super(2, ffguVar);
        this.a = uri;
        this.b = ylaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ykz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ekzz f = eleg.f("LegacyAttachmentDownloader#download");
        try {
            ensk h = yla.a.h();
            h.Y(ente.a, "BugleComposeRow2");
            ((enrr) h.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/send/attachment/downloader/LegacyAttachmentDownloader$download$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 36, "LegacyAttachmentDownloader.kt")).D("Downloading remote attachment to scratch space %s, %s", cskw.a(this.a), null);
            Uri d = this.b.c.d(this.a, null);
            if (d == null) {
                throw new yky();
            }
            ffig.a(f, null);
            return d;
        } finally {
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ykz ykzVar = new ykz(ffguVar, this.a, this.b);
        ykzVar.c = obj;
        return ykzVar;
    }
}
