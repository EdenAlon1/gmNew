package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class dqmv extends ffkh implements ffji {
    public dqmv(Object obj) {
        super(1, obj, dqmw.class, "onEmojiRemoved", "onEmojiRemoved(Lcom/google/android/libraries/compose/emoji/data/usage/EmojiUsage;)V", 0);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        dqrp dqrpVar = (dqrp) obj;
        dqrpVar.getClass();
        Iterator it = ((dqmw) this.g).c.iterator();
        while (it.hasNext()) {
            ((dqlt) it.next()).e(dqrpVar);
        }
        return ffcu.a;
    }
}
