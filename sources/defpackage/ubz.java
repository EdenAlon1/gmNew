package defpackage;

import j$.util.Collection;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ubz implements ejwd<engw<aqux>> {
    final /* synthetic */ ucd a;

    public ubz(ucd ucdVar) {
        this.a = ucdVar;
    }

    @Override // defpackage.ejwd
    public final void a(Throwable th) {
        ((ensz) ((ensz) ((ensz) ucd.a.j()).g(th)).h("com/google/android/apps/messaging/conversation/draft/DraftEditorFragmentPeer$7", "onError", (char) 1107, "DraftEditorFragmentPeer.java")).q("Failed to load self identities for SimPickerFragmentPeer.");
    }

    @Override // defpackage.ejwd
    public final /* synthetic */ void b(Object obj) {
        engw engwVar = (engw) obj;
        ekzz f = eleg.f("DraftEditorFragmentPeer::onNewData addSelfLocalIdentitiesMixin");
        try {
            ucd ucdVar = this.a;
            bcxo bcxoVar = (bcxo) ucdVar.X.b();
            Stream filter = Collection.EL.stream(engwVar).filter(new Predicate() { // from class: uby
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public final /* synthetic */ Predicate mo439negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public final /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj2) {
                    return ((aqux) obj2).t();
                }
            });
            int i = engw.d;
            ucdVar.P = bcxoVar.b((engw) filter.collect(endq.a));
            cxtc H = this.a.z.H();
            bcxr bcxrVar = this.a.P;
            cxvv cxvvVar = H.c;
            cxvvVar.y = bcxrVar;
            cxvvVar.D();
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ejwd
    public final /* synthetic */ void hB() {
    }
}
