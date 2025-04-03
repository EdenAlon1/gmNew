package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqnj implements dqlt {
    public static final dqgm a = new dqgm(0);
    private static final enru f = enru.c("com/google/android/libraries/compose/draft/text/EmojiUsageListener");
    public final ernh b;
    public final dqoy c;
    public final dqki d;
    public final dqgm e;
    private final ffsk g;

    public dqnj(ffsk ffskVar, ernh ernhVar, dqoy dqoyVar, dqki dqkiVar, dqgm dqgmVar) {
        this.g = ffskVar;
        this.b = ernhVar;
        this.c = dqoyVar;
        this.d = dqkiVar;
        this.e = dqgmVar;
    }

    public final void a(dqrp dqrpVar) {
        dqrpVar.getClass();
        ((enrr) f.f().h("com/google/android/libraries/compose/draft/text/EmojiUsageListener", "addUsage", 48, "EmojiUsageListener.kt")).q("Adding emoji usage");
        ffqy.d(this.g, null, null, new dqnh(dqrpVar, this, null), 3);
    }

    @Override // defpackage.dqlt
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void c(dqrp dqrpVar) {
        ffqy.d(this.g, null, null, new dqni(this, dqrpVar, null), 3);
    }

    @Override // defpackage.dqlt
    public final void d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a((dqrp) it.next());
        }
    }

    @Override // defpackage.dqlt
    public final /* bridge */ /* synthetic */ void e(Object obj) {
    }
}
