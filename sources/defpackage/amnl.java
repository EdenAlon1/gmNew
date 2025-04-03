package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amnl extends ffhv implements ffjm {
    final /* synthetic */ amnr a;
    final /* synthetic */ azch b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amnl(ffgu ffguVar, amnr amnrVar, azch azchVar) {
        super(2, ffguVar);
        this.a = amnrVar;
        this.b = azchVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amnl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        bsob e = bsom.e();
        e.f(new amnm());
        e.i(new amnn(this.b));
        e.z("DestinationConversationMatcher#matchRcsGroupConversation");
        engw y = e.b().y();
        y.getClass();
        ((akzt) this.a.b.b()).e("Bugle.Cme.Destination.Conversation.Match.Fallback", y.isEmpty() ? 3 : ((enou) y).c > 1 ? 2 : 1);
        if (((enou) y).c <= 1) {
            return ffdx.U(y);
        }
        ensk j = amnr.a.j();
        j.Y(ente.a, "BugleCME");
        ((enrr) j.h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/destination/BugleDestinationConversationMatcher$matchRcsGroupConversationFallback$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 173, "BugleDestinationConversationMatcher.kt")).q("Found more than one conversation for an RCS group.");
        enqv it = y.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j2 = ((bseh) next).C().a;
            do {
                Object next2 = it.next();
                long j3 = ((bseh) next2).C().a;
                if (j2 < j3) {
                    j2 = j3;
                }
                if (j2 < j3) {
                    next = next2;
                }
            } while (it.hasNext());
        }
        return next;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        amnl amnlVar = new amnl(ffguVar, this.a, this.b);
        amnlVar.c = obj;
        return amnlVar;
    }
}
