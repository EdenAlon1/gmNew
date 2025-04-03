package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feva extends fecs {
    public static final Logger a = Logger.getLogger(feva.class.getName());
    public static final ferd b = new fevn(fend.o);
    public static final fdzj c = new feuz();
    private static final fdyv t = fdyv.b;
    private static final fdxz u = fdxz.a;
    private static final long v = TimeUnit.SECONDS.toMillis(120);
    public final fenn d = new fenn();
    final List e = new ArrayList();
    public final List f = new ArrayList();
    public final List g = new ArrayList();
    public fdzj h = c;
    public ferd i = b;
    public fdyv j = t;
    public fdxz k = u;
    long l = v;
    fdyr m = fdys.a;
    public boolean n = true;
    public boolean o = true;
    public boolean p = true;
    public boolean q = true;
    fdzq r = fdzq.b;
    public final feem s;

    public feva(feem feemVar) {
        this.s = feemVar;
        Iterator it = fdyb.a().b().iterator();
        while (it.hasNext()) {
            ((fdya) it.next()).b();
        }
    }
}
