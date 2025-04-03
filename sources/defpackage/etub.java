package defpackage;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etub implements ettc {
    public static final etub a = new etub();

    private etub() {
    }

    @Override // defpackage.ettc
    public final Class a() {
        return ettz.class;
    }

    @Override // defpackage.ettc
    public final Class b() {
        return ettz.class;
    }

    @Override // defpackage.ettc
    public final /* bridge */ /* synthetic */ Object c(ettb ettbVar) {
        if (ettbVar.a == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        Iterator it = ettbVar.a().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
            }
        }
        return new etua();
    }
}
