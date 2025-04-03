package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cknb {
    public static final entd a = entd.c("BugleGroupManagement");
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffsk f;
    private final aqvh g;

    public cknb(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, aqvh aqvhVar, ffbr ffbrVar4, ffsk ffskVar) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        aqvhVar.getClass();
        ffbrVar4.getClass();
        ffskVar.getClass();
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.g = aqvhVar;
        this.e = ffbrVar4;
        this.f = ffskVar;
    }

    public static final boolean c(engw engwVar) {
        if (engwVar.isEmpty()) {
            return false;
        }
        Iterator<E> it = engwVar.iterator();
        while (it.hasNext()) {
            if (!((aqux) it.next()).u()) {
                return true;
            }
        }
        return false;
    }

    public final Object a(ffgu ffguVar) {
        elfl b = this.g.a().b();
        b.getClass();
        return fgfz.c(b, ffguVar);
    }

    public final void b(awvy awvyVar, awkh awkhVar, ezkp ezkpVar) {
        awvyVar.getClass();
        ezkpVar.getClass();
        ConversationIdType f = awkhVar.f();
        if (f.b()) {
            ((ensz) a.j()).q("Propagating invalid groupConversationId. Impossible to log participant count.");
        } else {
            axol.k(this.f, null, new ckna(this, awvyVar, f, ezkpVar, null), 3);
        }
    }
}
