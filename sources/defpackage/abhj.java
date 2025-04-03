package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abhj implements dqlx {
    final /* synthetic */ abho a;

    public abhj(abho abhoVar) {
        this.a = abhoVar;
    }

    private final void g(doxs doxsVar) {
        if (doxsVar instanceof dqzc) {
            abgm abgmVar = this.a.n;
            if (abgmVar != null) {
                abgmVar.a((dqzc) doxsVar);
            } else {
                enrr a = abho.b.a(Level.WARNING);
                a.Y(ente.a, "BugleReactions");
                ((enrr) a.h("com/google/android/apps/messaging/conversation2/screen/bottomsheets/reactionpicker/fragment/ReactionPickerFragmentPeer$customReactionHandlingAttachmentController$1", "handleAttachment", 166, "ReactionPickerFragmentPeer.kt")).q("Custom sticker selected before customStickerHandler was initialized");
            }
        } else if (doxsVar instanceof drni) {
            ffji ffjiVar = this.a.o;
            if (ffjiVar != null) {
                ffjiVar.invoke(((drni) doxsVar).b);
            } else {
                enrr a2 = abho.b.a(Level.WARNING);
                a2.Y(ente.a, "BugleReactions");
                ((enrr) a2.h("com/google/android/apps/messaging/conversation2/screen/bottomsheets/reactionpicker/fragment/ReactionPickerFragmentPeer$customReactionHandlingAttachmentController$1", "handleAttachment", 172, "ReactionPickerFragmentPeer.kt")).q("Image selected before onCameraGalleryMediaSelected was initialized");
            }
        }
        this.a.c.hw();
    }

    @Override // defpackage.dqlx
    public final Object a(doxs doxsVar, ffgu ffguVar) {
        g(doxsVar);
        return false;
    }

    @Override // defpackage.dqlx
    public final void d(doxs doxsVar) {
        doxsVar.getClass();
    }

    @Override // defpackage.dqlx
    public final void e(doxs doxsVar) {
        g(doxsVar);
    }

    @Override // defpackage.dqlx
    public final boolean f() {
        return true;
    }

    @Override // defpackage.dqlx
    public final void b() {
    }

    @Override // defpackage.dqlx
    public final void c() {
    }
}
