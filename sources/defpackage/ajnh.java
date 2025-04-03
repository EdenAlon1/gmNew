package defpackage;

import j$.util.Optional;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajnh {
    private final ffbr a;

    public ajnh(ffbr ffbrVar) {
        this.a = ffbrVar;
    }

    public final Iterable a(Iterable iterable) {
        Optional m = ((djry) this.a.b()).m();
        Iterable iterable2 = iterable;
        if (!m.isEmpty()) {
            iterable2 = iterable;
            if (((Boolean) dizg.o().a.R.a()).booleanValue()) {
                HashSet e = enpw.e(iterable);
                djtp djtpVar = (djtp) m.get();
                if (e.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.rcse.im") && !djtpVar.r().mChatAuth) {
                    e.remove("urn%3Aurn-7%3A3gpp-application.ims.iari.rcse.im");
                }
                if (e.contains(dkmn.a()) && e.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.fthttp") && !djtpVar.r().mGroupChatAuth) {
                    e.remove(dkmn.a());
                }
                boolean contains = e.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.fthttp");
                iterable2 = e;
                if (contains) {
                    iterable2 = e;
                    if (!djtpVar.r().mFtAuth) {
                        e.remove("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.fthttp");
                        iterable2 = e;
                    }
                }
            }
        }
        return iterable2;
    }
}
