package defpackage;

import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dkie extends dkgm {
    public final CopyOnWriteArrayList g;
    public dkii h;

    public dkie(djjr djjrVar, dkhc dkhcVar, dkii dkiiVar, dkur dkurVar) {
        super(djjrVar, dkhcVar, dkurVar);
        this.g = new CopyOnWriteArrayList();
        this.h = dkiiVar;
    }

    public final void p(dkic dkicVar) {
        if (this.g.contains(dkicVar)) {
            dkty.c("Listener is already registered!", new Object[0]);
        } else {
            this.g.add(dkicVar);
        }
    }

    protected final boolean r() {
        InstantMessageConfiguration d = this.a.d();
        eehk eehkVar = dkut.a;
        return d.a();
    }

    public abstract void s(String str, long j, String str2);

    public abstract void t(String str);

    public void q(eenk eenkVar) {
    }
}
