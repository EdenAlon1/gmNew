package defpackage;

import android.os.Trace;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dusx implements erqj {
    final /* synthetic */ ListenableFuture a;
    final /* synthetic */ ListenableFuture b;
    final /* synthetic */ dusd c;
    final /* synthetic */ dutb d;

    public dusx(dutb dutbVar, ListenableFuture listenableFuture, ListenableFuture listenableFuture2, dusd dusdVar) {
        this.a = listenableFuture;
        this.b = listenableFuture2;
        this.c = dusdVar;
        this.d = dutbVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((enrr) ((enrr) dutb.a.e()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerController$5", "onSuccess", 777, "EmojiPickerController.java")).q("Emoji picker data loading is done.");
        int i = engw.d;
        List<List> list = (List) dupt.a(this.a, enou.a);
        engw engwVar = (engw) dupt.a(this.b, enou.a);
        this.d.o.isPresent();
        this.d.p.isPresent();
        engr engrVar = new engr();
        ozg.a("ItemViewDataUtils.createEmojiViewData");
        dutb dutbVar = this.d;
        boolean z = dutbVar.f;
        try {
            engr engrVar2 = new engr();
            int i2 = 0;
            for (List<duph> list2 : list) {
                engr engrVar3 = new engr();
                int i3 = 0;
                for (duph duphVar : list2) {
                    int i4 = i3 + 1;
                    engrVar3.h(new dutv(i2, i3, duphVar.a, dutbVar.e ? duphVar.b : enou.a, z));
                    i3 = i4;
                }
                engrVar2.h(engrVar3.g());
                i2++;
            }
            engw g = engrVar2.g();
            Trace.endSection();
            engrVar.j(g);
            list.size();
            this.d.j.isPresent();
            dusd dusdVar = this.c;
            engw g2 = engrVar.g();
            ((enrr) ((enrr) dute.g.h()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerCoreBodyAdapter", "updateEmojis", 399, "EmojiPickerCoreBodyAdapter.java")).o();
            dusdVar.q = new duug(g2, dusdVar.l, dusdVar.i);
            dusdVar.q.d(0, engwVar);
            dusdVar.p();
            if (this.d.d.h() != null) {
                this.d.d.w();
            }
            dutb dutbVar2 = this.d;
            if (dutbVar2.u && dutbVar2.v) {
                dutbVar2.u = false;
                dutbVar2.v = false;
                this.d.e(engwVar.isEmpty() ? 1 : 0, 2);
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        ((enrr) ((enrr) ((enrr) dutb.a.j()).g(th)).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerController$5", "onFailure", (char) 894, "EmojiPickerController.java")).q("Emoji picker data loading failed");
    }
}
