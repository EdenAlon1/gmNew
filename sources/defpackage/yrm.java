package defpackage;

import android.content.ClipData;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class yrm extends ffkh implements ffji {
    public yrm(Object obj) {
        super(1, obj, yrn.class, "onReceiveContent", "onReceiveContent(Landroidx/core/view/ContentInfoCompat;)Landroidx/core/view/ContentInfoCompat;", 0);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ktm ktmVar = (ktm) obj;
        ktmVar.getClass();
        yrn yrnVar = (yrn) this.g;
        enru enruVar = yrn.a;
        ensk h = yrn.a.h();
        h.Y(ente.a, "BugleComposeRow2");
        ((enrr) h.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/content/ComposeRowContentInsertionListener", "onReceiveContent", 53, "ComposeRowContentInsertionListener.kt")).t("onReceiveContent %s", ktmVar);
        final LinkedHashSet linkedHashSet = new LinkedHashSet();
        int itemCount = ktmVar.d().getItemCount();
        for (int i = 0; i < itemCount; i++) {
            ClipData.Item itemAt = ktmVar.d().getItemAt(i);
            if (yrnVar.f.a()) {
                if (itemAt.getUri() == null || !yrnVar.b(ktmVar, i)) {
                    CharSequence text = itemAt.getText();
                    if (text == null || text.length() == 0) {
                        ensk h2 = yrn.a.h();
                        h2.Y(ente.a, "BugleComposeRow2");
                        ((enrr) h2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/content/ComposeRowContentInsertionListener", "onReceiveContent", 64, "ComposeRowContentInsertionListener.kt")).t("Skipping received content with null uri and text: %s", itemAt);
                    } else {
                        itemAt.getClass();
                        CharSequence text2 = itemAt.getText();
                        if (text2 == null || text2.length() == 0) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                        ((dqmn) yrnVar.e.b()).g(text2);
                        linkedHashSet.add(itemAt);
                    }
                } else {
                    itemAt.getClass();
                    linkedHashSet.add(itemAt);
                }
            } else if (yrnVar.b(ktmVar, i)) {
                itemAt.getClass();
                linkedHashSet.add(itemAt);
            }
        }
        return (ktm) ktmVar.e(new ksy() { // from class: yrh
            @Override // defpackage.ksy
            public final /* synthetic */ ksy a(ksy ksyVar) {
                return new ksx(this, ksyVar);
            }

            @Override // defpackage.ksy
            public final boolean b(Object obj2) {
                enru enruVar2 = yrn.a;
                return !linkedHashSet.contains((ClipData.Item) obj2);
            }
        }).first;
    }
}
