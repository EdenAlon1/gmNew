package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsis extends fflr {
    final /* synthetic */ dsit a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsis(dsit dsitVar) {
        super(null);
        this.a = dsitVar;
    }

    @Override // defpackage.fflr
    protected final void a(ffmx ffmxVar, Object obj, Object obj2) {
        dqnn dqnnVar = (dqnn) obj2;
        if (dqnnVar != null) {
            ((enrr) dsit.b.h().h("com/google/android/libraries/compose/ui/composable/text/DelegatingEmojiDraftTextController$special$$inlined$distinctObservable$1", "afterChange", 22, "DelegatingEmojiDraftTextController.kt")).B("Delegating text control to %s (%d pending operations)", dqnnVar, this.a.c.a);
            Iterator a = ffno.d(new dsir(this.a)).a();
            while (a.hasNext()) {
                ((ffji) a.next()).invoke(dqnnVar);
            }
        }
    }

    @Override // defpackage.fflr
    protected final boolean b(Object obj, Object obj2) {
        return !ffkj.e(obj, obj2);
    }
}
